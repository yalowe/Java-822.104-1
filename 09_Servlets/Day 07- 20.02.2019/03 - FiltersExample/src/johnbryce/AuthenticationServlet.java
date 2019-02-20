package johnbryce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/authentication")
public class AuthenticationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String command = request.getParameter("command");

		if(command == null) {
			command = "";
		}

		switch(command) {
			case "login": 
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				if(username.equals("ABCD") && password.equals("1234")) { // Demo
					HttpSession session = request.getSession();
					session.setAttribute("isLoggedIn", true);
				}
				break;
			case "logout":
				HttpSession session = request.getSession();
				session.invalidate();
				break;
		}
	}
}
