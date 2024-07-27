/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

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
@WebServlet("/kuu")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
      
      resp.setContentType("text/html");
      PrintWriter out=resp.getWriter();
      
      out.println("<html> "
              + "<head><title>LOGIN PAGE</title>"
              + "<style>"
              + "body { background-image:url('textile.jpg');"
              + "background-repeat:no-repeat;"
              + "background-attachment:fixed;"
              + "background-size: 100% 100%}"
              + "</style>"
              + "</head>"
              + "<body>"
              + "<h1><marquee>WELCOME TO KOMAL ENTERPRISES</marquee></h1><br><br>"
              + "<form action='checklogin' method='get'>"
              + "Username &nbsp <input type='text' name='user' placeholder='Enter Username'><br><br>"
              + "Password &nbsp <input type='password' name='pass' placeholder='Enter Password'<br><br>"
              + "<br><input type='submit' value='Login'> &nbsp"
              + "<br>"
              + "</form>"
              + "<br><a href='register'>REGISTER HERE! </a>"
              + "</body>"
              + "</html");
    }
    
}
