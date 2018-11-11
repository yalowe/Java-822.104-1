
public class App {
	
	
	
	public static void tryParseInt(String str){
		
		try{  
			 System.out.println("start try to parse "+str+" to int");
			 
			 int n1=Integer.parseInt(str);
			 
			 System.out.println("end try to parse "+n1+" to int");
		}
		catch(Exception ex){
			System.out.println("inside catch");
		}
		
		System.out.println("After try-catch");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("----------------tryParseInt(\"5\")---------------------");
		tryParseInt("5");
		
		
		System.out.println("----------------tryParseInt(\"hello\")---------------------");
		tryParseInt("hello");
	   
	}
}
