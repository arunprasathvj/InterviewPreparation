package NewTesting.GGGGGG;

import java.io.File;
import java.util.Arrays;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDownloaded {

		public static void main(String[] args) {
			
			if(isDownloaded("C:\\Users\\SuganyaDheekshaLapto\\Downloads\\","dummy.pdf")) {
				
				System.out.println("Deleted");
			}
		
		}
		
		
		public static boolean isDownloaded(String dwnldPath, String fileName) {
			
			String FullName = dwnldPath+fileName;
			File file = new File (dwnldPath);
			
			File[] lists = file.listFiles();
			
			//System.out.println("LIst ---" + Arrays.toString(lists));
			
			for (int i=0; i<lists.length; i++) {
				System.out.println(lists[i] +"--- "+ FullName);
				if(lists[i].toString().contains(FullName)) {
		
					//System.out.println(lists[i]);
					
					lists[i].delete();
					return true;
				}
				
			}
			return false;
			
			
		}
		
	}


