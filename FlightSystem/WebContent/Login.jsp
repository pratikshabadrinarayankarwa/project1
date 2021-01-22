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
<body>
 <div align="center">
  <h1> Login Form</h1>
<form action="LoginServlet" method="POST">
					<fieldset>
						<center>
							
							<br>
							
           <label>User Name :</label> <input type="text" name="username"><br>
								<br> <label>Password :</label> <input type="password"
									name="password"><br>
								<lable> Forgot Password?</lable>
								<br> <input type="submit" value="Login"> <input
									type="Reset" value="Reset"> <br> <br> <br>
								<lable>Don't have Account? Creat it now!</lable>
								<br> <a href="Register.jsp"><input type="button"
									value="Sign up"></a>
						</center>
					</fieldset>
				</form>
 </div>
</body>
</html>