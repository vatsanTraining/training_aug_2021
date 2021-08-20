package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.StudentRepository;

import java.util.*;
import com.example.demo.entity.*;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository repo;
	
	
	public List<Student> findAll(){
	
		System.out.println(repo.getClass());
		return this.repo.findAll();
	}
}
