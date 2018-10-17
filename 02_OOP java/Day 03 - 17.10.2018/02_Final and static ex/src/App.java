
public class App {

	public static void main(String[] args) {
		Invoice[] invoiceList=new Invoice[5];
		
		for(int i=0; i<invoiceList.length;i++){
			double price=(Math.random()*700)+100;
			invoiceList[i]=new Invoice(price);
		}
		
		
		for(Invoice invoice :invoiceList){
			System.out.println(invoice);
		}

	}

}
