
public class Sms<T> { 
	//---------------properties--------------------
	private String phone;
	private T message;
	
	
	//---------------constructor--------------------
	public Sms() {
	}
	
	public Sms(String phone, T message) {
		setPhone(phone);
		setMessage(message);
	}

	//---------------setter + getter--------------------
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public T getMessage() {
		return message;
	}
	
	public void setMessage(T message) {
		this.message = message;
	}
	
	
	//---------------methods--------------------
	public void send() {
		System.out.println("Sending '" + message + "' to phone: " + phone);
	}
	

}
