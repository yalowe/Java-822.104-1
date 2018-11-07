
public class App {

	public static void main(String[] args) {
		
		Tester<Integer> t1 = new Tester<>();
		t1.prop = 100;
	    System.out.println(t1.getProrDescription());
		
		Tester<Integer> t2 = new Tester<>(200);
		System.out.println(t2.getProrDescription());
		
		Tester<String> t3 = new Tester<>();
		t3.prop = "Hello";
		System.out.println(t3.getProrDescription());
		
		Tester<String> t4 = new Tester<>("Bye");
		System.out.println(t4.getProrDescription());
		
		Tester<Double> t5 = new Tester<>(1.2);
		System.out.println(t5.getProrDescription());
		
	}

}
