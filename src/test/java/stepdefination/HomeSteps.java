package stepdefination;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pageobjectcucumber.HomePageCucumber;
import ui.uitility.World;




public class HomeSteps {
	

	
		public HomePageCucumber hp;
		public World world;
		
		public HomeSteps(World world) throws IOException {
			this.world=world;
			this.hp=world.po.getHomePageCucumber();
		}
		
		    
		
		
		@When("I click on Selenium link")
		public void i_click_on_selenium_link() {
			hp.clickOnSeleniumLink();

		}
		@Then("I check user land on selenium webpage")
		public void i_check_user_land_on_selenium_webpage() {
	    assertEquals(hp.getCurrentUrl(), "https://debugautomation.com/Tabs/Selenium.html", "Page not matched");
		}

		@When("I click on api link")
		public void i_click_on_api_link() {
		   
		}
		@Then("I check user land on api webpage")
		public void i_check_user_land_on_api_webpage() {
		   
		}

	

	}


	
