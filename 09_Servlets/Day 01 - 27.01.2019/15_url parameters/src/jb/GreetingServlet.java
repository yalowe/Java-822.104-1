package jb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str=request.getParameter("part");
		
		
		
		switch(str) {
		
		//http://localhost:8080/15_url_parameters/GreetingServlet?part=night
		case "night": response.getWriter().append("now is: ").append(str).append(" So have sweet dreams"); break;
		
		//http://localhost:8080/15_url_parameters/GreetingServlet?part=morning
		case "morning": response.getWriter().append("now is: ").append(str).append(" So have a good day"); break;		
		
		
		default:response.getWriter().append("I do not recognize your choice: "+ str); break;
		
		}
		
	}

	
}
