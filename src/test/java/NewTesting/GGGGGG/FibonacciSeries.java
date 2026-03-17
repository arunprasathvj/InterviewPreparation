package NewTesting.GGGGGG;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	
@Test
	public  void testing1() {
		
		// output - 0 1 1 2 3 5 8 13 21 34
		
		  int a = 0;
	        int b = 1;

	        System.out.print(a + " " + b + " ");

	        for(int i = 1; i <= 8; i++) {

	            int c = a + b;

	            System.out.print(c + " ");

	            a = b;
	            b = c;
	        }
	       // Swap Two Numbers (Without Third Variable) 
	}
	
@Test
	public void testing () {
	        int a = 5;
	        int b = 10;

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println(a + " " + b);
	        
	}

}
