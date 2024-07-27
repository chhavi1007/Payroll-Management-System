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
@WebServlet("/register")
public class register extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    resp.setContentType("text/html");
    PrintWriter out=resp.getWriter();
    
    out.println("<html>"
            + "<head><title>REGISTER HERE</title></head>"
            + "<body><h2>WELCOME</h2>"
            + "<form action='registeruser' method='get'>"
            + "<table>"
            + "<tr>"
            + "<td>Userame: </td>"
            + "<td><input type='text' placeholder='Name' name='user'></td> "
            + "</tr>"
            + "<tr>"
            + "<td>Password: </td>"
            + "<td><input type='password' placeholder='Password' name='pass' ></td>"
            + "</tr>"
            + "<tr>"
            + "<td>E-mail: </td>"
            + "<td><input type='email' placeholder='Email' name='email'></td>"
            + "</tr>"
            + "</table>"
            + ""
            + "</form>"
            + "</body>"
            + "</html>");
    
    
    }
    
}
