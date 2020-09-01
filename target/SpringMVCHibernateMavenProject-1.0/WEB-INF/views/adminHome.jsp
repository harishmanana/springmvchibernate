<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
</head>
<body>
	<H2>Welcome to Admin Home Page</H2>
	How are you ${userInSession}
	
	<Br /> HELLO ${user.name}
	<A href="logout">Logout</A>
</body>
</html>