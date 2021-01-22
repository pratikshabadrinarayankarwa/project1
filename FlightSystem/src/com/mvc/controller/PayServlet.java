package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.PayBean;
import com.mvc.dao.PayDao;

@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {

	public PayServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flightname = request.getParameter("flightname");
		String ticketprice = request.getParameter("ticketprice");
		String cardholdername = request.getParameter("cardholdername");
		String cardnumber = request.getParameter("cardnumber");
		;

		PayBean payBean = new PayBean();

		payBean.setFlightname(flightname);
		payBean.setTicketprice(ticketprice);
		payBean.setCardholdername(cardholdername);
		payBean.setCardnumber(cardnumber);
		PayDao payDao = new PayDao();

		String userPay = payDao.payUser(payBean);

		if (userPay.equals("SUCCESS")) {
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", userPay);
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
	}
}