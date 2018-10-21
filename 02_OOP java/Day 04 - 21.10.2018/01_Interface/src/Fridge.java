
public class Fridge extends HouseItem implements IWashDry, IActivate{

	@Override
	public boolean turnOn() {
		System.out.println("Fridge turnedOn successfully");
		return true;
	}

	
	@Override
	public void turnOff() {
		System.out.println("Fridge turnOff successfully");
		
	}

	@Override
	public void wash(int minutes) {
		System.out.println("Wash the Fridge with cold water for "+minutes+" minutes");	
		
	}

	@Override
	public void dry() {
		System.out.println("Please dry the Fridge now!!!");
		
	}


}
