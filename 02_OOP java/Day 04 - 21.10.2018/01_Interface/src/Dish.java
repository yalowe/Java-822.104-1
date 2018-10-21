
public class Dish extends HouseItem implements IWash {

	@Override
	public void wash(int minutes) {
		System.out.println("Wash the dish with hot water for "+minutes+" minutes");	
	}

}
