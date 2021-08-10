package com.training;

public class LearnVariables {

	private int id;
	private static String department ="Computer Science";
	private static int counter =1;
	private String firstName;
	
	//Instance and Static variable have default value
	
	public String getDepartment() {
		return department;
	}
	
	public void defaultValue() {
		
		System.out.println(id);
		System.out.println(department);
		System.out.println(firstName);
	}
	
	// Local variables has to initialized before use
	public void local() {
		
		int mark;
		
		// should be initialized before use
		//System.out.println(mark);
		
		int age = 56;
		System.out.println(age);
		
		// cannot have modifiers
		//private String address = "chennai";
		
	}
	
	//passing primitive parameter 
	
	public int setValue(int value) {
		
		System.out.println("Value:="+value);
		
		return ++value;
	}
	
	public Item setItem(Item item) {
		
		item.setRatePerUnit(item.getRatePerUnit()+100);
		
		return item;
	}
	
	public void increment() {
		
		counter++;
	}
	
	public int getCounter() {
		
		return counter;
	}
}
