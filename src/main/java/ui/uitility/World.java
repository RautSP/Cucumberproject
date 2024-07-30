package ui.uitility;

import java.io.IOException;

import ui.base11.TestBaseCucumber;
import ui.pageobjectcucumber.PageObjectManager;

public class World {
	public TestBaseCucumber tb;
	public PageObjectManager po;
	
	public World() throws IOException
	{
		tb=new TestBaseCucumber();
		po=new PageObjectManager(tb.launchDriver());
	}

}
