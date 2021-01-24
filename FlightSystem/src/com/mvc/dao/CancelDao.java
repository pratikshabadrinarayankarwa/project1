package com.mvc.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.mvc.bean.CancelBean;
import com.mvc.util.DBConnection;

	public class CancelDao {
		public String userCancel(CancelBean cancelBean) 	    
		{
			   
	         String flightcode = cancelBean.getFlightcode();
	      
	         Connection con = null;
	         PreparedStatement preparedStatement = null;  
	        
	                  
	         try
	         {
	              con = DBConnection.createConnection();
	             String query = "delete from book where flightcode=?";
	             preparedStatement = con.prepareStatement(query); 
	             preparedStatement.setString(1, flightcode);
	        
	        
	             int i= preparedStatement.executeUpdate();
	             
	             if (i!=0)  
	             return "SUCCESS"; 
	         }
	         catch(SQLException e)
	         {
	            e.printStackTrace();
	         }       
	         return "Oops.. Something went wrong there..!";
	}

		
	}


