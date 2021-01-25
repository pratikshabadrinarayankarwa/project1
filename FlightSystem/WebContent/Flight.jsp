<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flights</title>
<style>
.container {
	width: 98%;
	height: 600px;
	margin: 10px;
	background-color: skyblue;
	border: 5px dotted red;
}

.co1 {
	width: 30%;
	height: 250px;
	margin-left: 450px;
	background-color: white;
	float: center;
}

ul {
	list-style-type: none;
	margin-top: 60px;
	padding: 0;
	overflow: hidden;
	background-color: black;
	border: 5px solid green;
}

li {
	float: left;
}

li a {
	display: blue;
	color: white;
	text-align: center;
	font-size: 30px;
	padding: 16px;
	text-decoration: none;
}

li a:hover {
	background-color: green;
}


table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

th, td {
	padding: 20px;
}

.container{
	width: 98%;
	height: 650px;
	margin: 10px;
	background-color: skyblue;
	border: 5px dotted red;
}

.txt{
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
<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="Login.jsp">Login</a></li>
		<li><a href="Register.jsp">Registration</a></li>
		<li><a href="Flight.jsp">Flights</a></li>
		<li><a href="Booking.jsp">Book Ticket</a></li>
		<li><a href="Check.jsp">Check Status</a></li>
		<li><a href="Cancel.jsp">Cancel Flight</a></li>
		                			<li><a href="Update.jsp">Reschedule Ticket</a></li>
		
	</ul>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/atyeti"
        user="root" password="Root"
    /> 
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM flights;
    </sql:query>
    <div align="center">
        <table border="1" cellpadding="5">
        <a href="Login.jsp"><input type="submit" value="Back"></a><br>
        
         <a href="Cancel.jsp"> <input type="submit" value="CancelFlight"></a><br>
         
		<a href="Booking.jsp"><input type="submit" value="Book"></a><br>
            <caption><h2>List of Flights</h2></caption>      
           <caption> <h5>Remember The Flight Code....</h5></caption>
            <tr>
                <th bgcolor="#00FF00">flightcode</th>
                <th bgcolor="#00FF00">flightname</th>
                <th bgcolor="#00FF00">source</th>
                <th bgcolor="#00FF00">destination</th>
                <th bgcolor="#00FF00">departuredate</th>
                <th bgcolor="#00FF00">TicketPrice</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.flightcode}" /></td>
                    <td><c:out value="${user.flightname}" /></td>
                    <td><c:out value="${user.source}" /></td>
                    <td><c:out value="${user.destination}" /></td>
                    <td><c:out value="${user.departuredate}" /></td>
                    <td><c:out value="${user.TicketPrice}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
