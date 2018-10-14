
public class App {

	
	public static int sumV1(int n1, int n2) {
		int n3=n1+n2;
		return n3;
	}


	public static int sumV2(int n1, int n2) {	
		return n1+n2;
	}
	
	
	public static boolean checkV1(int n1, int n2) {
		return (n1==n2)?true:false;

	}


	public static boolean checkV2(int n1, int n2) {
		return (n1==n2);

	}

	public static void main(String[] args) {
		System.out.println(sumV1(1,2));
		System.out.println(sumV2(1,2));
		
		System.out.println(checkV1(1,2));
		System.out.println(checkV2(1,2));

	}

}
