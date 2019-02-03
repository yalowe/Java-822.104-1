package School;

public class Student {

	//---------------- properties ----------------
	private int id;
	private String name;
	private int age;
	private int grade;
	
	
	//---------------- constructor ----------------
	public Student(int id, String name, int age, int grade) {
		setId(id);
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	
	public Student() {}
	
	//---------------- getters + setters ----------	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	

}
