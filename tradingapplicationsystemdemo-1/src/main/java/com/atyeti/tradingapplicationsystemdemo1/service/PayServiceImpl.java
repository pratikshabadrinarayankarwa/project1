package com.atyeti.tradingapplicationsystemdemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atyeti.tradingapplicationsystemdemo1.beans.PayBean;
import com.atyeti.tradingapplicationsystemdemo1.dao.PayDao;
@Service
public class PayServiceImpl implements PayService{
@Autowired
PayDao payDao;
	
	

	@Override
	public PayBean purchaseShares( int quantityOfShare, String symbol, int id,long cardNumber) {
		// TODO Auto-generated method stub
		return payDao.purchaseShares(quantityOfShare,symbol,id,cardNumber);
	}

}
