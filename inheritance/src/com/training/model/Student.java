package com.training.model;

public class Student {

	private int rollNumber;
	private String studentName;
	private double markScored;
	private String grade;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int rollNumber, String studentName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
	}


	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	public String toString() {
		return this.studentName +"," +this.rollNumber+"," +this.markScored;
	}


	
	
}


