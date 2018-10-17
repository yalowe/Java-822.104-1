
public class App {

	public static void main(String[] args) {
		Person[] personList=new Person[4];
		
		
		//Cannot instantiate the type Person (Person is abstract)
		//personList[0]=new Person();

		
		personList[0]=new Student();
		personList[1]=new Teacher();
		personList[2]=new Student();
		personList[3]=new Teacher();
		

		
		
		
		for(Person p : personList){
			
			System.out.println(p.toString());
			p.morningActions();
			
			if(p instanceof Student){
				((Student)p).studyForTest();
			}
			else if(p instanceof Teacher){
				((Teacher)p).startLesson();
			}
				
			System.out.println("-----------------------------------");
			
			
		}
	}

}
