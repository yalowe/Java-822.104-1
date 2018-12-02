
public class Reader implements Runnable{


@Override
public void run() {
	synchronized(Students.nameList) {
		System.out.println("***********Start read***********");
		for(String s:Students.nameList){
			System.out.println(s);
		}
		System.out.println("***********End read***********");
		
	
	}
	}
	
 
}
