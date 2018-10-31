# XO game - console app in java (oop)

## User class
```java

public class User {
	public final char gameChar;
	public int score;
	
	
	public User(char gameChar){
		this.gameChar=gameChar;
	}

}

```
notes: 
* `public final char gameChar;` - this property is final because we want to change it only once (in the constructor)
* `public int score;` - this property will count all the user winnings

## Game class
```java

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

```
Properties:
* `char[][] matrix=new char[3][3];` - a matrix that reprepsents the game board, every element in this matrix will contain 0 as a default value;
* `boolean firstPlayerTurn=true;` - this property will contain the boolean value that decideds if the current turn is the 'first player' turn  or the 'second player' turn 
* `boolean gameOver=false;` - this property will contain a boolean value that shows if the game is over or not 
Methods:
* `getMatrixFormat` -this function returns a string (to print in the console), that contains the state of the current board
    ```java
        public String getMatrixFormat(){
            String res="";
            
            for(int row=0; row<matrix.length; row++){
                for(int col=0; col<matrix[row].length; col++){  
                    //add to the current row a column
                    /*
                    the column content is in this format:
                        1)  (matrix[row][col]==0) --> if the element contains the default value:
                            init the content with the element index ((row*3+col+1)+ "|")
                        2)  !(matrix[row][col]==0) --> if the element does not contain the default value:
                            init the content with the element value (matrix[row][col]+ "|")
                    */
                    res+=(matrix[row][col]==0) ? (row*3+col+1)+ "|" : matrix[row][col]+ "|";
                }

                //insert between one row to another
                res+="\n------ \n";
                
            }
            return res;
            
        }
    ```
* `setElement` - this function is called each time when the user chose a element in the board.   
    the function gets as parameters the location thet the user selected, and the char that the current user owns (can be 'X' or 'O')   
    The function will return false in the follwing cases:
    * If the location is out of range
    * If the element in the location is allready taken
    * If the user did not win
    The function will return true in the follwing cases:
    * If the user won
```java
	public boolean setElement(int location, char playerChar){
        //chack if the location is valid (in the range 1-9)
		if(location>=1 && location<=9){

            //get the row and the col in the matrix - from the location
			int row=(location-1)/3;
			int col=(location-1)%3;


            //check if the element in the location is allready taken
			if(matrix[row][col]=='X' || matrix[row][col]=='O')
				return false;
			
            //if we reached this line of code - the location is ok, 
            //so we assign into it the user's char
			matrix[row][col]=playerChar;
			

            //only if the user finished his current turn - we will change it to the other player turn
			firstPlayerTurn=!firstPlayerTurn;


			return checkGameStatus();
		}
		return false;
	}
```

* `checkGameStatus` - this function returns true only if a user won, and chamges the `gameOver` (property of the `Game` class) to true if all the elements are chosen.
```java
	private boolean checkGameStatus(){
		
		boolean anyElementEmpty=false;
		
		for(char[] arr:matrix){
			for(char element:arr){
				if(element==0){
                    //if this element contains 0 - so we have an empty element in the matrix
					anyElementEmpty=true;
				}
			}
		}

        //if we dont have any empty elemnt - the game is over
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
```



## App class
```java
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Game game=new Game();
		User user1=new User('X');
        User user2=new User('O');
		
		
		while(!game.gameOver){
			System.out.println(game.getMatrixFormat());


			   System.out.print("Player "+ (game.firstPlayerTurn? user1.gameChar: user2.gameChar) +" Enter any number: ");

		       int location = scan.nextInt();

		       boolean isWinner=game.setElement(location, game.firstPlayerTurn? user1.gameChar: user2.gameChar );
		       if(isWinner)
		       {
		    	   System.out.println((game.firstPlayerTurn? user2.gameChar: user1.gameChar)  + " Won !!!!");

                   if(game.firstPlayerTurn)
		    	        user2.score++;
                   else
		    	        user1.score++;

                   //go out from the loop    
		    	   break;
		       }
		}
		 
	    System.out.println("Game over");
  
	    scan.close();
	        
	        
	}

}

```