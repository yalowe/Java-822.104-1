import java.util.ArrayList;

public class Client {

	  

		//-----------------properties------------------------------------
		private double amount;
		private ArrayList<Product> productsCart;
		
		//-----------------setters + getters------------------------------
		public double getAmount() {
				return amount;
		}

		public void setAmount(double amount) {
				this.amount = amount;
		}

		public ArrayList<Product>  getProductsCart() {
				return productsCart;
		}

			
		
		//-----------------constructor--------------------------------
		public Client(double amount,int numOfProducts){
			setAmount(amount);
			productsCart=new ArrayList<Product>();
		}
		
		
		//-----------------methods--------------------------------
		public void addProduct(Product product){
			if(isInRange(product.getPrice())){
				productsCart.add(product);
			}
			
		}
		
		
		public int getTotalCartPrice(){
			int total=0;
			for(Product p:productsCart){
				total+=p.getPrice();
			}
			
			return total;
		}
		
		
		
		public boolean isInRange(){
			return getTotalCartPrice()<= amount;
		}
		
		public boolean isInRange(int newAmount){
			return getTotalCartPrice()<= amount-newAmount;
		}
		
		
		@Override
		public String toString(){
			String str= "Client amount:" +getAmount() + "\nAmount of products in cart: "+
							productsCart.size()+"\nTotal cost:" + getTotalCartPrice()+ "\nIsInRange:"+isInRange()+ "\n\n";
			
			for(Product p:productsCart){
				str+=p.getProductName() + " price: "+p.getPrice()+"\n";
			}
			
			
			return str;
		}
	
}
