
public class App {

	public static void main(String[] args) {
		Earth myEarth;
		
		//myEarth=new Earth();  //COMPILATION ERROR -> The constructor Earth() is not visible
		
		myEarth=Earth.getInstance();
		
		myEarth.display();

	}

}
