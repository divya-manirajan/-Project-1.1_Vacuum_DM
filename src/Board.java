import java.util.Random;
/**
 * This is the board class which is used to set up the 4x4 grid used 
 * in the application class.
 * @author Divya Manirajan
 *
 */
public class Board {
	
	//creates a random object named rand to generate random values 0 or 1
	static Random rand = new Random();

	//creates an integer called rows and sets it to 4
	static int rows = 4;
	
	//creates an integer called col and sets it to 4
	static int col = 4;
	
	//creates a 2D array called vacuumMap with 4 rows and 4 columns
	static int [][] vacuumMap = new int [rows][col];

	//creates an integer called locationX and sets it to the horizontal location of the reflex agent
	static int locationX = reflexAgent.locationX;
	
	//creates an integer called locationY and sets it to the vertical location of the reflex agent
    static int locationY = reflexAgent.locationY;

    /**
     * Fills the 2D array vacuumMap with 0s and 1s in a random fashion
     */
    public void fill() {
		
    /*
     * Nested for loop cycles through all locations of vacuumMap and sets 
     * the value to either 0 or 1 at each location 
    */
		for(int rowCounter = 0; rowCounter<rows;rowCounter++) {
			for(int colCounter = 0; colCounter<col; colCounter++) {
				vacuumMap[rowCounter][colCounter] = rand.nextInt((1)+1);
			}
			
		}
	}
  
    /**
     * Prints the array vacuumMap to the screen while substituting values depending on the 
     * integer at a specific location, and the location of the reflex agent.
     
     * 
     * The values printed are either CO, CU, DO, or DU depending on the value and the location.
   

     * 
     */
	public static void print() {
		/*
		 	* For loop that goes through the vacuumMap array and prints either CO, CU, DO, or 
			* DU depending on the value and the location.
			* If the value is 0 then the location is clean, if the value is 1 then the value is dirty, 
			* 	if the location of the reflex agent matches the specific location on the board then
			*	 the space is occupied, otherwise if the location of the reflex agent does not match 
			*	 with the specific location on the board then it is unoccupied.
		    * If a location is clean and occupied then CO is printed
			* If a location is clean and unoccupied then CU is printed
			* If a location is dirty and occupied then DO is printed
     		* If a location is dirty and unoccupied then DU is printed
			
		 */
		for(int j = 0; j<4;j++) {
			for(int i = 0; i<4; i++) {
				
				if(vacuumMap[i][j] == 0 && i==locationX && j == locationY) {
					System.out.print("CO ");
				}
				
				else if(vacuumMap[i][j] == 0 && (i!=locationX || j != locationY)) {
					System.out.print("CU ");
				}
				
				else if(vacuumMap[i][j] == 1 && i==locationX && j == locationY) {
					System.out.print("DO ");
				}
				
				else if(vacuumMap[i][j] == 1 && (i!=locationX || j != locationY)) {
					 
					System.out.print("DU ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	
}
