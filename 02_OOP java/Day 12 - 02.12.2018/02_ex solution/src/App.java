
public class App {

	public static void main(String[] args) {
		
		
		System.out.println("-----------------------Main start----------------------------");
		
		Thread[] arr=new Thread[4];
		
		
		for(int i=0; i<4; i++){
			arr[i]=new Thread(new Tag("tag"+i));
			arr[i].start();
		}

		System.out.println("-----------------------Main end----------------------------");
	}

}
