<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

 <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
.container
{
width:98%;
height:600px;
margin:10px;
background-color:skyblue;
border:5px dotted red;
}
.co1
{
width:30%;
height:250px;
margin-left:450px;
background-color:white;
float:center;
}
ul{
 list-style-type: none;
 margin-top:60px;
 padding: 0;
  overflow: hidden;
 background-color:black;
border: 5px solid green;
}


li {
    float: left;
}

li a {
    display:blue;
    color:white;
    text-align: center;
    font-size:30px;
    padding: 16px;
    text-decoration: none;
    }
li a:hover {
    background-color: green;}

        </style>
 </head>

<script> 
function validate()
{ 
     var fullname = document.form.fullname.value;
     var email = document.form.email.value;
     var username = document.form.username.value; 
     var password = document.form.password.value;
 //    var conpassword= document.form.conpassword.value;
     
     if (fullname==null || fullname=="")
     { 
     alert("Full Name can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
    
 }
</script> 

 



</head>
<body>
<center><h2> Welcome To Flight Booking  </h2></center>


<ul>
				<li><a href="About.jsp">Home</a></li>
				<li><a href="Login.jsp">Login</a></li>
				<li><a href="Register.jsp">Registration</a></li>
				<li><a href="Flight.jsp">Flights</a></li>
				<li><a href="Booking.jsp">Book Ticket</a></li>
				<li><a href="Check.jsp">Check Status</a></li>
				<li><a href="Cancel.jsp">Cancel Ticket</a></li>
				<li><a href="Update.jsp">Reschedule Ticket</a></li>
			</ul>
			
			
			<center><h2> User Registration</h2></center>
			

    <form name="form" action="RegisterServlet" method="POST" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Full Name</td>
         <td><input type="text" name="fullname" /></td>
         </tr>
         <tr>
         <td>Email</td>
         <td><input type="text" name="email" /></td>
         </tr>
         <tr>
         <td>UserName</td>
         <td><input type="text" name="username" /></td>
         </tr>
         <tr>
         <td>Password</td>
         <td><input type="password" name="password" /></td>
         </tr>
         
       
         
         <tr>
         <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input><input
         type="reset" value="Reset"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>