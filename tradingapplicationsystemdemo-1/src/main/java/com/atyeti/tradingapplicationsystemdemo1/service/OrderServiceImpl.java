package com.atyeti.tradingapplicationsystemdemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;
import com.atyeti.tradingapplicationsystemdemo1.dao.OrderDao;
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderDao orderDao;
	@Override
	public OrderBean buyShares( int quantityOfShare, String symbol, int id) {
		// TODO Auto-generated method stub
		return orderDao.buyShares( quantityOfShare, symbol, id);
	}
	@Override
	public boolean cancelShare(int orderId) {
		return orderDao.cancelShares(orderId);
		
	}
	@Override
	public boolean updateShare(OrderBean orderBean) {
		// TODO Auto-generated method stub
		return orderDao.updateShare(orderBean);
	}
	
	



}
