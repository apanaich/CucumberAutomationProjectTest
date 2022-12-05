package AppRunner;

import StepDefinition.Hooks;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.google.common.io.Files;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json"
        ,overviewReport = true
        ,jsonUsageReport = "target/cucumber-usage.json"
        ,includeCoverageTags = {"@Test1","@Test2"}
        ,outputFolder = "target"

        //         retryCount = 3,
        //        ,detailedReport = true
        //        ,detailedAggregatedReport = true
        //        ,overviewReport = true
        //        ,overviewCharts = true
)
@CucumberOptions(
        features = ".\\src\\test\\resources\\Features",
        glue = {"StepDefinition"},
      
     //plugin = { "pretty", "html:test-output", "json:target/cucumber.json"}, 
        	
        		plugin = { "pretty", "html:test-output", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {},
        monochrome = true
        //"usage:target/cucumber-usage.json",
        //"junit:targer/cucumber-results.xml"
)

public class Runner{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("./src/test/resources/config/report.xml"));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	  // Reporter.addScenarioLog(screenshotName);
	   //Reporter.addScreenCaptureFromPath(Hooks.tearDown();
	    
	       
	    
	}

    
	 
	
	
	
	
	
}
