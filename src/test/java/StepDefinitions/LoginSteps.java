package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
	    System.out.println("User Login Page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Credential");
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
	    System.out.println("button");
	}

	@Then("user is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("Home");
	}

}
