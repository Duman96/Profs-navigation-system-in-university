package webapp;

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

public class DeleteComment extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("val-comm");
        System.out.println("ID IS !!!: " + id);

        String[] parts = id.split("/");

        int nid = Integer.parseInt(parts[0]);


        try {
            MySqlConnect mysqlConnect = new MySqlConnect();
            Connection conn = mysqlConnect.connect();
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = null;
            String referer = request.getHeader("Referer");
            System.out.println("It is "+ referer);

            String sql = "delete from comments where ID = " + nid;
            System.out.println("SQL is" + sql);
            st.executeUpdate(sql);
            response.sendRedirect(request.getHeader("Referer"));

            //PrintWriter out = response.getWriter();
            //out.println("Your comment was successfully deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
