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

public class DeleteProfessor extends HttpServlet {

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

            String sql = "delete from professors where ID = " + nid;
            System.out.println("SQL is" + sql);
            st.executeUpdate(sql);


            PrintWriter out = response.getWriter();
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
