package NewTesting.GGGGGG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPrice {
	
	
	@Test
	public static void getPrice() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        driver.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
		
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@title='Search for Products, Brands and More']")));
		
                searchBox.sendKeys("mobile 5g");

            driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
            
            List <WebElement> name  = driver.findElements(By.xpath("//*[@class=\"RG5Slk\"]"));
            
            List <WebElement> price  = driver.findElements(By.xpath("//*[@class=\"hZ3P6w DeU9vF\"]"));
            
         

            HashMap <String , Integer > datamap = new HashMap <>();
            
            for(int i =0 ; i< name.size(); i++) {
            	
         
            	String data1= name.get(i).getText();
            	        
            	String data2= price.get(i).getText().replaceAll("[^0-9]", "");
            	
            	int acutalprice = Integer.parseInt(data2);
            	
            	datamap.put(data1, acutalprice);        
            
            }
           
           Map.Entry<String, Integer> cheapest =
        		   datamap.entrySet()
        	                  .stream()
        	                       .min(Map.Entry.comparingByValue())
        	                       .get();

        	System.out.println("Cheapest Mobile: " + cheapest.getKey()
        	        + " | Price: ₹" + cheapest.getValue());
          		
		
	}  
	
	

}
