package com.example.daos;

import com.example.ifaces.*;

import java.util.List;

import com.example.entity.*;
import java.sql.*;

public class StudentDaoImpl implements Repository<Student> {

	
	private Connection con;
	
	
	public StudentDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Student t) {

		String sql ="insert into student values(?,?,?)";
		
		
		PreparedStatement pstmt;
		int rowAdded =0;
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getRollNumber());
			pstmt.setString(2, t.getStudentName());
			pstmt.setDouble(3,t.getMarkScored());
			
			System.out.println(pstmt.getClass());
			
			rowAdded = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return rowAdded==1?true:false;
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

	
}
