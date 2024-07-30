package ui.pageobjectcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumPageCucumber {
	//public class HomePage extends TestBase{
	public WebDriver driver;
	
	public SeleniumPageCucumber hp;
	
	public SeleniumPageCucumber(WebDriver driver) {
		this.driver=driver;
	}
	
	//private By selenium=By.xpath("//*[text()='Selenium']");
    private By description=By.xpath("//*[text()='Descrption']");	
	//public void  clickOnSeleniumLink() {
		//driver.findElement(selenium).click();
	//}
	public void clickonDescriptionLink()
	{
		driver.findElement(description).click();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	
	}
}



