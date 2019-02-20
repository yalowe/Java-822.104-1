package johnbryce;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TesterServlet")
public class TesterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String lastUpdate;
	private String authorName;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		lastUpdate = config.getInitParameter("LastUpdate");
		authorName = config.getInitParameter("AuthorName");
		
		System.out.println("Last Update (from init): " + lastUpdate);
		System.out.println("authorName (from init): " + authorName);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Last Update (from doGet): " + lastUpdate);
		System.out.println("authorName (from doGet): " + authorName);
		
		ServletConfig config = getServletConfig();
		System.out.println("Last Update (from doGet): " + config.getInitParameter("LastUpdate"));
		System.out.println("authorName (from doGet): " + config.getInitParameter("AuthorName"));
	}

}
