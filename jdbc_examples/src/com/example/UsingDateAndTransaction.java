package com.example;
import java.sql.*;
import java.time.LocalDate;

import com.example.utils.DbConnection;

public class UsingDateAndTransaction {

	public static void main(String[] args) {

	
		try {
			
			
		
			Connection con = DbConnection.getMySqlConnection();
			
			String sqlOne = "insert into department values(?,?,?)";
			
			PreparedStatement pstmt2One = con.prepareStatement(sqlOne);
			
			
			 LocalDate date = LocalDate.of(2021, 8, 17);
			
	     
		     Date sqlDate = Date.valueOf(date);
		     
		     System.out.println(sqlDate);
			
			pstmt2One.setInt(1,202);
			pstmt2One.setString(2, "ECE");
			pstmt2One.setDate(3,sqlDate );
			
			
			int rowAdded =pstmt2One.executeUpdate();
			
			System.out.println("Row Added :="+ rowAdded);
			
			
			// next query
			
			String sqlTwo ="insert into student values(?,?,?)";
			
			
			
				PreparedStatement pstmt2 = null;

				int rowCount = 0;
					pstmt2 = con.prepareStatement(sqlTwo);

					pstmt2.setInt(1, 505);
					pstmt2.setString(2, "shiv");
					pstmt2.setDouble(3, 87);


					rowCount = pstmt2.executeUpdate();

					System.out.println(rowCount);
			
			
		} catch (Exception e) {
			
			 e.printStackTrace();
		}
		
		
	
	}

}
