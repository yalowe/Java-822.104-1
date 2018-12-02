
public class Tag implements Runnable{
 private String tagName;
 
 
 public Tag(String tagName){
	 this.tagName=tagName;
 }


@Override
public void run() {
	for(int i=1; i<5; i++){
		System.out.println(tagName + " : " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
	}
	
}
 
 
}
