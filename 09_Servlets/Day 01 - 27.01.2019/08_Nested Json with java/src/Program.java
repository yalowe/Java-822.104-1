import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Program {

	public static void main(String[] args) {
		
		// Create some collection: 
		ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
		hobbies.add(new Hobby("Angular"));
		hobbies.add(new Hobby("Java"));
		hobbies.add(new Hobby("Html"));
		
		// Create JSON Array: 
		JSONArray jsonArray = new JSONArray();
		
		for (Hobby h : hobbies) {
			
			// Create one JSON Object: 
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", h.getHobbyName());
			
			//add the JSON object to the JSONarray
			jsonArray.add(jsonObject);
		}
		
		
		
		// Create one JSON Object: 
		JSONObject jsonCat= new JSONObject();
		jsonCat.put("name","Alice");
		jsonCat.put("age","4");
		
		// Create one JSON Object: 
		JSONObject jsonKing= new JSONObject();
		jsonKing.put("name", "Bob");			
		jsonKing.put("age", 12);
		jsonKing.put("isMale", true);
		jsonKing.put("pet", jsonCat);  //nested json object
		jsonKing.put("hobbies", jsonArray); //nested json array
		
		
		String jsonSingle = jsonKing.toString();
		
		System.out.println(jsonSingle);  // --> {"isMale":true,"hobbies":[{"name":"Angular"},{"name":"Java"},{"name":"Html"}],"name":"Bob","age":12,"pet":{"name":"Alice","age":"4"}}
		
		
	}

}
