package com.atyeti.tradingapplicationsystemdemo1.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TradingApplicationValidationImpl implements TradingApplicatIionValidation{
	Pattern pattern=null;
    Matcher matcher=null;
	@Override
	public boolean userNameValidation(String username) {
		pattern=Pattern.compile("[a-zA-Zs]+\\s[a-zA-Z]+$");
		matcher=pattern.matcher(username);
		if(matcher.matches()) {
			return true;
		}
		return false;
			}
	@Override
	public boolean emailValidation(String email) {
		pattern=Pattern.compile("\\w+\\@\\w+\\.\\w+");
		matcher=pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	@Override
	public boolean passwordValidation(String password) {
		pattern=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,15}");
		matcher=pattern.matcher(password);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
    
    

}
