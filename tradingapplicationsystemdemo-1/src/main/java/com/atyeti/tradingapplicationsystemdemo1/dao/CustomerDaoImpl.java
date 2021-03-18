package com.atyeti.tradingapplicationsystemdemo1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atyeti.tradingapplicationsystemdemo1.beans.CustomerBean;
import com.atyeti.tradingapplicationsystemdemo1.exception.TradingApplicationException;
@Repository

public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	EntityManagerFactory entityManagerFactory;

	@Override
	
	public void registration(CustomerBean customerBean) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(customerBean);
			entityTransaction.commit();
			
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	public CustomerBean login(String username, String password) {
		CustomerBean customerBean = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from CustomerBean where username = :username";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("username", username);
			System.out.println("username");
			customerBean = (CustomerBean) query.getSingleResult();
			System.out.println(customerBean.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!(customerBean.getPassword().equals(password))) {
			
			throw new TradingApplicationException("Invalid Password Please Enter Correct Password");
		}
		return customerBean;
	}

}
