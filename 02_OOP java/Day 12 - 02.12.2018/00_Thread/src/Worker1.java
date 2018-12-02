
public class Worker1 {
	
	public void run() {
		
		System.out.println("-----------------------Starting worker 1 - even numbers------------------------");
		
		
		long res=0;
		for (int i = 1; i <= Math.pow(10, 9); i++) {	
			res+=(i%2==0)? i : 0;
		}
		
		
		System.out.println("End of worker 1 - even numbers sum is: "+res);
		
	}
}
