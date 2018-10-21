
public class Cat extends Pet{
	//---------------properties-----------------
		private double weight;
		private int numOfHuntedSnakes;
		

		//---------------getters + setters----------
		@Override
		public double getWeight() {
			return weight;
		}

		@Override
		public void setWeight(double weight) {
			this.weight=(weight>0.2 && weight<30)?weight:0.2;
			
		}	
		
		
		public int getNumOfHuntedSnakes() {
			return numOfHuntedSnakes;
		}

		public void setNumOfHuntedSnakes(int numOfHuntedSnakes) {
			this.numOfHuntedSnakes = (numOfHuntedSnakes>0)?numOfHuntedSnakes:0;
		}
		
		
		//---------------constructor----------------
		public Cat(){
			System.out.println("Cat constructor");
		}	
			
			
		//---------------functions------------------
		@Override
		public String toString(){
			return  super.toString()+" ,numOfHuntedSnakes: "+getNumOfHuntedSnakes();
		}

		@Override
		public String makeSound() {
			return "Miawwww Miawwww";
		}
		
		@Override
		public void cleanPet(int minutes) {
			System.out.println("Cat is taking a bath for "+minutes +" minutes");
		}
}
