package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
	    System.out.println("Browser is open");
	    
	    String projectPath = System.getProperty("user.dir");
	    
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	   driver.manage().window().maximize();
	}
	

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("search page");
	    
	    driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	   System.out.println("search box");
	   
	   driver.findElement(By.name("q")).sendKeys("India");
	}

	@When("hits enter")
	public void hits_enter() {
	   System.out.println("Enter");
	   
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("result");
	    
	    driver.getPageSource().contains("India");
	    
	    driver.close();
	    driver.quit();
	    
	}


}
