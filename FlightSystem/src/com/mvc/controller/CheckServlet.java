package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.CheckBean;
import com.mvc.dao.CheckDao;


@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String flightcode = request.getParameter("flightcode");
		String passengername = request.getParameter("passengername");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departure = request.getParameter("departure");

		CheckBean checkBean = new CheckBean();

		checkBean.setFlightcode(flightcode);
		checkBean.setPassengername(passengername);
		checkBean.setSource(source);
		checkBean.setDestination(destination);
		checkBean.setDeparture(departure);

		CheckDao checkDao = new CheckDao();

		String userCheck = checkDao.userCheck(checkBean);

		if (userCheck.equals("SUCCESS")) {
			request.getRequestDispatcher("/Pay.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", userCheck);
			request.getRequestDispatcher("/Pay.jsp").forward(request, response);
		}

	}

}