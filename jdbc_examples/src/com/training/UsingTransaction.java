package com.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.example.utils.DbConnection;

public class UsingTransaction {

	public static void main(String[] args) {
		Connection con=null;
		try {
			
	
			 con = DbConnection.getMySqlConnection();
			
			
			con.setAutoCommit(false);
						
			String sqlOne ="insert into student values "+"(101 ,'Navven',87)";
			
			PreparedStatement pstmt1  = con.prepareStatement(sqlOne);

					pstmt1.executeUpdate();


					Savepoint sp = con.setSavepoint("sp1");

					
					String sqlTwo ="insert into student values "+"(102 ,'ram',97)";
					
					 pstmt1  = con.prepareStatement(sqlTwo);

							pstmt1.executeUpdate();
					
							

							String sqlThree ="insert into student values "+"(103 ,'vikcy',77)";
							
							 pstmt1  = con.prepareStatement(sqlThree);

							 
									pstmt1.executeUpdate();

									
                                     con.rollback(sp);
                                     
									con.commit();
	} catch(SQLException e) {
		
		e.printStackTrace();
	}

}
	
}
