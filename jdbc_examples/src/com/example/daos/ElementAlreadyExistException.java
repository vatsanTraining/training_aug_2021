package com.example.daos;

public class ElementAlreadyExistException extends RuntimeException {

	private String message;
	
	public ElementAlreadyExistException(String message) {
		
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "primary key with "+this.message + "  Already exisits in the table";
	}
	
	

}
