
public class App {

	public static void main(String[] args) {
		
		
		//---------------int numbers----------------
		
		byte n1=120;
		System.out.println("Bit size: "+Byte.SIZE+" , Byte size: "+Byte.SIZE/8);  				//--> Bit size: 8 , Byte size: 1
		

	    int n2=970;
		System.out.println("Bit size: "+Integer.SIZE+" , Byte size: "+Integer.SIZE/8);  		//--> Bit size: 32 , Byte size: 4

	    

	    long n3=270;
		System.out.println("Bit size: "+Long.SIZE+" , Byte size: "+Long.SIZE/8);  				//--> Bit size: 64 , Byte size: 8

	    
	    
		//---------------decimal numbers----------------

		float n4=(float)9.5;
		//n4=9.5;  //--> Compilation error: type mismatch: cannot convert from double to float
		n4=9.5F;
		System.out.println("Bit size: "+Float.SIZE+" , Byte size: "+Float.SIZE/8);  				//--> Bit size: 32 , Byte size: 4
		
		
	    double n5=9.5;
		System.out.println("Bit size: "+Double.SIZE+" , Byte size: "+Double.SIZE/8);  				//--> Bit size: 64 , Byte size: 8
	 
	    
		
		//--------------Convert 1 type to another type------------------
	    n2=n1;
	    n3=n1;
	    n4=n1;
	    n5=n1;
	    
	    
	    n1=(byte) n2;
	    n2=(int)n3;
	    n2=(int) n4;
	   
	    
	    
	    //--------------Convert string to number------------------
	    String numStr="4";
	    
	    
	    n1=Byte.parseByte(numStr);
	    n2=Integer.parseInt(numStr);
	    n3=Long.parseLong(numStr);
	    n4=Float.parseFloat(numStr);
	    n5=Double.parseDouble(numStr);
		
	    
	    System.out.println("------n1-------"+n1);
	    System.out.println("------n2-------"+n2);
	    System.out.println("------n3-------"+n3);
	    System.out.println("------n4-------"+n4);
	    System.out.println("------n5-------"+n5);
	}

}
