package com.example;
import java.sql.*;
import java.time.LocalDate;

import com.example.utils.DbConnection;

public class UsingDateAndTransaction {


	public static void main(String[] args) {

		 Savepoint sp1 =null;
		 Savepoint sp2 =null;

		
	
		Connection con=null;
		try {
			
	
			 
		
			 con = DbConnection.getMySqlConnection();
			
			
			con.setAutoCommit(false);
						
			String sqlTwo ="insert into student values(?,?,?)";
			
			
			
				PreparedStatement pstmt2 = null;

				int rowCount = 0;
					pstmt2 = con.prepareStatement(sqlTwo);

					pstmt2.setInt(1, 507);
					pstmt2.setString(2, "naveen");
					pstmt2.setDouble(3, 87);


					rowCount = pstmt2.executeUpdate();  // insert row => undo insert row

		
					  sp1 =con.setSavepoint("sp1");  // savepoint

					// next query
					
					String sqlOne = "insert into department values(?,?,?)";
					
					PreparedStatement pstmtOne = con.prepareStatement(sqlOne);
					
					
					 LocalDate date = LocalDate.of(2021, 8, 17);
					
			     
				     Date sqlDate = Date.valueOf(date);
				     
					
					pstmtOne.setInt(1,203);
					pstmtOne.setString(2, "ECE");
					pstmtOne.setDate(3,sqlDate );
					
					
					int rowAdded =pstmtOne.executeUpdate();
					
					System.out.println("Row Added :="+ rowAdded);
					
					 sp2=con.setSavepoint("sp2");
					
					con.commit();
					
				
			
		} catch (Exception e) {
			
			try {
				con.rollback(sp1);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			  
			 e.printStackTrace();
		}
		
		
	
	}

}
