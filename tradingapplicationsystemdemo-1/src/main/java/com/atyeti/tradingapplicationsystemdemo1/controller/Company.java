package com.atyeti.tradingapplicationsystemdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.tradingapplicationsystemdemo1.beans.CompanyBean;
import com.atyeti.tradingapplicationsystemdemo1.beans.TradingResponseBean;
import com.atyeti.tradingapplicationsystemdemo1.service.CompanyService;

@RestController

public class Company{
	@Autowired
	CompanyService companyService;
	String success = "success";
	
		@PostMapping("/addCompany")
		public TradingResponseBean addCompany(@RequestBody CompanyBean companyBean) {
			TradingResponseBean tradingResponseBean = new TradingResponseBean();
			companyService.addCompany(companyBean);
			tradingResponseBean.setStatusCode(200);
			tradingResponseBean.setMessage(success);
			tradingResponseBean.setDescription("company Added Successfully");
			return tradingResponseBean;
		}
		
	
		@GetMapping("/seeAllCompany")
		public TradingResponseBean seeAllCompany() {
			TradingResponseBean tradingResponseBean = new TradingResponseBean();
			List<CompanyBean> companyList = companyService.getAllCompany();
			tradingResponseBean.setStatusCode(200);
			tradingResponseBean.setMessage(success);
			tradingResponseBean.setDescription("company Found Sucesfully");
		
			tradingResponseBean.setCompanyList(companyList);
			return tradingResponseBean;
		}

		@PostMapping("/updateCompany")
		public TradingResponseBean UpdateCompany(@RequestBody CompanyBean companyBean) {
			TradingResponseBean tradingResponseBean = new TradingResponseBean();
			companyService.updateCompany(companyBean);
			tradingResponseBean.setStatusCode(200);
			tradingResponseBean.setMessage(success);
			tradingResponseBean.setDescription("company Updated Successfully");
			return tradingResponseBean;
		}
		
		@GetMapping("/getcompany")
		public TradingResponseBean getCompany(@RequestParam String cname) 
		{System.out.println(cname);
			List<CompanyBean> companyList = companyService.getCompany(cname);
			TradingResponseBean tradingResponseBean = new TradingResponseBean();
			tradingResponseBean.setStatusCode(200);
			tradingResponseBean.setMessage(success);
			tradingResponseBean.setDescription("Company Found...");
			tradingResponseBean.setCompanyList(companyList);
			return tradingResponseBean;
		}	
		
		
}
	
