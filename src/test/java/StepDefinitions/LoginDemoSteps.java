package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	WebDriver  driver = null;
	
//	@Given("Browser is open for test")
//	public void browser_is_open_for_test() {
//		
//		 System.out.println("Browser is open");
//		    
//		    String projectPath = System.getProperty("user.dir");
//		    
//		    System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
//		    
//		    driver = new FirefoxDriver();
//		    
//		   driver.manage().window().maximize();
//	   
//	}
//
//	@And("User is in login page")
//	public void user_is_in_login_page() {
//	  
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^User enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//	  
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//	}
//	
//	@And("User clicks on Login button")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("User is navigated to the Home Page")
//	public void user_is_navigated_to_the_home_page() {
//		
//		driver.findElement(By.id("logout")).isDisplayed();
//		
//		driver.close();
//		driver.quit();
//	   
//	}


}
