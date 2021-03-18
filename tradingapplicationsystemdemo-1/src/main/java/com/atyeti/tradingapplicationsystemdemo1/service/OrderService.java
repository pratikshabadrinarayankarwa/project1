package com.atyeti.tradingapplicationsystemdemo1.service;

import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;

public interface OrderService {

	public OrderBean buyShares(int quantityOfShare, String symbol,int id);

	public boolean cancelShare(int orderId);
	public boolean updateShare(OrderBean orderBean);
	

}
