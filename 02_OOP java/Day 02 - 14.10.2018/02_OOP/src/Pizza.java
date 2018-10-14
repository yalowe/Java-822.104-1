
public class Pizza extends Food {
	  private boolean isExtraLarge;
	  private int numOfToppings;
	  
	  
	    public boolean getisExtraLarge() {
			return isExtraLarge;
		}
		public void setIsExtraLarge(boolean isExtraLarge) {
			this.isExtraLarge = isExtraLarge;
		}
		
		public int getNumOfToppings() {
			return numOfToppings;
		}
		public void setNumOfToppings(int numOfToppings) {
			this.numOfToppings = (numOfToppings>=0)?numOfToppings:0;
		}
		
		@Override 
		public String toString() {
			return super.toString()+"\nNumOfToppings: "+numOfToppings+"\nIsExtraLarge: "+isExtraLarge;
		}
		
}
