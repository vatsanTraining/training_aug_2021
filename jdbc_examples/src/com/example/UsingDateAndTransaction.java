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
						
			String sqlOne ="insert into student values(?,?,?)";
			
			
			
				PreparedStatement pstmt1 = null;

					pstmt1 = con.prepareStatement(sqlOne);

					pstmt1.setInt(1, 508);
					pstmt1.setString(2, "naveen");
					pstmt1.setDouble(3, 87);

					 sp1 =con.setSavepoint("sp1");
					 
					int rowCount1 = pstmt1.executeUpdate(); 
					// insert row => savepoint=undo insert  below this row


					
					String sqlTwo = "insert into department values(?,?,?)";
					
					PreparedStatement pstmtTwo = con.prepareStatement(sqlTwo);
					
					
					 LocalDate date = LocalDate.of(2021, 8, 17);
					
			     
				     Date sqlDate = Date.valueOf(date);
				     
					
					pstmtTwo.setInt(1,203);
					pstmtTwo.setString(2, "ECE");
					pstmtTwo.setDate(3,sqlDate );
					
					
					int rowAdded2 =pstmtTwo.executeUpdate();
					
					System.out.println("Row Added :="+ rowAdded2);
					
					
					
					 con.commit();
					
				
			
		} catch (Exception e) {
			
//			try {
//				con.rollback(sp1);
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
			  
			 e.printStackTrace();
		}
		
		
	
	}

}
