public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		
		if(age>120)
			throw new AgeToOldException(" , you enterd: "+age);
			
		else if(age<0)
			throw new AgeToYoungException(" , you enterd: "+age);
		
		this.age = age;
	}
}
