import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Program {

	public static void main(String[] args) {
	
		
		
		/*
		 * NOTE:
		 * jsonObject.put function gets 2 parameters:
			 * 1) string that represents the key of the property
			 * 2) any value that represents the value of the property (the value will be converted to a string by the "toString" function)
		 `*/
		
		
			
		
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
		
		System.out.println(json);  // --> [{"name":"Mitsi","age":4},{"name":"Kitsi","age":3},{"name":"Pitsi","age":5}]
		
		
		// Create one JSON Object: 
		JSONObject jsonKing= new JSONObject();
		jsonKing.put("name", "Bob");			
		jsonKing.put("age", 12);
		jsonKing.put("isMale", true);
		jsonKing.put("pet", new Cat("Alice", 4));
		
		
		String jsonSingle = jsonKing.toString();
		
		System.out.println(jsonSingle);  // --> {"isMale":true,"name":"Bob","age":12,"pet":<name|Alice, age|4>}
		
		
		
		
	}

}
