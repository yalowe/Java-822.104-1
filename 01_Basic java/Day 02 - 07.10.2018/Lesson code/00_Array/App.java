
public class App {

	public static void main(String[] args) {
		
		int[] arr1=new int[3];
		arr1[0]=0;
		arr1[1]=1;
		arr1[2]=2;
		
		
		int[] arr2={0,1,2};
		
		System.out.println("---------arr1 in for----------");
		for(int i=0; i<arr1.length;System.out.println(arr1[i++]));
	
		System.out.println("---------arr2 in for----------");
		for(int singleElement:arr2){
			System.out.println(singleElement);
		}
	}

}
