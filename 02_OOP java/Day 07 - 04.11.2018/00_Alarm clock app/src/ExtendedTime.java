
public class ExtendedTime extends SimpleTime{

	//-----------------properties------------------------------------
	private boolean is24Hours;
	
	
	//-----------------setters + getters------------------------------
	public boolean getIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}
	
	//-----------------constructor--------------------------------
	public ExtendedTime(){
		super();
		setIs24Hours(true);
	}
	
	
	public ExtendedTime(int hour,int minute,int second,boolean is24Hours){
		super(hour,minute,second);
		setIs24Hours(true);
	}
	
	//-----------------methods-------------------------------------
	@Override
	public String toString(){
		
		if((getIs24Hours()))
			return super.toString();
		
		
		//if 12 hour format:
		String dayPart=(getHour()/12 >= 0)? "pm":"am";
		int format12Hour=(getHour()%12 ==0 )? 12:getHour()%12 ;
		
		return format12Hour +":"+getMinute()+":"+getSecond()+dayPart;
	}
}
