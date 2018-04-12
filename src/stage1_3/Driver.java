package stage1_3;

public class Driver {

	
	
	public static void main(String[] args) {
		
		int[][] rep = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] norep = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println("rep: " + checkDifferent(rep));
		System.out.println("norep: " + checkDifferent(norep));
		
	}
	
	
	public static boolean checkDifferent(int[][] data) {
		
		
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				
				if(checkContains(data, data[i][j], i, j + 1)) {
					return false;
				}
				
			}
		}
		
		return true;
		
	}
	
	public static boolean checkContains(int[][] data, int testValue, int rowStart, int colStart) {
		for (int i = rowStart; i < data.length; i++) {
			for (int j = colStart; j < data[i].length; j++) {
				
				if (data[i][j] == testValue) {
					return true;
				}
				
			}
		}
		return false;
	}
	
}
