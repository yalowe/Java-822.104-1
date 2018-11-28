import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	   // all this props are used to create the connection to mySql
	   private static String USERNAME = "root";
	   private static String PASSWORD = null;
	   private static String URL = "jdbc:mysql://localhost:3306/JB";

	
	
	public static void buildDB() {
		
		Connection connection =null;
		Statement statement = null;
		try {
			
			// Create a connection to the database: 
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			String sql = "CREATE TABLE products (" +
				"id INT PRIMARY KEY AUTO_INCREMENT, " +
				"name VARCHAR(50) NOT NULL, " +
				"price DOUBLE NOT NULL)";
			
			
			statement = connection.createStatement();	
			statement.executeUpdate(sql);
			
			System.out.println("orders table has been created.");			
		}
		catch(Exception ex) {
			 System.out.println(ex.getMessage());
		}
		finally{
			if(connection!=null)
				try {
					statement.close();
					connection.close();
				} catch (SQLException ex) {
					 System.out.println(ex.getMessage());
				}
		}
	}
	
	

		

	//-------------------------הכנסת נתונים לטבלה-----------------------------
	public static void insert(String name, double price){  	
	Connection connection =null;
	PreparedStatement preparedStatement = null;
	try {
		
		// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		// Create sql statement: 
		String sql = String.format("INSERT INTO products(name, price) VALUES('%s', %.2f)", name, price);
		
		// Create object which can execute the above sql and return the new id:
		 preparedStatement = connection.prepareStatement(sql);
		
		// Execute (the insert command):
		int res=preparedStatement.executeUpdate();
		
		if(res!=0)
			System.out.println("Insert succeeded");
	}
	catch(Exception ex) {
		 System.out.println(ex.getMessage());
	}
	finally{
		if(connection!=null)
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException ex) {
				 System.out.println(ex.getMessage());
			}
	}
	}
		
	
	
	//-------------------------קריאת נתונים מהטבלה-----------------------------
	public static void readAll(){
		
		Connection connection =null;
		Statement statement = null;
		
		try {
			
		// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		
		// Create a statement object which can read data: 
		statement = connection.createStatement();
		
		// Create sql statement for reading data: 
		String sql = "SELECT * FROM products";
		
		// Execute the query and return an object which contains the data (the table):
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		
		//loop over the rows in the ResultSet
		// next() - Moves the cursor forward one row from its current position - returns true if the new current row is valid; false if there are no more rows
		while(resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double price = resultSet.getDouble("price");
			
			System.out.println("id: " + id + ", name: " + name + ", price: " + price);	
		}
		}
		catch(Exception ex) {
			 System.out.println(ex.getMessage());
		}
		finally{
			if(connection!=null)
				try {
					statement.close();
					connection.close();
				} catch (SQLException ex) {
					 System.out.println(ex.getMessage());
				}
		}
		
	}
	
	
	
	//-------------------------עידכון נתונים בטבלה-----------------------------
	public static void update(int id, String name, double price) throws SQLException {
		
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			
			// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
	
		// Create an update sql statement: 
		String sql = String.format("UPDATE products SET name='%s', price=%.2f WHERE id=%d", name, price, id);
		
		// Create an object for executing the above sql: 
	    preparedStatement = connection.prepareStatement(sql);
		
	int res=preparedStatement.executeUpdate();
		
		if(res!=0)
			System.out.println("Update succeeded");
	}
	catch(Exception ex) {
		 System.out.println(ex.getMessage());
	}
	finally{
		if(connection!=null)
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException ex) {
				 System.out.println(ex.getMessage());
			}
	}
}
	
	
	
	//-------------------------מחיקת נתונים מהטבלה-----------------------------
	public static void delete(int id) throws SQLException {
		
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			
			// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
	
		
		// Create sql command for delete one record: 
		String sql = String.format("DELETE FROM products WHERE id=%d", id);
		
		// Create an object for executing the above command: 
		preparedStatement = connection.prepareStatement(sql);
		
int res=preparedStatement.executeUpdate();
		
		if(res!=0)
			System.out.println("Delete succeeded");
	}
	catch(Exception ex) {
		 System.out.println(ex.getMessage());
	}
	finally{
		if(connection!=null)
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException ex) {
				 System.out.println(ex.getMessage());
			}}
	}

	public static void main(String[] args) {
	

		try {
			Class.forName("com.mysql.jdbc.Driver");
			 
			buildDB();
			
			insert("Apple", 3.5);
			insert("Banana", 4.7);
			insert("Peach", 3.2);
			insert("Orange", 5.2);
			insert("Grapes", 7.3);
			
			update(4, "Blueberry", 10.7);
			
			delete(5);
			
			readAll();
			
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		

	}

}
