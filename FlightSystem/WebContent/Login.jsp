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
 
<script> 
function validate()
{ 
   
     var username = document.form.username.value; 
     var password = document.form.password.value;
 //    var conpassword= document.form.conpassword.value;
     
    
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

 

<ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="Login.jsp">Login</a></li>
                <li><a href="Register.jsp">Registration</a></li>
                <li><a href="Flight.jsp">Flights</a></li>
                <li><a href="Booking.jsp">Book Ticket</a></li>
                <li><a href="Check.jsp">Check Status</a></li>
                <li><a href="Cancel.jsp">Cancel Ticket</a></li>
                <li><a href="Update.jsp">Reschedule Ticket</a></li>
                
            </ul>
 <div align="center">
  <h1> Login Form</h1>
<form action="LoginServlet" method="POST"  onsubmit="return validate()">
                    <fieldset>
                        <center>
                            
                            <br>
                            
           <label>User Name :</label> <input type="text" name="username"><br>
                                <br> <label>Password :</label> <input type="password"
                                    name="password"><br>
                                <lable> Forgot Password?</lable>
                                
                                 <tr>
                                
                                <a href="Flight.jsp"><input type="button" value="Login"></a>
                                <br> 
                                 <tr>
         <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
         </tr>
        
                                <br> <br> <br>
                                <lable>Don't have Account? Creat it now!</lable>
                               <br> <a href="Register.jsp"><input type="button"
                                    value="Sign up"></a>
                        </center>
                    </fieldset>
                </form>
 </div>
</body>
</html>