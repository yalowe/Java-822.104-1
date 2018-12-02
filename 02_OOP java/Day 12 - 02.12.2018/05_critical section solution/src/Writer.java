
public class Writer implements Runnable{
 private String tagName;
 
 
 public Writer(String tagName){
	 this.tagName=tagName;
 }


@Override
public void run() {
		for(int i=0; i<5; i++){
			
		try {
		    Thread.sleep(1000);
			synchronized(Students.nameList) {
				Students.nameList.add(tagName);	
			} // Release the flag.
			
		} catch (InterruptedException e) {}
		}
		
		
		System.out.println("Thred number: "+ tagName + " | "+Students.nameList);
	}
	
 
}
