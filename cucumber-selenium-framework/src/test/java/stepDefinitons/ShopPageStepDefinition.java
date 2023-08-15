package stepDefinitons;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pageObjects.HomePage;
import pageObjects.ShopPage;

public class ShopPageStepDefinition {
	
	TestContext testContext;
	HomePage homePage;
	ShopPage shopPage;
	WebDriver driver;
	
	public ShopPageStepDefinition(TestContext testContext) {
		this.testContext = testContext;
		homePage = testContext.getPageObjectManager().getHomePage();
		shopPage = testContext.getPageObjectManager().getShopPage();
		driver = testContext.getWebDriverManager().getDriver();
	}
	
	
@Given("the user launches the applications")
public void the_user_launches_the_applications(){
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
}

@When("user redirects to shop Page")
public void user_redirects_to_shop_Page() {
	   shopPage.clikOnShopBtn();

}


@When("adds Products {string} and no of times {string} total cart value {string} Order Value {string}")
public void adds_products_and_no_of_times_total_cart_value_order_value(String productNames, String noOfProducts, String totalCartValue, String orderValue) throws InterruptedException{
	shopPage.adding_items(productNames, noOfProducts, totalCartValue, orderValue);
	shopPage.clickOnCheckoutBtn();
	shopPage.clickOnCheckoutBtn_2();
	  
	shopPage.select_country();
	   Thread.sleep(10000);
}
@Then("place the order")
public void place_the_order() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}