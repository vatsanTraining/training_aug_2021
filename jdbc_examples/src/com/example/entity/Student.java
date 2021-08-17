package com.example.entity;


public class Student implements Comparable<Student> {

	private int rollNumber;
	private String studentName;
	private double markScored;
	
	
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


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ "]";
	}


	@Override
	public int compareTo(Student o) {

		if(this.rollNumber < o.rollNumber) return -1;
		if(this.rollNumber> o.rollNumber) return 1;
		return 0;
	}
	
	
}
