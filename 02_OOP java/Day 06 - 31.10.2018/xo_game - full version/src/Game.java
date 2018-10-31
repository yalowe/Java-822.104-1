
public class Game {
	char[][] matrix=new char[3][3];
	boolean firstPlayerTurn=true;
	boolean gameOver=false;
	
	//will return true if the user sent a number of a valid element
	public boolean setElement(int location, char playerChar){
		if(location>=1 && location<=9){
			int row=(location-1)/3;
			int col=(location-1)%3;
			if(matrix[row][col]=='X' || matrix[row][col]=='O')
				return false;
			
			matrix[row][col]=playerChar;
			
			firstPlayerTurn=!firstPlayerTurn;
			return checkGameStatus();
		}
		return false;
	}
	
	public String getMatrixFormat(){
		String res="";
		
		for(int row=0; row<matrix.length; row++){
			for(int col=0; col<matrix[row].length; col++){
			
				res+=(matrix[row][col]==0) ? (row*3+col+1)+ "|" : matrix[row][col]+ "|";
			}
			res+="\n------ \n";
			
		}
		return res;
		
	}
	private boolean checkGameStatus(){
		
		boolean anyElementEmpty=false;
		
		for(char[] arr:matrix){
			for(char element:arr){
				if(element==0){
					anyElementEmpty=true;
				}
			}
		}
		gameOver=!anyElementEmpty;
		
		for(int outer=0; outer<matrix.length; outer++){
			//if row is chosen by a specific player
		 if((matrix[outer][0])==(matrix[outer][1]) && (matrix[outer][0])==(matrix[outer][2])  && matrix[outer][0]!=0){
			 return true;
		 }		 
			//if col is chosen by a specific player
		 if((matrix[0][outer])==(matrix[1][outer]) && (matrix[0][outer])==(matrix[2][outer])  && matrix[0][outer]!=0){
			 return true;
		 }
		}
		
		
		 if((matrix[0][0])==(matrix[1][1]) && (matrix[0][0])==(matrix[2][2])  && matrix[0][0]!=0){
			 return true;
		 }
		 
		 
		 if((matrix[0][2])==(matrix[1][1]) && (matrix[0][2])==(matrix[2][0])  && matrix[0][2]!=0){
			 return true;
		 }
		 
		 
		 return false;
	}
}
