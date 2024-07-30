package stepdefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.base11.TestBaseCucumber;
import ui.pageobjectcucumber.LoginPageCucumber;
import ui.uitility.World;

public class LoginSteps {
	public LoginPageCucumber lp;
    public World world;
	
	public LoginSteps(World world) throws IOException {
		this.world=world;
		this.lp=world.po.getLoginPageCucumber();
		
	}
		@Given("user login in  {string} website")
		public void user_login_in_website(String string) {

		    lp.launchWebsite(string);
			

		    
		}
		@When("User insert Username  {string} and Password {string}")
		public void user_insert_username_and_password(String string, String string2) {
			
			lp.setUsername(string);
			lp.setPassword(string2);
		    
		}
		@When("user click on submit button")
		public void user_click_on_submit_button() {
		    lp.clickOnSubmitButton();
		    lp.handleAlertAndAccept();
		}
		@Then("user will verify homepage")
		public void user_will_verify_homepage() {
			   assertEquals(lp.getCurrentUrlOfPage(), "https://debugautomation.com/Home.html");

		}
	}
	

	   

	

