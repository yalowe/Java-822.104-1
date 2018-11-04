
public class Alarm {
	
	//-----------------properties------------------------------------
	 private SimpleTime time;
	 private boolean isSet;
	 private boolean isSnooze;
	 private int snoozeTime; 
 
	//-----------------setters + getters------------------------------
	 public SimpleTime getTime() {
			return time;
		}
		public void setTime(SimpleTime time) {
			this.time = time;
		}
		public boolean getIsSet() {
			return isSet;
		}
		public void setIsSet(boolean isSet) {
			this.isSet = isSet;
		}
		public boolean getIsSnooze() {
			return isSnooze;
		}
		public void setIsSnooze(boolean isSnooze) {
			this.isSnooze = isSnooze;
		}
		public int getSnoozeTime() {
			return snoozeTime;
		}
		public void setSnoozeTime(int snoozeTime) {
			this.snoozeTime = (snoozeTime<0)?0:snoozeTime;
		}
		
		//-----------------constructor--------------------------------
		public Alarm(){}
		
		public Alarm(SimpleTime time,boolean isSet,boolean isSnooze,int snoozeTime){
			setTime(time);
			setIsSet(isSet);
			setIsSnooze(isSnooze);
			setSnoozeTime(snoozeTime);
		}
}
