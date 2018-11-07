import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Coffee> coffeeList=new ArrayList<Coffee>();
		
		
		//Appends the specified element to the end of this list.
		coffeeList.add(new Coffee(0,0));
		
		System.out.println(coffeeList);  						//--> [< Coffee: 0 ,Sugar: 0 >]
		
		
		ArrayList<Coffee> tempList=new ArrayList<Coffee>();
		tempList.add(new Coffee(1,1));
		tempList.add(new Coffee(2,2));
		
		coffeeList.addAll(0,tempList);
		
		System.out.println(coffeeList);  						//--> [< Coffee: 1 ,Sugar: 1 >, < Coffee: 2 ,Sugar: 2 >, < Coffee: 0 ,Sugar: 0 >] 
		

		coffeeList.remove(new Coffee(0,0));
		System.out.println(coffeeList);  						//--> [< Coffee: 1 ,Sugar: 1 >, < Coffee: 2 ,Sugar: 2 >, < Coffee: 0 ,Sugar: 0 >]
		
		
		Coffee myCoffee=new Coffee(4,4);
		coffeeList.add(myCoffee);
		
		System.out.println(coffeeList);  						//--> [< Coffee: 1 ,Sugar: 1 >, < Coffee: 2 ,Sugar: 2 >, < Coffee: 0 ,Sugar: 0 >, < Coffee: 4 ,Sugar: 4 >]
		
		coffeeList.remove(myCoffee);

		System.out.println(coffeeList);  						//--> [< Coffee: 1 ,Sugar: 1 >, < Coffee: 2 ,Sugar: 2 >, < Coffee: 0 ,Sugar: 0 >]
		
	}

}
