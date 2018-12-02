public class App {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("*********************start of main*******************************");	
		
		Worker1 w1 = new Worker1();
		Worker2 w2 = new Worker2();
		
		w1.run();
		w2.run();
		
	
		System.out.println("*********************end of main*******************************");		
	}
}