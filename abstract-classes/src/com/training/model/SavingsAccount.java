package com.training.model;

public  class SavingsAccount extends BankAccount {

	private String nominee;
	
	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	

	public SavingsAccount(int accountNumber, double balance, String nominee) {
		super(accountNumber, balance);
		this.nominee = nominee;
	}


	public String getNominee() {
		return nominee;
	}


	public void setNominee(String nominee) {
		this.nominee = nominee;
	}


	@Override
	public double deposit(double amount) {

		setBalance(getBalance()+amount);
		
		return getBalance();
	}

	@Override
	public double withdraw(double amount) {
		
		setBalance(getBalance()-amount);
		
		return getBalance();
	}

	
	
	
	
}
