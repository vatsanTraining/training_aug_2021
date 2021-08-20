package com.example.demo.services;

import java.util.*;

import com.example.demo.entity.Student;
import com.example.demo.repos.Repository;

public class StudentRepoImpl implements Repository<Student> {

	private List<Student> studList;
	
	public StudentRepoImpl() {
		super();
          studList = new ArrayList<>();
	}

	@Override
	public boolean add(Student t) {
		return studList.add(t);
	}

	@Override
	public List<Student> findAll() {
		return studList;
	}

	@Override
	public boolean remove(Student t) {

		return studList.remove(t);
	}

	@Override
	public List<Student> sortedList() {
			
			
         return studList;
	}

	@Override
	public List<Student> sortBy(String prop) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
