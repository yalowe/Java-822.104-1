/*
This interface imposes a total ordering on the objects of each class that implements it. 
This ordering is referred to as the class's natural ordering, 
and the class's compareTo method is referred to as its natural comparison method.
 */
public class Pizza implements Comparable<Pizza> {
	
	
	//---------------properties---------------------
	private int toppings;
	private int slices;
	private double price;
	
	
	
	//---------------constructor---------------------
	public Pizza(int toppings, int slices, double price) {
		setToppings(toppings);
		setSlices(slices);
		setPrice(price);
	}
	
	
	//---------------setter + getter---------------------
	public int getToppings() {
		return toppings;
	}
	public void setToppings(int toppings) {
		this.toppings = toppings;
	}
	public int getSlices() {
		return slices;
	}
	public void setSlices(int slices) {
		this.slices = slices;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//---------------methods---------------------	
	public void display() {
		System.out.println("Toppings: " + toppings);
		System.out.println("Slices: " + slices);
		System.out.println("Price: " + price);
		System.out.println("-----------------------");
	}

	
	//-----------------this function overrides the "Comparable" interface-----------------------------
	/*
	 Parameters: o - the object to be compared to the "this" instance
	 
	 Returns: 
	 		- a negative integer - as this object is less than
	 		- a positive integer - as this object is greater than
	 		- a zero - as this object is equal to
	 */
	@Override
	public int compareTo(Pizza o) {
		if(this.price > o.price) {
			return 1;
		}
		if(this.price < o.price) {
			return -1;
		}
		return 0;
	}
}
