package runners;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.vimalselvam.cucumber.listener.Reporter;

//import com.vimalselvam.cucumber.listener.Reporter;
//import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
//import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/ShopPage.feature"
		,glue={"stepDefinitons"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/RunCuke/cucumber.html","pretty"},
		monochrome = true
		)
public class HomePageRunner {
	
}
