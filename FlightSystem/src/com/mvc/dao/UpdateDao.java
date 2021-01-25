package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.UpdateBean;
import com.mvc.util.DBConnection;

public class UpdateDao {
	public String userUpdate(UpdateBean updateBean) {
		String flightcode = updateBean.getFlightcode();
		String passengername = updateBean.getPassengername();
		String source = updateBean.getSource();
		String destination = updateBean.getDestination();
		String departure = updateBean.getDeparture();

		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {
			con = DBConnection.createConnection();
			String query = ("update book set passengername=?,source=?,destination=?,departure=? where flightcode=?");
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, passengername);
			preparedStatement.setString(2, source);
			preparedStatement.setString(3, destination);
			preparedStatement.setString(4, departure);
			preparedStatement.setString(5, flightcode);
			int i = preparedStatement.executeUpdate();

			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";
	}
}