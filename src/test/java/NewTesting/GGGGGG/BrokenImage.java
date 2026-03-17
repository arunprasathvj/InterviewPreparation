 package NewTesting.GGGGGG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/broken_images");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List <WebElement> list =driver.findElements(By.tagName("img"));
		
		int brockenCount = 0;
		
		for (WebElement src: list) {
			
			String url = src.getAttribute("src");
			
			if (url !=null|!url.isEmpty()) {
				
				URL connection = new URL (url);
				
				HttpURLConnection http = (HttpURLConnection) connection.openConnection();
				http.connect();
				http.setConnectTimeout(5000);
				
				
				if(http.getResponseCode() <= 200) {
					
					System.out.println("*********"+http.getResponseMessage());
				}
				else {
					brockenCount++;
					System.err.println("*******" +http.getResponseMessage());
				}
				
				
			}
			
			
			
			
		}
		
		System.out.println("brockenCount =" + brockenCount);

	}

}
