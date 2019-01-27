package jb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class CatServlet
 */
@WebServlet("/CatServlet")
public class CatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static int requestCounter=0;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		requestCounter++;
		
		System.out.println("requestCounter: "+requestCounter);

		// Create some collection: 
		ArrayList<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat("Mitsi", 4));
		cats.add(new Cat("Kitsi", 3));
		cats.add(new Cat("Pitsi", 5));
		
		// Create JSON Array: 
		JSONArray jsonArray = new JSONArray();
		
		for (Cat c : cats) {
			
			// Create one JSON Object: 
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", c.getName());			
			jsonObject.put("age", c.getAge());
			
			//add the JSON object to the JSONarray
			jsonArray.add(jsonObject);
		}
		
		String json = jsonArray.toString();
		
		response.getWriter().append(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
