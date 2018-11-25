import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter a number: ");
			
			int num = console.nextInt();
			
			System.out.println(num * num);
			
			System.out.println("Done.");
			
		}
		catch(InputMismatchException ex) {
			System.out.println("Error! Please enter only numeric value!");
		}
		
		console.close();

		System.out.println("End of Main.");
	}

}
