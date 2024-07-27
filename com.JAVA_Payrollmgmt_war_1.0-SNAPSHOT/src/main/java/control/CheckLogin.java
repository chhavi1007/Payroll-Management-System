/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import project.TotalPay;

/**
 *
 * @author 91744
 */
@WebServlet("/checklogin")
public class CheckLogin extends HttpServlet{
    public static int x;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
      
      String username = req.getParameter("user");
      String password =req.getParameter("pass");
      
      
      
     
        try{
            
             String url="jdbc:mysql://localhost:3306/payroll", user="root", p="";
     
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, p);
          Statement st=con.createStatement();
          String q="SELECT * from employee where Username='"+username+"' and Password='"+password+"'";
          String q2="SELECT Username,Password from admin where Username='"+username+"' and Password='"+password+"'";
          ResultSet rs=st.executeQuery(q);
          Statement st2=con.createStatement();
          ResultSet rs2=st2.executeQuery(q2);
          if(rs.next()){
              //out.println(username + "&nbsp" + password); 
              //HttpSession hs=req.getSession();
              //hs.setAttribute("user", username);
              //hs.setAttribute("pass",password);
              services.user=username;
              services.pass=password;
              x=TotalPay.getPay(con, rs.getInt(1));
            //  services.d=rs.getDate(4);
              resp.sendRedirect("EDashboard.jsp");
              //RequestDispatcher rd=req.getRequestDispatcher("/EDashboard.jsp");
              //rd.forward(req, resp);
          } else if(rs2.next()){
              resp.sendRedirect("ADashboard.jsp");
              
          }
          
         // con.close();
          
        
         }
      catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
