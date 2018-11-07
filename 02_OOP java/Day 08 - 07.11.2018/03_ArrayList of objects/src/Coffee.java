
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

}
