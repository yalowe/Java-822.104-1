
public class App {

	public static void main(String[] args) {
				
		char[][] matrix=new char[3][3];
		for(int row=0; row<matrix.length;row++){
			for(int col=0; col<matrix[row].length;col++){
				if(row==col)
					matrix[row][col]='*';
				else
					matrix[row][col]='0';
					
			}
		}
		
		for(int row=0; row<matrix.length;row++){
			for(int col=0; col<matrix[row].length;col++){
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}

	}

}
