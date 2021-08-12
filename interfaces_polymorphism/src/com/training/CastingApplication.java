package com.training;

public class CastingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// super type = subtype
		//type first => but ref second
		First fst = new Second();
		
		fst.show();
		
		// type first and ref first
		First first = new First();
		
		first.show();
		
		// subtype = supertype =not valid
	      // Second sec = new First();
		   
		// casting super type sub type
		// valid at compile time but 
		// class cast exception thrown at runtime
		
		Second sec =(Second)new First();
		
		sec.show();
	}

}
