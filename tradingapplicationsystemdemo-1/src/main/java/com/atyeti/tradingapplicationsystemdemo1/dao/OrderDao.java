package com.atyeti.tradingapplicationsystemdemo1.dao;

import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;

public interface OrderDao {

	public OrderBean buyShares( int quantityOfShare, String symbol,int id);

	public boolean cancelShares(int oid);


	public	boolean updateShare(OrderBean orderBean);

}
