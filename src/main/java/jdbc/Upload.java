//package jdbc;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.io.*;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Iterator;
//import java.util.List;
//import com.programmerscuriosity.MySqlConnect;
//
//
//public class Upload extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request,
//                          HttpServletResponse response) throws ServletException, IOException {
//
//        MySqlConnect mysqlConnect = new MySqlConnect();
//        ResultSet rs = null;
//        String username = request.getSession().getAttribute("username").toString();
//        String sql = "select * from users where user_nickname = \"" + username + "\"";
//        String img = null;
//        Part part = request.getPart("file");
//        String filename = extractFileName(part);
//
//        try{
//
//            Connection conn = mysqlConnect.connect();
//            Statement stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                img = rs.getString(8);
//            }
//
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }
//
//
//    }
//}
