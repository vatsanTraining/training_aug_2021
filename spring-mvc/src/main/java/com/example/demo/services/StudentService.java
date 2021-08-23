package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Student;

@Service
public class StudentService {

	@Autowired
	private RestTemplate template;
	
	
	private String URL = "http://localhost:8080/api/v1/students";
	
	public List<Student> findAll(){
		
		return this.template.exchange(URL, HttpMethod.GET,null,
				 new ParameterizedTypeReference<List<Student>>() {}).getBody();
		
		
		
	}
	
}
