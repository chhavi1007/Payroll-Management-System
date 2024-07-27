<%-- 
    Document   : loginpayroll
    Created on : 25-Sept-2023, 7:37:25 pm
    Author     : 91744
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body {
background-image:url('textile.png');
background-repeat:no-repeat;
background-attachment:fixed;
background-size: 100% 100%
}
</style>
 <script src="https://cdn.tailwindcss.com"></script>

    </head>
    
    <body>
    --%>
    <%@include file="Header.jsp" %>
    <div class="text-3xl">
    <marquee><b>WELCOME TO KOMAL ENTERPRISES</b></marquee></h1><br><br>
</div>
    <form action='checklogin' method='get'>
        <%-- <h2><b>Username</b></h2> &nbsp; <input type='text' name='user' placeholder='Enter Username'><br><br>
    <h2><b>Password</b></h2> &nbsp; <input type='password' name='pass' placeholder='Enter Password'<br><br>
    <br><input type='submit' value='Login'> &nbsp;
    <br> --%>
    
        
        <div class="relative mb-4 w-1/4">
        <label for="user" class="leading-7 text-sm text-gray-600">Username</label>
        <input type="text" id="user" name="user" class="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
      </div>
        <div class="relative mb-4 w-1/4">
        <label for="pass" class="leading-7 text-sm text-gray-600">Password</label>
        <input type="password" id="pass" name="pass" class="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
      </div>
   
      <button class="text-white bg-orange-500 border-0 py-2 px-8 focus:outline-none hover:bg-orange-600 rounded text-lg">LOGIN</button>
</form>
    </div> 
    <br>
    <br>
    
    <%@include file="Footer.jsp" %>
    
