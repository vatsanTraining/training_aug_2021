package com.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.model.Book;

public class StreamApplication {

	public static void main(String[] args) {

		try {
			
//			ObjectOutputStream out =
//					new ObjectOutputStream(new FileOutputStream("abc.ser"));
//			
//			out.writeObject(new Book(101,"java","ja",45);
//			
			
			ObjectInputStream out =
					new ObjectInputStream(new FileInputStream("abc.ser"));
			
			System.out.println(out.readObject());
			
			out.close();
		} catch (Exception e) {
             e.printStackTrace();
		}
	}

}
