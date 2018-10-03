public class Proj {

	public void FuncVal(int n1) {
		n1=7;
	}
	
	public void FuncRef(int[] arr) {
		arr[0]=9;
	}
	
	public void Main() {
		int[] arr1={1,2,3,4};  //--> ref type
		int num1=6;  //--> val type
		
		//num1 is 6
		FuncVal(num1);
		//num1 is 6
		
		//arr1 is [1,2,3,4]
		FuncRef(arr1);
		//arr1 is [9,2,3,4]
		
		
		int[] arr2={9,2,3,4};  
		int num2=6;  
		
		
		int[] arr3=arr1;  
		int num3=num1; 
		
		boolean compareVal1=num1==num2;  //true
		boolean compareRef1=arr1==arr2;  //false
		
		boolean compareVal2=num1==num3;  //true
		boolean compareRef2=arr1==arr3;  //true
		
	}

}
