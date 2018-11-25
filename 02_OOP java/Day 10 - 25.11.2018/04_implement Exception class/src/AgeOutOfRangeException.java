
public class AgeOutOfRangeException extends Exception {

	static String staticMessage="range is 0-120 ";
	
	
	public AgeOutOfRangeException(String message){
		super(staticMessage+message);
	}
}
