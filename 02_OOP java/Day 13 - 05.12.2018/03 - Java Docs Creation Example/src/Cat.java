/**
 * Simple Cat. 
 * @author Assaf
 */
public class Cat {

	/**
	 * Cat's name.
	 */
	private String name;
	
	/**
	 * Cat ctor.
	 * @param name Cat's name sent to the ctor.
	 */
	public Cat(String name) {
		setName(name);
	}
	
	/**
	 * Get the Cat's name.
	 * @return Cat's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set Cat's name.
	 * @param name Cat's name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Displays Cat's details.
	 */
	public void display() {
		System.out.println("Name: " + name);
	}
}
















