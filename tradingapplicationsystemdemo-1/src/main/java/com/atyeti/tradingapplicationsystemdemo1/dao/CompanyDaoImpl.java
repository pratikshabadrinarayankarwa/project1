package com.atyeti.tradingapplicationsystemdemo1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;

import com.atyeti.tradingapplicationsystemdemo1.exception.TradingApplicationException;

@Repository
public class CompanyDaoImpl implements CompanyDao {
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void addCompany(CompanyBean companyBean) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(companyBean);
			entityTransaction.commit();

		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public List<CompanyBean> getAllCompany() {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String jpql = "from CompanyBean";
		Query query = entityManager.createQuery(jpql);
		List<CompanyBean> companyList = null;
		try {
			entityTransaction.begin();
			companyList = query.getResultList();
			entityTransaction.commit();

			if (companyList == null || companyList.isEmpty()) {
				throw new TradingApplicationException("No Company Present!!");
			}

		} catch (Exception e) {
			throw new TradingApplicationException("No Company Present!!");
		}

		return companyList;

	}

	@Override
	public boolean updateCompany(CompanyBean companyBean) {
		boolean isUpdate = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		CompanyBean companyBean2 = entityManager.find(CompanyBean.class, companyBean.getCid());
		if (companyBean2 != null) {
			if (companyBean.getCname() != null) {
				companyBean.setCname((companyBean.getCname()));
			}
			if (companyBean.getAvailabelShare()!= 0) {
				companyBean2.setAvailabelShare(companyBean.getAvailabelShare());
			}
			if (companyBean.getTodaysPrice() != 0) {
				companyBean2.setTodaysPrice(companyBean.getTodaysPrice());
			}
			if (companyBean.getLastPrice() != 0) {
				companyBean2.setLastPrice(companyBean.getLastPrice());
			}
			if(companyBean.getSymbol()!=null) {
				companyBean.setSymbol(companyBean.getSymbol());
			}

		} else {
			throw new TradingApplicationException("No Company is Present");
		}
		try {
			entityTransaction.begin();
			entityManager.persist(companyBean2);
			entityTransaction.commit();
			isUpdate = true;

		} catch (Exception e) {
			throw new TradingApplicationException("Unable to get Company");
		}
		return isUpdate;
	}


	@Override
	public List<CompanyBean> getCompany(String cname) {
		List<CompanyBean> companyList = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	CompanyBean companyBean = new CompanyBean();
		try {	
		String jpql = "from CompanyBean where cname = :cname";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("cname",cname);
			companyList = (List<CompanyBean>) query.getResultList();
			System.out.println(companyBean.getCname());
			if (companyList == null || companyList.isEmpty()) {
				throw new TradingApplicationException("No Company Present!!");
			}
		} catch (Exception e) {
			throw new TradingApplicationException("Unable to get Company");
			
		}
		
	
		return companyList;
	
	
	}

	


}
