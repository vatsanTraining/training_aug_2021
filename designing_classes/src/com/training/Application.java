package com.training;

public class Application {

	Item tv = new Item();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item tv = new Item();
		
		  tv.setItemNumber(1010);
		  tv.setItemName("Sony TV");
		  tv.setRatePerUnit(25000);
		  
		  
		  System.out.println(tv.getItemName());
		  
		  System.out.println(tv.getDetails());
		  
		  
	}

}
