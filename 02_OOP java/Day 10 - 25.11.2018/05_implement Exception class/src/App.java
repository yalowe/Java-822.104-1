
public class App {

	
	
	public static void printAge(int newAge){
		
		Person p=new Person();
		try {
			p.setAge(newAge);
			System.out.println("setAge success, age is: "+p.getAge());
		}
		catch(AgeToYoungException ex) {
			System.out.println("**************** AgeToYoungException ****************" + ex.getMessage());
		}
		catch(AgeToOldException ex) {
			System.out.println("**************** AgeToOldException ****************" + ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("**************** Exception ****************" + ex.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		
		printAge(-1);
		printAge(130);
		printAge(30);
		
		System.out.println("End of Main.");

	}

}
