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

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>


</head>

<style>
    #home {
        background: url(http://localhost:8080/assets/img/admin.jpg) no-repeat center center; /*Full Witdth background image*/
        padding: 0;
        -webkit-background-size: cover;
        background-size: cover;
        -moz-background-size: cover;
    }
</style>
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
            <a class="navbar-brand" href="adminIndex.jsp">
                <strong>NULL</strong>
            </a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a class="nav-bar-a"href="profSearch.jsp">PROFESSOR</a></li>
                <li><a class="nav-bar-a"href="userSearch.jsp">USERS</a></li>
                <li><a class="nav-bar-a"href="about_us.jsp">ABOUT US</a></li>
                <li><a class="nav-bar-user-a" href="logout">LOG OUT</a></li>


            </ul>
        </div>

    </div>
</div>
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
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <a href = "userSearch.jsp" class="btn btn-custom btn-two">Change users</a>
                        <a style = "width: 250px;" href = "profSearch.jsp" class="btn btn-custom btn-two">Change professors</a>
                            <a href = "profAdd.jsp" class="btn btn-custom btn-two">Add professors</a>
                    <a style = "width: 300px;" href = "forAdmin.jsp" class="btn btn-custom btn-two">Change Everything with AJAX</a>
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

NG-IN-->

<div class="modal fade bd-example-modal-sm-sign-in" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div style = "width: 800px" class="modal-content" id="sgn">
            <center>
                <h2> Sign In</h2><hr>
                <form action="/login" method="post" id="lgn">
                    <p>
                        <input id="val-login" class="sign_input" placeholder="Login" type="text" name="login" /><br />
                    </p>
                    <input id="val-pwd" class="sign_input" placeholder="Password" type="password" name="password" /><br />
                    <br>
                    <br>
                    <div class="g-recaptcha"
                         data-sitekey="6LfWdnwUAAAAANdcMj8QwkepO33pANBpgnuF2YJZ"></div>
                    <hr>
                    <input id="val-submit" type="submit" class="submit-sign"  name="submit" value="SUBMIT">

                </form>
                <center><p class="error" style="color:red;">${errorMessage}</p></center>
            </center>
        </div>
    </div>
</div>

<!-- MODAL SING-UP-->

<div class="modal fade bd-example-modal-sm-sign-up" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">


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
