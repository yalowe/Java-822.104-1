import java.util.Hashtable;

public class App {

	public static void main(String[] args) {

		Hashtable<Integer, String> items = new Hashtable<>();
		
		items.put(100, "A");
		items.put(200, "B");
		items.put(300, "C");
		items.put(400, "D");
		items.put(500, "E");
		
		String name = items.get(300);
		System.out.println(name);  //--> C

		Hashtable<String, Double> items2 = new Hashtable<>();

		items2.put("z", 1.1);
		items2.put("b", 2.2);
		items2.put("c", 3.3);
		items2.put("d", 4.4);
		items2.put("e", 5.5);
		
		System.out.println(items2.get("d")); //--> 4.4
		
		System.out.println(items2);  //--> {b=2.2, e=5.5, d=4.4, z=1.1, c=3.3}
		System.out.println(items2.keySet()); 
	}

}
