package jb;

public class ProductStock {
	public static Product[] products= {
			new Product(2.5,"Lighter"),
			new Product(5,"Mango"),
			new Product(10,"Pineapple"),
			new Product(7,"Water"),
			new Product(15,"Orange"),
			new Product(8,"Coke"),
			new Product(6,"Bread"),
			new Product(10,"Chips"),
			new Product(30,"Pizza"),
			new Product(10,"Sushi")
	};
	
	
	public static Product getItemByName(String name) {
		for(Product p: ProductStock.products) {
			if(p.getName().equals(name))
				return p;
		}
		
		return null;
	}
}
