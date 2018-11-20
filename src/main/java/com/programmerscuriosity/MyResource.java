package com.programmerscuriosity;

import org.glassfish.jersey.internal.util.Base64;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Arrays;
import java.util.Iterator;

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
    public String getIt(@PathParam("id") String id) throws IOException, SQLException {
        MySqlConnect mysqlConnect = new MySqlConnect();
        System.out.println("ID is " + id);
        System.out.println("Type of id " + ((Object) id).getClass().getName());
        int foo = Integer.parseInt(id);
        String sql = "select * from professors where ID = " + foo;
        String result_n = null;
        String result_s = null;
        String result_school = null;
        String result_dep = null;
        String result_pos= null;
        String result_bio = null;
        Blob b = null;

        ResultSet rs = null;
        try {
//            PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();

            Connection conn = mysqlConnect.connect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs.toString());

            while (rs.next()) {
                result_n = rs.getString(2);
                result_s = rs.getString(3);
                result_school = rs.getString(4);
                result_dep = rs.getString(5);
                result_pos = rs.getString(6);
                result_bio = rs.getString(7);
                // Do whatever you want to do with these 2 values

                //System.out.println("Result is: " + result);
                b = rs.getBlob(9);
                System.out.println("BLOB IS: \n");
                //System.out.println(Arrays.toString(blob));

                //photo64 = new String(b.getBytes(1l, (int) b.length()));


            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mysqlConnect.disconnect();
        }
        String imgsrc = "data:image/jpg;base64," + b;
        String str = "Dana";
        String html = "<!DOCTYPE html>\n" +
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
                "    <link href=\"http://localhost:8080/assets/css/bootstrap.css\" rel=\"stylesheet\" />\n" +
                "    <link href=\"http://localhost:8080/assets/css/ionicons.css\" rel=\"stylesheet\" />\n" +
                "    <link href=\"http://localhost:8080/assets/css/style.css\" rel=\"stylesheet\" />\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                "        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                "</head>\n" +
                "   <div class=\"navbar navbar-default navbar-fixed-top scroll-me\">\n" +
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
                "                    <li><a class=\"nav-bar-user-a\" href=\"http://localhost:8080/profile_s.jsp\">PROFILE</a></li>\n" +
                "                    <li><a class=\"nav-bar-user-a\" href=\"http://localhost:8080/logout\">LOG OUT</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "<section id=\"about\">\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"row scroll-me\">\n" +
                "                <div class=\"col-md-4\">\n" +
                "                    <h4>"+ result_n + " " + result_s + "</h4>\n" +
                "                    <h5>" + result_pos + "</h5>\n" +
                "                    <img src=\"http://localhost:8080/assets/profpic/" + id +".jpg\"" + " class=\"prof_img\">\n" +
                "                    <h5>" + result_school + "</h5>\n" +
                "                    <h5>" + result_dep + "</h5>\n" +
                "                          <div style=\"margin-left:-20px;\"class=\"col-md-10 col-10 col-lg-10 col-xl-10\"> \n" +
                "                            <a href=\"#subscribe\" data-toggle=\"modal\" data-target=\".bd-example-modal-sm-msg\"  class=\"btn btn-custom btn-two profile_btn\"><b class=\"avatar_type_1\">\n" +
                "                                <img src=\"http://localhost:8080/assets/img/message.png\">Write a Message</b></a>\n" +
                "                          </div>\n" +
                "                </div>\n" +
                "                <div class=\"col-md-4\">\n" +
                "                    <h4>Bio</h4>\n" +
                "                    <p>\n" +
                                        result_bio +
                "                    </p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <br>\n" +
                "        </div>\n" +
                "</section>\n" +
                "    <div class=\"footer\">\n" +
                "        <center>\n" +
                "                    <b>Designed by NULL TM </b> <br>       \n" +
                "        </center>\n" +
                "    </div>\n" +
                "    <script src=\"http://localhost:8080/assets/js/jquery-1.11.1.js\"></script>\n" +
                "    <script src=\"http://localhost:8080/assets/js/bootstrap.js\"></script>\n" +
                "    <script src=\"http://localhost:8080/assets/js/jquery.easing.min.js\"></script>\n" +
                "    <script src=\"http://localhost:8080/assets/js/custom.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";
        return html;

    }
}