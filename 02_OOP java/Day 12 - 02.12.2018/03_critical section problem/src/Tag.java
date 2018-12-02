
public class Tag implements Runnable{
 private int tagName;
 
 
 public Tag(int tagName){
	 this.tagName=tagName;
 }


@Override
public void run() {
		for(int i=0; i<5; i++){
			
		try {
			Thread.sleep(1000);
			Students.ageList.add(tagName);	

		} catch (InterruptedException e) {}
		}
		
		
		System.out.println("Thred number: "+ tagName + " | "+Students.ageList);
	}
	
 
}
