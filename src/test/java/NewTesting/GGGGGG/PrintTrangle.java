package NewTesting.GGGGGG;

import java.util.Random;

public class PrintTrangle {

	public static void main(String[] args) {
		  int rows = 5;

	         for (int i =1 ; i < rows; i++) {
	            System.out.println(" ".repeat(rows - i) + "*".repeat(2 * i - 1));
	        }
	        
	         for (int i = rows; i >= 1; i--) {
	            System.out.println(" ".repeat(rows - i) + "*".repeat(2 * i - 1));
	        }
	         
	         
	         
	         for (int i = 1; i <= rows; i++) {
	             System.out.println(" ".repeat(rows-i) + "*".repeat(i));
	         
	     }
	         
	         for (int i = 0 ; i<=10; i++){
	             Random random = new Random();
	             int number = 100000 + random.nextInt(900000);
	             System.out.println(number);

	}
	}

}
