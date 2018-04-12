package stage4_3;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	
	public static void main(String[] args) {
		
		Map<Character, Integer> empty = initMap();
		
		printMap(empty);
		
		Map<Character, Integer> full = getCharacterCounts("AABCDEFGGG");
		
		System.out.println();
		
		printMap(full);
		
	}
	
	public static void printMap(Map <Character, Integer> data) {
		
		for (char c = '!'; c <= '~'; c++) {
			System.out.print(data.get(c) );
		}
		System.out.println();
		for (char c = '!'; c <= '~'; c++) {
			System.out.print(c);
		}

		
	}
	
	public static Map<Character, Integer> getCharacterCounts(String text) {
		
		Map<Character, Integer> counts = initMap();
		
		for (int i = 0; i < text.length(); i++) {
			if (counts.containsKey(text.charAt(i))) {
				int count = counts.get(text.charAt(i));
				count++;
				counts.put(text.charAt(i), count);
			}
		}
		
		return counts;
		
		
	}
	
	public static Map<Character, Integer> initMap() {
		
		Map<Character, Integer> init = new HashMap<>();
		
		for (char c = '!'; c <= '~'; c++) {
			init.put(c, 0);
		}
		
		return init;
		
	}
	
}
