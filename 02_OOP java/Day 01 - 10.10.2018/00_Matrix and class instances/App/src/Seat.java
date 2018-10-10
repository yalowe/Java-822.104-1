
public class Seat {
	
	private boolean isOrdered=false;
	private int price;
	
	public void setIsOrdered(boolean isOrdered){
		this.isOrdered = isOrdered;
	}
		
	public void setPrice(int price){
		this.price = (price > 0) ?price:60;
	}
	
	public boolean getIsOrdered(){
		return isOrdered;
	}
		
	public int getPrice(){
		return price;
	}
}
