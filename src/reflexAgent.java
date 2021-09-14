import java.util.Random;
/**
 * This is the reflex agent class which is used to set up and move the vacuum.
 * It also manages the precepts and actions at a specific location.
 * 
 * 
 * @author Divya Manirajan
 *
 */
public class reflexAgent {
		
	//creates a random object named rand to generate random values 0 or 1
	static Random rand = new Random();
	
	//creates integer for the horizontal location of the reflex agent and sets it
		//to a random integer from between 0 and 4
	static int locationX = rand.nextInt((4));
  
	//creates integer for the horizontal location of the reflex agent and sets it
		//to a random integer from between 0 and 4
	static int locationY = rand.nextInt((4)); 
	   		
	/**
	 * Prints a statement that shows the vacuum location with x and y coordinates when called
	 */
	public void getLocation() {
		System.out.println("Vacuum Location: "+locationX+","+locationY);
	}
	
	/**
	 * Checks to see if a given move is legal. The move can be right, left, up, or down.
	 * If the move will be out of the array bounds then it does not pass the check.
	 * @param move The move that is being checked
	 * @return true if the move is legal or false if the move is not legal
	 */
	public boolean legalMove(String move) { 
		
		if(locationX == 3 && move == "right") {
			return false;
		}
		else if (locationX == 0 && move=="left") {
			return false;
		}
		else if (locationY == 0 && move == "up") {
			return false;
		}
		else if(locationY == 3 && move == "down") {
			return false;
		}
		else{
			return true;
		}
}

	/**
	 * Checks if moving right is allowed, if it is then the horizontal location of 
	 * the reflex agent is increased by 1
	 * Then calls the print function
	 */
	public void moveRight() {
		if(legalMove("right") == true) {
			locationX ++;
			Board.locationX = locationX;
		}
		print();
	}
	
	/**
	 * Checks if moving left is allowed, if it is then the horizontal location of 
	 * the reflex agent is decreased by 1
	 * Then calls the print function
	 */
	public void moveLeft() {
		if(legalMove("left") == true) {
			locationX --;
			Board.locationX = locationX;
		}
		print();

	}
	
	/**
	 * Checks if moving up is allowed, if it is then the vertical location of 
	 * the reflex agent is decreased by 1
	 * Then calls the print function
	 */
	public void moveUp() {
		if(legalMove("up") == true) {
			locationY --;
			Board.locationY = locationY;
		}
		print();

	}
	
	/**
	 * Checks if moving down is allowed, if it is then the vertical location of 
	 * the reflex agent is increased by 1
	 * Then calls the print function
	 */
	public void moveDown() {
		if(legalMove("down") == true) {
			locationY ++;
			Board.locationY = locationY;
		}
		print();

	}
	
	/**
	 * Reflex agent moves right until it reaches the right most edge. Then moves
	 * down until it reaches the bottom right corner. Then it moves upward in a zig-zag
	 * formation until all spots have been reached. 
	 */
	public void move() {
		while(legalMove("right") == true ) {
			moveRight();
		}
		while(legalMove("down") == true) {
			moveDown();
		}
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<3; j++) {
				if(i % 2 == 0) {
					moveLeft();
				}
				else moveRight();
			}
			moveUp();
		}
	}
	
	/**
	 * Prints out a statement that defines the precept at a specific location,
	 * Clean if value is 0 and Dirty if value is 1
	 */
	public void getPrecept() {
		if(Board.vacuumMap[locationX][locationY] == 0) {
			System.out.println("Precept is: Clean");
		}
		else
			System.out.println("Precept is: Dirty");
	}
	
	/**
	 * Prints out a statement that defines the action at a specific location,
	 * No Suck if value is 0 and Suck if value is 1
	 */
	public void getAction() {
		if(Board.vacuumMap[locationX][locationY] == 0) {
			System.out.println("Action is: No Suck");
		}
		else
			System.out.println("Action is: Suck");
	}
	
	/**
	 * Changes the vacuumMap value to 0 at the reflex agent location if the original value is 1
	 */
	public void doAction() {
		if(Board.vacuumMap[locationX][locationY] == 1) {
			Board.vacuumMap[locationX][locationY] = 0;
		}
			
	}
	
	/**
	 * Prints out the vacuumMap array
	 * Calls the getLocation method which prints the reflex agent location
	 * Calls the getPrecept method which prints the precept at the reflex agent location
	 * Calls the getAction method which prints the action at the reflex agent location
	 * Calls the doAction method which changes the vacuumMap value to 0 if the original is 1
	 */
	public void print() {
		System.out.println();
		Board.print();
		getLocation();
		getPrecept();
		getAction();
		doAction();
	}
}
