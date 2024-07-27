<%-- 
    Document   : EDashboard
    Created on : 29-Sept-2023, 11:53:14 pm
    Author     : 91744
--%>

<%@page import="java.sql.*,java.io.*,control.*,java.util.*,project.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <% //JAVACODE
            //HttpSession s=request.getSession(false);
            String user = services.user;
            String pass = services.pass;
                         String url="jdbc:mysql://localhost:3306/payroll", client="root", p="";
     try{                    
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, client, p);
          Statement st=con.createStatement();
          String q="SELECT * from employee where username='"+user+"' and password='"+pass+"'";
          ResultSet rs=st.executeQuery(q);
          if(rs.next()){
          //Date date=new Date();
         // int t=services.x;
        //  int d=services.find(date,rs.getDate(4));
        //  int pay=t*d;
        
        %>
        <%--HTML CODE--%>
        <section class="text-gray-600 body-font">
  <div class="container px-5 py-24 mx-auto">
    <div class="flex flex-col text-center w-full mb-20">
      <h1 class="sm:text-3xl text-2xl font-medium title-font mb-4 text-black">USER DETAILS</h1>
  
    </div>
    <div class="flex flex-wrap -m-4 text-center">
      <div class="p-4 md:w-1/4 sm:w-1/2 w-full">
        <div class="border-2 border-black px-4 py-6 rounded-lg">
          <h2 class="title-font font-medium text-3xl text-black">Name</h2>
          <p class="text-black leading-relaxed"><%= rs.getString(2) %></p>
          
        </div>
      </div>
      <div class="p-4 md:w-1/4 sm:w-1/2 w-full">
        <div class="border-2 border-black px-4 py-6 rounded-lg">
          <h2 class="title-font font-medium text-3xl text-black">Joining Date</h2>
          <p class="text-black leading-relaxed"><%= rs.getDate(4) %></p>
        </div>
      </div>
      <div class="p-4 md:w-1/4 sm:w-1/2 w-full">
        <div class="border-2 border-black px-4 py-6 rounded-lg">
          <h2 class="title-font font-medium text-3xl text-black">Basic Pay</h2>
          <p class="text-black leading-relaxed"><%= rs.getString(5) %></p>
        </div>
      </div>
      <div class="p-4 md:w-1/4 sm:w-1/2 w-full">
        <div class="border-2 border-black px-4 py-6 rounded-lg">
          <h2 class="title-font font-medium text-3xl text-black">Total Amount</h2>
          <p class="text-black leading-relaxed"><%= CheckLogin.x %></p>
        </div>
      </div>
    </div>
  </div>
</section>
        <%               }
             }
      catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        %>
        
<%@include file="Footer.jsp" %>
