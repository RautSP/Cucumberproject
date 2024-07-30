package stepdefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pageobjectcucumber.LoginPageCucumber;
import ui.pageobjectcucumber.SeleniumPageCucumber;
import ui.uitility.World;

public class SeleniumSteps {
	public SeleniumPageCucumber sp;
    public World world;
	
	public SeleniumSteps(World world) throws IOException {
		this.world=world;
		this.sp=world.po.getseleniumPageCucumber();
	}

	@When("I click on Description")
	public void i_click_on_description() {
		sp.clickonDescriptionLink();
	    
	}
	@Then("I check user land on Description webpage")
	public void i_check_user_land_on_description_webpage() {
		   assertEquals(sp.getCurrentUrl(), "https://debugautomation.com/Tabs/Selenium.html#description");

	    
	}

}
