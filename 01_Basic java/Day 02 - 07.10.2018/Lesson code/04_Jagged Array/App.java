
public class App {

	public static void main(String[] args) {
	
		String[][] kidsMatrix=new String[3][];
		
		
		kidsMatrix[0]=new String[1];
		kidsMatrix[0][0]="Noam";
		
		
		kidsMatrix[1]=new String[]{"Ishay","Noam","Bob","Alice","Tom"};
		
		kidsMatrix[2]=new String[]{"Emely","Aia"};
		
		
		for(String[] row:kidsMatrix){
			for(String child:row){
				System.out.print(child +" ");
			}
			System.out.println("\n----------------------");
		}
	}

}
