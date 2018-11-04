
public class SimpleTime {
	//-----------------properties------------------------------------
	private int hour; 
	private int minute; 
	private int second; 
	
	//-----------------setters + getters------------------------------
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>=0 && hour<24){
			this.hour=hour;
		}
		else if(hour>=0){
			this.hour=hour%24;
		}
		else{
		   this.hour=0;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0 && minute<60){
			this.minute=minute;
		}
		else if(minute>=0){
			setHour(getHour() + (minute/60));
			this.minute=minute%60;
		}
		else{
			this.minute=0;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>=0 && second<60){
			this.second=second;
		}
		else if(second>=0){
			setMinute(getMinute() + (second/60));
			this.second=second%60;
		}
		else{
			this.second=0;
		}
	}
	
	//-----------------constructor--------------------------------
	public SimpleTime(){
		setTime(0,0,0);
	}
	
	public SimpleTime(int hour,int minute,int second){
		setTime(hour,minute,second);
	}

	//-----------------methods-------------------------------------
	public void setTime(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void add(SimpleTime simpleTime){
		int newHour=getHour() + simpleTime.getHour();
		int newMinute=getMinute() + simpleTime.getMinute();
		int newSecond=getSecond() + simpleTime.getSecond();
		setTime(newHour,newMinute,newSecond);
	}
	
	
	public void addHour(int hour){
		setHour(getHour() + hour);
	}
	
	public void addMinute(int minute){
		setMinute(getMinute() + minute);
		}
	
	public void addSecond(int second){
		setSecond(getSecond() +second);
	}

	public void tick(){
		setSecond(getSecond() +1);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof SimpleTime){
			return ((SimpleTime)obj).getHour()== getHour() &&					
					((SimpleTime)obj).getMinute()== getMinute() &&
					((SimpleTime)obj).getSecond()== getSecond();
		}
		return false;	
	}
	
	@Override
	public String toString(){
		return getHour()+":"+getMinute()+":"+getSecond();
	}
}
