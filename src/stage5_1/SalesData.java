package stage5_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SalesData {
	
	private Map<String, Double> data;
	
	public SalesData() {
		data = new HashMap<>();
		
	}
	
	public void addData(String category, double amount) {
		if (!data.containsKey(category)) {
			data.put(category, 0.0);
		}
		double total = data.get(category);
		total += amount;
		data.put(category, total);
	}
	
	public void printData() {
		for (Entry<String, Double> e : data.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
