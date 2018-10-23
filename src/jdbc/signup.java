package jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//@WebServlet(name = "signup")
public class signup extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public signup()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try
        {
            String firstname = request.getParameter("first_name");
            String lastname = request.getParameter("last_name");
            String username = request.getParameter("username");
            String id = request.getParameter("id");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            String sql = "insert into users(user_name, user_surname, user_nickname, user_studentid, user_email, user_pwd) values(\""+ firstname + "\", \""+lastname+"\",\""+ username + "\",\""+id+"\",\""+email+"\",\""+password+"\")";

            System.out.println(sql);

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seproj"+
                    "?verifyServerCertificate=false"+
                    "&useSSL=false"+
                    "&requireSSL=false"+
                    "&useLegacyDatetimeCode=false"+
                    "&amp"+
                    "&serverTimezone=UTC", "root", "");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            //PrintWriter out = response.getWriter();
            //out.println("Success yeah");
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("Registration Successful");
    }
}
