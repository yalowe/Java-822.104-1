import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {
	
	
	private static ConnectionPool instance = new ConnectionPool();
	
	
	private Stack<Connection> connections = new Stack<>();
	private static final String connectionString = "jdbc:derby://localhost:1527/JohnBryceDB;create=true";
	

	private ConnectionPool() {
		for(int i = 1; i <= 10; i++) {
			try {
				Connection conn = DriverManager.getConnection(connectionString);
				connections.push(conn);
			}
			catch (SQLException e) { }
		}
	}

	public static ConnectionPool getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws InterruptedException {
		
		synchronized(connections) {

			if(connections.isEmpty()) {
				connections.wait();
			}
			
			return connections.pop();
		}
	}

	public void restoreConnection(Connection conn) {
		
		synchronized(connections) {
			connections.push(conn);
			connections.notify();
		}
	}
	
	public void closeAllConnection() throws InterruptedException {
		
		synchronized(connections) {

			while(connections.size() < 10) {
				connections.wait();
			}
			
			for (Connection conn : connections) {
				try { conn.close(); } catch (Exception e) { }
			}			
		}
	}
}



