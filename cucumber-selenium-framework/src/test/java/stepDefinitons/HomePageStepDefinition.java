package stepDefinitons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import managers.FileReaderManager;
import pageObjects.HomePage;

public class HomePageStepDefinition {

	TestContext testContext;
	HomePage homePage;
	WebDriver driver;

	public HomePageStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		homePage = testContext.getPageObjectManager().getHomePage();
		driver = testContext.getWebDriverManager().getDriver();
	}

	@Given("the user launches the application")
	public void the_user_launches_the_application() {
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
	}

	@When("user enters name {string}")
	public void user_enters_name(String name) {
		homePage.enter_name(name);
	}

	@When("user enters email {string}")
	public void user_enters_email(String email) {
		homePage.enter_email(email);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		homePage.enter_password(password);
	}

	@When("user selects gender {string}")
	public void user_selects_gender(String genderType) {
		homePage.select_gender(genderType);

	}

	@When("user selects employment Status {string}")
	public void user_selects_employment_status(String employment) {
		homePage.select_employmentStatus(employment);
	}

	@When("user enters dob {string}")
	public void user_enters_dob(String dob) {
		homePage.enter_dob(dob);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		homePage.submitBtn();
	}

	@Then("mesage should be displayed as {string}")
	public void mesage_should_be_displayed_as(String message) {
		String text = homePage.messageText();
		boolean textVerification = text.contains(message);
		System.out.println(text);
		Assert.assertTrue(textVerification);

	}

}
