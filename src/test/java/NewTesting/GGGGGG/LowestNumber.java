package NewTesting.GGGGGG;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LowestNumber {
	
    public static void main(String[] args) {
    	
        List<Double> numbers = Arrays.asList(250.0, 399.99, 1129.99, 599.0, 89.50);

        Double lowest = Collections.min(numbers);  

        System.out.println("Lowest value using PriorityQueue: " + lowest);
        
        
        
    }
}
