package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.StudentService;

import com.example.demo.entity.*;
import java.util.*;

@RestController
public class StudentController {

	private StudentService service;

	@Autowired
	public void setService(StudentService service) {
		this.service = service;
	}
	
	
	@GetMapping(path = "/api/v1/students")
	public List<Student> findAll(){
		return this.service.findAll();
	}
	
	
	
}
