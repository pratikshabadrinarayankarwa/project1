package com.atyeti.tradingapplicationsystemdemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;
import com.atyeti.tradingapplicationsystemdemo1.dao.CustomerDao;
import com.atyeti.tradingapplicationsystemdemo1.validation.TradingApplicatIionValidation;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	@Autowired(required = false)
	TradingApplicatIionValidation tradingapplicationValidation;
	@Override
	public void registration(CustomerBean customerBean) {
		
		customerDao.registration(customerBean);
	}
	@Override
	public CustomerBean login(String username, String password) {
		
	return customerDao.login(username, password);
	}

	
}
