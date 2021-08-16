package com.training.utils;

import com.training.ifaces.Repository;
import com.training.services.StudentRepoImpl;

public class MyFactory {

	
	public Repository<?> getRepo(String key) {
		
		switch (key.toLowerCase()) {
		case "list":
			 return new StudentRepoImpl();

		default:
			return null;
		}
		
	}
}
