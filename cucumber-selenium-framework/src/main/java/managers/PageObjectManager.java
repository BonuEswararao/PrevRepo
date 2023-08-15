package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.ShopPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private ShopPage shopPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
	}
	
	public HomePage getHomePage() {
		return (homePage==null)? homePage = new HomePage(driver) : homePage;
	}
	
	public ShopPage getShopPage() {
		return (shopPage==null)? shopPage = new ShopPage(driver) : shopPage;
	}
}
