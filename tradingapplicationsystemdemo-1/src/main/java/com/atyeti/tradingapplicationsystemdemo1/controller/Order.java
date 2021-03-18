package com.atyeti.tradingapplicationsystemdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.TradingResponseBean;
import com.atyeti.tradingapplicationsystemdemo1.service.OrderService;
@RestController

public class Order {
	@Autowired
	OrderService buyService;

	String success = "Success";
	
	@PostMapping("/orderShare")
	public TradingResponseBean buyShare(@RequestParam  int quantityOfShare, String symbol,int id) {

	System.out.println(quantityOfShare);
	System.out.println(symbol);
	System.out.println(id);
	
		buyService.buyShares( quantityOfShare, symbol, id);
		TradingResponseBean tradingResponseBean = new TradingResponseBean();
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage("Success");
		tradingResponseBean.setDescription("shares added Sucessfullly");
	
		return tradingResponseBean;
	}// end of buyShare
	@DeleteMapping(path = "/cancelShare")
	public TradingResponseBean deleteUser(@RequestBody OrderBean orderBean) {
		int orderId = orderBean.getOid();
	
		buyService.cancelShare(orderId);
		TradingResponseBean tradingResponseBean = new TradingResponseBean();
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage(success);
		tradingResponseBean.setDescription("Booking of share Cancel  Suceesfully");
		return tradingResponseBean;
	}// end of cancel Booking
	
	@PostMapping("/updateShare")
	
	public TradingResponseBean UpdateOrder(@RequestBody OrderBean orderBean) {
		TradingResponseBean tradingResponseBean = new TradingResponseBean();
		buyService.updateShare(orderBean);
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage(success);
		tradingResponseBean.setDescription("shares Updated Successfully");
		return tradingResponseBean;
	
	}

	
}
