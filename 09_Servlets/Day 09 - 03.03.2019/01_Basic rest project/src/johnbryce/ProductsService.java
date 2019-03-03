package johnbryce;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// Route Params	--> @PathParam
// Request Body --> @FormParam
// Query String --> @QueryParam

@Path("products")
public class ProductsService {

	@GET
	@Path("test")
	public Response getAllProducts() {
		String json = "";		
		try {
			json = "[\"All Products...\"]";
			return Response.ok(json).build();
		}
		catch(Exception ex) {
			json = "{\"error\": \"" + ex.getMessage() + "\"}";
			return Response.serverError().entity(json).build();
		}		
	}

	@GET
	@Path("{id}")
	public Response getOneProduct(@PathParam("id") int id) {
		System.out.println("id: " + id);
		String json = "";
		try {
			json = "{\"id\": " + id + "}";
			return Response.ok(json).build();
		}
		catch(Exception ex) {
			json = "{\"error\": \"" + ex.getMessage() + "\"}";
			return Response.serverError().entity(json).build();
		}		
	}
	

	@POST
	@Path("")
	public Response addProduct(@FormParam("name") String name, 
							   @FormParam("price") double price) {
		
		System.out.println("name: " + name + ", price: " + price);
		
		String json = "";
		try {
			json = "Product has been added";
			return Response.ok(json).build();
		}
		catch(Exception ex) {
			json = "{\"error\": \"" + ex.getMessage() + "\"}";
			return Response.serverError().entity(json).build();
		}		
	}
	
	@PUT
	@Path("{id}")
	public Response updateProduct(@PathParam("id")int id, 
							   @FormParam("name") String name, 
							   @FormParam("price") double price) {
		
		System.out.println("id: " + id + ", name: " + name + ", price: " + price);
		
		String json = "";
		try {
			json = "Product has been updated";
			return Response.ok(json).build();
		}
		catch(Exception ex) {
			json = "{\"error\": \"" + ex.getMessage() + "\"}";
			return Response.serverError().entity(json).build();
		}		
	}
	
	@DELETE
	@Path("{id}")
	public Response deleteProduct(@PathParam("id")int id) {
		
		System.out.println("id: " + id);
		
		String json = "";
		try {
			json = "Product has been deleted";
			return Response.ok(json).build();
		}
		catch(Exception ex) {
			json = "{\"error\": \"" + ex.getMessage() + "\"}";
			return Response.serverError().entity(json).build();
		}		
	}

}
