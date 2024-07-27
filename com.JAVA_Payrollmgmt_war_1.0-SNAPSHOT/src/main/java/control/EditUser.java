/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.sql.*;

/**
 *
 * @author 91744
 */
@WebServlet("/edituser")
public class EditUser extends HttpServlet {
public static String s;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //  super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        resp.setContentType("text/html");
        String id = req.getParameter("id"), invertedComma="'", comma=",";
EditUser.s=id;
            String username = req.getParameter("user");
            String password = req.getParameter("pass");
            String pay = req.getParameter("pay");
            //String contact = req.getParameter("contact");
            //String address = req.getParameter("address");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "");   
                /* StringBuilder query = new StringBuilder("update users set Username=");
                query.append(invertedComma).append(username).append(invertedComma).append(comma);
                query.append(" Password=").append(invertedComma).append(password).append(invertedComma).append(comma);
                query.append(" Email=").append(invertedComma).append(email).append(invertedComma).append(comma);
                query.append(" Contact=").append(invertedComma).append(contact).append(invertedComma).append(comma);
                query.append(" Address=").append(invertedComma).append(address).append(invertedComma);
                query.append(" where Id=").append(id);
                
                Statement statement = connection.createStatement();
                if (statement.executeUpdate(query.toString()) == 1) {
                     resp.sendRedirect("/MavenForm/dashboard");
                }
                */
                
                
                
                //'?', Password='?', Email='?', Contact='?', Address='?' where Id="+id+");
                PreparedStatement preparedStatement = connection.prepareStatement("update employee set USERNAME=?, PASSWORD=?, BASICPAY=? where ID="+id+";");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setInt(3, Integer.parseInt(pay));
               // preparedStatement.setString(4, contact);
               // preparedStatement.setString(5, address);
                if (preparedStatement.executeUpdate() == 1) {
                    resp.sendRedirect("ADashboard.jsp");
                }
            
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        
}
}

