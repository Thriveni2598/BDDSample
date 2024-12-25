package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CMRStepDef {
	
	//@BeforeAll
	//public static void setup() {
		//System.out.println("Before all scenario..");
	//}
	
	@Before(value ="@SmokeTest", order=1)
	public void readFromQAProperty() {
		System.out.println("read from QA Property");
	}
	@Before(value ="@SmokeTest",order=2)
	public void initQADBConnect() {
		System.out.println("Init DB Connection");
	}
	@Before(value ="@RegressionTest",order=1)
	public void readFromTestProperty() {
		System.out.println("read from Test Property");
	}
	@Before(value ="@RegressionTest",order=2)
	public void initTestDBConnect() {
		System.out.println("Init DB Connection");
	}
	
	
	//@Before(order=2)
	//public void setupEdgeBrowser() {
		//System.out.println("Init Edge Browser");
	//}
	
	
	//@AfterAll
	//public static void teardown() {
		//System.out.println("After all scenario..");
	//}
	//@After
	//public void closeBrowser() {
		//System.out.println("After each scenario");
	//}
	
	
	@Given("User login into app")
	public void user_login_into_app() {
		System.out.println("Login into app");
	    
	}
	@When("User create a new Deal")
	public void user_create_a_new_deal() {
		System.out.println("Create new Deal");
	}
	@When("User view Deal")
	public void user_view_deal() {
		System.out.println("View Deals");
	}
	
   @When("User update Deal")
   public void user_update_deal() {
	   System.out.println("Update Deal");
	   
	}
	
   @When("User delete a Deal")
   public void user_delete_a_deal() {
	   System.out.println("Delete Deal");
	    
	}

	@When("User create a new task")
	public void user_create_a_new_task() {
		System.out.println("Create task");
	}
	@When("User view task")
	public void user_view_task() {
		System.out.println("View task"); 
	}
	
	@When("User update task")
	public void user_update_task() {
		System.out.println("Update task");
	}
	
	@When("User delete a task")
	public void user_delete_a_task() {
		 System.out.println("Delete task");
	}

}
