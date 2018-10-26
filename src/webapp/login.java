package webapp;

import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.*;

//@WebServlet(name = "login")
public class login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User userObject = new User();

        request.setAttribute("username", request.getParameter("login"));
        request.setAttribute("password", request.getParameter("password"));


        if(userObject.isAdmin(request.getParameter("login"), request.getParameter("password"))){
            request.getRequestDispatcher("/admin.jsp").forward(request, response);
        }
        else if(userObject.isValidUserCredentials(request.getParameter("login"), request.getParameter("password"))){

            HttpSession session = request.getSession();
            session.setAttribute("username", request.getParameter("login"));
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage", "Invalid login or password. Try again");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.print("Login: "+request.getParameter("login")+" Password: "+request.getParameter("password"));

    }
}
