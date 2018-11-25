public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfRangeException {
		
		if(age>120 || age<0)
			throw new AgeOutOfRangeException(" , you enterd: "+age);
		
		this.age = age;
	}
}
