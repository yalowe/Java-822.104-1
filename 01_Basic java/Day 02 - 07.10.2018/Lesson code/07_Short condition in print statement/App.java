
public class App {

	public static double getRandNum(){
		int min=10;
		int max=15;
		return (Math.random() *(max - min)) + min;
	}
	
	public static void main(String[] args) {

		double num=getRandNum();
		System.out.println(num + ((num>=12)? " More": " Less") + " than dozen");
	}

}
