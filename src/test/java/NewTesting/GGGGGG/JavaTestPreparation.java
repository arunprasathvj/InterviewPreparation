package NewTesting.GGGGGG;

import java.util.ArrayList;

public class JavaTestPreparation {

	public static void main(String[] args) {
		
		
	//	Reverse String 
		
		String test = "arun Prasath";
		
		String rev= "";
		
		for(int i = 0 ; i < test.length(); i++) {
			
			rev = test.charAt(i)+rev;
		}
		
		
		System.out.println(rev);
	

	
	String test1 = "arun Prasath12345";
	
	StringBuilder sb = new StringBuilder (test1);
	
	System.out.println(sb.reverse());
	
	
	
	// odd and even Number in array
	
	
	int ar[] = {11,22,33,44,55,66,77,88};
	
	ArrayList<Integer> list = new ArrayList <Integer>();
	
	for (int i=0; i< ar.length; i++) {
		
		if(ar[i] % 2 != 0) {
			
		list.add(ar[i])	;
			
			System.out.println("odd Number ---" + ar[i]);
		}
		
		
	}
	
	System.out.println("odd Number ---From list" + list);
	
	}
	
}
