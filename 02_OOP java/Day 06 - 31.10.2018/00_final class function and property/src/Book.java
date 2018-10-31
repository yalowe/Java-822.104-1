
public class Book extends AcademicInfo {

	private static int bookCounter=0;
	
	public Book(boolean isMath) {
		super(isMath);
		bookCounter++;
	}


	@Override
	public int getCounter(){
		return bookCounter;
	}
}
