<%-- 
    Document   : inside_categories
    Created on : Nov 5, 2016, 10:36:35 AM
    Author     : deepika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login-add remove member</title>
       <link rel="stylesheet" href="styles/home_categories_css.css" type="text/css"/>
    <link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet'>
    </head>
    <body>
        
        <%@include file="header.jsp" %>
         
         <br><br><br><br><br>
         
         <section class="form-style-5">
        <form action = "" enctype="multipart/form-data" >
            <fieldset>
                    <legend><span class="number">1</span> User Info</legend>
                    <input type="text" name="fullName" placeholder="Full Name *">
                    <input type="email" name="userName" placeholder="Your Email/Userid *">
                    <input type="password" name="password" placeholder="password *" >
                    <input type="password" name="conPassword" placeholder="Confirm password *" >
                    
      <input type="submit" value = "Add member"> 
      
      <input type="reset" value = "Reset"> 
      
      
      </form>
          </section>
    </body>
</html>
