package com.atyeti.tradingapplicationsystemdemo1.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.OrderBean;
import com.atyeti.tradingapplicationsystemdemo1.exception.TradingApplicationException;
@Repository
public class OrderDaoImpl implements OrderDao{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public OrderBean buyShares(int quantityOfShare, String symbol,int id) {
		OrderBean orderBean=new OrderBean();
		// TODO Auto-generated method stub
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
int pid=0;
double pricepershare=0.0;
String symbol1=null;
double amount=0.0;
	pid=companyBean.getCid();
	pricepershare=companyBean.getTodaysPrice();
	symbol1=companyBean.getSymbol();
	 amount= quantityOfShare*pricepershare;

		
	
orderBean.setUsername(username);
orderBean.setPriceperShare(pricepershare);
orderBean.setQuantityOfShare(quantityOfShare);
orderBean.setSymbol(symbol1);
orderBean.setTotalPrice(amount);

		
entityManager.persist(orderBean);
entityTransaction.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

return orderBean;

	/*	String jpql = "from CompanyBean where symbol =:symbol";
		
	
			if (companyList == null || companyList.isEmpty()) {
				throw new TradingApplicationException("No Company Present!!");
			}

		} catch (Exception e) {
			throw new TradingApplicationException("No Company Present!!");
		}*/
	}

	@Override
	public boolean cancelShares(int oid) {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isDeleted = false;
		try {
			
			entityTransaction.begin();
			OrderBean orderBean = entityManager.find(OrderBean.class, oid);
			entityManager.remove(orderBean);
			entityTransaction.commit();
			isDeleted = true;
		} catch (Exception e) {
			throw new TradingApplicationException("Unable to cancel the booking Please Try Later");
		}
		entityManager.close();
		return isDeleted;
	}


@Override
	public boolean updateShare(OrderBean orderBean) {
		// TODO Auto-generated method stub
		
			boolean isUpdate = false;
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			OrderBean orderBean2 = entityManager.find(OrderBean.class, orderBean.getOid());
		
			

			if (orderBean2 != null) {
				int quantityOfShare=orderBean.getQuantityOfShare();
			
				if (quantityOfShare!= 0) {
					
					orderBean2.setQuantityOfShare(quantityOfShare);
				}
				if (orderBean.getTotalPrice() != 0) {
					
					orderBean2.setTotalPrice(orderBean.getTotalPrice());
				}
				
			} else {
				throw new TradingApplicationException("No Order is Present");
			}
			try {
				entityTransaction.begin();
				entityManager.persist(orderBean2);
				entityTransaction.commit();
				isUpdate = true;

			} catch (Exception e) {
				throw new TradingApplicationException("Unable to get Order");
			}
			return isUpdate;
		}



	
	
	
	

}
