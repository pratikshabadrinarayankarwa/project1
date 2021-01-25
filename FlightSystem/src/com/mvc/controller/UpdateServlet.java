package com.mvc.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.UpdateBean;
import com.mvc.dao.UpdateDao;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String flightcode = request.getParameter("flightcode");
		String passengername = request.getParameter("passengername");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departure = request.getParameter("departure");

		UpdateBean updateBean = new UpdateBean();

		updateBean.setFlightcode(flightcode);
		updateBean.setPassengername(passengername);
		updateBean.setSource(source);
		updateBean.setDestination(destination);
		updateBean.setDeparture(departure);

		UpdateDao updateDao = new UpdateDao();

		String userUpdate = updateDao.userUpdate(updateBean);

		if (userUpdate.equals("SUCCESS")) {
			request.getRequestDispatcher("/Updated.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", userUpdate);
			request.getRequestDispatcher("/Booking.jsp").forward(request, response);
		}

	}

}