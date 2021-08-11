package com.training.services;
import com.training.model.*;

public class StudentService {

	private Student[] list;
	private Student[] list2;

	public StudentService(Student[] list) {
		super();
		this.list = list;
	}
	
	
	
	public StudentService() {
		super();
 // initlaize the list2
	}



	public void printNames() {
		
		for(Student eachStudent: list) {
			System.out.println(eachStudent.getStudentName());
		}
	}
	
	public boolean addStudent(Student entity) {
	     // implement the code to add to the list2	
		return true;
	}
	
	public Student[] getList() {
		
		// Add a field grade to the student class 
		// based on the mark scored assign a grade
		// mark < 50 D  >50 and <75 C >75 and <85 B  ,>85 A
		// use the if ladder
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
