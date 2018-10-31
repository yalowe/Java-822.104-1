
public class AcademicInfo {

	//------------------final property----------------------
	//final property - can be asinged in the deceleration or in the constructor (only once)
	public final boolean isMath;
	private static int counter=0;
	
	public AcademicInfo(boolean isMath){
		this.isMath=isMath;
		counter++;
	}
	
	
	//------------------final method----------------------
	//Cannot override to a final method in the sub classes
	public final String getAcedemicState(){
		return (isMath)? "Math subject":"Non-Math subject";
	}
	
	public int getCounter(){
		return counter;
	}
		
}
