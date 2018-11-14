
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
	
		ArrayList<String> names = new ArrayList<>();
		
	
		//------------way to add new elements to the list-------------------
		names.add("aa");
		names.add("aa");
		names.add("cc");
		names.add("dd");
		//names.add(123); // Error - we can add only string as a new element
		names.add(123+"");  // 123+"" is "123"
		names.add(123+"");   
		
		
		//------------ access a sprcific elrment in the array by its index-------------------
		System.out.println("item in index 3: " + names.get(3));  //--> dd
		
		
		//------------ get the size of the list -------------------------
		System.out.println("Total Items: " + names.size());  //--> 6

		
		//------------ print all the elements in the list -------------------
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		
		//----------remove a specific element by its index -------------------
		names.remove(3); // Removes item with index number 3
		
		
		
		System.out.println("item in index 3: " + names.get(3));  //-->123

		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Total Items: " + names.size());  //--> 5
		
		
		//----------remove a specific element by its content -------------------
		// remove - returns true if this list contained the specified element
		//if we have a few elements with the same value - the first element will be removed
		names.remove("123");
		
		
		//remove all elements with "aa" content - with a while loop
		while(names.remove("aa"));
		
		
		System.out.print("All Items: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
	}
}
