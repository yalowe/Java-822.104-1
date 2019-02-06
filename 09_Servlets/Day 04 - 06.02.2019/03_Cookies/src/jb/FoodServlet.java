package jb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FoodServlet")
public class FoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FoodServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pizzatopParam=request.getParameter("pizzatop");
		String sushiaddParam=request.getParameter("sushiadd");
		
		
		if(pizzatopParam!=null) {
			//-----------------READ PREV COOKIES------------------
			
			String value ="";
					
			Cookie[] allCookies = request.getCookies();
			if(allCookies!=null) {
				for (Cookie c : allCookies) {
					if(c.getName().equals("PizzaTop")) {
					   value = c.getValue();
					}
				}	
			}
			

			//-----------------WRITE NEW COOKIE------------------
			value+=(value.equals(""))?pizzatopParam:"&"+pizzatopParam;
			Cookie cookie = new Cookie("PizzaTop", value);
			cookie.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(cookie); 
		
		}
		
		
		if(sushiaddParam!=null) {
			//-----------------READ PREV COOKIES------------------
			
			String value ="";
					
			Cookie[] allCookies = request.getCookies();
			if(allCookies!=null) {
				for (Cookie c : allCookies) {
					if(c.getName().equals("SushiAddition")) {
					   value = c.getValue();
					}
				}	
			}
			

			//-----------------WRITE NEW COOKIE------------------
			value+=(value.equals(""))?sushiaddParam:"&"+sushiaddParam;
			Cookie cookie = new Cookie("SushiAddition", value);
			cookie.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(cookie); 
		
		}
		
		response.getWriter().append("hello");
		
	}



}
