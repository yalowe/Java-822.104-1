
public class Dog extends Pet{


	//---------------properties-----------------
	private double weight;
	private boolean isExtraBarking;
	

	//---------------getters + setters----------
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight=(weight>0.2 && weight<90)?weight:0.2;
		
	}	
	
	
	public boolean getIsExtraBarking() {
		return isExtraBarking;
	}

	public void setIsExtraBarking(boolean isExtraBarking) {
		this.isExtraBarking = isExtraBarking;
	}
	
	
	//---------------constructor----------------
	public Dog(){
		System.out.println("Dog constructor");
	}	
		
		
	//---------------functions------------------
	@Override
	public String toString(){
		return  super.toString()+" ,isExtraBarking: "+getIsExtraBarking();
	}

	@Override
	public String makeSound() {
		return "Wufff Wufff";
	}
	
	@Override
	public void cleanPet(int minutes) {
		System.out.println("Dog is taking a shower for "+minutes +" minutes");
	}
}
