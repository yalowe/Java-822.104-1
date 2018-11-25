
public class AgeToOldException  extends Exception {

	static String staticMessage="max is 120 ";
	
	
	public AgeToOldException(String message){
		super(staticMessage+message);
	}
}