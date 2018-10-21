
public class Tv extends HouseItem implements IActivate{
	@Override
	public boolean turnOn() {
		System.out.println("Tv turnedOn successfully");
		return true;
	}

	@Override
	public void turnOff() {
		System.out.println("Tv turnOff successfully");
		
	}
}
