import java.util.Random;

public class Board {
	static Random rand = new Random();

	static int rows = 4;
	static int col = 4;
	
	static int [][] vacuumMap = new int [rows][col];

	static int locationX = reflexAgent.locationX;
    static int locationY = reflexAgent.locationY;

    
    public void fill() {
		
		for(int rowCounter = 0; rowCounter<rows;rowCounter++) {
			for(int colCounter = 0; colCounter<col; colCounter++) {
				vacuumMap[rowCounter][colCounter] = rand.nextInt((1)+1);
			}
			
		}
	}
	public void print() {
		for(int j = 0; j<4;j++) {
			for(int i = 0; i<4; i++) {
				
				if(vacuumMap[i][j] == 0 && i==locationX && j == locationY) {
					System.out.print("CO ");
				}
				
				else if(vacuumMap[i][j] == 0 && i!=locationX || j != locationY) {
					System.out.print("CU ");
				}
				
				else if(vacuumMap[i][j] == 1 && i==locationX && j == locationY) {
					System.out.print("DO ");
				}
				
				else if(vacuumMap[i][j] == 1 && i!=locationX || j != locationY) {
					System.out.print("DU ");
				}
			}
			System.out.println();
		}
	}
	
}
