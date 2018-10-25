<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Just App - Landing Page</title>
    <!-- BOOTSTRAP CORE CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- ION ICONS STYLES -->
    <link href="assets/css/ionicons.css" rel="stylesheet" />
    <!-- CUSTOM CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style>
        #home {
            background-image: url("wood.jpeg");
            background-size: cover;
        }

        .form-control {
          /*  position: relative; */
            height: 50px;
            width: 300px;
            margin: auto;
           text-align: center;
        }

        .reg-btn {
            height: 50px;
            width: 300px;
            margin: auto;
           text-align: center;
        }
        #social {
            background-color: #eff2f7;
        }
        
        #features {
            background-color: #eff2f7;
        }
    
        .btn-one {
            height: 60px;
            width: 300px;
            vertical-align: middle;
        }

        #srchfrm {
            border-radius: 30px;
            height: 70px;
            width: 600px;
        }

    </style>
</head>
<body>

    <%

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        if(session.getAttribute("username") == null){
            response.sendRedirect("/index.jsp");
        }

    %>
   <div class="navbar navbar-default navbar-fixed-top scroll-me">
        <!-- pass scroll-me class above a tags to starts scrolling -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                 <strong>HANDICAP</strong>   
                </a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/profs.jsp">Professors</a></li>
                    <li><a href="#subscribe">About Us</a></li>
                    <li style = "margin-left: 50px;"><a href="#features">My Profile</a></li>
                    <li><form action="/logout">
                        <input type="submit" value="Logout">
                    </form></li>
                </ul>
            </div>

        </div>
    </div>
    <!-- NAVBAR SECTION END-->
    <div id="home">
        <div class="overlay">
            <div class="container">
                <div class="row scroll-me" style = "align-items: center">
                        <h2 style = "text-align: center ">HADNICAP</h2>
                        <hr>
						<div class="form-group">
					
                            <input type="text" class="form-control" placeholder="Search" id = "srchfrm">
                            
                        </div>
                        <div style="text-align:center"><a href="#subscribe" class="btn btn-custom btn-one">Start Exploring </a> </div>
                </div>
              
                
            </div>
        </div>

    </div>

    
  
     <!-- SUBSCRIBE SECTION END-->
     <section id="social">
        <div class="container">
               <div class="row text-center pad-bottom">
                <div class="col-md-8 col-md-offset-2 ">
                  <a href="#" class="btn btn-custom btn-three" ><i class="ion-social-facebook-outline "></i></a>
                   <a href="#" class="btn btn-custom btn-three" ><i class="ion-social-googleplus-outline "></i> </a>
                    <a href="#" class="btn btn-custom btn-three" ><i class="ion-social-tumblr-outline "></i></a>
                </div>
            </div>
            <div class="row text-center">
                <div class="col-md-8 col-md-offset-2 ">
                <a href="#">Privacy Policy</a>  
                   
                     <a href="#">Terms of Use</a>
                </div>
            </div>
            <div class="row text-center" >
                  <div class="col-md-8 col-md-offset-2 ">
                   <a href="http://www.designbootstrap.com/" target="_blank"> by  DesignBootstrap</a>
                      </div>
            </div>
            
        </div>


    </section>
    <!-- SOCIAL SECTION END-->
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  SCRIPTS -->
    <script src="assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
    <!-- SCROLLING SCRIPTS PLUGIN  -->
    <script src="assets/js/jquery.easing.min.js"></script>
    <!-- CUSTOM SCRIPTS   -->
    <script src="assets/js/custom.js"></script>
</body>
</html>
