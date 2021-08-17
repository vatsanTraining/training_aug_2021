package com.example.utils;
import java.sql.*;
import java.util.Properties;
import java.io.*;
public class DbConnection {

	public static Connection getMySqlConnection() {
		
		Connection con = null;
		
		try(InputStream stream =
				new FileInputStream(new File("DbConnection.properties"));
				) {
			
			
			Properties props = new Properties();
			
			props.load(stream);
			
			
			Class.forName(props.getProperty("datasource.driver"));
			
			
			con = DriverManager.getConnection(
					 props.getProperty("datasource.url"),
					 props.getProperty("datasource.userName"),
					 props.getProperty("datasource.password")
					 
					);
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return con;
	}
	
	
}
