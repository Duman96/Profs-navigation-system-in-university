package webapp;

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
public class Search extends HttpServlet {

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

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"white\">");


            int count = 0;
            while(rs.next()){

                count ++;
                id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                String surname = rs.getString(3);

                ns = name + " " + surname;

//                out.print(x+" ");
//                x = rs.getString(4);
//                out.print(x+" ");
//                x = rs.getString(5);
//                out.println(x);
//                x = rs.getString(6);
//                out.println(x);
//                out.println();
//                x = rs.getString(7);
//                if(x != null) out.println(x);
//                else out.println("No BIO yet");
//                out.println();
//                x = rs.getString(8);
//                if(x != null) out.println(x);
//                else out.println("No email yet");
//                out.println("******************************************************************************************************************");

                String ref = "http://localhost:8080/rest/professors/" + id;
                out.println("<h1> TOTAL NAME IS: <a href = " + ref + ">" + ns + "</a></h1> ");
                out.println("</body>");
                out.println("</html>");
                System.out.println(count);
            }



        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException sx){
            sx.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
