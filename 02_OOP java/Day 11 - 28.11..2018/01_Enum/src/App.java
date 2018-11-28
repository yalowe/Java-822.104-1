
public class App {

	public static void displayColorMessage_BadDesign1(int color) {
		switch(color) {
			case 1: System.out.println("Blue is the color of the sky.");
					break;
			case 2: System.out.println("Red is the color of wine.");
					break;
			case 3: System.out.println("Light_Green is the color of grass.");
					break;
		}
	}
	
	public static void displayColorMessage_BadDesign2(String color) {
		switch(color) {
			case "Blue": System.out.println("Blue is the color of the sky.");
					break;
			case "Red": System.out.println("Red is the color of wine.");
					break;
			case "Light_Green": System.out.println("Green is the color of grass.");
					break;
		}
	}

	public static void displayColorMessage_GoodDesign(Color color) {
		switch(color) {
			case BLUE: System.out.println("Blue is the color of the sky.");
					break;
			case RED: System.out.println("Red is the color of wine.");
					break;
			case LIGHT_GREEN: System.out.println("Green is the color of grass.");
					break;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		displayColorMessage_BadDesign1(3);
		
		displayColorMessage_BadDesign2("Light_Green");
		
		displayColorMessage_GoodDesign(Color.LIGHT_GREEN);
		
		
		
		Color myColor=Color.RED;
		System.out.println(myColor);
		
	}	
}













