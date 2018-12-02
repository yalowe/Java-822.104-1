
public class WriterHandler implements Runnable{

	@Override
	public void run() {
		Thread[] writerArr=new Thread[4];
		
		
		for(int i=0; i<2; i++){
			writerArr[i]=new Thread(new Writer("t"+i));
			writerArr[i].start();
			try {
				writerArr[i].join();
			} catch (InterruptedException e) {}
			
		}
		
	}
}
