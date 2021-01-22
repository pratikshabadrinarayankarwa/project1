package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.BookBean;
import com.mvc.bean.LoginBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.BookDao;
import com.mvc.dao.LoginDao;
import com.mvc.dao.RegisterDao;

@WebServlet("/BookingServlet")
public class BookServlet extends HttpServlet {

	  private BookDao bookDao;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            
             String flightcode=request.getParameter("flightcode");
             String passengername=request.getParameter("passengername;");
             String source=request.getParameter("source");
             String destination=request.getParameter("destination");
             String departuredate=request.getParameter("departuredate");
                
             BookBean bookbean = new BookBean();
             bookbean.setFlightcode(flightcode);
             bookbean.setPassengername(passengername);
             bookbean.setSource(source);
             bookbean.setDestination(destination);
             bookbean.setDeparturedate(departuredate);
         
             BookDao bookDao = new BookDao();
             
             
             String userBook = bookDao.bookUser( bookbean);
             
             if(userBook.equals("SUCCESS"))  
             {
                request.getRequestDispatcher("/Pay.jsp").forward(request, response);
             }
             else  
             {
                request.setAttribute("errMessage", userBook);
                request.getRequestDispatcher("/Pay.jsp").forward(request, response);
             }
        
            
        }
    }


}