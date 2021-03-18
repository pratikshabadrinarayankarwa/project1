package com.atyeti.tradingapplicationsystemdemo1.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class CompanyBean {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private int availabelShare;
	private double todaysPrice;
	private double lastPrice;
	@Column(name="symbol",unique = true)
	private String symbol;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public int getAvailabelShare() {
		return availabelShare;
	}
	public void setAvailabelShare(int availabelShare) {
		this.availabelShare = availabelShare;
	}
	public double getTodaysPrice() {
		return todaysPrice;
	}
	public void setTodaysPrice(double todaysPrice) {
		this.todaysPrice = todaysPrice;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}
