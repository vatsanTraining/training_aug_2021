package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.Repository;
import com.training.model.Student;
import com.training.services.StudentRepoImpl;
import com.training.utils.MyFactory;

public class Application {

	public static void main(String[] args) {

			
		MyFactory factory = new MyFactory();
		
		
//		Student stud = 
//				new Student(Integer.parseInt(args[0]),
//						 args[1],Double.
//						    parseDouble(args[2])); 
		

		
		Repository repo = factory.getRepo("list");
		
		Student stud1 = new Student(101, "Ramesh", 90);
		Student stud2 = new Student(202, "Rajesh", 89);
		Student stud3 = new Student(103, "Rakesh", 79);
		
		System.out.println("is Added:= "+repo.add(stud1));
		System.out.println("is Added:= "+repo.add(stud2));
		System.out.println("is Added:= "+repo.add(stud3));
		
		
		List<Student> list = repo.findAll();
		

		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}
		
		
		List<String> names = new ArrayList<>();
		
		names.add("Anil");
		names.add("Zahir");
		names.add("Shiv");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		
	}

}
