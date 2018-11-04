
public class AlarmClock {
	
	//-----------------properties------------------------------------
	private ExtendedTime currentTime; 
	private Alarm[] alarmTime= new Alarm[5];
	
	

	//-----------------setters + getters------------------------------
	public ExtendedTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(ExtendedTime currentTime) {
		this.currentTime = currentTime;
	}

	public Alarm[] getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Alarm[] alarmTime) {
		this.alarmTime = alarmTime;
	}

	
	//-----------------methods-------------------------------------
	public void setAlarm(int index, SimpleTime time,boolean isSet,boolean isSnooze,int snoozeTime){
		if(index>=0 && index<5)
			alarmTime[index]=new Alarm(time,isSet,isSnooze,snoozeTime);
	}
	
	public void setAlarm(int index,int hour,int minute,int second,boolean isSet,boolean isSnooze,int snoozeTime){
		SimpleTime simpleTime=new SimpleTime(hour,minute,second);
		setAlarm(index,simpleTime,isSet,isSnooze,snoozeTime);
	}
}
