package stage1_2;

public class Driver {

	public static void main(String[] args) {

		String[] data = {"Red", "Orange", "Yellow", "Green", "Blue"};

		for (String s : data) {
			System.out.println(s);
		}
		
		String[] newData = rotate(data);
		
		for (String s : newData) {
			System.out.println(s);
		}
		

	}
	
	public static String[] rotate (String[] data) {
		String hold = data[0];
		for (int i = 0; i < data.length -1; i++) {
			data[i] = data[i + 1];
		}
		data[data.length - 1] = hold;
		return data;
	}

}
