<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring 3 MVC Series - Contact Manager</title>
<link type="text/css" rel="stylesheet" href="../" />
<style type="text/css">
body{
	background-color: olive;
}

h2{
	color: black;
	text-align: center;
}

div{
	background-color: teal;
	border:solid 6px red;
}
</style>

</head>
<body>
	<div align="Center">
		<h2>Contact Manager</h2>
		<form:form method="post" action="addContact"  commandName="contact">
			<table>
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" /></td>
					<td><form:errors path="firstName" /></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name</form:label></td>
					<td><form:input path="lastName" /></td>
					<td><form:errors path="lastName" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="telephone">Telephone</form:label></td>
					<td><form:input path="telephone" /></td>
					<td><form:errors path="telephone" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Add Contact" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
