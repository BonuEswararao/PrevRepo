package selenium.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("http://3.110.88.201/dropdownsPractise/");
//		WebElement element = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(element);
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(ele);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option: allOptions) {
			System.out.println(option.getText());
		}
	}

}
