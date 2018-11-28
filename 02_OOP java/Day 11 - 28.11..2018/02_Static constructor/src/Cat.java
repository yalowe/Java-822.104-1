
public class Cat {

	//regular constructor - is executed each time when we create a new instance
	public Cat() {
		System.out.println("I'm in a regular ctor...");
	}

	
	//static constructor - is executed only when the class is used in the first time
	static {
		System.out.println("I'm in a static ctor...");
	}
	
}
