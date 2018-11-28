public class Earth {
	
	// STEP 1 : Declare a private constructor
		private Earth() {
			diameter = 12742000;
			population = 8000000000L;
			area = 510100000L;
		}
		
	
	// STEP 2 : Declare a private static instance of the current class
	//(because we create the instance inside the class -we can call the private constructor)
	private static Earth instance = new Earth();
	
	
	
	// STEP 3 : Declare a public static function that returns the single instance of this class
	public static Earth getInstance() {
		return instance;
	}
	
	
	
	private long diameter;
	private long population;
	private long area;
	

	public long getDiameter() {
		return diameter;
	}

	public long getPopulation() {
		return population;
	}

	public long getArea() {
		return area;
	}
	
	public void display() {
		System.out.println("Diameter: " + diameter);
		System.out.println("Population: " + population);
		System.out.println("Area: " + area);
	}
}
