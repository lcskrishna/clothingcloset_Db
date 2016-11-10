<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Index page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles/signup_header.css" type="text/css" />
</head>

<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li input {
	float: right;
	position: absolute;
	display: block;
	text-align: right;
	padding: 14px 16px;
	text-decoration: none;
}

a:hover:not (.active ) {
	background-color: #111;
}

.active {
	background-color: #1abc9c;
}

.footer {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}
</style>
<body>

	<ul>
		<li><a href="home_categories.jsp">Home</a></li>
		<li><a href="#">Profile</a></li>
		<li><a href="#">LogOut</a></li>

	</ul>
</body>
</html>
