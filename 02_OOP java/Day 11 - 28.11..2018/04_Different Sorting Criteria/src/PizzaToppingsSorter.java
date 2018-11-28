import java.util.Comparator;

public class PizzaToppingsSorter implements Comparator<Pizza> {
	
	
	//-----------------this function overrides the "Comparator" interface-----------------------------
	/*
	 Parameters: 2 PARAMETERS OF THE TYPRE THAT WE DEFINED IN THE GENERIC INTERFACE
	 
	 Returns: 
	 		- a negative integer - as the first param object is less than the second param
	 		- a positive integer - as the first param is greater than the second param
	 		- a zero - as the first param is equal to the second param
	 */
	public int compare(Pizza p1, Pizza p2) {
		return p1.getToppings() - p2.getToppings();
	}
}
