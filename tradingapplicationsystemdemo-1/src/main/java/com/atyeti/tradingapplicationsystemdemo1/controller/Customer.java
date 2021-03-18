package com.atyeti.tradingapplicationsystemdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.TradingResponseBean;
import com.atyeti.tradingapplicationsystemdemo1.service.CustomerService;

@RestController

public class Customer {
	@Autowired
	CustomerService customerService;
	String success = "success";
	
	@PostMapping("/userRegistration")
	public TradingResponseBean registerUser(@RequestBody CustomerBean customerBean) {
		TradingResponseBean tradingResponseBean = new TradingResponseBean();
	customerService.registration(customerBean);
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage("success");
		tradingResponseBean.setDescription("User Register Successfully...");
		return tradingResponseBean;
	}// end of add User

	@PostMapping("/login")
	public TradingResponseBean login(@RequestBody CustomerBean customerBean) {
		String username = customerBean.getUsername();
		String password = customerBean.getPassword();
	TradingResponseBean tradingResponseBean = new TradingResponseBean();
		CustomerBean customerBean2 = customerService.login(username, password);
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage("success");
		tradingResponseBean.setDescription("User Login Successfully remember id...");
		tradingResponseBean.setCustomerBean(customerBean2);
		return tradingResponseBean;
	}// end of login

	
}
