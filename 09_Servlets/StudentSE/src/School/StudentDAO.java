package School;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {
	ArrayList<Student> getAll() throws SQLException, InterruptedException;
}
