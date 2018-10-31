
public class App {

	public static void main(String[] args) {
		
		Pizza pizza=new Pizza();
		Pizza.Addition pizzaAddition=pizza.getAddition();
		pizzaAddition.setTopName("Olive");
		pizza.setAddition(pizzaAddition);
		System.out.println(pizza.getAddition().getTopName());
		
		Chips chips=new Chips();
		Chips.Addition chipsAddition=chips.getAddition();
		chipsAddition.setExtraFried(false);
		chips.setAddition(chipsAddition);
		System.out.println(chips.getAddition().getExtraFried());
	
	}
}
