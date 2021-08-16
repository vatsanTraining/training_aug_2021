package com.training.comparators;

import java.util.Comparator;

import com.training.model.Student;

public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getRollNumber(), o2.getRollNumber());
	}

}
