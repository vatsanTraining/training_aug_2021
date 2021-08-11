package com.training;
import java.util.*;

public class Application {

	public static void usingCommandLineArgs(String[] args) {
		
		ItemService service = new ItemService();
		
		String num ="45";
		                            
		  Item tv = new Item(Integer.parseInt(args[0]),
				            args[1], Double.parseDouble(args[2]));
		  
		  System.out.println("5% discount:=" +service.calculateDiscount(tv));
		  
		  System.out.println("10% discount:="+service.calculateDiscount(tv, .10));

	}
	
	public static void usingTerminalUserInput() {
		
		ItemService service = new ItemService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Item Number");
		
			int itemNumber = sc.nextInt();
		
		System.out.println("Enter the Item Name");
		
			String itemName = sc.next();
		
			System.out.println("Enter the Description -more than one word");
			
			sc.next();
			String word1 = sc.nextLine();
		
			System.out.println("Enter the Review ");
			
			String word2 = sc.nextLine();
		
			System.out.println("first number");
			
			int num1 = sc.nextInt();
						
            System.out.println("second number");
			
			int num2 = sc.nextInt();
			
		System.out.println("Rate Per Unit");
			double ratePerUnit = sc.nextDouble();
			
			Item obj = new Item(itemNumber, itemName, ratePerUnit);
			
			 System.out.println("5% discount:=" +service.calculateDiscount(obj));
			  
			  System.out.println("10% discount:="+service.calculateDiscount(obj, .10));

				
		sc.close();
		
	}
	
	public static void main(String[] args) {
		
		
				  usingCommandLineArgs(args);
				  
				  //usingTerminalUserInput();
				  
	}
}
