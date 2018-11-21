package com.programmerscuriosity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.io.*;
import java.sql.*;


@Path("profile")
public class MyProfile {

    @Context private HttpServletRequest request;
    @GET
    //@Produces(MediaType.TEXT_HTML)
    //@Path("{id}")
    public String getUser () throws IOException, SQLException, ServletException {

        MySqlConnect mysqlConnect = new MySqlConnect();
        //System.out.println("ID is " + id);
        //System.out.println("Type of id " + ((Object) id).getClass().getName());
        //int foo = Integer.parseInt(id);
        String name = null;
        String surname = null;
        String username = null;
        String email = null;
        String sid = null;
        username = request.getSession().getAttribute("username").toString();

        String sql = "SELECT * FROM users WHERE user_nickname = \"" + username + "\"";
        System.out.println(sql);
        System.out.println(username);

        //System.out.println("User is : " + username + " " + password);

        //String query = "User is : " + username + " " + password;

        ResultSet rs = null;
        try {
//            PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();

            Connection conn = mysqlConnect.connect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs.toString());
            //PrintWriter out = response.getWriter();

            if (rs.next()) {

                name = rs.getString(2);
                surname = rs.getString(3);
                email = rs.getString(5);
                sid = rs.getString(6);
                System.out.println(name + " " + surname);
                System.out.println("Username is "+ username);

            }else{

                //out.println("Error");
                System.out.println("Error");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }

        String query = "<!DOCTYPE html>\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n" +
                "    <meta name=\"description\" content=\"\" />\n" +
                "    <meta name=\"author\" content=\"\" />\n" +
                "    <!--[if IE]>\n" +
                "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "        <![endif]-->\n" +
                "    <title>Just App - Landing Page</title>\n" +
                "    <!-- BOOTSTRAP CORE CSS -->\n" +
                "    <link href=\"http://localhost:8080/assets/css/bootstrap.css\" rel=\"stylesheet\" />\n" +
                "    <!-- ION ICONS STYLES -->\n" +
                "    <link href=\"http://localhost:8080/assets/css/ionicons.css\" rel=\"stylesheet\" />\n" +
                "    <!-- CUSTOM CSS -->\n" +
                "    <link href=\"http://localhost:8080/assets/css/style.css\" rel=\"stylesheet\" />\n" +
                "    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                "    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n" +
                "    <!--[if lt IE 9]>\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<%\n" +
                "\n" +
                "    response.setHeader(\"Cache-Control\", \"no-cache, no-store, must-revalidate\");\n" +
                "    response.setHeader(\"Pragma\", \"no-cache\");\n" +
                "    response.setDateHeader(\"Expires\", 0);\n" +
                "\n" +
                "    if(session.getAttribute(\"username\") == null){\n" +
                "        response.sendRedirect(\"/index.jsp\");\n" +
                "    }\n" +
                "\n" +
                "%>\n" +
                "   <div class=\"navbar navbar-default navbar-fixed-top scroll-me\">\n" +
                "        <!-- pass scroll-me class above a tags to starts scrolling -->\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"navbar-header\">\n" +
                "                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                </button>\n" +
                "                <a class=\"navbar-brand\" href=\"http://localhost:8080/index.jsp\">\n" +
                "                 <strong>NULL</strong>   \n" +
                "                </a>\n" +
                "            </div>\n" +
                "            <div class=\"navbar-collapse collapse\">\n" +
                "                <ul class=\"nav navbar-nav navbar-right\">\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"http://localhost:8080/profs.jsp\">PROFESSOR</a></li>\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"#features\">COURSES</a></li>\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"http://localhost:8080/about_us.jsp\">ABOUT US</a></li>\n" +
                "                    <li><a class=\"nav-bar-user-a\" href=\"http://localhost:8080/rest/profile\">PROFILE</a></li>\n" +
                "                    <li><a class=\"nav-bar-user-a\" href=\"http://localhost:8080/logout\">LOG OUT</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "<section id=\"about\">\n" +
                "        <div class=\"container\">\n" +
                "\n" +
                "\n" +
                "                                    <div class=\"row scroll-me\">\n" +
                "                <div class=\"col-md-4\">\n" +
                "                    <h4>"+ name + " " + surname + "</h4>\n" +
                "                    <h5>NU Student</h5>\n" +
                "                  <img style=\"border:3px solid #16A8C2;margin-top:5px;margin-bottom:5px;\"src=\"http://localhost:8080/assets/img/change2.jpg\" class=\"team_img\">\n" +
                "                   \n" +
                "                   <h5>School of Science and Technology</h5>\n" +
                "                    <h5>ID:" + sid + "</h5>\n" +
                "                    <div style=\"margin-left:-20px;\"class=\"col-md-10 col-10 col-lg-10 col-xl-10\"> \n" +
                "                        <a href=\"#subscribe\" data-toggle=\"modal\" data-target=\".bd-example-modal-sm-msg\"  class=\"btn btn-custom btn-two profile_btn\"><b class=\"avatar_type_1\"><img src=\"http://localhost:8080/assets/img/avatar.png\">Change Avatar</b></a>\n" +
                "                     \n" +
                "                        <!--<a href=\"#subscribe\" data-toggle=\"modal\" data-target=\".bd-example-modal-sm-msg\"  class=\"btn btn-custom btn-two profile_btn\"><b class=\"avatar_type_1\"><img src=\"http://localhost:8080/assets/img/avatar.png\">Change Avatar</b></a>-->\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"col-md-4 bio_div\">\n" +
                "                    <h4>Bio</h4>\n" +
                "                        <br>\n" +
                "                        <b> 3rd Grade </b>\n" +
                "                        <p> Grade </p>\n" +
                "                        <b> Astana </b>\n" +
                "                        <p> Hometown </p>\n" +
                "                        <b>" + sid + "</b>\n" +
                "                        <p> Student ID </p>\n" +
                "                        <b>" + email + "</b>\n" +
                "                        <p> E-mail </p>\n" +
                "                        \n" +
                "\n" +
                "                 \n" +
                "                </div>\n" +
                "                <div class=\"col-md-4\">\n" +
                "               <h4>Courses Taken</h4>\n" +
                "               <ul>\n" +
                "                <li>CSCI 111 – Web Programming & Problem Solving Course.</li>\n" +
                "                <li>CSCI 151 – Programming for Scientists and Engineers Lab</li>\n" +
                "                <li>CSCI 152 – Data Stuctures</li>\n" +
                "                <li>CSCI 245 – System Analysis and Design.</li>\n" +
                "                <li>CSCI 262 – Software Project Management.</li>\n" +
                "                <li>CSCI 330, Mobile Computing</li>\n" +
                "                <li>CSCI 336, Ubiquity and Sensing</li>\n" +
                "                <li>CSCI 344, Data Mining and Decision Support</li> \n" +
                "                <li>CSCI 361, Software Engineering</li>\n" +
                "                <li>CSCI 455, Scripting Languages</li>\n" +
                "                <li>CSCI 512, Information Theory</li>\n" +
                "                <li>CSCI 545, Big Data Analytics</li>\n" +
                "             </ul>\n" +
                "                </div>\n" +
                "            </div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "\n" +
                "    <div class=\"footer\">\n" +
                "        <center>\n" +
                "                    <b>Designed by NULL TM </b> <br>\n" +
                "                \n" +
                "        </center>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "    <!-- MODAL MSG-->\n" +
                "\n" +
                "<div class=\"modal fade bd-example-modal-sm-msg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n" +
                "  <div class=\"modal-dialog modal-sm\">\n" +
                "    <div class=\"modal-content\">\n" +
                "        <center>\n" +
                "      <h2> Message</h2><hr>\n" +
                "     \n" +
                "             <input class=\"msg_input\" placeholder=\"Message\" type=\"password\" name=\"password\" /><br />\n" +
                "             <hr>\n" +
                "            <input type=\"submit\" class=\"submit-sign\"  name=\"submit\" value=\"SUBMIT\">\n" +
                "    </form>\n" +
                "        </center>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->\n" +
                "    <!-- CORE JQUERY  SCRIPTS -->\n" +
                "    <script src=\"assets/js/jquery-1.11.1.js\"></script>\n" +
                "    <!-- BOOTSTRAP SCRIPTS  -->\n" +
                "    <script src=\"assets/js/bootstrap.js\"></script>\n" +
                "    <!-- SCROLLING SCRIPTS PLUGIN  -->\n" +
                "    <script src=\"assets/js/jquery.easing.min.js\"></script>\n" +
                "    <!-- CUSTOM SCRIPTS   -->\n" +
                "    <script src=\"assets/js/custom.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";

        return query;
    }
}
