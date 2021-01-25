package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
 
     public RegisterServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
         String fullname = request.getParameter("fullname");
         String email = request.getParameter("email");
         String username = request.getParameter("username");
         String password = request.getParameter("password");
         
         RegisterBean registerBean = new RegisterBean();
         
       
         registerBean.setFullname(fullname);
         registerBean.setEmail(email);
         registerBean.setUsername(username);
         registerBean.setPassword(password); 
         
         RegisterDao registerDao = new RegisterDao();
         
       
         String userRegistered = registerDao.registerUser(registerBean);
         
         if(userRegistered.equals("SUCCESS"))  
         {
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
         }
         else  
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/Register.jsp").forward(request, response);
         }
     }
}