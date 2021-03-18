package com.atyeti.tradingapplicationsystemdemo1.service;

import java.util.List;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;


public interface CompanyService {

public void addCompany(CompanyBean companyBean);

public List<CompanyBean> getAllCompany();

public boolean updateCompany(CompanyBean companyBean);

public List<CompanyBean>  getCompany(String cname);

}
