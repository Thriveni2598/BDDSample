package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "@target//failedScenarios.txt",
				glue = {"stepDefinition"},
		        monochrome = true
		        )
		      
		

public class RerunRunner extends AbstractTestNGCucumberTests {
  
}
