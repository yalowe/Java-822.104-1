package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	   private static String USERNAME = "root";
	   private static String PASSWORD = null;
	   private static String DRIVER = "com.mysql.jdbc.Driver";
	   private static String URL = "jdbc:mysql://localhost:3306/bookStore";
	
	
	public static void buildDB() {
		
		// If JohnBryceDB already exist, there will be an exception.
		// Do nothing in the catch.
		try {
			
			// Create a connection to the database: 
			Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			String sql = "create table Test (" +
				"id int primary key, " +
				"name varchar(50) not null, " +
				"price double not null)";
			
			
			Statement statement = connection.createStatement();
		
			statement.executeUpdate(sql);
			
			System.out.println("Products table has been created.");			
		}
		catch(Exception ex) {
			 System.out.println(ex.getMessage());
		}
	}
	
	
	
		
	   
	public static void main(String[] args) {
	

		try {
			Class.forName(DRIVER);
			 
			buildDB();
			
			
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		

	}

}
