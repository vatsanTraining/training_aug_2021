package com.training;

import com.training.model.Insurance;
import com.training.model.Student;
import com.training.model.VechcileInsurance;

public class Application {
	

	public static void main(String[] args) {
		
		Student ram = new Student(101, "ramesh", 90);
		
		
		System.out.println(ram);
		
		Insurance insObj = new Insurance(2020, "ramesh", 40000);
		
		System.out.println(insObj.calculatePremium());
		
		
		Insurance vecObj = new VechcileInsurance(102, "Suresh", 60000, "car", 2000);
		
		
		System.out.println(vecObj.calculatePremium());
		 
	}
}
