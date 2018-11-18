public class App {

	
	//for full details: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html 
	
	public static void main(String[] args) {
		
		String name = "Apple";
		double price = 3.4;
		
		
		//-----------------------first way to concat strings -------------------------
		String str = "Name = " + name + ", price = " + price;
		
		System.out.println(str);
		
		
		
		//-----------------------second way to concat strings -------------------------
		// %s - placeholder for string
		// %f - placeholder for numbers (decimal)
		// %d - for int (d = digits)
		String str2 = String.format("Name = %s, price = %f", name, price);
		
		System.out.println(str2);
		
		String str3 = String.format("Name = %s, price = %.2f", name, price);
		
		System.out.println(str3);
		
		
	    String str4 = String.format("Name = %s, price = %.0f", name, price);
		
		System.out.println(str4);
		
		
	}
}