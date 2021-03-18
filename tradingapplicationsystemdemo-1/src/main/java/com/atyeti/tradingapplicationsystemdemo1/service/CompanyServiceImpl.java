package com.atyeti.tradingapplicationsystemdemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.dao.CompanyDao;
@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	CompanyDao companyDao;


	@Override
	public void addCompany(CompanyBean companyBean) {
		
		companyDao.addCompany(companyBean);
	}


	@Override
	public List<CompanyBean> getAllCompany() {
		// TODO Auto-generated method stub
		return companyDao.getAllCompany();	}


	@Override
	public boolean updateCompany(CompanyBean companyBean) {
		// TODO Auto-generated method stub
		return companyDao.updateCompany(companyBean);
	}



	@Override
	public List<CompanyBean> getCompany(String cname) {
		return companyDao.getCompany(cname);
	}




}
