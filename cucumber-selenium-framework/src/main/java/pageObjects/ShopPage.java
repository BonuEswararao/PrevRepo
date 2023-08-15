package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
	
	public ShopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Shop")
	private WebElement shop;
	
	@FindAll(@FindBy(how=How.XPATH, using="//button[@class='btn btn-info']"))
	private List<WebElement> btns;
	
	@FindBy(how=How.XPATH , using="//a[@class='nav-link btn btn-primary']")
	private WebElement checkoutBtn;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-success']")
	private WebElement checkoutBtn2;
	
	@FindBy(how=How.ID, using="country")
	private WebElement countryField;
	
	@FindAll(@FindBy(how=How.XPATH, using="//div[@class='suggestions']//following-sibling::a"))
	private List<WebElement> countryValue;
	public void clikOnShopBtn() {
		shop.click();
	}
	
	public void adding_items(String productNames, String noOfProducts, String totalCartValue, String orderValue) {
		String[] products = productNames.split(",");
		List<String> listOfProducts = Arrays.asList(products);
		String[] count = noOfProducts.split(",");
		List<String> listOfCounts = Arrays.asList(count);
		add_product(listOfProducts, listOfCounts);
	}
	
	public void add_product(List<String> listOfProducts, List<String> listOfCounts) {
		for(String productName : listOfProducts) {
			if(productName.equalsIgnoreCase("iphone X")) {	
				int size = Integer.valueOf(listOfCounts.get(0));
				for(int i=0; i<size; i++) {
					btns.get(0).click();
				}
			
			} else if(productName.equalsIgnoreCase("Samsung Note 8")) {
				int size = Integer.valueOf(listOfCounts.get(1));
				for(int i=0; i<size; i++) {
					btns.get(1).click();
				}
			}
			else if(productName.equalsIgnoreCase("Nokia Edge")) {
				int size = Integer.valueOf(listOfCounts.get(2));
				for(int i=0; i<size; i++) {
					btns.get(2).click();
				}
			}
			else if(productName.equalsIgnoreCase("Blackberry")) {
				int size = Integer.valueOf(listOfCounts.get(3));
				for(int i=0; i<size; i++) {
					btns.get(3).click();
				}
			}
		}
	}
	
	public void numberOfTimesAdding() {
		
	}
	
	public void clickOnCheckoutBtn() {
		checkoutBtn.click();
	}
	
	public void clickOnCheckoutBtn_2() {
		checkoutBtn2.click();
	}
	
	public void select_country() throws InterruptedException {
		countryField.sendKeys("india");
		
		Thread.sleep(5000);
		System.out.println(countryValue.size());
		countryValue.get(0).click();
		
	}

}
