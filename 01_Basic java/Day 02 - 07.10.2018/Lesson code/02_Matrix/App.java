
public class App {

	public static void main(String[] args) {
		/*
		int[][] grades={{99,85,100},{72,99,60}};

		for(int row=0; row<grades.length;row++){
			System.out.println("--------Grades for student: "+row+"----------");
			for(int col=0; col<grades[row].length;col++){
				System.out.println(grades[row][col]);
			}
		}*/
		
		
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
