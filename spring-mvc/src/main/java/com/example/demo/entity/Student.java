package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {

	private int rollNumber;
	private String studentName;
	private double markScored;
	
}
