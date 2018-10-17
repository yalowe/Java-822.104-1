
public class Invoice {
	//-------------- static (class level) ------------
	private static int globalSerialId=0;
	
	
	//-------------- non-static (object level) -------
	private final int serialId;
	private final double price;
	
	
	//-------------- constructor ---------------------
	public Invoice(double price){
		
		
		//Insert into the object level property a value that is unique
		serialId=globalSerialId;
		
		this.price=price;
		
		//increment the global serial number 
		globalSerialId++;		
	}
	
	//-------------- functions ---------------------
		@Override public String toString(){
			return "serialId: " + serialId +" , price: "+price;
		}

}
