package com.training;

import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {

		
		Function funObj = new UsdToInrConverter();
		
		   System.out.println("Expected: 7000 ,Actual:="+ funObj.apply(100));
		   
	}

}
