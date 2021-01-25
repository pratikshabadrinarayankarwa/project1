<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>check status</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

th, td {
	padding: 20px;
}

.container {
	width: 98%;
	height: 650px;
	margin: 10px;
	background-color: skyblue;
	border: 5px dotted red;
}

.txt {
	padding: 10px;
	color: blue;
	font-size: 20px;
}

.txt1 {
	padding: 10px;
	color: red;
	font-size: 40px;
}
</style>
</head>
<body>
	<sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/atyeti" user="root" password="Root" />

	<sql:query var="listUsers" dataSource="${myDS}">
        SELECT * FROM book;
    </sql:query>
	<div class="container">

		<div class="txt1">
			<center>
				<b>booking status 
			</center>
		</div>
		<a href="index.jsp"><input type="submit" value="Back"></a> <a
			href="Cancel.jsp"> <input type="submit" value="CancelFlight"></a>
		<a href="Booking.jsp"><input type="submit" value="BookOneMore"></a>
		<a href="Update.jsp"><input type="button" value="Reschedule"></a>
		<a href="Logout.jsp"><input type="button" value="Logout"></a>
		
			<table style="width: 100%" class="table-borderd" align="center">
				<tr>
					<b>
						<th bgcolor="#00FF00">FlightCode</th>
						<th bgcolor="#00FF00">PassengerName</th>
						<th bgcolor="#00FF00">Source</th>
						<th bgcolor="#00FF00">Destination</th>
						<th bgcolor="#00FF00">Departure</th>
					</b>
				</tr>
				<c:forEach var="user" items="${listUsers.rows}">
					<tr>
						<td><c:out value="${user.flightcode}" /></td>
						<td><c:out value="${user.passengername}" /></td>
						<td><c:out value="${user.source}" /></td>
						<td><c:out value="${user.destination}" /></td>
						<td><c:out value="${user.departure}" /></td>
					</tr>
				</c:forEach>
			</table>
	

	
	</div>
</body>
</html>