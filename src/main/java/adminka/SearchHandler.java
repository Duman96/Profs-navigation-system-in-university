package adminka;

import com.programmerscuriosity.MySqlConnect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchHandler extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String total = null;

        try {
            MySqlConnect mysqlConnect = new MySqlConnect();
            Connection conn = mysqlConnect.connect();
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = null;
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>\n" +
                    "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"utf-8\" />\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n" +
                    "    <meta name=\"description\" content=\"\" />\n" +
                    "    <meta name=\"author\" content=\"\" />\n" +
                    "    <!--[if IE]>\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                    "    <![endif]-->\n" +
                    "    <title>Just App - Landing Page</title>\n" +
                    "    <!-- BOOTSTRAP CORE CSS -->\n" +
                    "    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n" +
                    "    <!-- ION ICONS STYLES -->\n" +
                    "    <link href=\"assets/css/ionicons.css\" rel=\"stylesheet\" />\n" +
                    "    <!-- CUSTOM CSS -->\n" +
                    "    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n" +
                    "    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                    "       <!--[if lt IE 9]>\n" +
                    "    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                    "    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                    "    <![endif]-->\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div class=\"navbar navbar-default navbar-fixed-top scroll-me\">\n" +
                    "    <!-- pass scroll-me class above a tags to starts scrolling -->\n" +
                    "    <div class=\"container\">\n" +
                    "        <div class=\"navbar-header\">\n" +
                    "            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                    "                <span class=\"icon-bar\"></span>\n" +
                    "                <span class=\"icon-bar\"></span>\n" +
                    "                <span class=\"icon-bar\"></span>\n" +
                    "            </button>\n" +
                    "            <a class=\"navbar-brand\" href=\"index.html\">\n" +
                    "                <strong>NULL</strong>\n" +
                    "            </a>\n" +
                    "\n" +
                    "        </div>\n" +
                    "        <div class=\"navbar-collapse collapse\">\n" +
                    "            <ul class=\"nav navbar-nav navbar-right\">\n" +
                    "\n" +
                    "                <li><a class=\"nav-bar-a\"href=\"profs.html\">PROFESSOR</a></li>\n" +
                    "                <li><a class=\"nav-bar-a\"href=\"#features\">COURSES</a></li>\n" +
                    "                <li><a class=\"nav-bar-a\"href=\"about_us.html\">ABOUT US</a></li>\n" +
                    "                <li><a class=\"nav-bar-user-a\" href=\"profile_s.html\">PROFILE</a></li>\n" +
                    "                <li><a class=\"nav-bar-user-a\" href=\"about.html\">LOG OUT</a></li>\n" +
                    "            </ul>\n" +
                    "        </div>\n" +
                    "\n" +
                    "    </div>\n" +
                    "</div>\n");

            String sql = "select * from professors";
            System.out.println("SQL is" + sql);
            st.executeQuery(sql);

            out.println("<section id=\"about\">\n" +
                    "        <div class=\"container\">\n" +
                    "<!--SEARCH INPUT-->\n" +
                    "    <div class=\"row scroll-me\">\n" +
                    "        <div class=\"col-md-12\">\n" +
                    "            <center>\n" +
                    "            <h4>Search Proffessor</h4>\n" +
                    "            <div class=\"box\">\n" +
                    "             <form action=\"/SearchUser\" method=\"post\">" +
                    "<input type=\"search\" id=\"search\" placeholder=\"Search...\" name=\"search\">" +
                    "<button type=\"submit\" name = \"submit\" class=\"icon\">Search</button>" +
                    "</form>"+
                    "            </div>" +
                    "    </div>\n" +
                    "    </div><br>\n" +
                    "        </div>\n" +
                    "</section>");


            while(rs.next()){
                total += "<h2>" + rs.getString(2) + " " + rs.getString(3) + "</h2>\n";
                total += "<h3> Nickname: " + rs.getString(4) + "</h3>\n";
                total += "<h3> Email: " + rs.getString(5) + "</h3>\n";

                out.println("<section id=\"about\">\n" +
                        "    <div class=\"container\">\n" +
                        "        <div class=\"row scroll-me\">\n" +
                        "            <center>\n" +
                        "                <div class=\"col-md-12\">\n" +
                        "                    <h1>" + rs.getString(2) + " " + rs.getString(3) + "</h1>\n" +
                        "<h2> Nickname: " + rs.getString(4) + "</h2>\n" +
                        "<h3> Email: " + rs.getString(5)  + "</h3>\n" +
                        "<form action=\"/DeleteUser\" method=\"post\" id=\"lgn\" >" +
                        "<input id=\"di\" class=\"sign_input\" placeholder=\"Enter comment\" type=\"text\" name=\"val-comm\" value = " + rs.getString(1) + "/>" +
                        "<input id=\"val-submit\" type=\"submit\" class=\"submit-sign\"  name=\"delete\" value=\"DELETE\">" +
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

            out.println("Your professor was successfully deleted!");
            request.getRequestDispatcher("/profSearch.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
