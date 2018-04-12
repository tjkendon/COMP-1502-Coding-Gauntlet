package stage4_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<String> test1 = new ArrayList<>();
		test1.add("A");
		test1.add("B");
		test1.add("C");
		test1.add("A");
		test1.add("C");
		System.out.println(test1);
		
		List<String> result1 = reorder(test1, "A");
		System.out.println(result1);
		
		List<String> result2 = reorder(test1, "B");
		System.out.println(result2);
		
		List<String> result3 = reorder(test1, "C");
		System.out.println(result3);
		
		List<String> test2 = new LinkedList<>();
		test2.add("A");
		test2.add("B");
		test2.add("C");
		test2.add("A");
		test2.add("C");
		System.out.println(test2);
		
		
		List<String> result4 = reorder(test2, "A");
		System.out.println(result4);
		
		List<String> result5 = reorder(test2, "B");
		System.out.println(result5);
		
		List<String> result6 = reorder(test2, "C");
		System.out.println(result6);
		
		
		
	}
	
	public static List<String> reorder (List<String> list, String example) {
		
		List<String> stuff = new ArrayList<>();
		List<Integer> indexes = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).equals(example)) {
				System.out.print(i + " ");
				stuff.add(list.get(i));
				indexes.add(i);
			}
			
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (!indexes.contains(i)) {
				stuff.add(list.get(i));
			}
		}
		
		
		return stuff;
	}


}



