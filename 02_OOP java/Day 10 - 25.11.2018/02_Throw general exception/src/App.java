
public class App {

	
	//here the exception is the basic class Exception
	//so we need to define in the function declaration that the function may throw an error
	//the goal to do this - is to give to the code that calls this function directions to add try/catch
	public static void printName(String name) throws Exception{
		
		if(name.length()<3)
			throw new Exception("Name min length is 3 chars, you entered: "+name);
		
		
		System.out.println("my name is: "+name);
		
	}
	
	
	public static void main(String[] args) {
		
		
		String name1="Bo";
		
		try {
			printName(name1);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		

		String name2="Bob";
		
		try {
			printName(name2);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	
		System.out.println("End of Main.");
	}

}
