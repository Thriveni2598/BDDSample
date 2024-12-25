package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	

@Given("User is on login page")
public void user_is_on_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/login");
		
	}

@When("User enters credentials")
public void user_enters_credentials(DataTable dataTable) {
	
	List<List<String>> user = dataTable.asLists();
	String strUser= user.get(0).get(0);
	String strPwd = user.get(0).get(1);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
	driver.findElement(By.name("password")).sendKeys(strPwd);
	driver.findElement(By.cssSelector("button.radius")).click();
	
	
	
}
	

	//@When("User enters {string} and {string}")
	//public void user_enters_and(String strUser, String strPwd) {
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
	//	driver.findElement(By.name("password")).sendKeys(strPwd);
	//	driver.findElement(By.cssSelector("button.radius")).click();
		
	    
	//}
	//@Then("Should display home page")
	//public void should_display_home_page() {
		//boolean isvalidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		//Assert.assertTrue(isvalidUser);

//}
@Then("Should display home page")
public void should_display_home_page(DataTable dataTable) {
	List<List<String>> data= dataTable.asLists();
	String expMsg = data.get(0).get(0);
	WebElement msg = driver.findElement(By.cssSelector("div.success"));
	String actMsg = msg.getText();
	System.out.println("Actual msg..."+actMsg);
	Assert.assertEquals(actMsg,expMsg);
}
	
	
}
	
