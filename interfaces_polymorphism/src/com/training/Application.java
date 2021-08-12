package com.training;

import com.training.ifaces.ConvTypes;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverterService;

public class Application {

	public static void main(String[] args) {

		CurrencyConverterService service =
				   new CurrencyConverterService();
		
		
		
		Function usdToInr = service.getFunctionByType(1);
		Function dhmToInr= service.getFunctionByType(ConvTypes.DHMTOINR);
		Function euroToInr= service.getFunctionByType(ConvTypes.EURTOINR);

		
		
		  Function[] refs = {usdToInr,dhmToInr,euroToInr};
		  int[] values = {100,200,300};
		  
		  System.out.println("Expected : 7000 -4000 -27000");
		  int i=0;
		  for(Function eachRef: refs) {
			  
			  service.printResult(eachRef, values[i]);
			i++;
		  }
		
		
		
		
		
		
		
		
		
		
		   
	}

}
