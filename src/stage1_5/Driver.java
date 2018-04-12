package stage1_5;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Connect4 game = new Connect4();

		game.draw();

		play(game);

		System.out.println("Done");

	}

	public static void play(Connect4 game) {

		Scanner kb = new Scanner(System.in);

		
		boolean leagal;

		do {
			do {
				System.out.println("Player 1, enter your move: ");
				int p1Move = kb.nextInt();
				leagal = game.p1Go(p1Move);
			} while (!leagal);

			game.draw();
			System.out.println();
			
			if (gameover(game, "Player 1")) {
				break;
			}

			do {
				System.out.println("Player 2, enter your move: ");
				int p2Move = kb.nextInt();
				game.p2Go(p2Move);
			} while (!leagal);

			game.draw();
			System.out.println();
			
			if (gameover(game, "Player 2")) {
				break;
			}

			

		} while (true);
		kb.close();
	}
	
	public static boolean gameover(Connect4 game, String player) {
		
		
		if (game.boardFull()) {
			System.out.println("Board Full - Game Over");
			return true;
		} else if (game.won()) {
			System.out.println(player + " WINS!");
			return true;
		} 
		return false;
	}

}
