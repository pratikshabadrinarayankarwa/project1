package com.atyeti.tradingapplicationsystemdemo1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.PayBean;



@Repository

public class PayDaoImpl implements PayDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

			
			@Override
			public PayBean purchaseShares(int quantityOfShare, String symbol,int id,long cardNumber) {
				// TODO Auto-generated method stub
				PayBean payBean=new PayBean();
				String username=null;
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction = entityManager.getTransaction();
				try {
				String jpql1="from CustomerBean where id =: id";
				entityTransaction.begin();
				Query query = entityManager.createQuery(jpql1);
				query.setParameter("id", id);
				CustomerBean customerBean=(CustomerBean) query.getSingleResult();
					username=customerBean.getUsername();
					
				
		String jpql="from CompanyBean where symbol=: symbol";
		Query query1 = entityManager.createQuery(jpql);
		query1.setParameter("symbol", symbol);
		CompanyBean companyBean=(CompanyBean) query1.getSingleResult();
	
		double pricepershare=0.0;
		String symbol1=null;
		double amount=0.0;
		
			pricepershare=companyBean.getTodaysPrice();
			symbol1=companyBean.getSymbol();
			 amount= quantityOfShare*pricepershare;

payBean.setCardNumber(cardNumber);
		payBean.setUsername(username);
		payBean.setPriceperShare(pricepershare);
		payBean.setQuantityOfShare(quantityOfShare);
		payBean.setSymbol(symbol1);
		payBean.setTotalPrice(amount);
		
		entityManager.persist(payBean);
		entityTransaction.commit();
		}
				catch(Exception e) {
					e.printStackTrace();
				}
		return payBean;

	}






	









}
