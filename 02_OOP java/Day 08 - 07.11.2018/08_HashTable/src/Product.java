
public class Product {

	private String catalog;
	private String name;
	private double price;
	
	public Product() {}

	public Product(String catalog, String name, double price) {
		setCatalog(catalog);
		setName(name);
		setPrice(price);
	}
	
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
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
	
	@Override
	public String toString() {
		return "Catalog:" + catalog+" ,Name:" + name+" ,Price:" + price;
	}
	
}
