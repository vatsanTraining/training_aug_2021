package com.training;
import java.util.*;

import com.training.model.Book;
public class ExampleMap {
	
	public static Map<Integer,Book> createMap(Book ...books){
		
		Map<Integer,Book> bookList = new HashMap<>();
		
		
		for(Book eachBook:books) {
			
			bookList.put(eachBook.getBookNumber(),eachBook);
		}
		
		return bookList;
		
	}
	
	public static void printUsingGet(int key,Map<Integer,Book> list) {
		
		System.out.println(list.get(key));
		
	}
	
	public static void printUsingKeys(Map<Integer,Book> list) {
	
		     Set<Integer> keys = list.keySet();
		
		     for(Integer eachKey:keys) {
		    	 System.out.println(list.get(eachKey));
		     }
	}
	
	public static void printUsingValues(Map<Integer,Book> list) {
		
		          Collection<Book> values =  list.values();
		          
		          for(Book eachBook:values) {
		        	  
		        	  System.out.println(eachBook);
		          }
		
	}
	public static void printByGettingSetView(Map<Integer,Book> list) {
	
		        Set<Map.Entry<Integer, Book>>  setView = list.entrySet();
		
		        Iterator<Map.Entry<Integer,Book>> itr = setView.iterator();
		        
		        
		        while(itr.hasNext()) {
		        	
		        	System.out.println(itr.next());
		        }
		        
	}
	
	

	public static void main(String[] args) {

		
		Book java = new Book(101, "Head first java", "kathy sieera", 450);
		Book spring = new Book(102, "Spring in action", "Ben johnson", 950);
		Book effjava = new Book(103, "Effective Java", "Thomas", 1450);
		
		Book effjava2 = new Book(104, "Effective Java", "Thomas", 1450);
		
		
		Map<Integer,Book> list =
				
				    createMap(java,spring,effjava,effjava2);
		
		
	//	printUsingGet(102, list);
		
	//	printUsingKeys(list);
		
	// printUsingValues(list);
		
	printByGettingSetView(list);
		
		
	}

}
