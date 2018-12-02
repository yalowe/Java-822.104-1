
public class App {

	public static void main(String[] args)  {
		
		
		System.out.println("-----------------------Main start----------------------------");
		
		
		
		Thread t1=new Thread(new WriterHandler());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}
		
		
		Thread t2=new Thread(new Reader());
		t2.start();
		
		System.out.println("-----------------------Main end----------------------------");
	}

}
