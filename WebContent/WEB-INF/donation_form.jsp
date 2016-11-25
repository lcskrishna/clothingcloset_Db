<%-- 
    Document   : inside_categories
    Created on : Nov 5, 2016, 10:36:35 AM
    Author     : deepika
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<title>donation form</title>
<link rel="stylesheet" href="styles/home_categories_css.css"
	type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Bitter'
	rel='stylesheet'>
</head>
<body>

	<%@include file="header.jsp"%>

	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<h1 id="myid">
			Clothing Closet <br>
			<br> <img
				src="http://www.whiteriveranimalrescue.org/donation2.jpg"
				alt="no image" width="200" height="200" />
		</h1>
		<br>
	</center>
	
	
	<form:form method="POST" action="/ClothingCloset/donate/donateItem">
   <table cellspacing="15px" align="center" font-size="205px">
    <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="dateOfDonation">Date of Donation</form:label></td>
        <td><form:input path="dateOfDonation" required="true"/></td>
    </tr>
    <tr>
          <td><form:label path="itemName">Item Name</form:label></td>
        <td><form:select path="itemName">
        	<form:option value="Belt"></form:option>
        	<form:option value="Sunglasses"></form:option>
        	<form:option value="Shoe"></form:option>
        	<form:option value="Caps"></form:option>
        	<form:option value="Wallets"></form:option>
        	<form:option value="T-Shirts"></form:option>
        	<form:option value="Formal Shirts"></form:option>
        	<form:option value="Sweat Shirts"></form:option>
        	<form:option value="Hoods"></form:option>
        	<form:option value="Blazers"></form:option>
        	<form:option value="Swim wears"></form:option>
        	<form:option value="Jeans"></form:option>
        	<form:option value="Shorts"></form:option>
        	<form:option value="Track Pants"></form:option>
        	<form:option value="Jeggings"></form:option>
        	<form:option value="Shrugs"></form:option>
        	<form:option value="Kurtas"></form:option>
        	<form:option value="Sarees"></form:option>
        	<form:option value="Dress Materials"></form:option>
        	<form:option value="Shawls"></form:option>  
        </form:select></td>
        <%-- <td><form:input path="gender" /></td> --%>
    </tr>
    
    <tr>
        <td><form:label path="size">Size</form:label></td>
        <td><td><form:select path="size">
        	<form:option value="S"></form:option>
        	<form:option value="M"></form:option>
        	<form:option value="L"></form:option>
        	<form:option value="XL"></form:option>	
        	</form:select>
        	</td>
    </tr>
    <tr>
        <td><form:label path="quantity" >Quantity</form:label></td>
        <td><form:input path="quantity" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="color" >Color</form:label></td>
        <td><form:input path="color" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="item_Condition" >State</form:label></td>
        <td><form:select path="item_Condition">
        	<form:option value="Good"></form:option>
        	<form:option value="Excellent"></form:option>
        	<form:option value="Average"></form:option>
        	</form:select>
        	</td>
    </tr>
    <tr>
        <td><form:label path="description" >Description</form:label></td>
        <td><form:input path="description" /></td>
    </tr>
      <tr>
          <td><form:label path="gender">Gender</form:label></td>
        <td><form:select path="gender">
        	<form:option value="Male"></form:option>
        	<form:option value="Female"></form:option> 
        </form:select></td>
        <%-- <td><form:input path="gender" /></td> --%>
    </tr>
	
	 <tr>
        <td><form:label path="brand" >Brand</form:label></td>
        <td><form:input path="brand" required="true"/></td>
    </tr>

    
    

    
    <tr>
        <td colspan="2">
            <input type="submit" value="Donate"/>
            <input type ="reset" value = "Reset" />
        </td>
    </tr>
</table>  
</form:form>
	
	
<%-- 	 <section class="form-style-5">
          <form action = "/ClothingCloset/donate/donateItem" method="POST" enctype="multipart/form-data" >
            <fieldset>
                    <legend><span class="number">1</span> Donation Info</legend>
                    
                    <input type="email" name="EMAIL" placeholder="Donor Email*">
                    <input type="text" name="date_of_donation" placeholder="date_of_donation(YYYY-MM-DD)*">
                    <input type="text" name="ItemName" placeholder="ItemName*">
                    <input type="text" name="Size" placeholder="Size">
                    <input type="text" name="Quantity" placeholder="Quantity">
                    <input type="text" name="Color" placeholder="Color">
                    <input type="text" name="ItemCondition" placeholder="ItemCondition">
                    <input type="text" name="Description" placeholder="Description">
                    <input type="text" name="Gender" placeholder="Gender">
                    <input type="text" name="Brand" placeholder="Brand">
                    
      <input type="submit" value = "Donate"> 
      
      <input type="reset" value = "Reset"> 
      
      
      </form> --%>


<%-- <!-- 	<section class="form-style-5"> -->
	<form:form  action="/ClothingCloset/donate/donateItem"  method="POST">
	<!--  	<fieldset>
			<legend>
				<span class="number">1</span> Donation Info
			</legend> -->

			<form:input  path="email" placeholder="Donor Email*" />
			<form:input  path="dateOfDonation" placeholder="date_of_donation(YYYY-MM-DD)*" />
			 <form:input  path="itemName" placeholder="ItemName*" />
			  <form:input  path="size" placeholder="Size" /> 
			  <form:input  path="quantity" placeholder="Quantity" /> 
			  <form:input  path="color" placeholder="Color" /> 
			  <form:input  path="item_Condition" placeholder="ItemCondition" />
				<form:input  path="description" placeholder="Description"/>
			<form:input  path="gender" placeholder="Gender"/>
			 <form:input  path="brand" placeholder="Brand"/>
			 
			 <input type="submit" value="Donate"/>
			 <input type="reset" value="Reset"/>
		<!-- 		</fieldset>  -->
	</form:form> --%>
<!-- 	</section> -->
</body>
</html>
