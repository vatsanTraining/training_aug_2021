package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	
	@PostMapping(path = "/api/v1/students")
	public Student add(@RequestBody Student entity){ 
		return this.service.add(entity);
	}
	
	
	@GetMapping(path = "/api/v1/students/srch/{name}")
	public List<Student> searchByName(@PathVariable("name") String name){
		
		return this.service.findByName(name);
	}
	
}
