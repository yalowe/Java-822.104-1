
public class App {

	public static void main(String[] args) {
		boolean b1=true, b2=false;
		
		//---------------------- AND (&&) ---------------------
		System.out.println(b1 && b1);  //--> true
		System.out.println(b1 && b2);  //--> false
		System.out.println(b2 && b1);  //--> false
		System.out.println(b2 && b2);  //--> false

		//---------------------- OR (||) ----------------------
		System.out.println(b1 || b1);  //--> true
		System.out.println(b1 || b2);  //--> true
		System.out.println(b2 || b1);  //--> true
		System.out.println(b2 || b2);  //--> false
		
		
		//---------------------- NOT (!) ----------------------
		System.out.println(!b1);  //--> false
		System.out.println(!b2);  //--> true
		
		
		
		// DONT WRITE THIS WAY!!!!!!!! 
		if(b1==true){}  				//--> true
		

		// WRITE THIS WAY!!!!!!!! 
		if(b1){}  						//--> true
				
		
		// DONT WRITE THIS WAY!!!!!!!! 
		if(b1==false){}  				//--> false
				

		// WRITE THIS WAY!!!!!!!! 
		if(!b1){}   					//--> false
		
		
		// DONT WRITE THIS WAY!!!!!!!! 
		if(b2==false){}  				//--> true
				

		// WRITE THIS WAY!!!!!!!! 
		if(!b2){}  						//--> true
		
		// DONT WRITE THIS WAY!!!!!!!! 
		if(b2==true){}  				//--> false
				

		// WRITE THIS WAY!!!!!!!! 
		if(b2){}  						//--> false

	
	}

}
