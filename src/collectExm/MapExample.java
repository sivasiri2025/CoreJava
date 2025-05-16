package collectExm;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> vehicles = new HashMap<>();
		
		vehicles.put("BMW", 5);
		vehicles.put("Camry", 2);
		vehicles.put("volvo", 4);
		
		System.out.println("Size of the map "+ vehicles.size());
		
		for(String key: vehicles.keySet()) {
			System.out.println(key + " | " +vehicles.get(key));
		}
		
		if(vehicles.containsKey("BMW")) {
			System.out.println("found vehicles "+vehicles.get("BMW"));
		}
		
	}

}
