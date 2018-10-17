
public class Teacher  extends Person{

	//----------------properties------------
	private String teachingSubject;
	private boolean isMaster;
	
	
	//----------------setters + getters------------

	public String getTeachingSubject() {
		return teachingSubject;
	}


	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}


	public boolean isMaster() {
		return isMaster;
	}


	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}
	//----------------functions------------
	@Override public String toString(){
		return super.toString()+ " , teachingSubject: "+teachingSubject+", isMaster: "+isMaster;
	}
	
	
	@Override
	public void morningActions() {
		System.out.println("Teacher morningActions");
		
	}

	
	public void startLesson() {
		System.out.println("Teacher startLesson");
		
	}


}
