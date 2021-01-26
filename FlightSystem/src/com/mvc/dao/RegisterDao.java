package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;
 
public class RegisterDao { 
     public String registerUser(RegisterBean registerBean)
     {
         String fullname = registerBean.getFullname();
         String email = registerBean.getEmail();
         String username = registerBean.getUsername();
         String password = registerBean.getPassword();
         
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
             con = DBConnection.createConnection();
             String query = "insert into Registration(fullname,email,username,password) values (?,?,?,?)";
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, fullname);
             preparedStatement.setString(2, email);
             preparedStatement.setString(3, username);
             preparedStatement.setString(4, password);
             
             int i= preparedStatement.executeUpdate();
             
             if (i!=0)  
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!"; 
     }
}