package com.training;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {
	
	
	public static void main(String[] args) {
		
		  
		
		// ramsAccount is of type Super class= sub class
		BankAccount ramsAccount = 
				new SavingsAccount(1010,5000,"Shiv");
		
		
		ramsAccount.deposit(5000);
		
		ramsAccount.withdraw(1000);
		
		System.out.println("Current Balance should be 9000:="
		                    +ramsAccount.getBalance()); 
	
		System.out.println(ramsAccount.getMessage());
		
		 //System.out.println(ramsAccount.getDetails());
		
		 //Up casting => down casting
		
		   SavingsAccount savings=((SavingsAccount)ramsAccount);
		   System.out.println(savings.getDetails() + savings.getNominee());
		   
		   
	}
	
}


