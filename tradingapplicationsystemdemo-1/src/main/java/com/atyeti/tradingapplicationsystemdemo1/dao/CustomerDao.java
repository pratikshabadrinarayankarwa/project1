package com.atyeti.tradingapplicationsystemdemo1.dao;

import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;

public interface CustomerDao {
public void registration(CustomerBean customerBean) ;

public CustomerBean login(String username, String password);
}
