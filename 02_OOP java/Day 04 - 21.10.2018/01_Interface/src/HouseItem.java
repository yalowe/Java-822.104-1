
public abstract class HouseItem {

	private int price;
	private boolean isElectric;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = (price>0)?price:0;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
}
