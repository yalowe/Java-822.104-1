
public class App {

	public static void main(String[] args) {
		Food[] foodList={new Pizza(),new Chips()};
		for(Food food:foodList){
			Food.Addition addition=food.getAddition();
			
			if(addition instanceof Pizza.Addition){
				((Pizza.Addition)addition).setTopName("Olive");
			}
			else if(addition instanceof Chips.Addition){
				((Chips.Addition)addition).setExtraFried(false);
			}
			
			food.setAddition(addition);
			System.out.println(food.getAddition().getAdditionInfo()); 
		}
	}
}
