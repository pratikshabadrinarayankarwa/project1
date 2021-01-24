package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.CancelBean;

import com.mvc.dao.CancelDao;


@WebServlet("/CancelServlet")
public class CancelServlet extends HttpServlet {
	private CancelDao cancelDao;
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	     
	       
	        
	            
	             String flightcode=request.getParameter("flightcode");
	           
	                
	             CancelBean cancelBean = new CancelBean();
	             
	             cancelBean.setFlightcode(flightcode);
	          
	         
	             CancelDao cancelDao = new CancelDao();
	             
	             
	             String userCancel = cancelDao.userCancel(cancelBean);
	             
	             if(userCancel.equals("SUCCESS"))  
	             {
	                request.getRequestDispatcher("/Pay.jsp").forward(request, response);
	             }
	             else  
	             {
	                request.setAttribute("errMessage", userCancel);
	                request.getRequestDispatcher("/Pay.jsp").forward(request, response);
	             }
	             
	        
	            
	        }
	    
	}