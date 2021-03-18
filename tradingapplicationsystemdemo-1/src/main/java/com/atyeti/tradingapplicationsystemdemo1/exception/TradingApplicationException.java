package com.atyeti.tradingapplicationsystemdemo1.exception;


public class TradingApplicationException extends RuntimeException{

	String message;
	
	public TradingApplicationException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	

	
	
	

}
