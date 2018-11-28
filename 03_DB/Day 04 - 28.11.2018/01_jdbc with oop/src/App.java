import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	public static void insert(Product newProduct){  	
	Connection connection =null;
	PreparedStatement preparedStatement = null;
	try {
		
		// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		// Create sql statement: 
		String sql = String.format("INSERT INTO products(name, price) VALUES('%s', %.2f)", newProduct.getName(), newProduct.getPrice());
		
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
	public static ArrayList<Product> readAll(){
		
		Connection connection =null;
		Statement statement = null;
		ArrayList<Product> products=new ArrayList<Product>();
		
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
			products.add(new Product(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getDouble("price")));	
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
		
		return products;
		
	}
	
	
	
	//-------------------------עידכון נתונים בטבלה-----------------------------
	public static void update(Product updateProduct)  {
		
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			
			// Create a connection: 
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
	
		// Create an update sql statement: 
		String sql = String.format("UPDATE products SET name='%s', price=%.2f WHERE id=%d", updateProduct.getName(), updateProduct.getPrice(), updateProduct.getId());
		
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
	public static void delete(int id) {
		
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
			
			insert(new Product("Apple", 3.5));
			insert(new Product("Banana", 4.7));
			insert(new Product("Peach", 3.2));
			insert(new Product("Orange", 5.2));
			insert(new Product("Grapes", 7.3));
			
			update(new Product(4, "Blueberry", 10.7));
			
			delete(5);
			
			ArrayList<Product> res=readAll();
			
			for(Product p:res){
				System.out.println(p);
			}
			
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		

	}

}
