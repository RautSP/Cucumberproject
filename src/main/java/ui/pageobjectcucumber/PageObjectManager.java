package ui.pageobjectcucumber;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver ;
	LoginPageCucumber lp;
	HomePageCucumber hp;
	SeleniumPageCucumber sp;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public LoginPageCucumber getLoginPageCucumber()
	{
		lp=new LoginPageCucumber(driver);
		return lp;
	}
	
	public HomePageCucumber getHomePageCucumber()
	{
		hp=new HomePageCucumber(driver);
		return hp;
	}
	public SeleniumPageCucumber getseleniumPageCucumber()
	{
		sp=new SeleniumPageCucumber(driver);
		return sp;
		
	}

}
