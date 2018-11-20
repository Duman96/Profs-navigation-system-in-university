package com.programmerscuriosity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by marom on 27/09/16.
 */
@Path("professors")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("{id}")
    public Response getIt(@PathParam("id") String id) {
        MySqlConnect mysqlConnect = new MySqlConnect();
        System.out.println("ID is " + id);
        System.out.println("Type of id " + ((Object) id).getClass().getName());
        int foo = Integer.parseInt(id);
        String sql = "select * from professors where ID = " + foo;
        String result_n = null;
        String result_s = null;
        InputStream binaryStream = null;
        try {
//            PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();

            Connection conn = mysqlConnect.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.toString());

            while (rs.next()) {
                String sid = rs.getString(2);
                String lid = rs.getString(3);
                // Do whatever you want to do with these 2 values

                result_n = sid;
                result_s = lid;
                //System.out.println("Result is: " + result);
                binaryStream = rs.getBinaryStream(9);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }

        return Response.status(200).entity("<!DOCTYPE html>\n" +
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
                "    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n" +
                "    <!-- ION ICONS STYLES -->\n" +
                "    <link href=\"assets/css/ionicons.css\" rel=\"stylesheet\" />\n" +
                "    <!-- CUSTOM CSS -->\n" +
                "    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n" +
                "    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                "    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n" +
                "    <!--[if lt IE 9]>\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "   <div class=\"navbar navbar-default navbar-fixed-top scroll-me\">\n" +
                "        <!-- pass scroll-me class above a tags to starts scrolling -->\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"navbar-header\">\n" +
                "                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                </button>\n" +
                "                <a class=\"navbar-brand\" href=\"index.jsp\">\n" +
                "                 <strong>NULL</strong>   \n" +
                "                </a>\n" +
                "\n" +
                "            </div>\n" +
                "            <div class=\"navbar-collapse collapse\">\n" +
                "                <ul class=\"nav navbar-nav navbar-right\">\n" +
                "\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"profs.jsp\">PROFESSOR</a></li>\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"#features\">COURSES</a></li>\n" +
                "                    <li><a class=\"nav-bar-a\"href=\"about_us.jsp\">ABOUT US</a></li>\n" +
                "                    <li><a class=\"nav-bar-user-a\" href=\"profile_s.jsp\">PROFILE</a></li>\n" +
                "                    <li><a class=\"nav-bar-user-a\" href=\"logout\">LOG OUT</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "\n" +
                "        </div>\n" +
                "    </div>\n" +
                "<section id=\"about\">\n" +
                "        <div class=\"container\">\n" +
                "\n" +
                "\n" +
                "            <div class=\"row scroll-me\">\n" +
                "                <div class=\"col-md-4\">\n" +
                "                    <h4>"+result_n + " " + result_s +"</h4>\n" +
                "                    <h5>Assistant Proffesor</h5>\n" +
                "\n" +
                "                   <img src=\"assets/img/mark_sterling.jpeg\" class=\"prof_img\">\n" +
                "                   <h5>School of Science and Technology</h5>\n" +
                "                    <h5>Computer Science</h5>\n" +
                "                        <div style=\"margin-left:-20px;\"class=\"col-md-10 col-10 col-lg-10 col-xl-10\"> \n" +
                "                            <a href=\"#subscribe\" data-toggle=\"modal\" data-target=\".bd-example-modal-sm-msg\"  class=\"btn btn-custom btn-two profile_btn\"><b class=\"avatar_type_1\"><img src=\"assets/img/message.png\">Write a Message</b></a>\n" +
                "                        </div>\n" +
                "                </div>\n" +
                "                <div class=\"col-md-4\">\n" +
                "                    <h4>Bio</h4>\n" +
                "                    <p>\n" +
                "                    <strong> "+result_n + " " + result_s +"</strong>  received the B.S. degree in Electrical and Computer Engineering from the\n" +
                "University of Rochester, Rochester, NY in 2002 and the M.S. and Ph.D. degrees in Electrical and Computer\n" +
                "Engineering from the University of Rochester, Rochester NY, in 2004 and 2010 respectively. He held post-\n" +
                "doctoral positions at the University of Rochester and Rochester Institute of Technology from 2010 to 2014.\n" +
                "He is currently Assistant Professor in the Department of Computer Science, School of Science and\n" +
                "Technology, Nazarbayev University and has published articles in IEEE Transactions and served on technical\n" +
                "committees of international conferences. His research interests include biomedical and audio signal\n" +
                "processing as applied to translational medicine and mobile sensing.\n" +
                "                    </p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "   \n" +
                "    <div class=\"footer\">\n" +
                "        <center>\n" +
                "                    <b>Designed by NULL TM </b> <br>\n" +
                "                \n" +
                "        </center>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "<div class=\"modal fade bd-example-modal-sm-msg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n" +
                "  <div class=\"modal-dialog modal-sm\">\n" +
                "    <div class=\"modal-content\">\n" +
                "        <center>\n" +
                "      <h2> Message</h2><hr>\n" +
                "     \n" +
                "             <input class=\"msg_input\" placeholder=\"Message\" type=\"text\" name=\"password\" /><br />\n" +
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
                "</html>\n")
                .build();
    }
}