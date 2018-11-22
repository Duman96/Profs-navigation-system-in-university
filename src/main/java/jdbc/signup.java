package jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.security.*;

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
            String conpassword = request.getParameter("conpassword");

            /*if(firstname.isEmpty() || lastname.isEmpty() || username.isEmpty() || id.isEmpty() || email.isEmpty() || password.isEmpty()){

            }*/
            ResultSet rs, rs1;
            Statement st, st1;

            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.10.3.14:3306/nullteam","nullteam", "helloworld2");

            String query = "SELECT * FROM students WHERE Student_Name = \""+ firstname + "\" AND Student_surname = \"" + lastname + "\" AND Student_ID = \"" + id + "\"";
            String query1 = "SELECT * FROM users WHERE user_nickname = \""+ username + "\" AND user_studentid = \"" + id + "\"";
            st = conn.createStatement();
            st1 = conn.createStatement();
            rs = st.executeQuery(query);
            rs1 = st1.executeQuery(query1);
            String generatedPassword = getString(password);


            if(!password.equals(conpassword)){
                request.setAttribute("error", "Passwords must match each other");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }else{
                if(rs.next()) {

                    if(rs1.next()){
                        request.setAttribute("error2", "Login already taken");
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    }else{
                    String sql = "insert into users(user_name, user_surname, user_nickname, user_studentid, user_email, user_pwd) values(\"" + firstname + "\", \"" + lastname + "\",\"" + username + "\",\"" + id + "\",\"" + email + "\",\"" + generatedPassword + "\")";

                    System.out.println(sql);

                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                    //PrintWriter out = response.getWriter();
                    //out.println("Success yeah");
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                }
                }else{
                    request.setAttribute("error1", "You must be a NU student to access this site");
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                }
        }}
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static String getString(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(password.getBytes());

            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            password = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return password;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("Registration Successful");
    }
}
