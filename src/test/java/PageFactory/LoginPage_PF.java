package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy (id="name")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy (id="password")
	@CacheLookup
	WebElement txt_password;
	
	@FindBy (id="login")
	@CacheLookup
	WebElement btn_login;
	
	
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userCredentials(String username, String password) {
		
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	

}
