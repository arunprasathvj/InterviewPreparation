package NewTesting.GGGGGG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport extends TestListenerAdapter {
	
	
	
	ExtentSparkReporter spark  ;
	ExtentReports extent;
	ExtentTest test;
	
	
	WebDriver driver;
	

	
	
	public void onStart (ITestContext context) {
		
		spark = new ExtentSparkReporter("./reports/myNewReport.html");
		spark.config().setDocumentTitle("TiTle");
		spark.config().setReportName("myNewReport");
		spark.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports ();
		extent.attachReporter(spark);
		extent.setSystemInfo("Environmnt", "local");
		extent.setSystemInfo("Name", "Prasath");
		
			
		System.out.println("Test Started "+ context.getName() );
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		 test = extent.createTest(tr.getName());
		 test.log(Status.PASS, "Passssssssssssssssssss");
		System.out.println("Test Success "+ tr.getName() );
		
	  }
	
	public void onTestSkipped(ITestResult tr) {
		 test = extent.createTest(tr.getName());
		 test.log(Status.SKIP, "Skipped");
		System.out.println("Test Skipped "+ tr.getName() );  
		
	  }
	
	@Override
	public void onTestFailure(ITestResult tr) {

	    test = extent.createTest(tr.getName());
	    test.log(Status.FAIL, tr.getThrowable());

	    try {
	        TakesScreenshot ts = (TakesScreenshot) this.driver;

	        File source = ts.getScreenshotAs(OutputType.FILE);
	        File location = new File("./reports/" + tr.getName() + ".png");

	        FileUtils.copyFile(source, location);

	        test.addScreenCaptureFromPath(location.getPath());

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    System.out.println("Test Failed " + tr.getName());
	}

	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		System.out.println("Test Finish "+ context.getName() );   
		
	  }
	
	
	

}
