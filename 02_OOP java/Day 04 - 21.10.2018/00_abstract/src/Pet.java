
public abstract class Pet extends Animal {
	//---------------properties-----------------
	private String name;
	private double price;
	
	
	//---------------getters + setters----------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = (price>0)?price:0;
	}
	
	//---------------constructor----------------
	public Pet(){
		System.out.println("Pet constructor");
	}
	
	
	//---------------functions------------------
	@Override
	public String toString(){
		return  super.toString()+" ,name: "+getName() + " ,price: " + getPrice();
	}
	
	public abstract void cleanPet(int minutes);
	
}
