
public class SomeDerived extends SomeBase {

	
	private boolean localFlag;
	
	
	public SomeDerived(boolean localFlag){
		this.localFlag=localFlag;
	}
	
	
	@Override
	public void run() {
	
		synchronized(lockFlag) {
			
			System.out.println("Starting Critical Section, value: "+localFlag);
			
			try {
				if(localFlag)
					lockFlag.wait(); 
				else
					lockFlag.notify(); 
			} catch(Exception ex) {}
			
			System.out.println("Ending Critical Section, value: "+localFlag);		
		}
		
	}

}
