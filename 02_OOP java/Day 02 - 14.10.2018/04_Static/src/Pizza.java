
public class Pizza {
	    //Each instance contains a different int
	 	private int numOfToppings;
	  
	 	//Class level 
	 	public static int sumOfToppings=0;
	 	
	 	Pizza(int numOfToppings){
	 		this.numOfToppings=numOfToppings;
	 		Pizza.sumOfToppings+=numOfToppings; 		
	 	}
	 	
	 	

		@Override 
		public String toString() {
			return super.toString()+"\nNumOfToppings: "+numOfToppings;
		}
}
