<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="loginhtml" method="post"> 
		<Table>
			<tr>
				<th colspan="2" align="center">
					<h3>Login Form</h3>
				</th>
			</tr>

			<tr>
				<td>User ID no</td>
				<td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><Input type="submit" value="Verify" /></td>
			</tr>
		</Table>
	</form>
</body>
</html>