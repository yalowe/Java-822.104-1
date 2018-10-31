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


