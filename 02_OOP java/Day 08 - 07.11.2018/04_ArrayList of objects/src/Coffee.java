
public class Coffee {
	public int numOfCoffeeSpoons;
	public int numOfSugarSpoons;
	
	
	public Coffee(int numOfCoffeeSpoons,int numOfSugarSpoons){
		this.numOfCoffeeSpoons=numOfCoffeeSpoons;
		this.numOfSugarSpoons=numOfSugarSpoons;
	}
	
	@Override
	public String toString(){
		return "< Coffee: "+numOfCoffeeSpoons + " ,Sugar: "+numOfSugarSpoons+" >";
	}
	
	@Override
	public boolean equals(Object obj){
		return ((Coffee)obj).numOfCoffeeSpoons == this.numOfCoffeeSpoons  &&
			   ((Coffee)obj).numOfSugarSpoons == this.numOfSugarSpoons;
	}

}
