package Animal;


public class Cat {
	
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
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
	
	

	public String getDescription() {
		return "name|"+getName()+" ,age|"+getAge()+"";
	}
}
