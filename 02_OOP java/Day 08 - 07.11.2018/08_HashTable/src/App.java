import java.util.Hashtable;

public class App {

	public static void main(String[] args) {
		
		Product p1 = new Product("x01", "Apple", 3.5);
		Product p2 = new Product("x02", "Banana", 4.7);
		Product p3 = new Product("x03", "Peach", 5.2);
		
		Hashtable<String, Product> items = new Hashtable<>();
		
		
		//put - Maps the specified key to the specified value in this hashtable
		items.put(p1.getCatalog(), p1);
		items.put(p2.getCatalog(), p2);
		items.put(p3.getCatalog(), p3);
		
		
		//get - Returns the value to which the specified key is mapped
		Product selectedProduct = items.get("x02");
		System.out.println(selectedProduct);  //--> Catalog:x02 ,Name:Banana ,Price:4.7
		
		
		//------------------How to print all the keys in the HashTable----------------------------
		System.out.print("--------------------All Keys:--------------------------\n");
		for (String key : items.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		
		//------------------ Way 1: How to print all the values in the HashTable----------------------------
		System.out.print("--------------------All Values: (way 1)--------------------\n");
		for (String key : items.keySet()) {
			Product p = items.get(key);
			System.out.println(p);
		}
		System.out.println();

		
		//------------------ Way 2: How to print all the values in the HashTable----------------------------
		System.out.print("--------------------All Values: (way 2)--------------------\n");
		for (Product value : items.values()) {
			System.out.println(value);
		}
		System.out.println();
		
	}

}
