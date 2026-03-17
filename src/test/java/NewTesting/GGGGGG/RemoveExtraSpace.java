package NewTesting.GGGGGG;

import java.util.HashMap;
import java.util.Map;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		
		
		String name = "yara   new    to   new yes  i";
		
		String[] words = name.trim().split("\\s+");
		String result = String.join(" ", words);
		System.out.println(result);

		
		String name1 = "yara   new    to   new yes  i";
		String result1 = name1.trim().replaceAll("\\s+", " ");
		System.out.println(result1);
		
		String word = "automation testing automation testing automation ";
		
		String[] splt = word.split(" ");
		
		
		Map <String, Integer> charCountMap = new HashMap<>();

		for (int i=0 ; i< splt.length; i++ ) {
		   
			// Increment count if character exists, else start at 1
		    charCountMap.put(splt[i], charCountMap.getOrDefault(splt[i], 0) + 1);
		    
		}

		System.out.println(charCountMap);

	}

}
