package stage1_5;

public class Connect4 {

	public static final int width = 7;
	public static final int height = 6;

	public static final char EMPTY_SPOT = '.';
	public static final char P1_SPOT = 'X';
	public static final char P2_SPOT = '0';

	int lastMove = 0;

	private char[][] board;

	public Connect4() {

		board = new char[height][width];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = EMPTY_SPOT;
			}
		}

	}

	public boolean p1Go(int column) {
		for (int i = 0; i < height; i++) {
			if (board[i][column - 1] == EMPTY_SPOT) {
				board[i][column - 1] = P1_SPOT;
				lastMove = column - 1;
				return true;
			}
		}
		return false;
	}

	public boolean p2Go(int column) {
		for (int i = 0; i < height; i++) {
			if (board[i][column - 1] == EMPTY_SPOT) {
				board[i][column - 1] = P2_SPOT;
				lastMove = column - 1;
				return true;
			}
		}
		return false;
	}

	public boolean boardFull() {
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == EMPTY_SPOT) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean won() {

		int row = height - 1;
		while (board[row][lastMove] == EMPTY_SPOT) {
			row--;
		}

		char target = board[row][lastMove];

		int y = row;
		int x = lastMove;
		int spaces = 0;

		// left
		while ((x >= 0) && (board[y][x] == target)) {
			x--;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}

		// right
		y = row;
		x = lastMove;
		spaces = 0;

		while ((x < board[0].length) && (board[y][x] == target)) {
			x++;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}

		// down
		y = row;
		x = lastMove;
		spaces = 0;

		while ((y >= 0) && (board[y][x] == target)) {
			y--;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}

		// up left
		y = row;
		x = lastMove;
		spaces = 0;
		while ((x >= 0) && (y < board.length) && (board[y][x] == target)) {
			x--;
			y++;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}
		
		// up right
		y = row;
		x = lastMove;
		spaces = 0;
		while ((x < board[0].length) && (y < board.length) && (board[y][x] == target)) {
			x++;
			y++;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}
		
		// down left
		y = row;
		x = lastMove;
		spaces = 0;
		while ((x >= 0) && (y >= 0) && (board[y][x] == target)) {
			x--;
			y--;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}
		
		// down right
		y = row;
		x = lastMove;
		spaces = 0;
		while ((x < board[0].length) && (y >= 0) && (board[y][x] == target)) {
			x++;
			y--;
			spaces++;
			if (spaces == 4) {
				return true;
			}
		}

		return false;
	}

	public void draw() {
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		for (int j = 0; j < board[0].length; j++) {
			System.out.print((j + 1) + " ");
		}
		System.out.println();
	}

}
