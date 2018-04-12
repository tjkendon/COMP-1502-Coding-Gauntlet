package stage4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameOfLife {

	private static final int BOARD_SIZE = 10;
	
	private static final int INIT_RANDOM_CELLS = 35;

	private static final char EMPTY = '.';
	private static final char FILLED = 'X';

	char[][] board;

	public GameOfLife() {
		emptyBoard();
		List<IntPair> startingCoordinates = getStartingCoordinates();
		loadStartingCoordinates(startingCoordinates);

	}

	private void loadStartingCoordinates(List<IntPair> coords) {
		for (IntPair c : coords) {
			board[c.getX()][c.getY()] = FILLED;
		}
	}

	private List<IntPair> getStartingCoordinates() {
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.println("Mode? (1, 2 or 3) ");
//		int choice = kb.nextInt();
//		switch(choice) {
//			case 1 : return getStablePaterns();
//			case 2 : return getGliderPatern();
//			default : return getRandomPatern();
//		}

		//return getRandomPatern();
		return getStablePaterns();
		
	}
	
	public List<IntPair> getGliderPatern() {
		return null;
	}
	
	public List<IntPair> getRandomPatern() {
		Random r = new Random();
		List<IntPair> coords = new ArrayList<>();
		for (int i = 0; i < INIT_RANDOM_CELLS; i++) {
			coords.add(
					new IntPair(
							r.nextInt(10), r.nextInt(10)));
		}
		return coords;
		
	}
	
	public List<IntPair> getStablePaterns() {
		List<IntPair> coords = new ArrayList<>();

		coords.add(new IntPair(1, 1));
		coords.add(new IntPair(1, 2));
		coords.add(new IntPair(1, 3));
		
		coords.add(new IntPair(5,5));
		coords.add(new IntPair(5,6));
		coords.add(new IntPair(6,5));
		coords.add(new IntPair(5,6));
		
		coords.add(new IntPair(1, 8));
		coords.add(new IntPair(2, 8));
		coords.add(new IntPair(3, 8));
		

		return coords;

	}

	private void emptyBoard() {
		board = new char[BOARD_SIZE][BOARD_SIZE];

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = EMPTY;
			}
		}

	}

	public void drawBoard() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public void advanceGeneration() {
		char[][] nextBoard = new char[BOARD_SIZE][BOARD_SIZE];

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				nextBoard[i][j] = determineLife(board[i][j], i, j);
			}
		}
		
		board = nextBoard;

	}

	private char determineLife(char original, int i, int j) {
		if ((original == EMPTY) 
				&& (livingNeighbours(i, j) == 3)) {
			return FILLED;
		}
		if ((original == FILLED) && 
				((livingNeighbours(i, j) < 2) || 
						(livingNeighbours(i, j) > 3))) {
			return EMPTY;
		}
		return original;
	}

	private int livingNeighbours(int x, int y) {

		int iStart;
		int iEnd;

		int jStart;
		int jEnd;
		
		int livingNeighbourCount = 0;

		// we want to find all 8 nighbours UP, DOWN, LEFT, RIGHT,
		// UP LEFT, UP RIGHT, DOWN LEFT, DOWN RIGHT

		// but we have to deal with the edges of the board

		iStart = x - 1;
		iEnd = x + 1;
		
		if (x == 0) {
			iStart = x;
		} else if (x == BOARD_SIZE - 1) {
			iEnd = x;
		}
		
		jStart = y - 1;
		jEnd = y + 1;
		
		if (y == 0) {
			jStart = y;
		} else if (y == BOARD_SIZE - 1) {
			jEnd = y;
		}
//		System.out.println("x " + x + ", y" + y);
//		System.out.println("iS " + iStart + ", iE" + iEnd);
//		System.out.println("jS " + jStart + ", jE" + jEnd);
		for (int i = iStart; i <= iEnd; i++) {
//			System.out.print(i + "-");
			for (int j = jStart; j <= jEnd; j++) {
//				System.out.println(j);
				if (!(i == x && j ==y)) {
					if (board[i][j] == FILLED) {
						livingNeighbourCount++;
					}
				}
			}
		}

//		System.out.println(livingNeighbourCount);
		
		return livingNeighbourCount;
	}

}
