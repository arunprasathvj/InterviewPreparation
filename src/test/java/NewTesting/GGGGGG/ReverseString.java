package NewTesting.GGGGGG;

public class ReverseString {

	public static void main(String[] args) {
	
		
		String name = "Arun Prasath" ; 
		
		String Reverse = ""; 
		
		String arry[] = name.split(" ");
		for (int i=0 ; i< arry.length; i++) {
		
		StringBuilder bu = new StringBuilder(arry[i]);
		
		
		
		Reverse = Reverse+" "+bu.reverse();
		
		
	}
		
		System.out.println( "*******" + Reverse);
		
		Reverse = Reverse.trim();
		
		System.out.println( "*******" + Reverse);
		
		
		
		String rev = "";
		
		for (int i= 0 ; i < name.length(); i++) {
			
		rev = name.charAt(i)+rev;	
			
		}
		
		System.out.println("*****" + rev);
	}

}
