
public class App {


	public static String getName(int index){
		
		String[] names=new String[]{"Bob","Alice","Tom"};

		try{
			System.out.println("try in getName function---------------");
			return names[index];
		}
		catch(Exception ex){
			System.out.println("catch in getName function---------------");
			return ex.getClass().getName();
		}
		//finally - is allways executed after catch / try end (even if we had return statement)
		finally{
			System.out.println("END of getName function---------------");
		}
		
	
		
	}
	
	public static void main(String[] args) {
		
	
		System.out.println("**************************getName(1)**************************");
		System.out.println("\nGot from function:"+getName(1));
	
		
		
		System.out.println("**************************getName(5)**************************");
		System.out.println("\nGot from function:"+getName(5));
	
	
	}

}
