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

@WebServlet("/ProductsServlet")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductsServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pageParam=request.getParameter("page");
		String itemParam=request.getParameter("item");
		
		
		if(pageParam!=null) {
			if(pageParam.equals("home")) {
				JSONArray allProducts=new JSONArray();
				
				for(Product p: ProductStock.products) {
					JSONObject prod=new JSONObject();
					prod.put("name", p.getName());
					prod.put("price", p.getPrice());
					allProducts.add(prod);
				}
				response.getWriter().append(allProducts.toString());
				return;
			}
			
			else if(pageParam.equals("cart")) {
				Object cart=request.getSession().getAttribute("cart");
				if(cart!=null) {
					ArrayList<Product> userProducts=(ArrayList<Product>)cart;
					JSONArray allCartProducts=new JSONArray();
					
					for(Product p: userProducts) {
						JSONObject prod=new JSONObject();
						prod.put("name", p.getName());
						prod.put("price", p.getPrice());
						allCartProducts.add(prod);
					}
					response.getWriter().append(allCartProducts.toString());
					return;
				}
	
			}
		}
		if(itemParam!=null) {
			Product selected=ProductStock.getItemByName(itemParam);
			
			if(selected!=null) {
				Object cart=request.getSession().getAttribute("cart");
				ArrayList<Product> userProducts=(cart!=null)?(ArrayList<Product>)cart:new ArrayList<Product>();
				userProducts.add(selected);	
				request.getSession().setAttribute("cart",userProducts);
				
				response.getWriter().append("{\"res\": \"Added product successfully\"}");
				return;
			}
					
			
		}
		
		response.getWriter().append("Sorry - non supprted request");
	}



}
