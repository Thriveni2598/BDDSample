package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//feature//UserLogin.feature",
				glue = {"stepDefinition"},
		        monochrome = true,
		       plugin = {"pretty",
		    		   "html:target//reports//HTMLReport.html",
		    		   "rerun:target//failedScenarios.txt"
//		    		   "usage:target//reports//usage",
//		    		   "json:target//reports//JsonReport.json",
//		    		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//		
		}
		
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests {
  
}
