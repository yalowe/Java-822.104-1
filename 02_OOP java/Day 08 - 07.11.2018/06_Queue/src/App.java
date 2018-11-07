import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		
		// Queue = FIFO (First In First Out)
		Queue<Integer> items = new LinkedList<>(); // This is a queue.
		
		items.add(100);
		items.add(200);
		items.add(300);
		items.add(400);
		items.add(500);
		
		System.out.println(items); 
		
		
		int num = items.remove(); // Removes the first item.
		System.out.println(num);
		
		System.out.println(items); 
		
		
		num = items.remove(); // Removes the first item.
		System.out.println(num);
		
		System.out.println(items); 

	}

}
