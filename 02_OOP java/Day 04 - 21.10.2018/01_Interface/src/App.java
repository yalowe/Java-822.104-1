
public class App {

	public static void main(String[] args) {
		HouseItem[] houseItemArray=new HouseItem[3];
		
		houseItemArray[0]=new Tv();
		houseItemArray[1]=new Dish();
		houseItemArray[2]=new Fridge();
		

		for(HouseItem item:houseItemArray){
			System.out.println("--------------------item-----------------");
			
			
			IActivate myIActivate=null; 
			
			if(item instanceof IActivate){
				myIActivate=(IActivate)item;
				myIActivate.turnOff();
			}
			
			
			if(item instanceof IWash ){
				((IWash)item).wash(30);
				
				if(item instanceof IWashDry)
					((IWashDry)item).dry();
			}
			
			
			if(myIActivate!=null){
				myIActivate.turnOn();
			}
			
			
		}
		
	}

}
