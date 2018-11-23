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

public class UpdateProfessor extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("val-upd");
        int nid = Integer.parseInt(id);

        PrintWriter out = response.getWriter();

        String name = null;
        String surname = null;
        String school = null;
        String dept = null;
        String position = null;
        String bio = null;
        String email = null;

        try {
            MySqlConnect mysqlConnect = new MySqlConnect();
            Connection conn = mysqlConnect.connect();
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = null;

            String sql = "select * from professors where ID = " + nid;
            System.out.println("SQL is" + sql);
            rs = st.executeQuery(sql);

            while(rs.next()) {
                name = rs.getString(2);
                 surname = rs.getString(3);
                 school = rs.getString(4);
                 dept = rs.getString(5);
                 position = rs.getString(6);
                 bio = rs.getString(7);
                 email = rs.getString(8);
                System.out.println(name);
                System.out.println(surname);
                System.out.println(school);
                System.out.println(dept);
                System.out.println(position);
                System.out.println(bio);
                System.out.println(email);
            }

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
                    "    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n" +
                    "    <!--[if lt IE 9]>\n" +
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
                    "</div>\n" +
                    "\n" +
                    "<section id=\"about\">\n" +
                    "    <div class=\"container\">\n" +
                    "\n" +
                    "        <!--SEARCH INPUT-->\n" +
                    "        <div class=\"row scroll-me\">\n" +
                    "\n" +
                    "            <div class=\"col-md-12\">\n" +
                    "                <center>\n" +
                    "                    <h4>Update Professor</h4>\n" +
                    "\n" +
                    "                            <form action=\"/UpdateProfessorFinal\" method=\"post\">\n" +
                                                    "<input hidden class=\"container-4 box\" type=\"text\"  placeholder=\"ID\" name=\"id\" value = \"" + id + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\"  placeholder=\"Name\" name=\"name\" value = \"" + name + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\" placeholder=\"Surname\" name=\"surname\" value = \"" + surname + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\"  placeholder=\"School\" name=\"school\" value = \"" + school + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\" placeholder=\"Department\" name=\"dept\" value = \"" + dept + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\" placeholder=\"Position\" name=\"position\" value = \""+ position + "\"> <br><br>\n" +
                    "                                <input class=\"container-4 box\" type=\"text\" placeholder=\"Position\" name=\"position\" value = \""+ email + "\"> <br><br>\n" +
                    "                                <textarea style = \"height: 150px;\" class=\"container-4 box\" type=\"text\" placeholder=\"Bio\" name=\"bio\" >" + bio +  "</textarea> <br><br>\n" +
                    "                                <br>\n" +
                    "                                <button type=\"submit\" name = \"submit\" >UPDATE</button>\n" +
                    "                            </form>\n" +
                    "                </center>\n" +
                    "            </div>\n" +
                    "        </div><br>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    </div>\n" +
                    "</section>\n" +
                    "\n" +
                    "\n" +
                    "<div class=\"footer\">\n" +
                    "    <center>\n" +
                    "        <b>Designed by NULL TM </b> <br>\n" +
                    "\n" +
                    "    </center>\n" +
                    "\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- MODAL MSG-->\n" +
                    "\n" +
                    "<div class=\"modal fade bd-example-modal-sm-msg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n" +
                    "    <div class=\"modal-dialog modal-sm\">\n" +
                    "        <div class=\"modal-content\">\n" +
                    "            <center>\n" +
                    "                <h2> Message</h2><hr>\n" +
                    "\n" +
                    "                <input class=\"msg_input\" placeholder=\"Message\" type=\"text\" name=\"password\" /><br />\n" +
                    "                <hr>\n" +
                    "                <input type=\"submit\" class=\"submit-sign\"  name=\"submit\" value=\"SUBMIT\">\n" +
                    "                </form>\n" +
                    "            </center>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>\n" +
                    "\n" +
                    "\n" +
                    "<!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->\n" +
                    "<!-- CORE JQUERY  SCRIPTS -->\n" +
                    "<script src=\"assets/js/jquery-1.11.1.js\"></script>\n" +
                    "<!-- BOOTSTRAP SCRIPTS  -->\n" +
                    "<script src=\"assets/js/bootstrap.js\"></script>\n" +
                    "<!-- SCROLLING SCRIPTS PLUGIN  -->\n" +
                    "<script src=\"assets/js/jquery.easing.min.js\"></script>\n" +
                    "<!-- CUSTOM SCRIPTS   -->\n" +
                    "<script src=\"assets/js/custom.js\"></script>\n" +
                    "</body>\n" +
                    "</html>\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
