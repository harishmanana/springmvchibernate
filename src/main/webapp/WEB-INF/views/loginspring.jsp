<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.errorMsg {
	color: red;
}
</style>
</head>

<body>
	<form:form method="post" modelAttribute="user">
		<Table>
			<tr>
				<th colspan="2" align="center">
					<h3>Login Form</h3>
				</th>
			</tr>

			<tr>
				<td>Email Id</td>
				<td><form:input type="text" path="userId" /></td>
				<td><form:errors path="userId" cssClass="errorMsg" />
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="errorMsg" />
			</tr>
			<tr>
				<td colspan="2" align="center"><Input type="submit"
					value="Verify" /></td>
			</tr>
		</Table>
	</form:form>
</body>
</html>