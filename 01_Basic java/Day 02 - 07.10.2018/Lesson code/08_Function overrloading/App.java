
public class App {

	
	/*
	Rules of Overloading:
	_____________________________
	
	1) The functions must have the same name
	2) The functions must have :
			 - Or different number of parameters
			 - Or different types of parameters
	3) Different return types does not effect the function Overloading
	*/
	public static double add(int n1, int n2){
		System.out.println("V1");
		return n1+n2;
	}
	
	public static double add(double n1, double n2){
		System.out.println("V2");
		return n1+n2;
	}
		
	public static int add(){
		System.out.println("V3");
		return 4;
	}
	public static void main(String[] args) {

		
		double d1=add();
		System.out.println(d1);
		
		double d2=add(3,6);
		System.out.println(d2);
		
		double d3=add(3.1,6);
		System.out.println(d3);
	}

}
