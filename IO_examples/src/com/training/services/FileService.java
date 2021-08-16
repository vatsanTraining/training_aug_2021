package com.training.services;

import java.io.*;
import java.util.*;

import com.training.model.Book;

public class FileService {
	
	public boolean writeToFile(List<Book> bookList) throws IOException {
		
		boolean result =false;
		
		try(PrintWriter writer = new PrintWriter(
				            new FileWriter(new File("books.txt"),true))){
			
			for(Book eachBook:bookList) {
				
				writer.println(eachBook.toString());
				
				result =true;
			}
			
			return result;
		}
		
		
	}
	
	public List<Book> readFromFile(){
		
		List<Book> bookList = new ArrayList<>();
		
		try(BufferedReader reader = 
				new BufferedReader(
						 new FileReader(new File("books.txt")))){
			
			String line =null;
					
					while( (line=reader.readLine())!=null) {
						
						String[] values = line.split(",");
						
						 int bookNumber= Integer.parseInt(values[0]);
						String bookName= values[1];
						 String author =values[2];
						 double price=Double.parseDouble(values[3]);
							
					 Book book = new Book(bookNumber, bookName, author, price);
							 
							 bookList.add(book);
						
					}
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		return bookList;
	}
	
	
}
