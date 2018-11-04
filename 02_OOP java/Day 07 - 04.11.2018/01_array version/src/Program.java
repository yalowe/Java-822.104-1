
public class Program {

	public static void main(String[] args) {
		Client client=new Client(100,4);
		
		client.addProduct(new Product(20,"Pizza"));
		client.addProduct(new Product(30,"Chips"));
		client.addProduct(new Product(40,"Hummus"));
		client.addProduct(new Product(25,"Coffee"));
		
		
		
		System.out.println(client);

	}

}
