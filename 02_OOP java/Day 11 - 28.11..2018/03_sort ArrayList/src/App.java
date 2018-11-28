import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			numbers.add(rnd(1, 100));
		}
		
		
		
		System.out.println("-------------BEFORE SORT---------------");
		System.out.println(numbers);
		
		
		//Sorts the specified list into ascending order, according to the natural ordering of its elements
		Collections.sort(numbers);
		
		System.out.println("-------------AFTER SORT---------------");
		System.out.println(numbers);
    }

	
	public static int rnd(int min, int max) {
		return min + (int)(Math.random() * (max-min+1));
	}
}
