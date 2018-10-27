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

   <!-- <%
        /*response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");*/
    %>-->
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
                    <li><a href="profs.jsp">PROFESSOR</a></li>
                    <li><a href="#features">COURSES</a></li>
                    <%
                        if(session.getAttribute("username") != null){

                    %>
                    <li><a href="profile_s.jsp">PROFILE</a></li>
                    <%
                        }
                    %>
                    <li><a href="about.html">ABOUT US</a></li>
                    <%
                        if(session.getAttribute("username") != null){

                    %>
                    <li><form action="/logout">
                        <input type="submit" value="Logout">
                    </form></li>
                    <%
                        }
                    %>

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
                        Consectetur adipiscing elit felis dolor felis dolor vitae.
                        Eelit felis dolor vitae  adipiscing elit felis dolor felis dolor vitae.
                        Eelit felis dolor vitae

                    </h4>

                          <%
                            if(session.getAttribute("username") == null){

                          %>

                          <a href="#about" data-toggle="modal" data-target=".bd-example-modal-sm-sign-in" class="btn btn-custom btn-one" >SIGN IN</a>
                          <a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-sign-up" class="btn btn-custom btn-two" >SIGN UP</a
                          <%
                              }
                          %>

                </div>
                </div>
              
                
            </div>

        </div>

    </div>
    <div class="footer">
        <center>
                    <b>Designed by NULL TM </b> <br>

            
                
        </center>

    </div>


    <!--HOME SECTION END  -->
    <!-- <section id="about">
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
   <!-- <section id="features">
        <div class="container">
            
            <div class="row text-center">
                <div class="col-md-6">
                    <div class="row pad-bottom">
                         <div class="col-md-4">
                    <i class="ion-ios-star-outline icon-set"></i>
                    <h4>Free to download </h4>
                                        Consectetur adipiscing elit felis dolor .

                </div>
                <div class="col-md-4">
                    <i class="ion-ios-chatboxes-outline icon-set"></i>
                    <h4>Stable relaese  </h4>
                                      Consectetur adipiscing elit felis dolor .

                </div>
                <div class="col-md-4">
                    <i class="ion-ios-cloud-upload-outline icon-set"></i>
                    <h4>No strings attached </h4>
                    Consectetur adipiscing elit felis dolor .
                </div>
                        </div>
                        <div class="row">
                         <div class="col-md-4">
                    <i class="ion-ios-pricetags-outline icon-set"></i>
                    <h4>Free to download </h4>
                                        Consectetur adipiscing elit felis dolor .

                </div>
                <div class="col-md-4">
                    <i class="ion-ios-speedometer-outline icon-set"></i>
                    <h4>Stable relaese  </h4>
                                      Consectetur adipiscing elit felis dolor .

                </div>
                <div class="col-md-4">
                    <i class="ion-ios-crop icon-set"></i>
                    <h4>No strings attached </h4>
                    Consectetur adipiscing elit felis dolor .
                </div>
                    </div>
            </div>
                <div class="col-md-6 text-center">
                    <img src="assets/img/phone.png" class="img-phone" />
                </div>
        </div>
</div>

    </section>
    <!-- FEATURES SECTION END-->   
    <!--<section id="subscribe">
        <div class="container">
            <div class="row text-center">
                <div class="col-md-8 col-md-offset-2 ">
                   <h4>We are happy to say that we have 30,000+ subscribers, so don't wait subscribe us now </h4>
                     <a href="#" class="btn btn-custom btn-three" > Subscribe & Send Download Link</a>
                </div>
            </div>
           
        </div>
    </section>
     <!-- SUBSCRIBE SECTION END-->
    <!-- <section id="social">
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

    <!-- MODAL SING-IN-->

<div class="modal fade bd-example-modal-sm-sign-in" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <center>
          <h2> Sign In</h2><hr>
               <form action="/login" method="post">
                <p>
                <input class="sign_input" placeholder="Login" type="text" name="login" /><br />
                 </p>
                 <input class="sign_input" placeholder="Password" type="password" name="password" /><br />
                 <hr>
                <input type="submit" class="submit-sign"  name="submit" value="SUBMIT">
         </form>
            <center><p style="color:red;">${errorMessage}</p></center>
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
           <form action="/signup" method="post">
            <p>
            <input class="sign_input" placeholder="Name" type="text" name="first_name" required/><br />
         </p>
            <p>
            <input class="sign_input" placeholder="Surname" type="text" name="last_name" required/><br />
         </p>
            <p>
            <input class="sign_input" placeholder="Login" type="text" name="username" required/><br />
         </p>
            <p>
            <input class="sign_input" placeholder="ID" type="text" name="id" required/><br />
         </p>
             <p>
             <input class="sign_input" placeholder="Email" type="text" name = "email" required/><br />
         </p>
               <!--<p>
              <input class="sign_input" placeholder="Login" type="text" name="login" /><br />
          </p>-->
             <p>
             <input class="sign_input" placeholder="Password" type="password" name="password" required/><br />
         </p>
             <input class="sign_input" placeholder="Confirm Password" type="password" name="conpassword" required/><br />
               <hr>
              <input type="submit" class="submit-sign"  name="submit" value="SUBMIT">
      </form>
            <center><p style="color:red;">${error}</p></center>
            <center><p style="color:red;">${error1}</p></center>
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
