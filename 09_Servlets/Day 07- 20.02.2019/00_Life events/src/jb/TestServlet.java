package jb;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*

first request to running servlet:
Constructor --> @PostConstruct  --> init
_____________________________________________

Every request:
service
______________________________________________
when we stop the service:
destroy --> @PreDestroy  

*/


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		System.out.println("I'm in the ctor.");
    }
	
	@PostConstruct
	public void doSomethingAfterConstruct() {
		System.out.println("I'm in doSomethingAfterConstruct method.");
	}
	
	public void init() {
		System.out.println("I'm in init method.");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I'm in service method.");
	    response.getWriter().write("Got a Request.");
	}

	public void destroy() {
		System.out.println("I'm in destroy method...");
	}
	
	@PreDestroy
	public void doSomethingBeforeDestruct() {
		System.out.println("I'm in doSomethingBeforeDestruct method.");
	}


}
