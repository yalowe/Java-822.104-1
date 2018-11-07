import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		// Stack = LIFO (Last In First Out)
		Stack<Integer> items = new Stack<>(); 
		
		
		// push - Pushes an item onto the top of this stack. 
		items.push(100);
		items.push(200);
		items.push(300);
		items.push(400);
		items.push(500);
		
		System.out.println(items);
		
		int num = items.pop(); // Removes the object at the top of this stack - Removes the last item entered.
		System.out.println(num);  //--> 500

		System.out.println(items);
		
		num = items.pop(); // Removes the last item entered.
		System.out.println(num);  //--> 400
		
		System.out.println(items);

	}

}
