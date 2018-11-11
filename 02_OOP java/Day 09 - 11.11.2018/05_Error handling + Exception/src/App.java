
public class App {
	
	
	
	public static String tryAccessArray(String[] arr,int index){
		
		String str=null;
		
		try{  
			 System.out.println("start try");
			 
			 str=arr[index];
			 
			 System.out.println("end try");
		}
		
		
		/*
		The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonableapplication might want to catch. 	
		*/
		
		
		/*
		ArrayIndexOutOfBoundsException is a subclass of Exception
        Thrown to indicate that an array has been accessed with anillegal index. 
        The index is either negative or greater than orequal to the size of the array.
		*/
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("inside catch: "+ex.getMessage());
		}
		
		System.out.println("After try-catch");
		return str;
	}
	
	
	public static void main(String[] args) {
		
		
		String[] array=new String[]{"A1","B2"};
		
		
		String res;
		
		System.out.println("----------------tryAccessArray(array,1)---------------------");
		res=tryAccessArray(array,1);
		System.out.println("## res :" + res);
		
		System.out.println("----------------tryAccessArray(array,3)---------------------");
		res=tryAccessArray(array,3);
		System.out.println("## res :" + res);
	   
	}
}
