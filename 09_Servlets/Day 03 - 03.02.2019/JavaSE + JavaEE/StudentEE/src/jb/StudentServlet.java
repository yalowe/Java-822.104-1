package jb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import School.Student;
import School.StudentDBDAO;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public StudentServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentDBDAO myStudentDBDAO=new StudentDBDAO();
		JSONArray studentJson=new JSONArray();
		

		try {
			ArrayList<Student> arrayResult=myStudentDBDAO.getAll();

			for(Student s:arrayResult) {
				JSONObject singleStudent=new JSONObject();
				singleStudent.put("id", s.getId());
				singleStudent.put("name", s.getName());
				singleStudent.put("age", s.getAge());
				singleStudent.put("grade", s.getGrade());
				
				studentJson.add(singleStudent);
				
			}
			
		} catch (Exception e) {} 
		
		response.getWriter().append(studentJson.toString());
	}

	
}
