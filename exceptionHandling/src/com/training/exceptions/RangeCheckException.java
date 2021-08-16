package com.training.exceptions;
/**
 * 
 * @author vatsan
 * This class is used to check the Range 
 *  of a given number is within a limit 
 */
public class RangeCheckException extends Exception {

	private String message;

	/**
	 * 
	 * @param message  its a exception message
	 */
	public RangeCheckException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "custom Exception Message:="+super.getMessage();
	}
	
	
}
