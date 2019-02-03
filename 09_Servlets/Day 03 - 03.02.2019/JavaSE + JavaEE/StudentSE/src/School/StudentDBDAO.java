package School;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDBDAO implements StudentDAO {

	@Override
	public ArrayList<Student> getAll() throws SQLException, InterruptedException {

		
		
	
		ArrayList<Student> studentList = new ArrayList<Student>();

		ConnectionPool connectionPool = ConnectionPool.getInstance();
		Connection connection = connectionPool.getConnection();

		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM students";
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			studentList.add(new Student(
					resultSet.getInt("student_id"), 
					resultSet.getString("student_name"),
					resultSet.getInt("student_age"), 
					resultSet.getInt("student_grade")));

		}

		connectionPool.restoreConnection(connection);

		return studentList;
	}

}
