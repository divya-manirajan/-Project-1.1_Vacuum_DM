public class Application {
	public static void main (String [] args) {
		
		reflexAgent rA = new reflexAgent();
		Board b = new Board();
		b.fill();
		
		b.print();
		rA.getLocation();
		rA.move();
		b.print();
		rA.getLocation();

		
	}
}
