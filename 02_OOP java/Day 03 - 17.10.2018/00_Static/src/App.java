
public class App {

	
	public static void main(String[] args) {
		System.out.println(Student.getStudentStatistics());
		
		
		Student s1=new Student(18,100);
		System.out.println("----------ADDED s1-------------");
		System.out.println(s1);
		
		System.out.println(Student.getStudentStatistics());
		
		Student s2=new Student(17,90);
		
		System.out.println("----------ADDED s2-------------");
		System.out.println(s2);
		
		System.out.println(Student.getStudentStatistics());
		
		
		Student s3=new Student(10,80);
		System.out.println("----------ADDED s3-------------");
		System.out.println(s3);
		
		System.out.println(Student.getStudentStatistics());
		
	}

}
