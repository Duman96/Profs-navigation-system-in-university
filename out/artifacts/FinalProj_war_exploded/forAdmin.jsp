<%--
  Created by IntelliJ IDEA.
  User: nurda
  Date: 11/20/18
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Page</title>
    <script src="scripts/underscore.js"></script>
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/lodash.min.js"></script>
    <script type="text/javascript">
        items = [];
        function updateList(){
            $("#my-list").html("");
            var newlist= items.split(",");

            for (var j = 0, len = newlist.length; j<len; j++){
                newlist[j] = newlist[j].replace("\"", "");
                newlist[j] = newlist[j].replace("[", "");
                newlist[j] = newlist[j].replace("]", "");
                newlist[j] = newlist[j].replace("\n", "");
                $("#my-list").append("<li>"+ newlist[j]+ "<button type=\"submit\" class=\"delete-btn-comment\"  style=\"background: url(assets/img/delete.png);background-repeat: no-repeat;background-position: center; background-size: 20px 20px; height:40px;\" value=\"del\" id= \"del\" onclick = \"del(" + j + ")\"> </button> </li>" );
            }



          /* [].forEach.call(items, function (e) {
                $("#my-list").append("<li>" + e + "</li>" );
            });*/

        }

        function del(index){
            $.post("forAdmin", { method: "del", index: index}, function() {
                getListItems();
            });
        }
        
        function getListItems() {
            $.ajax(
                {
                    url: 'forAdmin',
                    datatype: 'json',
                    success : function(r){
                        console.log(r);
                        items = r;
                        console.log(items);
                        updateList();

                    }
                });

        }
        function getListofProfsorUsers(){
            var s=$("#searchin").val();
            $.post("forAdmin", { searching: s, method: "post"}, function(){
                getListItems();
            } );


        }

        $(document).ready(function (){
            $("#my-list").append("<li>test");
            getListItems();

            $("#submit").on('click', function(){
                getListofProfsorUsers();
            });


        });
    </script>

    <!-- Basic Page Needs
  ================================================== -->
    <meta charset="utf-8">
    <title>NULL ADMIN</title>
    <meta name="description" content="Free Responsive Html5 Css3 Templates | Zerotheme.com">
    <meta name="author" content="http://www.Zerotheme.com">
    
    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
      <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- ION ICONS STYLES -->
    <link href="assets/css/ionicons.css" rel="stylesheet" />
    <!-- CUSTOM CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />
    
    <!-- CSS
    ================================================== -->
    <link rel="stylesheet" href="admin/css/zerogrid.css">
    <link rel="stylesheet" href="admin/css/style.css">
    
    <!-- Custom Fonts -->
    <link href="admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    
    <link rel="stylesheet" href="admin/css/menu.css">
    <!-- jQuery Core Javascript -->
    <script src="admin/js/jquery.min.js"></script>
    <script src="admin/js/script.js"></script>
    
    <!-- Owl Stylesheets -->
    <link rel="stylesheet" href="admin/owlcarousel/assets/owl.carousel.min.css">
    


</head>



<body class="sub-page">
    <div class="wrap-body">
        
        <header class="main-header">
            <div class="zerogrid">
                <div class="row">
                    <div class="col-1-3">

                    </div>
                    <div class="col-2-3">
                        <!-- Menu-main -->
                        <div id='cssmenu' class="align-right">
                            <ul>
                               <li><a href='index.jsp'><span>Home</span></a></li>
                               <li><a href='adminIndex.jsp.jsp'><span>Admin</span></a></li>
                               
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        
        <!--////////////////////////////////////Container-->
        <section id="container" class="zerogrid">
            <div class="wrap-container">
                <!-----------------Content-Box-------------------->
                <article class="single-post">
                    <div class="row wrap-post"><!--Start Box-->
                        <div class="entry-header">

                            <h1 class="entry-title">LIST OF USERS</h1>

                        </div>      

                <div class="col-md-12">
                   <h5>List of users</h5>

                    <ul id ="my-list">
                        <li> Feel my blood running</li>
                        <li> breathin</li>
                    </ul>


                </div>
 

                            

                <div class="col-md-12">
                   <!--BUTTONS-->

                        <center>

                        <div id="comment">
                            <a href = "forAdmin"> List of profs</a>
                            <h1>Enter your text:</h1><br>
                            <input type="text" class="admin_input" type="text" id="searchin" placeholder="users/profs..."  required>

                          <center><input class="button button-skin nav-bar-a" type="submit" id="submit" value="SUBMIT"></center>


                                                                

                        </div>
                        </center>
                </div>


                        

                    </div>
                </article>

<!-- HERE IS SOME HEDERS AND INPUTS IF NEEDED-->
                    <div class="comments-are">

                        <div id="comment">
                        </div>
                    </div>
            </div>
        </section>
        
        <!--////////////////////////////////////Footer-->





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
