<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>PBL Staff Login</h2>
<form:form method="POST" action="/ClothingCloset/login/pblStaffLogin">
   <table>
    <tr>
        <td><form:label path="email">Email ID: </form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password : </form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Login"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>