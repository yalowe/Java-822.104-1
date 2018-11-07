
public class App {

	public static void main(String[] args) {
		
		Sms<String> sms1 = new Sms<>("0523698521", "Whats Up?");
		sms1.send();

		Sms<Integer> sms2 = new Sms<>("0523698521", 123);
		sms2.send();
		
	}
}
