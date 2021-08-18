package com.example.daos;

import com.example.ifaces.*;
import com.training.ifaces.CrudRepository;

import java.util.List;

import com.example.entity.*;
import java.sql.*;

public class StudentDaoImpl implements CrudRepository<Student> {

	
	private Connection con;
	
	
	public StudentDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Student t) {

		String sql ="insert into student values(?,?,?)";
		
		
		if (findById(t.getRollNumber()) == null) {

			PreparedStatement pstmt = null;

			int rowAdded = 0;
			try {
				pstmt = con.prepareStatement(sql);

				pstmt.setInt(1, t.getRollNumber());
				pstmt.setString(2, t.getStudentName());
				pstmt.setDouble(3, t.getMarkScored());

				System.out.println(pstmt.getClass());

				rowAdded = pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return rowAdded==1?true:false;
		} else {
			throw new ElementAlreadyExistException(Integer.toString(t.getRollNumber()));
		}
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean remove(Student t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> sortedList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> sortBy(String prop) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Student findById(int id) {

		String sql = "select * from student where rollNumber=?";
		
		Student stud =null;
		
		PreparedStatement pstmt =null;
		try {
			
				
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			
			ResultSet rs = pstmt.executeQuery();
			
		  if(rs.next()) {
			   
			  int rollNumber = rs.getInt("rollNumber");
			  String studentName = rs.getString("studentName");
			  double markScored = rs.getDouble("markScored");
			  
			  stud =new Student(rollNumber, studentName, markScored);
		  }
		
		} catch (Exception e) {
             e.printStackTrace();
		}
		
		return stud;
	}
	
}
