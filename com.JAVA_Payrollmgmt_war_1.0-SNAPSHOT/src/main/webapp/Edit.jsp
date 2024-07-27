<%-- 
    Document   : Edit
    Created on : 30-Sept-2023, 1:06:11 am
    Author     : 91744
--%>

<%@page import="java.sql.*,java.io.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
         <%
            //JAVACODE
            try{
            String id=request.getParameter("id");
             String url="jdbc:mysql://localhost:3306/payroll", user="root", p="";
     
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, p);
          Statement st=con.createStatement();
          String q="SELECT * from employee where Id="+id;
          ResultSet rs=st.executeQuery(q);
          if(rs.next()){
                
          %>
          <form action="edituser" method="get">
              <input type="hidden" value="<%= rs.getString(1) %>" name="id">
        <div class="relative mb-4 w-1/4">
        <label for="user" class="leading-7 text-sm text-gray-600">Username</label>
        <input type="text" id="user" name="user" value="<%= rs.getString(2) %>" class="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
      </div>
        <div class="relative mb-4 w-1/4">
        <label for="pass" class="leading-7 text-sm text-gray-600">Password</label>
        <input type="text" id="pass" name="pass" value="<%= rs.getString(3) %>" class="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
      </div>
        <div class="relative mb-4 w-1/4">
        <label for="pay" class="leading-7 text-sm text-gray-600">Basic Pay</label>
        <input type="number" id="pay" name="pay" value="<%= rs.getString(5) %>" class="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
      </div>
      <button class="flex ml-auto text-white bg-indigo-500 border-0 py-2 px-6 focus:outline-none hover:bg-indigo-600 rounded">Edit</button>
          </form>
       <%
              }
              }
      catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
          %>
          
    </body>
</html>
