package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		
		BankAccount ramsAccount = 
				new SavingsAccount(1010,5000, "shiv");
		
		
		ramsAccount.deposit(5000);
		
		ramsAccount.withdraw(1000);
		
		System.out.println("Current Balance should be 9000:="
		                    +ramsAccount.getBalance()); 
		
	}

}
