
public class App {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new SomeDerived(true));
		Thread t2 = new Thread(new SomeDerived(false));
		
		t1.start();
		
		Thread.sleep(3000);
		
		t2.start();
	}
}