/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 91744
 */

@WebServlet("/")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        out.println("<html>"
                + "<head><title>HOME</title></head>"
                + "<body>"
                + "<h1>WELCOME !!</h1>"
                + "<form action='checklogin' method='get'>"
                + "Username &nbsp <input type='text' name='user' placeholder='Enter Username' ><br><br>"
                + "Password &nbsp <input type='password' name='pass' placeholder='Enter Password'><br><br>"
                + ""
                + "<input type='submit' value='Login'> &nbsp"
                + "<br>" 
                + "</form>"
                + "Don't have an account? <a href='register'> &nbsp REGISTER Here!</a>"
                + "</body>"
                + "</html>");
    }
    
    
}
