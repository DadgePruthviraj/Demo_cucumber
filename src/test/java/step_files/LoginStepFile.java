package step_files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepFile {

	@Given("Open the login page")
	public void Open_the_login_page () {
		System.out.println("Step1: Open Browser");
		System.out.println("Step2: Enter the URL");
		System.out.println("Step3: Open Application Page");
	}
	@When("Enter username and password")
	public void Enter_username_and_password () {
		System.out.println("Step4: Entring");	
	}
	@And("click on Login button")
	public void click_on_Login_button () {
		System.out.println("Step5: Enter button ");

	}
	@Then("Open homepage")
	public void Open_homepage() {
		System.out.println("Step6: Enter to Home Page");
		System.out.println("Steps7: Logout");
		System.out.println("Steps8 "
				+ ": Close Browser ");
	}
	@Then("Its Should be show Error")
	public void its_should_be_show_error() {
		System.out.println("Step9: Invaild password");
	}
	    
	   
}
