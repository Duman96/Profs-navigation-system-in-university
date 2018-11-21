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
                <a class="navbar-brand" href="index.jsp">
                 <strong>NULL</strong>   
                </a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a class="nav-bar-a"href="profs.jsp">PROFESSOR</a></li>
                    <li><a class="nav-bar-a"href="#features">COURSES</a></li>
                    <li><a class="nav-bar-a"href="about_us.jsp">ABOUT US</a></li>
                    <li><a class="nav-bar-user-a" href="profile_s.jsp">PROFILE</a></li>
                    <li><a class="nav-bar-user-a" href="logout">LOG OUT</a></li>
                </ul>
            </div>

        </div>
    </div>

<section id="about">
        <div class="container">


                                    <div class="row scroll-me">
                <div class="col-md-4">
                    <h4>Yussup Tumgoyev</h4>
                    <h5>NU Student</h5>
                  <img style="border:3px solid #16A8C2;margin-top:5px;margin-bottom:5px;"src="assets/img/change2.jpg" class="team_img">
                   
                   <h5>School of Science and Technology</h5>
                    <h5>ID: 201490584</h5>
                    <div style="margin-left:-20px;"class="col-md-10 col-10 col-lg-10 col-xl-10"> 
                        <a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-msg"  class="btn btn-custom btn-two profile_btn"><b class="avatar_type_1"><img src="assets/img/avatar.png">Change Avatar</b></a>
                     
                        <!--<a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-msg"  class="btn btn-custom btn-two profile_btn"><b class="avatar_type_1"><img src="assets/img/avatar.png">Change Avatar</b></a>-->
                    </div>
                </div>
                <div class="col-md-4 bio_div">
                    <h4>Bio</h4>
                        <br>
                        <b> 3rd Grade </b>
                        <p> Grade </p>
                        <b> Astana </b>
                        <p> Hometown </p>
                        <b> +7 (705) 705 70 5 7 </b>
                        <p> Phone </p>
                        <b> adnan.yazici@nu.edu.kz </b>
                        <p> E-mail </p>
                        

                 
                </div>
                <div class="col-md-4">
               <h4>Courses Taken</h4>
               <ul>
                <li>CSCI 111 – Web Programming & Problem Solving Course.</li>
                <li>CSCI 151 – Programming for Scientists and Engineers Lab</li>
                <li>CSCI 152 – Data Stuctures</li>
                <li>CSCI 245 – System Analysis and Design.</li>
                <li>CSCI 262 – Software Project Management.</li>
                <li>CSCI 330, Mobile Computing</li>
                <li>CSCI 336, Ubiquity and Sensing</li>
                <li>CSCI 344, Data Mining and Decision Support</li> 
                <li>CSCI 361, Software Engineering</li>
                <li>CSCI 455, Scripting Languages</li>
                <li>CSCI 512, Information Theory</li>
                <li>CSCI 545, Big Data Analytics</li>
             </ul>
                </div>
            </div><br>



        </div>
    </section>


    <div class="footer">
        <center>
                    <b>Designed by NULL TM </b> <br>
                
        </center>

    </div>

    <!-- MODAL MSG-->

<div class="modal fade bd-example-modal-sm-msg" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <center>
      <h2> Message</h2><hr>
     
             <input class="msg_input" placeholder="Message" type="password" name="password" /><br />
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
