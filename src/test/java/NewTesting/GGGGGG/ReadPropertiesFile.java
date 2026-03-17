package NewTesting.GGGGGG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		File file  = new File ("./PropertiesFile/dataFile.properties"); 
		
		FileInputStream fl = new FileInputStream (file ); 
		
		Properties prop  = new Properties (); 
		
		prop.load(fl);
		
		System.out.println("****" + prop.getProperty("data") );
		
		System.out.println("****" + prop.getProperty("password") );
		
		String st = prop.getProperty("password");
		
		String[] split = st.split(",");
		
	System.out.println(split [2]);
		

	}

}
