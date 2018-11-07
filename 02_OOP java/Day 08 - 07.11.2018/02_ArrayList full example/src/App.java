import java.util.ArrayList;

public class App {
	
	

	public static int getSummary(ArrayList<Integer> arrList) {
		int sum = 0;
		for (int value : arrList) {
			sum += value;
		}
		return sum;
	}
	
	//this function gets a list and prints all the list items
	public static void printArrayList(ArrayList<Integer> arrList) {
		for (int value : arrList) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	
	
	//this function return a random number in range 300-500
	public static int getRandomNumber(int min, int max) {
		return min + (int)(Math.random() * (max - min));
	}
	
	
	//this function adds 4 elements to the list (each element is a random number in range 300-500)
	public static void initArrayList(ArrayList<Integer> arrList) {
		for (int i = 0; i < 4; i++) {
			arrList.add(getRandomNumber(300, 500));
		}
	}
	
	public static void main(String[] args) {
		
		
		//ArrayList element type - can be only a complete ReferenceType
		//The Integer class wraps a value of the primitive type int in an object
		ArrayList<Integer> items = new ArrayList<>();

		// Fill all items: 
		initArrayList(items);
		
		// Print all items: 
		printArrayList(items);   					//--> 406 458 448 341 
		
		// Calc sum: 
		int sum = getSummary(items);
		System.out.println("Sum: " + sum);  		//--> Sum: 1653
		
		// Remove by index: 
		items.remove(3);
		items.remove(1);
		
		// Print all items: 
		printArrayList(items);   					//--> 406 448
				
		items.add(22);
		
		// Print all items: 
		printArrayList(items);   					//--> 406 448 22
				
		// Remove by element value: 
		items.remove(new Integer(22));
		
		// Print all items: 
		printArrayList(items);   					//--> 406 448
	}
}
