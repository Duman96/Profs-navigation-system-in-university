package webapp;

import com.programmerscuriosity.MySqlConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@WebServlet(name = "login")
public class Delete extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            MySqlConnect mysqlConnect = new MySqlConnect();
            Connection conn = mysqlConnect.connect();
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String username = request.getSession().getAttribute("username").toString();

            String sql = "select * from comments where From_User = " + username;

            rs = st.executeQuery(sql);


        }catch(SQLException ex){
            ex.printStackTrace();
        }

    }
}