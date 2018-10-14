
public class App {

	public static void main(String[] args) {
		
		
		//here we declared a pointer that can point to any instance of `Date` class or subclasses
		//At this point - myDate contains null
		Date myDate;
		
		
		//here we declared a pointer that can point to any instance of `Food` class or subclasses
		//At this point - myFood contains null
		Food myFood;
		
		
		//here we declared a pointer that can point to any instance of `Pizza` class or subclasses
		//At this point - myPizza contains null
		Pizza myPizza;
		
		//new Date() calls the constructor and creates a new instance of the `Date` class in the memory
		//The constructor return the address of the instance, and we save it into `myDate`
		myDate=new Date();
		System.out.println("----------------myDate (before set)----------------");
		System.out.println(myDate.toString());
		
		
		myDate.setMonth(10);
		myDate.setYear(2021);
		
		System.out.println("----------------myDate (after set)----------------");
		System.out.println(myDate.toString());
		
		
		//new Food() calls the constructor and creates a new instance of the `Food` class in the memory
		//The constructor return the address of the instance, and we save it into `myFood`				
		myFood=new Food();
		
		
		System.out.println("----------------myFood (before set)----------------");
		System.out.println(myFood.toString());
		
		myFood.setPrice(100);
		myFood.setVeg(true);
		myFood.setExDate(new Date());
		
		
		System.out.println("----------------myFood (after set 1)----------------");
		System.out.println(myFood.toString());
		
		
		Date tempDate=myFood.getExDate();
		tempDate.setMonth(12);
		tempDate.setYear(2020);
		
		System.out.println("----------------myFood (after set 2)----------------");
		System.out.println(myFood.toString());
		
		
		//new Pizza() calls the constructor and creates a new instance of the `Pizza` class in the memory
		//The constructor return the address of the instance, and we save it into `myFood`				
		myFood=new Pizza();
		
		System.out.println("----------------myFood (Pizza - before set)----------------");
		System.out.println(myFood.toString());
		
		myFood.setVeg(true);
		
		if(myFood instanceof Pizza){
			((Pizza)myFood).setIsExtraLarge(true);
		}
		
		System.out.println("----------------myFood (Pizza - after set)----------------");
		System.out.println(myFood.toString());
		
	
	}

}
