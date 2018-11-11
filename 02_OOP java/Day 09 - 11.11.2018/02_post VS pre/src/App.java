
public class App {

	public static void main(String[] args) {
		
		
		int n1=0;
		int n2=0;
		
		
		//----------------------------pre---------------------------------

		n1=++n2;	
		
		
		System.out.println(n1);  //-->1
		System.out.println(n2);  //-->1
		
		//----------------------------post---------------------------------

		n1=n2++;
		
		System.out.println(n1);  //-->1
		System.out.println(n2);  //-->2
	}

}
