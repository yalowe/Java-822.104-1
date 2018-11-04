
public class Client {

	  

		//-----------------properties------------------------------------
		private double amount;
		private Product[] productsCart;
		private int productCounter=0;
		
		//-----------------setters + getters------------------------------
		public double getAmount() {
				return amount;
		}

		public void setAmount(double amount) {
				this.amount = amount;
		}

		public Product[] getProductsCart() {
				return productsCart;
		}

			
		
		//-----------------constructor--------------------------------
		public Client(double amount,int numOfProducts){
			setAmount(amount);
			productsCart=new Product[numOfProducts];
		}
		
		
		//-----------------methods--------------------------------
		public void addProduct(Product product){
			if(productCounter<productsCart.length){
				productsCart[productCounter]=product;
				productCounter++;
			}
			
		}
		
		
		public int getTotalCartPrice(){
			int total=0;
			for(Product p:productsCart){
				total+=p.getPrice();
			}
			
			return total;
		}
		
		
		
		public boolean IsInRange(){
			return getTotalCartPrice()<= amount;
		}
		
		
		@Override
		public String toString(){
			String str= "Client amount:" +getAmount() + "\nAmount of products in cart: "
						+productCounter+"\nTotal cost:" + getTotalCartPrice()+ "\nIsInRange:"+IsInRange()+ "\n\n";
			
			for(Product p:productsCart){
				str+=p.getProductName() + " price: "+p.getPrice()+"\n";
			}
			
			
			return str;
		}
	
}
