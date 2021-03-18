package com.atyeti.tradingapplicationsystemdemo1.beans;

import java.util.List;

public class TradingResponseBean {

	
	private String message;
	private int statusCode;
	private String description;
	private CustomerBean customerBean;
	private CustomerBean customerBean2;
	private CompanyBean companyBean;
	private List<CompanyBean> CompanyBean;
	private List<CompanyBean> companyList;
	private double totalPrice; 
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int i) {
		this.statusCode = i;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	public CustomerBean getCustomerBean2() {
		return customerBean2;
	}
	public void setCustomerBean2(CustomerBean customerBean2) {
		this.customerBean2 = customerBean2;
	}
	public CompanyBean getCompanyBean() {
		return companyBean;
	}
	
	public List<CompanyBean> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<CompanyBean> companyList) {
		this.companyList = companyList;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		// TODO Auto-generated method stub
		this.totalPrice = totalPrice;	
	}
	public void setCompanyBean(List<CompanyBean> companyList2) {
	this.companyList=companyList2;
		
	}
	
	
	
	
}
