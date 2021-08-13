package com.training;

public class UnderstandFinally {

	public static void show() {
		
		System.out.println("Hi");
	}
	// case -1 when null is passed => throws exception and prints back from ty catch
	// case -2 when string is passed => does not throw exception but print back from try catch
	// case -3 when finally block is added => it get called when exception is thrown and i am back also printed
	// case -4 when finally block is called when exception is not there and i am back also printed
	// case -5 add return statement in catch and observe
	public static String getMessage(String message) {
		
		
		String substr=null;
		try {
			substr = message.substring(1,5);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("=========catch=====");
			//return "from catch Block";
		}
		finally {
			System.out.println("I am inside finally");
			//return "I am from finally";
		}
		  System.out.println("Back from Try-Catch");
		  
		  show();
		return substr;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getMessage(null));
		
//		try {
//			
//			System.out.println(args[0].length());
//		} catch (Exception e) {
//               e.printStackTrace();
//		}
//		
//		System.out.println("Good Bye");
//	}
}
}
