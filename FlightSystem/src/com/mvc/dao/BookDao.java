package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.BookBean;
import com.mvc.util.DBConnection;

public class BookDao {
	 public String userBook(BookBean bookBean  ) {
		    String flightcode =  bookBean.getFlightcode();
		    String passengername =  bookBean.getPassengername();
		    String source =  bookBean.getSource();
		    String destination =  bookBean.getDestination();
		    String departure =  bookBean.getDeparture();
		    
		    Connection con = null;
		    PreparedStatement preparedStatement = null;         
		    try
		    {
		        con = DBConnection.createConnection();
		        String query = "insert into book(flightcode,passengername,source,destination,departure) values (?,?,?,?,?)"; //Insert user details into the table 'USERS'
		        preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
		        preparedStatement.setString(1, flightcode);
		        preparedStatement.setString(2, passengername);
		        preparedStatement.setString(3, source );
		        preparedStatement.setString(4, destination);
		        preparedStatement.setString(5,departure);
		        
		        int i= preparedStatement.executeUpdate();
		        
		        if (i!=0)  //Just to ensure data has been inserted into the database
		        return "SUCCESS"; 
		    }
		    catch(SQLException e)
		    {
		       e.printStackTrace();
		    }       
		    return "Oops.. Something went wrong there..!";  // On failure, send a message from here.


	 }

	public String bookUser(BookBean bookbean) {
		// TODO Auto-generated method stub
		return null;
	}

	}
