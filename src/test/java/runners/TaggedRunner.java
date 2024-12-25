package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//TaggedFeature//",
				glue = {"stepDefinition"},
		        monochrome = true,
		        dryRun = false,
		        //tags= "@SmokeTest"
		        //tags= "@RegressionTest"
		        //tags= "@SmokeTest or @RegressionTest"
		       // tags="@SmokeTest and @RegressionTest"
		      //  tags="not @SmokeTest"
		        tags="@PhaseTwo"
		        //tags="@PhaseOne and @SmokeTest"
		        //tags="@PhaseOne and @SmokeTest or @PhaseTwo and @SmokeTest"\
		        //tags="@PhaseOne and not @RegressionTest or @PhaseTwo and not @RegressionTest"
		        
		        )
		    		  

public class TaggedRunner extends AbstractTestNGCucumberTests {

}
