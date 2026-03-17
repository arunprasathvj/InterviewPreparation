package NewTesting.GGGGGG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;

public class ArrayAssentingOrder {

	
	public static void main (String[] arg) {
	
		  Integer[] ary = {12, 123, 2, 2, 3, 3, 6, 34, 56, 6};

	        Arrays.sort(ary, Collections.reverseOrder());
	        

	        System.out.println(Arrays.toString(ary));
	        
	        List <Integer> list = Arrays.asList(ary);
	        
	        int number = Collections.max(list);
	        
	        int min = ary[0];
	        
	        for (int i = 0; i < ary.length; i++) {
	            if (ary[i] < min) {
	                min = ary[i];
	            }
	        }
 
	          Collections.sort(list.reversed()) ;
	      
	      
	        System.out.println("Lowest number is: " + min);
	        
	        System.out.println("Height number is: " + number);
	        
	       System.out.println( "*******"+list);
	
	       
	       Set <Integer> se = new HashSet <Integer> (Arrays.asList(ary));
	       
	       System.out.println( "*******"+ se);
	
	       String per = "30%";
			
			
			
			System.out.println("//*[@class=\"buvtMR\"][text()='" +per+" or more']");
			
			// remove unwanted character
			
			String str = "Se@le#ni$um123";

			String result = str.replaceAll("[^a-zA-Z]", "");

			System.out.println(result);
			
			// remove everything except numbers
			
			String price = "Price: $1,200";

			String results = price.replaceAll("[^0-9]", "");

			System.out.println(results);
	
}

	
}