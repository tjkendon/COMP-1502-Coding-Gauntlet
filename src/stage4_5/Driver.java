package stage4_5;

public class Driver {

	public static void main(String[] args) {

		GameOfLife g = new GameOfLife();

		while (true) {
			g = new GameOfLife();
			for (int i = 0; i < 100; i++) {

				g.advanceGeneration();
				g.drawBoard();
				System.out.println("--Generation " 
						+ i 
						+ " ------");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
