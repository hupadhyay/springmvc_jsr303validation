<html>
<head>
<title>Spring 3 MVC Series - Contact Manager</title>
<style type="text/css">
body{
	background-color: olive;
	font-family:arial;
}

h2{
	color: black;
	text-align: left;
}

td{padding:7px; background-color: #fff;}

table{
	font:17px/18px normal arial; width:200px;
}
.bgDiv{
background-color: #000;
width:200px;

}
</style>
</head>
<body>
	<h2>Contact Details:-</h2>
		<div class="bgDiv">
		<table cellspacing="2" cellpadding="0" border="0">
			<tr>
				<td>First Name</td>
				<td>${contact.firstName}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${contact.lastName}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${contact.email}</td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td>${contact.telephone}</td>
			</tr>
		</table>
		</div>
</body>
</html>
