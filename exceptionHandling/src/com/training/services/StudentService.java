package com.training.services;

public class StudentService {

	public void simpleExceptionHandling() {
		
		
		 try {
			Object obj = "forty";
			 
			 Integer number=(Integer)obj;
		} catch (ClassCastException e) {
			
			System.err.println("Is Value of Obj is string ,it can't be cast to interger");
		    e.printStackTrace();
		}
		 
		 
		 
	}
	
	public void handlingWithMultipleCatch(String strNumber) {
		
		      try {
				//Object obj = "forty";

		    	  Object obj = 40;

				  Integer value = (Integer)obj;
				  		      
				  int number = Integer.parseInt(strNumber);
			} catch (NumberFormatException e) {
  				e.printStackTrace();
			}
		    catch(ClassCastException e) {
		    	e.printStackTrace();
		    }
	}
	
	public void multiCatchFromJavaSevenOnwards(String numerator,String denominator) {
		
		
		      try {
				int num = Integer.parseInt(numerator);
				  int den = Integer.parseInt(denominator);
				  
				  
				  int result = num/den;
				  
				  System.out.println(result);
			} catch (NumberFormatException | ArithmeticException e) {
				e.printStackTrace();
			}
		
		
	}
	
	public void usingThrowsClause(String args) throws NullPointerException {
		
		int len = args.length();
		System.out.println("Length of String :="+len);
		
		
	}
}
