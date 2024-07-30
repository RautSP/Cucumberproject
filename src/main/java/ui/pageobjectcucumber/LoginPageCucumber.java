package ui.pageobjectcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageCucumber {
	public WebDriver driver;
	
	
	public LoginPageCucumber(WebDriver driver) {
		this.driver=driver;
	}
		
		
		private By username=By.id("username");
		private By password=By.id("password");
		private By submit=By.xpath("//*[@type='submit']");
		
		public void launchWebsite(String websiteName) {
			driver.get(websiteName);
		}

		public void setUsername(String user) {
		 driver.findElement(username).sendKeys(user);
		}
	 
		public void setPassword(String test) {
		 driver.findElement(password).sendKeys(test);
		}                     

		public void clickOnSubmitButton() {
		 driver.findElement(submit).click();
		}
		
		public String getCurrentUrlOfPage() {
			return driver.getCurrentUrl();
		}
		
		public void handleAlertAndAccept() {
			driver.switchTo().alert().accept();
		}
	}


