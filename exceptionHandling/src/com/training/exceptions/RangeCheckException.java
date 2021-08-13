package com.training.exceptions;

public class RangeCheckException extends Exception {

	private String message;

	public RangeCheckException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "custom Exception Message:="+super.getMessage();
	}
	
	
}
