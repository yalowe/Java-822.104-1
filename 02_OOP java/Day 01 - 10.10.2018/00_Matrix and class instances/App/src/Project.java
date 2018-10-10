import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		    Scanner console = new Scanner(System.in);
		
			Seat[][] matrixSeat=new Seat[2][];		
			
			matrixSeat[0]=new Seat[2];
			matrixSeat[1]=new Seat[3];					
			
			
			
			for(int row=0; row<matrixSeat.length; row++){
				for(int col=0; col<matrixSeat[row].length; col++){
					matrixSeat[row][col]=new Seat();
					
					//Math.random()*20+70 - will generate a number between 70 to 90
					matrixSeat[row][col].setPrice((int)(Math.random()*20+70));
				}
			}
			
	
			
			System.out.print("Please enter mumber of seats: ");
			int numOfSeats = console.nextInt();
			
			for(int counter=1; counter<=numOfSeats; counter++){
				System.out.print("-----------Seat number: "+counter);
				System.out.print("Please enter row for seat "+counter+":");
				int row = console.nextInt();
				System.out.print("Please enter col for seat "+counter+":");
				int col = console.nextInt();
				
				if(matrixSeat[row][col].getIsOrdered()){
					System.out.print("This seat is allready taken");
					counter--;
				}
				else{
					matrixSeat[row][col].setIsOrdered(true);
				}
			}
			
			console.close();
	
		}
}
