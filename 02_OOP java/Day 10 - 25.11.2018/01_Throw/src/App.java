import java.util.InputMismatchException;

public class App {

	
	
	
	//here the exception is not the basic class Exception
	//it is the sub class - InputMismatchException
	public static void printAge(int age) throws InputMismatchException{
		
		if(age>120 || age<0)
			throw new InputMismatchException();
		
		
		System.out.println("my age is: "+age);
		
	}
	
	
	public static void main(String[] args) {
		
		
		int age1=130;
		
		try {
			printAge(age1);
		}
		catch(InputMismatchException ex) {
			System.out.println("Your age is not in range : "+age1);
		}
		
		
		

		int age2=20;
		
		try {
			printAge(age2);
		}
		catch(InputMismatchException ex) {
			System.out.println("Your age is not in range : "+age2);
		}
		
	
		System.out.println("End of Main.");
	}

}
