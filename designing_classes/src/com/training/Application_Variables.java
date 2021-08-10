package com.training;

public class Application_Variables {

	public void invoke() {
		
		LearnVariables var =
				 new LearnVariables();
		
		//var.defaultValue();
		
		//var.local();
		
		int value =100;
		
		System.out.println(var.setValue(value));
		
		System.out.println("Value:="+value);
		
		Item printer= new Item(101, "Printer", 100);
		
       var.setItem(printer);
       
       System.out.println(printer.getRatePerUnit());

	}
	
public static void invoke2() {
		
		LearnVariables var =
				 new LearnVariables();
		
		//var.defaultValue();
		
		//var.local();
		
		int value =100;
		
		System.out.println(var.setValue(value));
		
		System.out.println("Value:="+value);
		
		Item printer= new Item(101, "Printer", 100);
		
       var.setItem(printer);
       
       System.out.println(printer.getRatePerUnit());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Application_Variables obj = new Application_Variables();
//		
//		obj.invoke();
				
		//invoke2();
		
		// understanding static 
		
		
		LearnVariables v1  = new LearnVariables();
		 v1.increment();
		LearnVariables v2  = new LearnVariables();
		  v2.increment();
		
		LearnVariables v3  = new LearnVariables();
		  v3.increment();

		  System.out.println(v3.getCounter());
//		
//		System.out.println(v1.getDepartment());
//
//		System.out.println(v2.getDepartment());
//
//		System.out.println(v3.getDepartment());

	}

}
