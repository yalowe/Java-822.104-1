
public class App {

	public static void main(String[] args) {
		int[][] grades={{99,85,100},{72,99,60}};

		for(int row=0; row<grades.length;row++){
			System.out.println("--------Grades for student: "+row+"----------");
			for(int col=0; col<grades[row].length;col++){
				System.out.println(grades[row][col]);
			}
		}
		
	}

}
