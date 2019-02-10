package jb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShoppingServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pizzatopParam=request.getParameter("pizzatop");
		String sushiaddParam=request.getParameter("sushiadd");
		
		String finalResult="";
		
		
		if(pizzatopParam!=null) {
			//-----------------READ PREV SESSION------------------
			HttpSession mySession=request.getSession();
			
			Object obj=mySession.getAttribute("PizzaTop");
			ArrayList<String> topList=(obj!=null)?(ArrayList<String>)obj:new ArrayList<String>();
			topList.add(pizzatopParam);
			

			//-----------------WRITE NEW SESSION------------------
			mySession.setAttribute("PizzaTop", topList);
			
			finalResult+=topList;
		
		}
		
		
		if(sushiaddParam!=null) {

			//-----------------READ PREV SESSION------------------
			HttpSession mySession=request.getSession();
			
			Object obj=mySession.getAttribute("SushiAddition");
			ArrayList<String> additionList=(obj!=null)?(ArrayList<String>)obj:new ArrayList<String>();

			additionList.add(sushiaddParam);
			

			//-----------------WRITE NEW SESSION------------------
			mySession.setAttribute("SushiAddition", additionList);
			
			finalResult+=additionList;
	
		}
		
		response.getWriter().append("res: "+finalResult);
		
	}


}
