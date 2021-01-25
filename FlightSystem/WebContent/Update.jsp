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
<script> 
function validate()
{ 
     var flightcode = document.form.flightcode.value;
     var passengername = document.form.passengernamel.value;
     var source = document.form.source.value; 
     var destination = document.form.destination.value;
 var departuredate= document.form.departuredate.value;
 //var payment= document.form.payment.value;
     
     if (flightcode==null || flightcode=="")
     { 
     alert("Flight code can't be change"); 
     return false; 
     }
     else if (passengername==null || passengername=="")
     { 
     alert("passengername can't be blank"); 
     return false; 
     }
     else if (source==null || source=="")
     { 
     alert("source can't be blank"); 
     return false; 
     }
     else if(destination==null || destination=="")
     { 
     alert("destination can't be blank"); 
     return false; 
     } 
     else if (departuredate==null || departuredate=="")
     { 
     alert("Please mention a date"); 
     return false; 
     }  
 } 
</script>
</head>
<body>
	<center>
		<h2>Welcome To Flight Booking</h2>
	</center>
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="Login.jsp">Login</a></li>
		<li><a href="Register.jsp">Registration</a></li>
		<li><a href="Flight.jsp">Flights</a></li>
		<li><a href="Booking.jsp">Book Ticket</a></li>
		<li><a href="Check.jsp">Check Status</a></li>
		<li><a href="Cancel.jsp">Cancel Flight</a></li>
	</ul>


	<center>
		<h2>Book Ticket</h2>
	</center>

	<form name="form" action="UpdateServlet" method="post"
		onsubmit="return validate()">
		<table align="center">


			<tr>
				<td>Flight Code</td>
				<td><input type="text" name="flightcode" /></td>
			</tr>
			<tr>
				<td>Passenger Name</td>
				<td><input type="text" name="passengername" /></td>
			</tr>
			<tr>
				<td>Source</td>
				<td><input type="text" name="source" /></td>
			</tr>
			<tr>
				<td>Destination</td>
				<td><input type="text" name="destination" /></td>
			</tr>
			<tr>
				<td>Departure Date</td>
				<td><input type="text" name="departure" /></td>
			</tr>

			</tr>
		

			<tr>
				<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></input><input
					type="reset" value="Reset"></input></td>
			</tr>
		</table>
		
	</form>
</body>
</html>