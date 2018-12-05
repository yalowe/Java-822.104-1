
public class SomeDerived1 extends SomeBase {

	@Override
	public void run() {
		
		synchronized(lockFlag) {
			
			System.out.println("Starting Critical Section 1");
			
            // Working on Critical Section 1, but getting to some point in which we need some data which only another
            // thread can supply, but this other thread is working also on a Critical Section related to the
            // same lock flag and thus won't be able to enter its Critical Section at all, to supply us the data.
			// lockFlag.wait() will immediately send the current thread from the "Runtime" section into the "Wait" section
			// and will release the lock flag so other threads could enter their Critical Section to supply the needed data:
			try { 
				lockFlag.wait(); 
			} catch(Exception ex) {
				
			}
			
			System.out.println("Ending Critical Section 1");		
		}
		
	}

}
