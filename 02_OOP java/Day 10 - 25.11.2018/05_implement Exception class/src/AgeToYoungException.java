
public class AgeToYoungException extends Exception {

	static String staticMessage="min is 0 ";
	
	
	public AgeToYoungException(String message){
		super(staticMessage+message);
	}
}