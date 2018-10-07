
public class App {

	public static void main(String[] args) {
		
		char[][] matrix=new char[5][5];
		for(int row=0; row<matrix.length;row++){
			for(int col=0; col<matrix[row].length;col++){
				if(row==0 || col==0 || row==matrix.length-1 || col==matrix.length-1)
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
