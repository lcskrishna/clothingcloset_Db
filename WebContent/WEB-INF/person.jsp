<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Person Information</h2>
<form:form method="POST" action="/ClothingCloset/login/registration">
   <table>
    <tr>
        <td><form:label path="firstName">FirstName</form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName">LastName</form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td><form:label path="gender">Gender</form:label></td>
        <td><form:input path="gender" /></td>
    </tr>
    <tr>
        <td><form:label path="mobileNumber">MobileNumber</form:label></td>
        <td><form:input path="mobileNumber" /></td>
    </tr>
    <tr>
        <td><form:label path="street">Street</form:label></td>
        <td><form:input path="street" /></td>
    </tr>
    <tr>
        <td><form:label path="city">City</form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td><form:label path="state">State</form:label></td>
        <td><form:input path="state" /></td>
    </tr>
    <tr>
        <td><form:label path="pincode">Pincode</form:label></td>
        <td><form:input path="pincode" /></td>
    </tr>
    <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td><form:label path="subscription">Subscription (y/n)</form:label></td>
        <td><form:input path="subscription" /></td>
    </tr>
    <tr>
        <td><form:label path="subscriptionType">Subscription Type</form:label></td>
        <td><form:input path="subscriptionType" /></td>
    </tr>
    
    
    <tr>
        <td><form:label path="role">Role</form:label></td>
        <td><form:input path="role" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>