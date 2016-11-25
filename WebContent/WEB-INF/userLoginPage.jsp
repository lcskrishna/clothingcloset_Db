<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<br>
	<br>
	<br>
	<br>
	<center><h2>USER LOGIN </h2></center>
	
	<form:form method="POST" action="/ClothingCloset/login/userLoginPage">
		<table align="center" cellspacing="15px">
		
			<tr>
				<td><form:label path="email">Email ID: </form:label></td>
				<td><form:input path="email" required="true" placeholder="Enter your email ID" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password : </form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>