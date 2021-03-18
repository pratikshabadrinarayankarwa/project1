package com.atyeti.tradingapplicationsystemdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.PayBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.TradingResponseBean;
import com.atyeti.tradingapplicationsystemdemo1.service.PayService;
@RestController

public class Pay {
	@Autowired
	PayService payService;
	String success = "success";

	@PostMapping("/purchaseShare")
	public TradingResponseBean purcahseShare(@RequestParam  int quantityOfShare, String symbol,int id,long cardNumber) {
		payService.purchaseShares(quantityOfShare, symbol, id,cardNumber);
		TradingResponseBean tradingResponseBean = new TradingResponseBean();
		tradingResponseBean.setStatusCode(200);
		tradingResponseBean.setMessage("Success");
		tradingResponseBean.setDescription("Transaction Sucessfull");
	
		return tradingResponseBean;
	}// end of buyShare
	

}
