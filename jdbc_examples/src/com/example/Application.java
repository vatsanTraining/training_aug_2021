package com.example;

import java.sql.Connection;

import com.example.daos.StudentDaoImpl;
import com.example.entity.Student;
import com.example.ifaces.Repository;
import com.example.utils.DbConnection;

public class Application {

	public static void underStandForName() {
		
		try {
			Class cls =Class.forName("com.example.entity.Student");
			
			Student obj =(Student)cls.newInstance();
			
			System.out.println(obj);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		
		Student ram = new Student(101, "ramesh", 90);
		
		Connection con = DbConnection.getMySqlConnection();
		
		Repository<Student> dao =new StudentDaoImpl(con);
		
		System.out.println(dao.add(ram));
		
		
	}

}
