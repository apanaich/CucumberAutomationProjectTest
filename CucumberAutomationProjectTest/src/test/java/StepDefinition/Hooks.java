package StepDefinition;
import java.io.File;
//import
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.qa.Utils.TestClass;
import cucumber.api.Scenario;
//import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import io.cucumber.java.Scenario;
	//import io.cucumber.java.After;
	//import io.cucumber.java.Before;
	

	public class Hooks extends TestClass  {

		//public static WebDriver driver;
	@After
	public static void tearDown(Scenario scenario) throws Throwable{
		
		if (scenario.isFailed()) {
			Thread.sleep(5000);
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   
 
			//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				//Reporter.addScenarioLog(screenshotName);
			} catch (IOException e) {
			} 
		}
		
	}
	
	
	}
	



	