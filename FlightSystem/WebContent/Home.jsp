<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<title>TODO supply a title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
</style>
</head>

<body>


	<center>
		<h1>AirSafari</h1>
	</center>

	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="Login.jsp">Login</a></li>
		<li><a href="Register.jsp">Registration</a></li>
		<li><a href="Flight1.jsp">All Flights</a></li>
		<li><a href="Booking.jsp">Book Ticket</a></li>
		<li><a href="About.jsp">Booked Tickets</a></li>
		<li><a href="Contact.jsp">Cancel Ticket</a></li>
	</ul>


	<img src="C:\Users\PratikshaKarwa\Desktop\documents\airplane.jpeg"
		style="width: 100%" />



</body>
</html>