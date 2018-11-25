
public class App {

	public static void main(String[] args) {
		
		Person p=new Person();

		try {
			p.setAge(130);
		}
		catch(AgeOutOfRangeException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		try {
			p.setAge(30);
			System.out.println("setAge success, age is: "+p.getAge());
		}
		catch(AgeOutOfRangeException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("End of Main.");

	}

}
