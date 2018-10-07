
public class App {

	public static void main(String[] args) {
	
		String str1, str2;
		int num=8;
		
		
		if(num%2==0)
			str1="Even";
		else
			str1="Odd";

		System.out.println("Regular conditation: "+str1 );
		
		

		
		str2=(num%2==0) ? "Even" : "Odd";
		
		System.out.println("Short conditation: "+str2 );
		
		
	}

}
