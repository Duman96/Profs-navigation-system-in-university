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
        .btn-one{
            width: 200px;
        }

    </style>
</head>
<body>
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
                    <li><a href="#about">Log In</a></li>
                    <li><a href="#features">Sign Up</a></li>
                    <li><a href="#subscribe">About Us</a></li>
                </ul>
            </div>

        </div>
    </div>
    <!-- NAVBAR SECTION END-->
    <div id="home">
        <div class="overlay">
            <div class="container">
                <div class="row scroll-me" >
                      <div class="col-md-6 ">
                    <h4>
                        Welcome to Handicap without SMS and Registartion!

                    </h4>
                    <a href="#about" class="btn btn-custom btn-one" >Start using Handicap! </a>
                    <a href="#subscribe" class="btn btn-custom btn-two" >Just Button </a>
                </div>
                </div>
              
                
            </div>
        </div>

    </div>
    <!--HOME SECTION END  -->
    <section id="about">
        <div class="container">
            <div class="row scroll-me">
                <div class="col-md-12">
                    <form action="/login" method="post">
                        <h2 class="text-center">Log in</h2>    
                        <hr>   
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Username" name="login" required="required">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password" name="password" required="required">
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary btn-block reg-btn">Log in</button>
                        </div>
      
                    </form>
                    <center><p style="color:red;">${errorMessage}</p></center>
                </div>
                
            </div>
        </div>
    </section>
    <!-- ABOUT SECTION END-->
    <section id="features">
        <div class="container">
            
            <div class="row text-center">
                <div class="col-md-12">
                        <form action="/signup" method="post">
                            <h2>Sign Up</h2>
                            <p>Please fill in this form to create an account!</p>
                            <hr style = "color: black">
                            
                            <div class="form-group">
                                    <div class="row">
                                        <div class="col-xs-6" style = "padding: 0"><input type="text" class="form-control" style = "margin-right: 2.5px"
                                            name="first_name" placeholder="First Name" required="required"></div>
                                        <div class="col-xs-6" style = " padding: 0"><input type="text" class="form-control"  style = "margin-left: 2.5px"
                                            name="last_name" placeholder="Last Name" required="required"></div>
                                    </div>        	
                            </div>

                            <div class="form-group">
                                    <input type="text" class="form-control" name="username" placeholder="Username" required="required">   
                            </div>
                            <div class="form-group">
                                    <input type="text" class="form-control" name="id" placeholder="ID" required="required">   
                            </div>

                            <div class="form-group">
                                    <input type="email" class="form-control" name="email" placeholder="Email Address" required="required">
                            </div>
                            <div class="form-group">                
                                    <input type="password" class="form-control" name="password" placeholder="Password" required="required">
                            </div>
                            <!--<div class="form-group">
                                    <input type="text" class="form-control" name="confirm_password" placeholder="Confirm Password" required="required">
                            </div>-->
                            <br>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-lg reg-btn">Sign Up</button>
                            </div>
                        </form>    
                </div>    
        </div>
      </div>

    </section>
    <!-- FEATURES SECTION END-->   
    <section id="subscribe">
        <div class="container">
            <div class="row text-center">
                <div class="col-md-8 col-md-offset-2 ">
                   <h4>We will not tell you anything about us ;) </h4>
                     <a href="#" class="btn btn-custom btn-three" > Subscribe to Us!</a>
                </div>
            </div>
           
        </div>
    </section>
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
