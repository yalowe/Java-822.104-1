
public class Product {

	//-----------------properties------------------------------------
	private int price;
	private String productName;
	
	//-----------------setters + getters------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//-----------------constructor--------------------------------
	public Product(int price,String productName){
		setPrice(price);
		setProductName(productName);
	}
	
}
