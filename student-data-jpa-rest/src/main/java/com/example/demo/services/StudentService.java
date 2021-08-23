package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repos.StudentRepository;

import java.util.*;
import com.example.demo.entity.*;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository repo;
	
	
	@GetMapping
	public List<Student> findAll(){
	
		return this.repo.findAll();
	}
	
	public Student add(Student entity) {
		
		 return this.repo.save(entity);
	}
	
	public List<Student> findByName(String name){
		
		return this.repo.findByStudentName(name);
		
	}
	
	
}
