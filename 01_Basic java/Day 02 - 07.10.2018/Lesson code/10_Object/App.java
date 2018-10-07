
public class App {

	
	public static void PrintNum(int num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {

		int num1=9;
		double num2=8.9;
		Object num3=7;
	
		
		PrintNum(num1);
		PrintNum((int)num2);
		PrintNum((int)num3);
		
		
		Object obj=true;
		obj="Hello";
		obj='a';
		obj=1.2;
		obj=1;
		
		//Type mismatch: cannot convert from Object to int
		//obj++;  //--> COMPILATION ERROR
		
		obj=(int)obj + 1;
	}

}
