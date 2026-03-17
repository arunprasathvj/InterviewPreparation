package NewTesting.GGGGGG;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

		
		
		Map<String, Integer> map = Map.of( "A", 10, "B", 5,"C", 20 ); 
		
		Map<String, Integer> linkedmap = new LinkedHashMap<>(); 
		
	map.entrySet().stream() .sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(x -> linkedmap.put(x.getKey(),x.getValue()));
		
	System.out.println(linkedmap);	
		
		  Map.Entry<String, Integer> cheapest =
				  
       		   map.entrySet()
       	                  .stream()
       	                       .min(Map.Entry.comparingByValue())
      	                       .get();

       	System.out.println("Cheapest Mobile: " + cheapest.getKey()
       	        + " | Price: ₹" + cheapest.getValue());
		
		
		
		
		
	}

}
