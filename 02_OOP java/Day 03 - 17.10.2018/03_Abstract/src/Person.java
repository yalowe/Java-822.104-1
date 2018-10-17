
public abstract class Person {

	//----------------properties------------
	private int id;
	private String name;
	private boolean isMale;


	//----------------setters + getters------------
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
	
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	//----------------functions------------
	@Override public String toString(){
		return "name: "+name+", isMale: "+isMale;
	}
	
	public abstract void morningActions();

}
