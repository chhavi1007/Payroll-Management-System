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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 91744
 */
@WebServlet("/dashboard")
public class Dashboard extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<html>"
                + "<head>"
                + "<title>Dashboard</title>"
                + "</head>"
                + ""
                + "<body>"
                + "<table border='2'>"
                + "<th>USERNAME</th>"
                + "<th>PASSWORD</th>"
                + "<th>E-MAIL</th>"
                + "<th>ACTIONS</th>");
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * from client");
            
            while(rs.next()){
                out.println("<tr>"
                        + "<td>"+rs.getString(2)+"</td>"
                        + "<td>"+rs.getString(3)+"</td>"
                        + "<td>"+rs.getString(4)+"</td>"
                        + "<td><a href='edit?id="+rs.getString("ID")+"'>EDIT</a>"
                                + "&nbsp <a href='delete?id="+rs.getString("ID")+"'>DELETE</a>"
                        + "</tr>");
            }
            
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
                
                 out.println("<a href='/DemoWeb/'><input type='submit' value='LogOut'></a> <br> <br> "
                         + "<a href='add'>ADD USER</a>"
                         + ""
                         + "</body>"
                         + "</html>");
    }
        
    
}
