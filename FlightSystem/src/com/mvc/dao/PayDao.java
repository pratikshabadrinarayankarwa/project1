package com.mvc.dao;

import com.mvc.bean.PayBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.util.DBConnection;

public class PayDao {
	public String payUser(PayBean payBean) 
	{
		String flightname = payBean.getFlightname();
		String ticketprice = payBean.getTicketprice();
		String cardholdername = payBean.getCardholdername();
		String cardnumber = payBean.getCardnumber();

		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			
			con = DBConnection.createConnection();
			String query = "insert into payment(flightname,ticketprice,cardholdername,creditcardnumber) values (?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, flightname);
			preparedStatement.setString(2, ticketprice);
			preparedStatement.setString(3, cardholdername);
			preparedStatement.setString(4, cardnumber);

			int i = preparedStatement.executeUpdate();

			if (i != 0) 
				return "SUCCESS";
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";
	}

}
