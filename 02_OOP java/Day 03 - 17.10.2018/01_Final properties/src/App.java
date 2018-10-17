
public class App {

	public static void main(String[] args) {
	
		//readonly var in local function:
		final int  NUM_OF_DAYS_IN_WEEK;
		
		NUM_OF_DAYS_IN_WEEK=9;
		
		System.out.println(NUM_OF_DAYS_IN_WEEK);
	
		//Unresolved compilation problem: The final local variable NUM_OF_DAYS_IN_WEEK cannot be assigned. 
		//It must be blank and not using a compound assignment
		//NUM_OF_DAYS_IN_WEEK=9;
		
		
		final int MIN_AGE=18;
		
		//Unresolved compilation problem:The final local variable MIN_AGE cannot be assigned. 
		//It must be blank and not using a compound assignment
		//MIN_AGE=9;
		
		System.out.println(MIN_AGE);
		
		
		Person p1=new Person("Israel");
		System.out.println(p1.countryOfBirth);
		
		
		//The final field Person.countryOfBirth cannot be assigned
		//p1.countryOfBirth="Swiss";
	}

}
