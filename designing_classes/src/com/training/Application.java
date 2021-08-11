package com.training;

public class Application {

	Item tv = new Item();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number ="45";
	int parsedNumber = Integer.parseInt(number);
		
	parsedNumber++;
	
	 
		Item tv = new Item();
		
		  tv.setItemNumber(1010);
		  tv.setItemName("Sony TV");
		  tv.setRatePerUnit(25000);
		  
		  
		  System.out.println(tv.getItemName());
		  
		  System.out.println(tv.getDetails());
		  
		  
	}

}
