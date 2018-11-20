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
                    <h4>"+result_n + " " + result_s +"</h4>
                    <h5>Assistant Proffesor</h5>

                   <img src="assets/img/mark_sterling.jpeg" class="prof_img">
                   <h5>School of Science and Technology</h5>
                    <h5>Computer Science</h5>
                        <div style="margin-left:-20px;"class="col-md-10 col-10 col-lg-10 col-xl-10"> 
                            <a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-msg"  class="btn btn-custom btn-two profile_btn"><b class="avatar_type_1"><img src="assets/img/message.png">Write a Message</b></a>
                        </div>
                </div>
                <div class="col-md-4">
                    <h4>Bio</h4>
                    <p>
                    <strong> "+result_n + " " + result_s +"</strong>  received the B.S. degree in Electrical and Computer Engineering from the
University of Rochester, Rochester, NY in 2002 and the M.S. and Ph.D. degrees in Electrical and Computer
Engineering from the University of Rochester, Rochester NY, in 2004 and 2010 respectively. He held post-
doctoral positions at the University of Rochester and Rochester Institute of Technology from 2010 to 2014.
He is currently Assistant Professor in the Department of Computer Science, School of Science and
Technology, Nazarbayev University and has published articles in IEEE Transactions and served on technical
committees of international conferences. His research interests include biomedical and audio signal
processing as applied to translational medicine and mobile sensing.
                    </p>
                </div>
            </div>
        </div>
    </section>

    <div class="footer">
        <center>
                    <b>Designed by NULL TM </b> <br>
                
        </center>

    </div>

<div class="modal fade bd-example-modal-sm-msg" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
        <center>
      <h2> Message</h2><hr>
     
             <input class="msg_input" placeholder="Message" type="text" name="password" /><br />
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
