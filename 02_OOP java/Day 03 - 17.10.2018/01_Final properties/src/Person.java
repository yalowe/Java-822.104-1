
public class Person {
  public final String countryOfBirth;
  public static final int MaxPersonLife=120;
  
  public Person(String country){
	  countryOfBirth=country;
	  
	  
	  //The final field Person.MaxPersonLife cannot be assigned - static
	  //MaxPersonLife=120;
  }
}
