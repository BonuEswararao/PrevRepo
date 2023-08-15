package stepDefinitons;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContext testContext;

	public Hooks(TestContext context) {
		
		
		this.testContext = context;
	}
	
	@Before
	public void setUp() {
		System.out.println("****************This will Run Before every Scenario**********************");
	}

	@After
	public void tearDown() {
		testContext.getWebDriverManager().closeDriver();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName()); 
		}
		
	}
}
