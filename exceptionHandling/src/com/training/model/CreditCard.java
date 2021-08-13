package com.training.model;

public class CreditCard {

	private String cardHolderName;
	private String  cardNumber;
	private double creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(String cardHolderName, String cardNumber, double creditLimit) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		
		this.cardNumber = cardNumber;
	}
	public double getcreditLimit() {
		return creditLimit;
	}
	public void setcreditLimit(double creditLimit) {
		
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", creditLimit="
				+ creditLimit + "]";
	}
	
	
}
