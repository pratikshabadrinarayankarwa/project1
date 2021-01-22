package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.BookBean;
import com.mvc.bean.LoginBean;
import com.mvc.dao.BookDao;
import com.mvc.dao.LoginDao;
import com.mvc.dao.RegisterDao;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

	 public BookServlet() {
     }

	private BookDao bookDao;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flightcode = request.getParameter("flightcode");
		String passengername = request.getParameter("passengername");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departure = request.getParameter("departure");
		String payment = request.getParameter("payment");
		
		BookBean bookBean = new BookBean();
		bookBean.setFlightcode( flightcode);
		bookBean.setPassengername(passengername);
		bookBean.setSource(source);
		bookBean.setDestination(destination);
		bookBean.setDeparture(departure);
		bookBean.setPayment(payment);
		
		   BookDao bookDao = new BookDao();
	         
	        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
	         String userBook = bookDao.userBook(bookBean);
	         if(userBook.equals("SUCCESS"))   //On success, you can display a message to user on Home page
	         {
	            request.getRequestDispatcher("/Logout.jsp").forward(request, response);
	         }
	         else   //On Failure, display a meaningful message to the User.
	         {
	            request.setAttribute("errMessage",userBook);
	            request.getRequestDispatcher("/Register.jsp").forward(request, response);
	         }
	}
}