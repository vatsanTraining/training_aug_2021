package com.training;
import java.util.*;

import com.training.model.Book;
public class ExampleHashSet {

	
	// ... denotes varargs => variable arguments
	// you can one ore more arguments book1,book2,book3
	// book1,book2
	// book1,book2,book3,book4
	// java converts the values into array and its passed
	
	//public Set<Book>  usingHashSet(Book[] books) ==> equivalent to this
	
	public static void print(Set<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook.getBookName());
			System.out.println(eachBook.getAuthor());
		}
	}
	
	public static  Set<Book>  usingHashSet(Book ...books) {
		
		Set<Book> bookList = new HashSet<>();
		
		for(Book eachBook:books) {
			
			bookList.add(eachBook);
		}
		
		return bookList;
	}
	
	public static  Set<Book>  usingTreeSet(Book ...books) {
		
	  TreeSet<Book> bookList = new TreeSet<>();
	  
	  
		 return null;
	}
		
	
	
	public static void main(String[] args) {

		Book java = new Book(101, "Head first java", "kathy sieera", 450);
		Book spring = new Book(102, "Spring in action", "Ben johnson", 950);
		Book effjava = new Book(103, "Effective Java", "Thomas", 1450);
		Book effjava2 = new Book(103, "Effective Java", "Thomas", 1450);

		Set<Book> response =usingHashSet(java,spring,effjava,effjava2);
		
		 print(response);
		 
		 
		
	}

}
