/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import java.sql.Statement;
import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 91744
 */
@WebServlet("/checklogin")
public class check extends HttpServlet{
   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
      
      String username = req.getParameter("user");
      String password =req.getParameter("pass");
      
      
      
     
        try{
            
             String url="jdbc:mysql://localhost:3306/db1", user="root", p="";
     
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, p);
          Statement st=con.createStatement();
          String q="SELECT USERNAME,PASSWORD from client where USERNAME='"+username+"' and PASSWORD='"+password+"'";
          
          ResultSet rs=st.executeQuery(q);
          if(rs.next()){
              //out.println(username + "&nbsp" + password); 
              resp.sendRedirect("dashboard");
          }
          
         // con.close();
          
        
         }
      catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}