package NewTesting.GGGGGG;

import java.util.Random;

public class RandomText {

	public static void main(String[] args) {
		
		       String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		       String num = "0123456789";
		       StringBuilder bu = new StringBuilder();
		       
		       Random rd = new Random();
		       
		     for(int i=0; i< 5; i++){ 
		     bu.append(chars.charAt(rd.nextInt(chars.length())));
		   
		     }
		     for(int i=0; i< 4; i++){ 
		   
		    bu.append(num.charAt(rd.nextInt(num.length())));
		     }
		     for(int i=0; i< 1; i++){ 
		    bu.append(chars.charAt(rd.nextInt(chars.length())));
		   
		     }
		     
		     System.out.println(bu);
		     
		  //  Random Numbers  
		     
		     Random random = new Random();
             int number = 100000 + random.nextInt(900000);
             System.out.println(number);
		     
		        

	}

}
