public class App {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("*********************start of main*******************************");	
		
		Worker1 w1 = new Worker1();
		Worker2 w2 = new Worker2();
		
	
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);

		
		t1.start(); // runs the "run" function in a new thread
		t2.start(); // runs the "run" function in a new thread
		
		Thread.sleep(1000);
	
		System.out.println("*********************end of main*******************************");	
	
			
	}
}