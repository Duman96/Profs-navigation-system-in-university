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
</head>
<body>
<%
if(session.getAttribute("username") == null){
response.sendRedirect("/index.jsp");
}%>
   <div class="navbar navbar-default navbar-fixed-top scroll-me">
        <!-- pass scroll-me class above a tags to starts scrolling -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">
                 <strong>NULL</strong>   
                </a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a class="nav-bar-a"href="profs.jsp">PROFESSOR</a></li>
                    <li><a class="nav-bar-a"href="#features">COURSES</a></li>
                    <li><a class="nav-bar-a"href="about_us.jsp">ABOUT US</a></li>
                    <li><a class="nav-bar-user-a" href="/rest/profile/">PROFILE</a></li>
                    <li><a class="nav-bar-user-a" href="logout">LOG OUT</a></li>


                </ul>
            </div>

        </div>
    </div>

    <!--HOME SECTION END  -->
   
    <section id="features">
        <div class="container">
            <h1> DEVELOPMENT TEAM</h1><br>
            <div class="row text-center">
                <div class="col-md-12">
                    <div class="row pad-bottom">
                         <div class="col-md-4">
                    <img src="assets/img/duman.jpg" class="team_img">
                    <h4>Iklassov Duman </h4>
                    <h3>Product Owner</h3>

                </div>
                <div class="col-md-4">
                     <img src="assets/img/abil.jpg" class="team_img">
                    <h4>Abil Kuatbayev </h4>
                    <h3>Scrum Master</h3>

                </div>
                <div class="col-md-4">
                <img src="assets/img/dana.jpg" class="team_img">
                    <h4>Dana Oshakbayeva</h4>
                    <h3>Project Manager</h3>
                </div>
                        </div>
                        <div class="row">
                         <div class="col-md-4">
                     <img src="assets/img/nurduman.jpg" class="team_img">
                    <h4>Nurduman Aidossov</h4>
                      <h3>Software Developer</h3>

                </div>
                <div class="col-md-4">
                     <img src="assets/img/assiya.jpg" class="team_img">
                    
                    <h4>Assiya Zhiyenbek</h4>
                    <h3>Database Developer</h3>

                </div>
                <div class="col-md-4">
                  <img src="assets/img/yussup.jpg" class="team_img">
                    <h4>Yussup Tumgoyev</h4>
                    <h3>Web Designer</h3>
                </div>
                    </div>
            </div>
            
        </div>
</div>

    </section>

     <section id="about">
        <div class="container">
            <div class="row scroll-me">
                <div class="col-md-4">
                    <h4>About This App </h4>
                    <p>
                       Morbi mollis lectus et ipsum sollicitudin varius.
                         Aliquam tempus ante placerat, consectetur tellus nec, porttitor nulla.
                         Maecenas a quam erat. Praesent vehicula ut magna sit amet ultrices.
                    </p>
                     <a href="#subscribe" class="btn btn-custom btn-three" ><i class="ion-ios-arrow-thin-right"></i> &nbsp;Explore Awesomeness</a>
                </div>
                <div class="col-md-4">
                    <h4>Who is the Developer ?</h4>
                    <p>
                    <strong>   Jhon Deocarlic </strong> developed this app for the entertainment of the youth. He <strong>graduated</strong> from oxford unversity.
                         Aliquam tempus ante placerat, consectetur tellus nec, porttitor nulla.
                    </p>
                </div>
                <div class="col-md-4">
               <h4>How you can reach him ?</h4>
                    <p>
                        You can reach him by sending text at <strong>  hello@thisdomain.com</strong>  . But please notice he doesn't reply for support mails, for support you have to send query at <i> support@thisdomain.com</i>.
                    </p>
                </div>
            </div>
        </div>
    </section>
    <!-- ABOUT SECTION END-->


    </section>
    <!-- SOCIAL SECTION END-->
        <div class="footer">
        <center>
                    <b>Designed by NULL TM </b> <br>                
        </center>

    </div>

    <!-- MODAL SING-IN-->

<div class="modal fade bd-example-modal-sm-sign-in" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <center>
          <h2> Sign In</h2><hr>
               <form action="reg.php" method="post">
                <p>
                <input class="sign_input" placeholder="Login" type="text" name="login" /><br />
                 </p>
                 <input class="sign_input" placeholder="Password" type="password" name="password" /><br />
                 <hr>
                <input type="submit" class="submit-sign"  name="submit" value="SUBMIT">
         </form>
        </center>
    </div>
  </div>
</div>

    <!-- MODAL SING-UP-->

<div class="modal fade bd-example-modal-sm-sign-up" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <center>
      <h2> Sign Up</h2><hr>
           <form action="reg.php" method="post">
            <p>
            <input class="sign_input" placeholder="Name" type="text" name="name" /><br />
         </p>
            <p>
             <input class="sign_input" placeholder="Email" type="text" name = "email"/><br />
        </p>
            <p>
            <input class="sign_input" placeholder="Login" type="text" name="login" /><br />
        </p>
             <input class="sign_input" placeholder="Password" type="password" name="password" /><br />
             <hr>
            <input type="submit" class="submit-sign"  name="submit" value="SUBMIT">
    </form>
        </center>
    </div>
  </div>
</div>


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
