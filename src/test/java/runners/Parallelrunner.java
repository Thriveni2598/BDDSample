package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//feature//GooglePageSearch.feature",
				glue = {"stepDefinition"},
		        monochrome = true,
		       plugin = {"pretty",
		    		   "html:target//reports//HTMLReport.html"
		}
		)

public class Parallelrunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
  
}
