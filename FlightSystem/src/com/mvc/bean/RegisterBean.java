package com.mvc.bean;
 
public class RegisterBean {
 
 private String fullname;
 private String email;
 private String username;
 private String password;
 
 public String getUserName() {
 return username;
 }
 public void setUserName(String userName) {
 this.username = userName;
 }
 public String getPassword() {
 return password;
 }
 public void setPassword(String password) {
 this.password = password;
 }
 public void setFullName(String fullName) {
 this.fullname = fullName;
 }
 public String getFullName() {
 return fullname;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public String getEmail() {
 return email;
 }
}