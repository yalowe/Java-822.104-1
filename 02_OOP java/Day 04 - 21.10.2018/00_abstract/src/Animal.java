
public abstract class Animal {

	
	//---------------properties-----------------
	private String color;
	private int age;
	
	//---------------getters + setters----------
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (age>0&& age<100)?age:0;
	}
	
	
	//abstract setter & getter (will force the sub-classes to add a property named weight)
	public abstract double getWeight();
	public abstract void setWeight(double weight);
	
	
	//---------------constructor----------------
	public Animal(){
		System.out.println("Animal constructor");
	}
	
	
	//---------------functions------------------
	@Override
	public String toString(){
		return "age: "+getAge() + " ,color" + getColor() + ", weight:" + getWeight();
	}
	
	
	public abstract String makeSound();
}
