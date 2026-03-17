package NewTesting.GGGGGG;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,2,4,3,4,1};

		for(int i=0;i<arr.length;i++)
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]==arr[j])
		        System.out.println(arr[i]);
		    }
		}
		
		// Get currentime
		String email="test"+System.currentTimeMillis()+"@gmail.com";

		System.out.println(email);
	}

}
