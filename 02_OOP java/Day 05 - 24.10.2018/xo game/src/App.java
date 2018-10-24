import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Game game=new Game();
		User[] userArr={new User('X'),new User('O')};
		
		
		while(!game.gameOver){
			System.out.println(game.getMatrixFormat());
			   System.out.print("Player "+ userArr[game.firstPlayerTurn?0:1].gameChar+" Enter any number: ");
		       int location = scan.nextInt();
		       boolean isWinner=game.setElement(location, userArr[game.firstPlayerTurn?0:1].gameChar);
		       if(isWinner)
		       {
		    	   System.out.println(userArr[game.firstPlayerTurn?1:0].gameChar + " Won !!!!");
		    	   userArr[game.firstPlayerTurn?1:0].score++;
		    	   break;
		       }
		}
		 
	    System.out.println("Game over");
	    
	    
	    
	    scan.close();
	        
	        

	}

}


