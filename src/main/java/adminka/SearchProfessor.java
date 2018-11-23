package adminka;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

//@WebServlet(name = "Search")
public class SearchProfessor extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            String searchy = request.getParameter("search");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.10.3.14:3306/nullteam" +
                    "?verifyServerCertificate=false" +
                    "&useSSL=false" +
                    "&requireSSL=false" +
                    "&useLegacyDatetimeCode=false" +
                    "&amp" +
                    "&serverTimezone=UTC", "nullteam", "helloworld2");

            System.out.println("Profs with this name");
            //String sql = "SELECT * FROM professors WHERE FirstName LIKE '%$search%' OR Surname LIKE '%$search%' OR School LIKE '%$search%' OR Department LIKE '%$search%'";

            String sql = "SELECT * FROM professors WHERE Professor_name='" + searchy + "' OR Professor_surname='" + searchy + "' OR School='" + searchy
                    + "' OR Department='" + searchy + "' OR Professor_name LIKE '"+searchy+"%' OR Professor_surname LIKE '"+searchy+"%'";

            ResultSet rs;
            Statement st;
            String x;
            String ns = null;
            int id = 0;
            st = conn.createStatement();
            rs = st.executeQuery(sql);



            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
            out.println("<head>\n" +
                    "    <meta charset=\"utf-8\" />\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n" +
                    "    <meta name=\"description\" content=\"\" />\n" +
                    "    <meta name=\"author\" content=\"\" />\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                    "    <title>Just App - Landing Page</title>\n" +
                    "    <link href=\"http://localhost:8080/assets/css/bootstrap.css\" rel=\"stylesheet\" />\n" +
                    "    <link href=\"http://localhost:8080/assets/css/ionicons.css\" rel=\"stylesheet\" />\n" +
                    "    <link href=\"http://localhost:8080/assets/css/style.css\" rel=\"stylesheet\" />\n" +
                    "        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                    "        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                    "</head>");
            out.println("<body>");
            out.println(" <div class=\"navbar navbar-default navbar-fixed-top scroll-me\">\n" +
                    "        <div class=\"container\">\n" +
                    "            <div class=\"navbar-header\">\n" +
                    "                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                    "                    <span class=\"icon-bar\"></span>\n" +
                    "                    <span class=\"icon-bar\"></span>\n" +
                    "                    <span class=\"icon-bar\"></span>\n" +
                    "                </button>\n" +
                    "                <a class=\"navbar-brand\" href=\"index.html\">\n" +
                    "                 <strong>NULL</strong>   \n" +
                    "                </a>\n" +
                    "            </div>\n" +
                    "            <div class=\"navbar-collapse collapse\">\n" +
                    "                <ul class=\"nav navbar-nav navbar-right\">\n" +
                    "                    <li><a class=\"nav-bar-a\"href=\"profs.html\">PROFESSOR</a></li>\n" +
                    "                    <li><a class=\"nav-bar-a\"href=\"#features\">COURSES</a></li>\n" +
                    "                    <li><a class=\"nav-bar-a\"href=\"about_us.html\">ABOUT US</a></li>\n" +
                    "                    <li><a class=\"nav-bar-user-a\" href=\"profile_s.html\">PROFILE</a></li>\n" +
                    "                    <li><a class=\"nav-bar-user-a\" href=\"about.html\">LOG OUT</a></li>\n" +
                    "                </ul>\n" +
                    "            </div>\n" +
                    "\n" +
                    "        </div>\n" +
                    "    </div>");
            out.println("<section id=\"about\">\n" +
                    "        <div class=\"container\">\n" +
                    "    <div class=\"row scroll-me\">\n" +
                    "        <div class=\"col-md-12\">\n" +
                    "            <center>\n" +
                    "            <h4>Search Proffessor</h4>\n" +
                    "            <div class=\"box\">\n" +
                    "              <div class=\"container-4\">\n" +
                    "                <input type=\"search\" id=\"search\" placeholder=\"Search...\" />\n" +
                    "                <button class=\"icon\">Search</button>\n" +
                    "              </div>\n" +
                    "            </div>" +
                    "    </div>\n" +
                    "    </div><br>\n" +
                    "        </div>\n" +
                    "</section>");



            int count = 0;
            while(rs.next()){

                count ++;
                id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                String surname = rs.getString(3);

                ns = name + " " + surname;
                String pos = rs.getString(6);
                String school = rs.getString(4);
                String dept = rs.getString(5);

                String ref = "http://localhost:8080/rest/professors/" + id;
                out.println("<section id=\"about\">\n" +
                        "    <div class=\"container\">\n" +
                        "        <div class=\"row scroll-me\">\n" +
                        "            <center>\n" +
                        "                <div class=\"col-md-12\">\n" +
                        "                    <h1><a href = " + ref + ">" + ns + "</a></h1>\n" +
                        "                     <h2>" + pos + ", " + dept + ", " + school + "</h2>\n" +
                                "<form action=\"/DeleteProfessor\" method=\"post\" id=\"lgn\" >" +
                                "<input hidden id=\"di\" class=\"sign_input\" placeholder=\"Enter comment\" type=\"text\" name=\"val-comm\" value = " + rs.getString(1) + "/>" +
                                "<input id=\"val-submit\" type=\"submit\" class=\"submit-sign\"  name=\"delete\" value=\"DELETE\">" +
                                "</form>" +

                                "<form action=\"/UpdateProfessor\" method=\"post\" id=\"lgn\" >" +
                                "<input hidden id=\"di\" class=\"sign_input\" placeholder=\"Enter comment\" type=\"text\" name=\"val-upd\" value = " + rs.getString(1) + ">" +
                                "<input id=\"val-submit\" type=\"submit\" class=\"submit-sign\"  name=\"update\" value=\"UPDATE\">" +
                                "</form>" +
                        "                </div>\n" +
                        "            </center>\n" +
                        "        </div><br>\n" +
                        "    </div>\n" +
                        "</section>");


            }
            out.println("<div class=\"footer\">\n" +
                    "    <center>\n" +
                    "        <b>Designed by NULL TM </b> <br>\n" +
                    "    </center>\n" +
                    "</div>\n" +
                    "<script src=\"assets/js/jquery-1.11.1.js\"></script>\n" +
                    "<script src=\"assets/js/bootstrap.js\"></script>\n" +
                    "<script src=\"assets/js/jquery.easing.min.js\"></script>\n" +
                    "<script src=\"assets/js/custom.js\"></script>\n" +
                    "</body>\n" +
                    "</html>");
            System.out.println(count);


        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException sx){
            sx.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
