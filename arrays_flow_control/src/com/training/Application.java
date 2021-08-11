package com.training;

import com.training.model.Student;

import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {

		
		Student[] list = new Student[2];
				
				list[0]= new Student(101,"Ramesh",80);
				list[1] = new Student(102,"Suresh",56);
				
	
				StudentService service = new StudentService(list);
				
				service.printNames();
	}

}
