package ui.pageobjectcucumber;


	

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import ui.base11.TestBaseCucumber;

	public class HomePageCucumber {
		//public class HomePage extends TestBase{
			public WebDriver driver;
			
			public HomePageCucumber(WebDriver driver) {
				this.driver=driver;
			}
			
			private By selenium=By.xpath("//*[text()='Selenium']");
			//private By api=By.xpath("//*[text()='Api Automation']");
			
			public void  clickOnSeleniumLink() {
				driver.findElement(selenium).click();
			}
			
			
			public String getCurrentUrl() {
				return driver.getCurrentUrl();
			
			}
		}

		
		


		

	



