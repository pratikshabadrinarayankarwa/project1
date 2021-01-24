package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mvc.bean.CheckBean;
import com.mvc.util.DBConnection;

public class CheckDao {
	public String userCheck(CheckBean checkBean) 
	{
		String flightcode = checkBean.getFlightcode();
		String passengername = checkBean.getPassengername();
		String source = checkBean.getSource();
		String destination = checkBean.getDestination();
		String departure = checkBean.getDeparture();
		
		String flightcodedb ="";
		String passengernamedb="";
		String sourcedb="";
		String destinationdb="";
		String departuredb="";

		Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs =null;
		try {
			 con = DBConnection.createConnection();
			String query = "select * from book";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, flightcode);
			preparedStatement.setString(2, passengername);
			preparedStatement.setString(3, source);
			preparedStatement.setString(4, destination);
			preparedStatement.setString(5, departure);

			preparedStatement.executeQuery();
				 while(rs.next()) // Until next row is present otherwise it return false
	             {
					 flightcodedb = rs.getString("flightcode"); //fetch the values present in database
					 passengernamedb = rs.getString("passengername");   
					 sourcedb = rs.getString("source");   
					 destinationdb = rs.getString("destination");   
					 departuredb = rs.getString("departure");   

	                
	                System.out.println(flightcode + passengername  + source  + destination  + departure);
	            }
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";
	}
}
