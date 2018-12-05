
public class SomeDerived2 extends SomeBase {

	@Override
	public void run() {
		
		synchronized(lockFlag) {
			
			System.out.println("Starting Critical Section 2");
			
            // Working on Critical Section 2, and supplying some data which other threads working on the same lock flag might need.
			// Thus we need to notify the waiting thread (if there is one) that it can return to the "Runnable" section.
            // lockFlag.notify() will extract only one thread waiting on that lock flag from the "Wait" section into the "Runnable" section.
            // lockFlag.notifyAll() will extract all threads waiting on that lock flag from the "Wait" section into the "Runnable" section.
            // The extracted thread (the one which was in the "Wait" and extracted back to the "Runnable") can't enter immediately back 
			// to Critical Section 1, because we have that lock flag now:
			try { 
				lockFlag.notify(); 
			} catch(Exception ex) { 
				
			}
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {}
			
			System.out.println("Ending Critical Section 2");		
		}
		
	}

}
