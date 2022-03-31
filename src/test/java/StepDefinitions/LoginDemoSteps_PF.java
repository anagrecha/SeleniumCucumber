package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginDemoSteps_PF {
	
	WebDriver  driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Before (value = "@tag", order = 1)
	public void browserSetup() {
		
		 String projectPath = System.getProperty("user.dir");
		    
		 System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		    
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
	   
	}
	
	@Given("Browser is open for test")
	public void browser_is_open_for_test() {
		
		    System.out.println("====== Login Steps =======");
		    		      
		   
	   
	}

	@And("User is in login page")
	public void user_is_in_login_page() {
	  
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	  
		login = new LoginPage_PF(driver);
		
		login.userCredentials(username, password);
		
	}
	
	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
		
		home = new HomePage_PF(driver);
		home.checkLogOutDisplayed();

	}


}
