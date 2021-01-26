package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Atyeti","root","root");
            Statement st=con.createStatement();
            String user=request.getParameter("username");
            String pass=request.getParameter("password");
            if(user!=null && pass!=null)
            {
               String sql= "select * from Registration where username='"+user+"'  AND  password='"+pass+"'";
                ResultSet r = st.executeQuery(sql);
                if(r.next())
                {
                    out.println("Login sucessfully");
                    out.println("WELCOME:"+user);
                    HttpSession session=request.getSession();
                    request.setAttribute("username", user);
                    request.getRequestDispatcher("Booking.jsp").forward(request,response);


                }
               else
                {
                   
            	   request.getRequestDispatcher("LoginProcess.jsp").forward(request,response);
                }
            }
        }
           
        }

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    

}