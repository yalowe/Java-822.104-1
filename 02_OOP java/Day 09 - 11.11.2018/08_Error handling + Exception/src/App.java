
public class App {
	
	
	
	public static String tryAccessArray(String[] arr,String indexStr){
		
		String str=null;
		
		try{  
			 System.out.println("start try");
			 
			 
			 //  !! string can be with different value than a number !!!
			 int index=Integer.parseInt(indexStr);
					
			 
			 //  !! index is out of array range !!!
			 str=arr[index];
			 
			 System.out.println("end try");
		}
		
		
		
		
		catch(Exception ex){
			System.out.println("inside catch: "+ex.getMessage());
		}
		
		
		System.out.println("After try-catch");
		return str;
	}
	
	
	public static void main(String[] args) {
		
		
		String[] array=new String[]{"A1","B2"};
		
		
		String res;
		
		System.out.println("----------------tryAccessArray(array,\"1\")---------------------");
		res=tryAccessArray(array,"1");
		System.out.println("## res :" + res);
		
		
		System.out.println("----------------tryAccessArray(array,\"3\")---------------------");
		res=tryAccessArray(array,"3");
		System.out.println("## res :" + res);
		
		
		System.out.println("----------------tryAccessArray(array,\"hello\")---------------------");
		res=tryAccessArray(array,"hello");
		System.out.println("## res :" + res);
	   
	}
}
