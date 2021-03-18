package com.atyeti.tradingapplicationsystemdemo1.service;

import com.atyeti.tradingapplicationsystemdemo1.beans.PayBean;

public interface PayService {

	
	public PayBean purchaseShares(int quantityOfShare, String symbol, int id,long cardNumber);
}
