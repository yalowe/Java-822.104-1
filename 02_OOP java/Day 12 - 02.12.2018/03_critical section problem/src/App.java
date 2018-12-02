
public class App {

	public static void main(String[] args) {
		
		
		System.out.println("-----------------------Main start----------------------------");
		
		Thread[] writerArr=new Thread[4];
		
		
		for(int i=0; i<4; i++){
			writerArr[i]=new Thread(new Tag(i));
			writerArr[i].start();
		}

		
		
		System.out.println("-----------------------Main end----------------------------");
	}

}
