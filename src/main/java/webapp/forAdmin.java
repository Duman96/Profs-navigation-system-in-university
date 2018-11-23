package webapp;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

//@WebServlet(urlPatterns="forAdmin")
public class forAdmin extends HttpServlet {
    private static List<String> listp = new ArrayList<String>();

    public forAdmin(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        Gson gson = new Gson();
        out.append(gson.toJson(listp));
        //request.getHeader("Referer");
        //response.sendRedirect("forAdmin.jsp");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
            String toDisplay = request.getParameter("searching");
            String method = request.getParameter("method");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://10.10.3.14:3306/nullteam" +
                    "?verifyServerCertificate=false" +
                    "&useSSL=false" +
                    "&requireSSL=false" +
                    "&useLegacyDatetimeCode=false" +
                    "&amp" +
                    "&serverTimezone=UTC", "nullteam", "helloworld2");

            if (method.equals("post")) {
                if (toDisplay.equals("profs")) {
                    listp.clear();
                    String sql = "SELECT * FROM professors";
                    ResultSet rs;
                    Statement st;
                    String x;
                    String ns = null;
                    int id = 0;
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {

                        id = Integer.parseInt(rs.getString(1));
                        String name = rs.getString(2);
                        String surname = rs.getString(3);
                        ns = name + " " + surname;
                        String pos = rs.getString(6);
                        String school = rs.getString(4);
                        String dept = rs.getString(5);
                        String email12 = rs.getString(8);
                        String ID = Integer.toString(id);
                        String sent = ID + " " + ns + " " + email12;
                        listp.add(sent);
                        id++;
                    }
                }

                else if (toDisplay.equals("users")){
                    listp.clear();
                    String sql = "SELECT * FROM users";
                    ResultSet rs = null;
                    Statement st = null;
                    String ns = null;
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    int id = 0;
                    while (rs.next()) {

                        id = Integer.parseInt(rs.getString(1));
                        String name = rs.getString(2);
                        String surname = rs.getString(3);
                        ns = name + " " + surname;
                        String email1 = rs.getString(5);
                        String school = rs.getString(4);
                        String ID= Integer.toString(id);
                        String sent1 = ID + " " +ns + " " + email1;
                        listp.add(sent1);
                        id++;
                    }

                }
            }

            else if(method.equals("del")) {
                int i = Integer.parseInt(request.getParameter("index"));
                String emailorname = listp.get(i);
                String[] email=emailorname.split(" ");
                System.out.println(email[0]);
                System.out.println(email[1]);
                System.out.println(email[2]);
                System.out.println(email[3]);

                int k = 1;
                String sqlprof = "SELECT * FROM professors";
                ResultSet rs;
                Statement st = conn.createStatement();
                rs = st.executeQuery(sqlprof);
                while(rs.next()){
                    while(email[k-1].equals(rs.getString(1)) && email[k].equals(rs.getString(2))){
                        System.out.println(email[k]);
                        System.out.println("found it");
                        String sql2 = "Delete FROM professors WHERE ID=\"" + email[k-1] + "\"";
                        Statement st2 = conn.createStatement();
                        st2.executeUpdate(sql2);
                        listp.remove(i);
                        k++;

                    }
                }


                k=1;
                String sqluser = "SELECT * FROM users";
                ResultSet rs1;
                Statement st1;
                st1 = conn.createStatement();
                rs1 = st1.executeQuery(sqluser);
                while(rs1.next()){

                    System.out.println("it will enter here");

                    while(email[k-1].equals(rs1.getString(1)) && email[k].equals(rs1.getString(2))){
                        listp.remove(i);
                        System.out.println(email[k]);
                        System.out.println("found her");
                        String sql3 = "Delete FROM users WHERE user_id=\"" + email[k-1] + "\"";
                        Statement st3 = conn.createStatement();
                        st3.executeUpdate(sql3);
                        k++;
                    }


                }


               /* while(email[k].endsWith("@nu.edu.kz")){
                    System.out.println(email[k]);
                    String sql1 = "Delete FROM users WHERE user_email=\"" + email[k] + "\"";
                    String sql2 = "Delete FROM professors WHERE Email=\"" + email[k] + "\"";
                    Statement st = null;
                    st = conn.createStatement();
                    st.executeUpdate(sql1);
                    st.executeUpdate(sql2);*/
                   /* if (st.executeUpdate(sql1)){
                        String sql1 = "Delete FROM professors WHERE Email=\"" + email[k] + "\"";
                        st.executeUpdate(sql1);
                    };*/
                }





           // }
           /* if (userprofs.equals("users")) {
                String sql = "SELECT * FROM users";
                ResultSet rs = null;
                Statement st = null;
                String x;
                String ns = null;
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                int id = 0;
                while (rs.next()) {

                    id = Integer.parseInt(rs.getString(1));
                    String name = rs.getString(2);
                    String surname = rs.getString(3);

                    ns = name + " " + surname;
                    String email1 = rs.getString(5);
                    String studid = rs.getString(6);
                    out.println(id + " users   " + ns + "email1:   " + email1 + "id    " + studid);
                    id++;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException sx) {
            sx.printStackTrace();
        }
    }


}