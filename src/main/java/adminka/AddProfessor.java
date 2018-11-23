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

public class AddProfessor extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       // String id = request.getParameter("id");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String school = request.getParameter("school");
        String dept = request.getParameter("dept");
        String position = request.getParameter("position");
        String bio = request.getParameter("bio");
        String email = request.getParameter("email");

       // System.out.println("ID IS !!!: " + id);




        try {
            MySqlConnect mysqlConnect = new MySqlConnect();
            Connection conn = mysqlConnect.connect();
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = null;

            String sql = "insert into professors (Professor_name, Professor_surname, School, Department, Position, Bio, Email) values" +
                    "(\"" + name + "\",\"" + surname + "\",\"" + school + "\",\"" + dept + "\",\"" + position + "\",\"" + bio + "\",\"" + email + "\")";
            System.out.println("SQL is" + sql);
            st.executeUpdate(sql);


            PrintWriter out = response.getWriter();
            out.println("Your professor was successfully added!");
            request.getRequestDispatcher("/profAdd.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
