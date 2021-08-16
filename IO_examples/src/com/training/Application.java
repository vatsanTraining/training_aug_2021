package com.training;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.training.model.Book;
import com.training.services.FileService;
import java.util.*;
public class Application {

	public static void main(String[] args) {

		Book java = new Book(101, "Head first java", "kathy sieera", 450);
		Book spring = new Book(102, "Spring in action", "Ben johnson", 950);
		Book effjava = new Book(103, "Effective Java", "Thomas", 1450);
	
		List<Book> bookList = Arrays.asList(java,spring,effjava);
		
		FileService service = new FileService();
		
		int ch = 2;
		
		if(ch==1) {
		
		try {
			
			boolean result = service.writeToFile(bookList);
			
			if(result) {
				System.out.println("File Created !!");
			}
		} catch (IOException e) {

			 e.printStackTrace();
		 }
		}
		if(ch==2) {
			
			    List<Book> list =service.readFromFile();
			    
			    for(Book eachBook:list) {
			    	System.out.println(eachBook);
			    }
		}
	}

}
