
public class Food {

  private boolean isVeg;
  private int price;
  private Date exDate;
  
  
    public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = (price>10)?price:10;
	}
	public Date getExDate() {
		return exDate;
	}
	
	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}
	
	
	@Override 
	public String toString() {
		
		String date=(exDate==null)?"null":exDate.toString();
		return super.toString()+"\nExDate: "+date+"\nPrice: "+price + "\nIsVeg: "+isVeg;
	}
  
}
