package stage1_4;

public class Driver {
	
	public static void main(String[] args) {
		
		int[][] norep = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0; i < norep.length; i++) {
			for (int j = 0; j < norep[i].length; j++) {
				System.out.print(norep[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] after = exchange(norep, 0, 2);
		
		for (int i = 0; i < after.length; i++) {
			for (int j = 0; j < after[i].length; j++) {
				System.out.print(after[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] exchange(int[][] data, int first, int second) {
	
		int[] hold = data[first];
		data[first] = data[second];
		data[second] = hold;
		
		return data;
	}

}
