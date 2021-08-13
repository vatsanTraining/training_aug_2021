package com.training.exceptions;

public class InvalidNumber extends RuntimeException {

	private String message;

	public InvalidNumber(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Custom Exception Message:="+super.getMessage();
	}
	
}
