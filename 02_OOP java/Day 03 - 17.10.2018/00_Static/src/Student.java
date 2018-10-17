
public class Student {

	//----------------PROPERTIES-----------------
	private int grade;
	private int age;
	private static  int sumOfGrades=0;
	private static  int sumOfAges=0;
	private static  int sumOfStudents=0;
	
	//----------------SETTER+GETTER-----------------
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		//remove the prev grade from the sum
		sumOfGrades-=this.grade;
		
		this.grade = (grade>=0 && grade<=100)?grade:0;
		
		//add the new grade to the sum
		sumOfGrades+=this.grade;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//remove the prev age from the sum
		sumOfAges-=this.age;
		
		this.age = (age>=0 && age<=120)?age:0;
		
		//add the new age to the sum
		sumOfAges+=this.age;
	}
	 
	
	
	//--------------------GETTERS----------------------
	public static int getSumOfGrades() {
		return sumOfGrades;
	}

	public static int getSumOfAges() {
		return sumOfAges;
	}

	public static int getSumOfStudents() {
		return sumOfStudents;
	}
	
	
	
	public static double getAvgOfAges() {
		return (sumOfStudents==0)?0:(double)sumOfAges/sumOfStudents;
	}

	public static double getAvgOfGrades() {
		return (sumOfStudents==0)?0:(double)sumOfGrades/sumOfStudents;
	}
	
	
	//----------------CONSTRUCTOR-----------------
	public Student(int age, int grade){
		
		sumOfStudents++;
		
		setAge(age);
		setGrade(grade);
		
	}
	
	
	//----------------FUNCTIONS-----------------
	public static String getStudentStatistics(){
		return  "\nSumOfStudents: "+Student.getSumOfStudents()+
				"\nSumOfAges: "+Student.getSumOfAges()+
				"\nSumOfGrades: "+Student.getSumOfGrades()+
				"\nAvgOfAges: "+Student.getAvgOfAges()+
				"\nAvgOfGrades: "+Student.getAvgOfGrades()+"\n";
	}
	
	@Override public String toString(){
		return "Age: "+age+" , Grade: "+grade;
	}
	
}
