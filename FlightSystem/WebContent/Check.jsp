<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,th,td
            {
                border: 1px solid black;
                border-collapse: collapse;
                text-align: center;
            }
            th,td
            {
                padding: 20px;
            }
            .container
            {
            width:98%;
            height:650px;
            margin:10px;
            background-color:skyblue;
            border:5px dotted red;
            }
            .txt
            {
            padding:10px;
            color:blue;
            font-size:20px;
            }
            .txt1
            {
            padding:10px;
            color:red;
            font-size:40px;
            }
            
        </style>
    </head>
    <body>
        <div class="container">
            
    <div class="txt1">
    <center> <b>booking status  </center>
</div>
	<form name="form" action="CheckServlet" method="post">
    <table style="width:100%" class="table-borderd" align="center">
        <tr>
        <b>
        <th bgcolor="#00FF00">flightcode</th>
        <th bgcolor="#00FF00">passengername</th>
        <th bgcolor="#00FF00">source </th>
        <th bgcolor="#00FF00">destination</th>
        <th bgcolor="#00FF00">departure</th></b>
        </tr> 
       
         <a href="Cancel.jsp"> <input type="submit" value="CancelFlight"></a>
    <center>
        <a href="Booking.jsp"><input type="submit" value="BookOneMore"></a></center>
        </div>
        </table></form></div></body></html>