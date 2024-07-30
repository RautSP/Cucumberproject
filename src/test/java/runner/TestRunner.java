package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/feature/",glue="stepdefination",plugin={"html:target/cucumberReport.html"},monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
