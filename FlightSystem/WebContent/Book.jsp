<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function validate() {
		var flightcode = document.form.flightcode.value;
		var passengername = document.form.passenger.value;
		var source = document.form.source.value;
		var destination = document.form.destination.value;
		var departure = document.form.conpassword.value;

		if (flightcode == null || flightcode == "") {
			alert("Flight code can't be blank");
			return false;
		} else if (email == null || email == "") {
			alert("passengername can't be blank");
			return false;
		} else if (source == null || source == "") {
			alert("it is not possible");
			return false;
		} else if (destination == null || destination == "") {
			alert("it is not possible");
			return false;
		}

		else if (departure == null || departure == "") {
			alert("please mention date");
			return false;
			
		}
		else if(payment==null || payment==""){
			alert("enter valid amount");
		return false;
		}
		
	}
</script>
</head>
<body>
	<ul>
		<li><a href="Login.jsp">Login</a></li>
		<li><a href="Register.jsp">Registration</a></li>
		<li><a href="Book.jsp">Book Ticket</a></li>
		<li><a href="cancel.jsp">Flights</a></li>
		<li><a href="About.jsp">About us</a></li>
		<li><a href="Contact.jsp">Contact us</a></li>
	</ul>
	<form action="BookServlet" method="POST">
		<center>
			<lable>flightcode:<input type="text" name="flightcode"><br><br><br> 
			<lable>passengername:<input	type="text" name="passengername"><br> <br> <br>
			<lable>source:</lable><input type="text" name="source"><br><br><br>
			<lable>destination:</lable><input type="text" name="destination"><br><br><br>
			<lable>departure:</lable> <input type="text" name="departure"><br><br><br>
			<lable>payment:</lable> <input type="text" name="payment"><br><br><br>
			<input type="submit" value="Book ticket">
		</center>
	</form>
</body>
</html>