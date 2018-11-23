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

    /*response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);*/

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
                <li><a class="nav-bar-user-a" href="/rest/profile/">PROFILE</a></li>
                <li><a class="nav-bar-user-a" href="logout">LOG OUT</a></li>
            </ul>
        </div>

    </div>
</div>

<section id="about">
    <div class="container">
        <div class="row scroll-me">
            <center>
                <div class="col-md-12">
                    <h4>Search Professor</h4>
                    <div class="box">
                        <div class="container-4">
                    <!--<input class="search_inputtt" placeholder="  Search..." type="text" name="search" /></li>-->
                            <form action="/Search" method="post">
                                <input id = "search" placeholder=" Search..." type="search" name="search" required/>
                                <button type="submit" class="icon" name="submit">SUBMIT</button>
                            </form>
                        </div>
                    </div>
                </div>
            </center>
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
