package com.atyeti.tradingapplicationsystemdemo1.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="orderShare")
public class OrderBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	private String username;
	private int quantityOfShare;
	private double PriceperShare;
	private double totalPrice;
	private String symbol;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQuantityOfShare() {
		return quantityOfShare;
	}
	public void setQuantityOfShare(int quantityOfShare) {
		this.quantityOfShare = quantityOfShare;
	}
	public double getPriceperShare() {
		return PriceperShare;
	}
	public void setPriceperShare(double priceperShare) {
		PriceperShare = priceperShare;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
}
