package NewTesting.GGGGGG;

import java.util.HashMap;
import java.util.Map;

public class JavaPreparationTwo {

	public static void main(String[] args) {
		
		
		String test = "New   Yaro   Testingg test ";

		// Replace one or more spaces ("\\s+") with a single space (" ")
		// and use trim() to remove leading/trailing spaces
		String clean = test.replaceAll("\\s+", " ").trim();

		System.out.println("[" + clean + "]");
		
		
		
		String test1 = "New Yaro Testingg test";
		
		String  split[] = test1.split(" ");
		
		System.out.println(split[3]);
		
		
		String word = "automation testing ";
		
		String space = word.replace(" ", "");
		
		
		Map <Character, Integer> charCountMap = new HashMap<>();

		for (char c : space.toCharArray()) {
		   
			// Increment count if character exists, else start at 1
		    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		    
		}

		System.out.println(charCountMap);
		
		
		// Polyntrome 
		
		for (int i=0; i<=100;i++) {
			
			if(isPolyntrome(i)) {
				
				System.out.println("Is Polyntrome = " + i);
			}
		}
		
		

	}
	
	private static boolean isPolyntrome (int num) {
		
		
	String s= String.valueOf(num);	
	StringBuilder sf = new StringBuilder(s);
	
	return sf.reverse().toString().equals(s);
		
	}

}
