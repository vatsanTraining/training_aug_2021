package com.training.services;

import com.training.DhiramToInrConverter;
import com.training.EuroToInrConverter;
import com.training.UsdToInrConverter;
import com.training.ifaces.ConvTypes;
import com.training.ifaces.Function;

public class CurrencyConverterService {

	
	// Factory Method which takes integer argument
	
	public Function getFunctionByType(int key) {
		
		switch (key) {
		case 1:
			return new UsdToInrConverter();
		case 2:
			return new DhiramToInrConverter();
		case 3:
			return new EuroToInrConverter();
		default:
			return null;
		}
	}
	// overloaded Factory Method
public Function getFunctionByType(String key) {
		
		switch (key) {
		case ConvTypes.USDTOINR:
			return new UsdToInrConverter();
		case  ConvTypes.DHMTOINR:
			return new DhiramToInrConverter();
		case ConvTypes.EURTOINR:
			return new EuroToInrConverter();
		default:
			return null;
		}
	}
	
	public void printResult(Function funRef,double value) {
		System.out.println(funRef.apply(value));
	}
	
	//YenToInR
	
}
