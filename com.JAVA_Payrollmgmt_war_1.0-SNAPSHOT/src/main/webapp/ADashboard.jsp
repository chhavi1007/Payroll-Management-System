<%-- 
    Document   : ADashboard
    Created on : 29-Sept-2023, 11:53:03 pm
    Author     : 91744
--%>

<%@page import="java.sql.*, java.io.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <section class="text-gray-600 body-font">
  <div class="container px-5 py-24 mx-auto">
    <div class="flex flex-col text-center w-full mb-20">
      <h1 class="sm:text-4xl text-3xl font-medium title-font mb-2 text-gray-900">Welcome Admin</h1>
      <p class="lg:w-2/3 mx-auto leading-relaxed text-base">Employee Details</p>
    </div>
    <div class="lg:w-2/3 w-full mx-auto overflow-auto">
      <table class="table-auto w-full text-left whitespace-no-wrap">
        <thead>
          <tr>
            <th class="px-4 py-3 title-font tracking-wider font-medium text-gray-900 text-sm bg-gray-100 rounded-tl rounded-bl">Username</th>
            <th class="px-4 py-3 title-font tracking-wider font-medium text-gray-900 text-sm bg-gray-100">Password</th>
            <th class="px-4 py-3 title-font tracking-wider font-medium text-gray-900 text-sm bg-gray-100">Date</th>
            <th class="px-4 py-3 title-font tracking-wider font-medium text-gray-900 text-sm bg-gray-100">Basic Pay</th>
            <th class="w-10 title-font tracking-wider font-medium text-gray-900 text-sm bg-gray-100 rounded-tr rounded-br">Actions</th>
          </tr>
        </thead>
        <tbody>
            <%
            //JAVACODE
            try{
            
             String url="jdbc:mysql://localhost:3306/payroll", user="root", p="";
     
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, p);
          Statement st=con.createStatement();
          String q="SELECT * from employee";
          ResultSet rs=st.executeQuery(q);
          while(rs.next()){
                
          %>
            <tr>
                <td class="border-t-2 border-b-2 border-gray-200 px-4 py-3"><%= rs.getString(2) %></td>
            <td class="border-t-2 border-b-2 border-gray-200 px-4 py-3"><%= rs.getString(3) %></td>
            <td class="border-t-2 border-b-2 border-gray-200 px-4 py-3"><%= rs.getString(4) %></td>
            <td class="border-t-2 border-b-2 border-gray-200 px-4 py-3 text-lg text-gray-900"><%= rs.getString(5) %></td>
            <td class="border-t-2 border-b-2 border-gray-200 px-4 py-3">
                <a href="Edit.jsp?id=<%= rs.getString(1) %>">Edit User </a> 
                &nbsp;&nbsp;
                <a href="delete?id=<%= rs.getString(1) %>">Delete User </a> 
            </td>
          
          </tr>
          <%
              }
              }
      catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
          %>
          </tbody>
      </table>
    </div>
    <div class="flex pl-4 mt-4 lg:w-2/3 w-full mx-auto">
      
      <button class="flex ml-auto text-white bg-indigo-500 border-0 py-2 px-6 focus:outline-none hover:bg-indigo-600 rounded">Button</button>
    </div>
  </div>
</section>
    </body>
    
</html>
