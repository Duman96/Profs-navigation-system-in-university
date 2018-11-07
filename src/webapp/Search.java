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

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            String firstname = request.getParameter("first_name");
            String lastname = request.getParameter("last_name");
            String username = request.getParameter("username");
            String id = request.getParameter("id");


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seproj"+
                    "?verifyServerCertificate=false"+
                    "&useSSL=false"+
                    "&requireSSL=false"+
                    "&useLegacyDatetimeCode=false"+
                    "&amp"+
                    "&serverTimezone=UTC", "root", "");

            String sql = "SELECT * FROM professors WHERE FirstName LIKE '%$search%' OR Surname LIKE '%$search%' OR School LIKE '%$search%' OR Department LIKE '%$search%'";
            ResultSet rs;
            Statement st;

            st = conn.createStatement();
            rs = st.executeQuery(sql);
            PrintWriter out = response.getWriter();

            int count = 0;
            while(rs.next()){
                count ++;
            }
            System.out.println(count);

            if(count > 0){
                for(int i = 0; i < count; i++){
                    out.println("There are " + count + " results matching your search.");
                }
            }


        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException sx){
            sx.printStackTrace();
        }


    }
}
