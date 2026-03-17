package NewTesting.GGGGGG;

import java.util.HashMap;

public class RemoveCharectorIfDuplicate {

	public static void main(String[] args) {
		
		String name = "JAVA";
		
		StringBuilder bu = new StringBuilder();
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		for(Character c: name.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);	
			
		}
		
		for (Character ch: name.toCharArray()) {
			
			if(map.get(ch)==1) {
				
				bu.append(ch);
			}
			else {
				
				System.out.println("Duplicate = " + ch);
			}
		}
		
		System.out.println("Output = " + bu);
		
		// print duplicate 
		String str = "automation";

		for(int i=0;i<str.length();i++){
		    
		    for(int j=i+1;j<str.length();j++){
		        
		        if(str.charAt(i)==str.charAt(j)){
		            System.out.println(str.charAt(i));
		        }
		    }
		}
	}

}
