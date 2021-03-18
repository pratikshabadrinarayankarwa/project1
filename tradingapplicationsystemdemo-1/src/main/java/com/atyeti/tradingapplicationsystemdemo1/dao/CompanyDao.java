package com.atyeti.tradingapplicationsystemdemo1.dao;

import java.util.List;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;

public interface CompanyDao {


public void addCompany(CompanyBean companyBean);
public List<CompanyBean> getAllCompany() ;

public boolean updateCompany(CompanyBean companyBean);

public List<CompanyBean> getCompany(String cname) ;

}
