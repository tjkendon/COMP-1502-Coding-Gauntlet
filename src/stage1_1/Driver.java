package stage1_1;

public class Driver {
	
	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int[] numbers = {1, 2, 4, 5, 7, 9, -1, 5};
		
		for (int i : numbers) {
			if (i < min) {
				min = i;
			} 
			if (i > max) {
				max = i;
			}
		}
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		
		
	}

}
