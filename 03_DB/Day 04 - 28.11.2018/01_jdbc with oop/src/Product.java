
public class Product {
	
	
	//-------------------properties------------------
	private int id;
	private String name;
	private double price;
	
	
	//-------------------setter+getter------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		this.price = price;
	}
	
	
	//-------------------constructor------------------
	public Product(int id,String name,double price){
		setId(id);
		setName(name);
		setPrice(price);
	}
	
	
	public Product(String name,double price){
		//this - calls to a constructor in the current class
		this(0,name,price);
	}
	
	//-------------------methods------------------
	@Override
	public String toString(){
		return "id: " +  getId() + ", name: " + getName() + ", price: " + getPrice();
	}
	
}
