
public class Student extends Person{

	
	//----------------properties------------
	private String schoolName;
	private double gradesAvg;
	
	
	//----------------setters + getters------------
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public double getGradesAvg() {
		return gradesAvg;
	}


	public void setGradesAvg(double gradesAvg) {
		this.gradesAvg = (gradesAvg >=0 && gradesAvg<=100)?gradesAvg:0;
	}

	//----------------functions------------
	@Override public String toString(){
		return super.toString()+ " , schoolName: "+schoolName+", gradesAvg: "+gradesAvg;
	}
	
	
	@Override
	public void morningActions() {
		System.out.println("Student morningActions");
		
	}

	
	public void studyForTest() {
		System.out.println("Student studyForTest");
		
	}

}
