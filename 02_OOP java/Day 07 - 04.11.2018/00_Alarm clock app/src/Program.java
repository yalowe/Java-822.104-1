
public class Program {

	public static void main(String[] args) {
		AlarmClock myAlarmClock=new AlarmClock();

		
		myAlarmClock.setCurrentTime(new ExtendedTime(0,0,0,true));
		String str="00:00:06";
		String[] splitArr=str.split(":");
		
		SimpleTime mySimpleTime=new SimpleTime(Integer.parseInt(splitArr[0]),Integer.parseInt(splitArr[1]),Integer.parseInt(splitArr[2]));
		
		myAlarmClock.setAlarm(0,mySimpleTime, true, true, 3);
		myAlarmClock.setAlarm(1,0,0,01, true, true, 3);
		
		int counter=0;


		while(true){
			
			
			myAlarmClock.getCurrentTime().tick();
				
			
			if(myAlarmClock.getCurrentTime().equals(myAlarmClock.getAlarmTime()[0].getTime())){
				System.out.println("Alarm index 0 is set to: "+ myAlarmClock.getAlarmTime()[0].getTime() + " ,now the time is: "+myAlarmClock.getCurrentTime());
				counter++;
			}
			else if(myAlarmClock.getCurrentTime().equals(myAlarmClock.getAlarmTime()[1].getTime())){
				System.out.println("Alarm index 1 is set to: "+ myAlarmClock.getAlarmTime()[1].getTime() + " ,now the time is: "+myAlarmClock.getCurrentTime());
				counter++;
			}
			
			else{
				System.out.println(myAlarmClock.getCurrentTime());
			}
			
			
			if(counter==2)
				break;
			
			
		}
		
		
	}

}
