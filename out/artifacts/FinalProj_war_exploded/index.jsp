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
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"
                integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
                crossorigin="anonymous"></script>

        <script>
        $(document).ready(function() {
            $("#lgn").submit(function(event) {
                event.preventDefault();
                var login = $("#val-login").val();
                var password = $("#val-pwd").val();
                var submit = $("#val-submit").val();
                $(".error").load("/login", {
                    login: login,
                    password: password,
                    submit: submit
                });
            }
            )
        }
        </script>
    <![endif]-->
        <script src='https://www.google.com/recaptcha/api.js?explicit&hl=en'></script>
</head>
<%
    if(session.getAttribute("username") != null){

%>
<style>
    #home {
        background: url(http://localhost:8080/assets/img/homelight.jpg) no-repeat center center; /*Full Witdth background image*/
        padding: 0;
        -webkit-background-size: cover;
        background-size: cover;
        -moz-background-size: cover;
    }
</style>
<%
    }
    if(session.getAttribute("username") == null){
%>
<style>
    #home {
        background: url(http://localhost:8080/assets/img/home.jpg) no-repeat center center; /*Full Witdth background image*/
        padding: 0;
        -webkit-background-size: cover;
        background-size: cover;
        -moz-background-size: cover;
    }
</style>
<%
    }
%>
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
                <a class="navbar-brand" href="index.jsp">
                 <strong>NULL</strong>   
                </a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a class="nav-bar-a"href="profs.jsp">PROFESSOR</a></li>
                    <li><a class="nav-bar-a"href="#features">COURSES</a></li>
                    <li><a class="nav-bar-a"href="about_us.jsp">ABOUT US</a></li>
                    <%
                        if(session.getAttribute("username") != null){

                    %>
                    <li><a class="nav-bar-user-a" href="/rest/profile/">PROFILE</a></li>
                    <li><a class="nav-bar-user-a" href="/logout">LOG OUT</a></li>

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
                    <a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-sign-up" class="btn btn-custom btn-two" >SIGN UP</a>
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

<div class="modal fade bd-example-modal-sm-sign-in" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm" style="width: 500px">
    <div class="modal-content" id="sgn">
        <center>
          <h2> Sign In</h2><hr>
               <form action="/login" method="post" id="lgn">
                   <p>
                       <input id="val-login" class="sign_input" placeholder="Login" type="text" name="login" /><br />
                   </p>
                   <input id="val-pwd" class="sign_input" placeholder="Password" type="password" name="password" /><br />
                   <hr>
                   <div class="g-recaptcha" data-sitekey="6LceeXwUAAAAAJr-Wb0dEji-5lkPNJLxfZ1ixbDK"></div>
                   <br/>
                   <input id="val-submit" type="submit" class="submit-sign"  name="submit" value="SUBMIT">
         </form>
            <center><p class="error" style="color:red;">${errorMessage}</p></center>
        </center>
    </div>
  </div>
</div>

    <!-- MODAL SING-UP-->

<div class="modal fade bd-example-modal-sm-sign-up" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm" style="width: 500px">
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
               <div class="g-recaptcha" data-sitekey="6LceeXwUAAAAAJr-Wb0dEji-5lkPNJLxfZ1ixbDK"></div>
               <br/>
               <button type="submit" class="submit-sign"  name="submit">SUBMIT</button>
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
