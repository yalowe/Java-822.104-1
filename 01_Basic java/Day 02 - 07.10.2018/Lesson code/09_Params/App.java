
public class App {

	
	public static int add1(int[] arr){
		int sum=0;
		for(int element:arr){
			sum+=element;
		}
		
		return sum;
	}
	
	public static int add2(int... x){
		int sum=0;
		for(int element:x){
			sum+=element;
		}
		
		return sum;
	}
	
	//The ... parameter must be the last parameter
	public static int add2(String msg, int... x){
		System.out.println(msg);
		
		// call `int App.add2(int... x)` function with the second param
		return add2(x);
	}
	
	public static void main(String[] args) {

		int[] sumArr=new int[8];
		//--------------call `int App.add1(int[] arr)`----------
		// sumArr[0]= add1(1,2,3);  //--> COMPILATION ERROR
		sumArr[1]= add1(new int[]{1,2,3});
		
		
		
		//--------------call `int App.add1(int... x)`----------		
	    sumArr[2]= add2(new int[]{1,2,3});
		
	    sumArr[3]= add2();
		
	    sumArr[4]= add2(1,2,3);
		
		
		//--------------call `int App.add1(String msg, int... x)`----------		
	    sumArr[5]= add2("My Msg",new int[]{1,2,3});
		
	    sumArr[6]= add2("My Msg");
		
	    sumArr[7]= add2("My Msg",1,2,3);
	    
	    for(int element:sumArr){
			System.out.println(element);
		}
	}

}
