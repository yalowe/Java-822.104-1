
public class App {

	public static void main(String[] args) {
	
		char[][] matrix=new char[5][];
		
		
		for(int row=0; row<matrix.length; row++){
			matrix[row]=new char[row+1];
			
			for(int col=0; col<matrix[row].length; col++){
				matrix[row][col]='*';	
			}
			
		}
		
		
		for(char[] arr: matrix){
			for(char element: arr){
				System.out.print(element + " ");
			}
			System.out.println();
		}
	
	}

}
