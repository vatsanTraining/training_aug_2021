package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student_test")

@Data
public class Student {

	@Id
	@Column(name = "rollNumber")
	private int rollNumber;
	@Column(name="studentName")
	private String studentName;
	@Column(name="markScored")
	private double markScored;
	
}
