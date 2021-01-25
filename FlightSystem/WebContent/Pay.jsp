<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment</title>
<style>
.container {
	width: 95%;
	height: 500px;
	margin: 10px;
	padding: 20px;
	background-color: white;
	float: left;
}

.txt {
	padding: 10px;
	color: blue;
	font-size: 40px;
	margin-left: 400px;
}

.c1 {
	width: 300px;
	height: 300px;
	margin: 20px 20px 20px 20px;
	background-color: white;
	padding: 10px;
	float: left;
}

.co1 {
	width: 50%;
	height: 440px;
	margin-left: 300px;
	background-color: white;
	float: center;
}
</style>
</head>
<body>
	<div class="container">
		<div class="c1">
			<img src="C:\Users\PratikshaKarwa\Desktop\documents/ATM.jpeg" width="100%"
				height="150px">
		</div>
		<div class="txt">Make A Payement</div>

		<div class="co1">
			<form action="PayServlet" method="POST">
				<center>
<br><br> Flight Name : <input type="text"placeholder="enter flight name" name="flightname"><br><br> 
Ticket Price: <input type="date"placeholder="Mention here price" name="ticketprice"> <br><br> 
Cardholder Name : <input type="text"placeholder="Enter cardholder name" name="cardholdername"><br><br>
CreditCard Number: <input type="text"placeholder="Enter card number" name="cardnumber"><br><br>

<center>
<button onclick="myFunction()">Done</button>
<script>
function myFunction() {
alert("Payment successful!!");
	}
</script>
					</center>
					<br>
				<a href="Register.jsp">
					<input type="button" value="Back"></a>

			</form>
		</div>
	</div>


</body>
</html>