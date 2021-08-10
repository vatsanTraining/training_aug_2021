package com.training;

public class UnderstandingConstructor {

	public static void main(String[] args) {

		
		Item tv = new Item();
		
		System.out.println("Zero Argument :="+ tv.getDetails());
		
		
         Item laptop = new Item(101,"Dell Laptop");
		
		System.out.println("Two Argument :="+ laptop.getDetails());
		
		
		 Item printer = new Item(102,"HP Printer",7000);
			
			System.out.println("Three Argument :="+ printer.getDetails());
			
		
	}

}
