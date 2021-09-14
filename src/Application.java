/**
 * This is the main class for the Vacuum World Project
 * This just calls on the other classes and methods.
 * 
 * @author Divya Manirajan
 *
 */
public class Application {
	public static void main (String [] args) {
	
		//creates reflex Agent object named reflex
		reflexAgent reflex = new reflexAgent();
	
		//creates Board object named board
		Board board = new Board();
		
		//calls the fill method for the board object
		board.fill();
		
		//calls the print method for the board object
		board.print();
	
		//calls the get location method for the reflex agent object
		reflex.getLocation();
		
		//calls the get precept method for the reflex agent object
		reflex.getPrecept();
		
		//calls the get action method for the reflex agent object
		reflex.getAction();
	
		//calls the do action method for the reflex agent object
		reflex.doAction();

		//calls the move method for the reflex agent object
		reflex.move();
		
		//Prints out statement to signal completion of program 
		System.out.println("\nDONE :)");

	}
}
