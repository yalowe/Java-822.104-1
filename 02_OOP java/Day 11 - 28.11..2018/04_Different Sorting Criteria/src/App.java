import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {

		ArrayList<Pizza> pizzas = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			Pizza p = new Pizza(rnd(0, 5), rnd(3, 8), rnd(10, 80));
			pizzas.add(p);
		}

		
		System.out.println("-------------------BEFORE SORT-----------------------");
		for (Pizza pizza : pizzas) {
			pizza.display();
		}
		System.out.println("------------------------------------------------------");

		
		
		Collections.sort(pizzas);

		
		System.out.println("-------------------AFTER SORT 1-----------------------");
		for (Pizza pizza : pizzas) {
			pizza.display();
		}
		System.out.println("------------------------------------------");

		Collections.sort(pizzas, new PizzaToppingsSorter());
		
		
		System.out.println("-------------------AFTER SORT 2-----------------------");
		for (Pizza pizza : pizzas) {
			pizza.display();
		}
		System.out.println();
	}

	public static int rnd(int min, int max) {
		return min + (int)(Math.random() * (max-min+1));
	}

}
