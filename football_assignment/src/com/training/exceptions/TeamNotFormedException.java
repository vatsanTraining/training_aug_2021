package com.training.exceptions;

public class TeamNotFormedException extends Exception {

	private String message;

	public TeamNotFormedException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	
}
