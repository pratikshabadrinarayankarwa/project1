package com.atyeti.tradingapplicationsystemdemo1.dao;

import com.atyeti.tradingapplicationsystemdemo1.beans.PayBean;

public interface PayDao {

	


	public PayBean purchaseShares(int quantityOfShare, String symbol, int id, long cardNumber);


}
