import java.util.Random;

public class reflexAgent {
		
	static Random rand = new Random();
	
	static int locationX = rand.nextInt((4));
    static int locationY = rand.nextInt((4));
	    
		String [] possibleMoves = {"right","left","up","down"};
		
		public void getLocation() {
			System.out.println(locationX+","+locationY);
		}
		public void move() {
		
			locationX ++;
			Board.locationX = locationX;
		}
		
		public boolean legalMove(String move) { 
			
						
			
			return false;
		}
		
	}
