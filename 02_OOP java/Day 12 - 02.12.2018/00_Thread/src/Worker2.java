
public class Worker2 {
	
	public void run() {
		
		System.out.println("-----------------------Starting worker 2 - odd numbers------------------------");
		
		
		long res=0;
		for (int i = 1; i <= Math.pow(10, 9); i++) {	
			res+=(i%2==1)? i : 0;
		}
		
		
		System.out.println("End of worker 2 - odd numbers sum is: "+res);
		
	}
}
