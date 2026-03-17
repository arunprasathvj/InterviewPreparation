package NewTesting.GGGGGG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateValueBasedOnKey {

	public static void main(String[] args) {
		 Map<Integer,String> map = new HashMap<>();

	        map.put(1,"Java");
	        map.put(2,"Selenium");
	        map.put(3,"Java");
	        map.put(4,"TestNG");
	        map.put(5,"Java");
	       
	        
	        
	        String dub = "Java";
	        
	        LinkedList <Integer> keys = new LinkedList<>();
	        
	        // will return key and values
	        
	        for (Map.Entry<Integer , String> KeyValue :map.entrySet()) {
	        	
	        	//if need key 
	        //*** 	if (KeyValue.getKey().equals(dub)){}
	        	
	        	if (KeyValue.getValue().equals(dub)) {
	        		
	        		keys.add(KeyValue.getKey());
	        		
	        	}
	        	
	        }
	        
	        
	        //  Find Duplicate Value

	        Set<String> set = new HashSet<>();

	        for(String value : map.values())
	        {
	            if(!set.add(value))
	            {
	                System.out.println("Duplicate Value: "+value);
	            }
	        }
	        
	        // Remove Duplicate Value
	        
	        Set<String> removeSet = new HashSet<>();

	        map.entrySet().removeIf(entry -> !removeSet.add(entry.getValue()));
	        
	        
	        //Convert Map Keys to List same use ---- valueSet()
	        
	        List<Integer> listkeys = new ArrayList<>(map.keySet());

	        System.out.println(listkeys);
	        
	        System.out.println("Duplicate value Keys-" + listkeys);
	        
	        
	        // Find Maximum Key in Map
	        
	        int max = Collections.max(map.keySet());


	}

}
