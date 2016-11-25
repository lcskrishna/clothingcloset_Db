<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<%@include file="header.jsp"%>

<h2>Register Your Account</h2>
<form:form method="POST" action="/ClothingCloset/login/registration">
   <table cellspacing="15px" align="center" font-size="205px">
    <tr>
        <td><form:label path="firstName">FirstName</form:label></td>
        <td><form:input path="firstName" required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName">LastName</form:label></td>
        <td><form:input path="lastName" required="true"/></td>
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
        <td><form:label path="mobileNumber">MobileNumber</form:label></td>
        <td><form:input path="mobileNumber" required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="street" >Street</form:label></td>
        <td><form:input path="street" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="city" >City</form:label></td>
        <td><form:input path="city" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="state" >State</form:label></td>
        <td><form:input path="state" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="pincode" >Pincode</form:label></td>
        <td><form:input path="pincode" required="true"/></td>
    </tr>
    <tr>
        <td><form:label path="email" >Email</form:label></td>
        <td><form:input path="email" required="true" placeholder="Enter Your Email ID"/></td>
    </tr>
    <tr>
        <td><form:label path="password" >Password</form:label></td>
        <td><form:password path="password" required="true" /></td>
    </tr>

        
      <tr>
          <td><form:label path="subscription"> Subscription</form:label></td>
        <td><form:select path="subscription">
        	<form:option value="Y"></form:option>
        	<form:option value="N"></form:option> 
        </form:select></td>
        <%-- <td><form:input path="gender" /></td> --%>
    </tr>
    
        
      <tr>
          <td><form:label path="subscriptionType"> Subscription</form:label></td>
        <td><form:select path="subscriptionType">
        	<form:option value="Daily"></form:option>
        	<form:option value="Weekly"></form:option> 
        	<form:option value="Monthly"></form:option> 
        </form:select></td>
        <%-- <td><form:input path="gender" /></td> --%>
    </tr>
    
     <tr>
          <td><form:label path="role"> Role </form:label></td>
        <td><form:select path="role">
        	<form:option value="Alumni"></form:option>
        	<form:option value="Faculty"></form:option> 
        	<form:option value="Student"></form:option> 
        </form:select></td>
        <%-- <td><form:input path="gender" /></td> --%>
    </tr>
    

    
    <tr>
        <td colspan="2">
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>