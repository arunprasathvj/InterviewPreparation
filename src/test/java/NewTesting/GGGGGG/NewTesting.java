package NewTesting.GGGGGG;

import java.util.HashMap;
import java.util.Map;

public class NewTesting {

	public static void main(String[] args) {
		
		 String name = "Arun Prasath";
		 
		String name2 =  name.toLowerCase().replaceAll(" ", "");
	       
	       Map < Character, Integer> map = new HashMap<>();
	       
	       for (char ch : name2.toCharArray()){
	           
	           map.put (ch, map.getOrDefault(ch, 0)+1);
	           

	           
	       }
	       System.out.println( (map));
	       
	       
	       String xpath = "40%";
	       
	       String newtext = "//*[@class='buvtMR'][text()='"+xpath+" or more']"; 
	       
	       System.out.println(newtext);
	    

	}

}
