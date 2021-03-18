package com.atyeti.tradingapplicationsystemdemo1.service;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;

public interface CustomerService {
	public void registration(CustomerBean customerBean) ;

	public CustomerBean login(String username, String password);


}
