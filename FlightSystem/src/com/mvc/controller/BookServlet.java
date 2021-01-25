package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.BookBean;
import com.mvc.dao.BookDao;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String flightcode = request.getParameter("flightcode");
		String passengername = request.getParameter("passengername");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departure = request.getParameter("departure");

		BookBean bookBean = new BookBean();

		bookBean.setFlightcode(flightcode);
		bookBean.setPassengername(passengername);
		bookBean.setSource(source);
		bookBean.setDestination(destination);
		bookBean.setDeparture(departure);

		BookDao bookDao = new BookDao();

		String userBook = bookDao.userBook(bookBean);

		if (userBook.equals("SUCCESS")) {
			request.getRequestDispatcher("/Pay.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", userBook);
			request.getRequestDispatcher("/Booking.jsp").forward(request, response);
		}

	}

}