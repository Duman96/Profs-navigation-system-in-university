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
img {
  max-width: 100%;
  vertical-align: middle;
}
body{
    background:#000;
    
}

.trigger {
  display: none;
}

.slider, .slider-wrapper {
  position: relative;
  height: 1000px;
}

.slide {
  background-color: black;
  width: 100%;
  overflow: hidden;
  position: absolute;
  height: 100%;
  left: 0;
  top: 0;
  z-index: 5000;
  opacity: 0;
  transition: opacity .5s ease-in-out;
}

.slide-img {
  filter: brightness(50%);
  height: 100%;
  object-fit: fill;
  display: block;
  margin: 0 auto;
}

.slide-figure {
  height: 100%;
  position: relative;
  margin: 0;
}

.slide-caption {
  position: absolute;
  bottom: 30%;
  width: calc(100% - 1rem);
  color: white;
  text-align: center;
 
}

.trigger:checked + .slide {
  z-index: 6000;
  opacity: 1;
}

.slider-nav {
  width: 100%;
  text-align: center;
  margin: 1rem 0;
}

.slider-nav__item {

}

.slider-nav__label {
  font-size: 13px;
  display: block;
  height: 3em;
  background: #000;
  line-height: 3em;
  width: 3em;
  text-align: center;
  border-radius: 50%;
  color: white;
  cursor: pointer;
  transition: background-color 1s, color 1s ease-in-out;
}

.slider-nav__label:hover,
.slider-nav__label:active,
.slider-nav__label:focus {
  background: #fff;
  color: black;
}
/*@media only screen and (min-width: 1024px) {
  .slider, .slider-wrapper {
    height: 1000px;
  }

  .slide-caption {
    width: 65%;
    font-size: 1.5rem;
  }
}

@media only screen and (max-width: 1023px) and (min-width: 768px) {
  .slider, .slider-wrapper {
    height: 800px;
  }

  .slide-caption {
    width: 75%;
    font-size: 1.25rem;
  }
}

@media only screen and (min-width: 768px) {
  .slide-img {
    width: 100%;
    height: auto;
  }
}*/
.slide {
  position: absolute;
  z-index: 5000;
  ...
  opacity: 0;
  transition: opacity .5s ease-in-out;
}

.trigger:checked + .slide {
  z-index: 6000;
  opacity: 1;
}

    </style>
    <script type="text/javascript">
        jQuery(document).ready(function ($) {

  $('#checkbox').change(function(){
    setInterval(function () {
        moveRight();
    }, 3000);
  });
  
    var slideCount = $('#slider ul li').length;
    var slideWidth = $('#slider ul li').width();
    var slideHeight = $('#slider ul li').height();
    var sliderUlWidth = slideCount * slideWidth;
    
    $('#slider').css({ width: slideWidth, height: slideHeight });
    
    $('#slider ul').css({ width: sliderUlWidth, marginLeft: - slideWidth });
    
    $('#slider ul li:last-child').prependTo('#slider ul');

    function moveLeft() {
        $('#slider ul').animate({
            left: + slideWidth
        }, 200, function () {
            $('#slider ul li:last-child').prependTo('#slider ul');
            $('#slider ul').css('left', '');
        });
    };

    function moveRight() {
        $('#slider ul').animate({
            left: - slideWidth
        }, 200, function () {
            $('#slider ul li:first-child').appendTo('#slider ul');
            $('#slider ul').css('left', '');
        });
    };

    $('a.control_prev').click(function () {
        moveLeft();
    });

    $('a.control_next').click(function () {
        moveRight();
    });

});    

    </script>
</head>
<body class="admin_body">

<%

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

    if(session.getAttribute("username") == null){
        response.sendRedirect("/index.jsp");
    }

%>
                        <!--<img class="admin_body_img" src="assets/img/background_a.png">
                         <div  class="admin_body_login col-md-10 col-10 col-lg-10 col-xl-10"> 
                            <a href="#subscribe" data-toggle="modal" data-target=".bd-example-modal-sm-msg"  class="btn btn-custom btn-two profile_btn"><b class="avatar_type_1"><img src="assets/img/message.png">Write a Message</b></a>
                        </div>-->

                            <div class="slider-wrapper">
                              <div class="slider">
                                <input type="radio" name="slider" class="trigger" id="one" checked="checked" />
                                <div class="slide">
                                  <figure class="slide-figure">
               
                               
                                  </figure><!-- .slide-figure -->
                                </div><!-- .slide -->
                                <input type="radio" name="slider" class="trigger" id="two" />
                                <div class="slide">
                                  <figure class="slide-figure">
                                  
                                    <figcaption class="slide-caption">

                                        <h2> Welcome Master</h2><hr>
                                                       <form action="reg.php" method="post">
                                                        <p>
                                                        <input class="sign_input" placeholder="Login" type="text" name="login" /><br />
                                                         </p>
                                                         <input class="sign_input" placeholder="Password" type="password" name="password" /><br />
                                                         <hr>
                                                        <input type="submit" style="opacity:0" name="submit" value="SUBMIT">
                                                 </form>

                                    </figcaption>
                                  </figure><!-- .slide-figure -->
                                </div><!-- .slide -->
                                <input type="radio" name="slider" class="trigger" id="three" />
                      
                              </div><!-- .slider -->
                              <ul class="slider-nav">
                                <li class="slider-nav__item"><label class="slider-nav__label" for="two"><img src="assets/img/avatar.png"></label></li>
                              </ul><!-- .slider-nav -->
                            </div><!-- .slider-wrapper -->
</body>
</html>
