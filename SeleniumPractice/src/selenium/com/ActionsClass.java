package selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		WebElement enterText = driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(enterText).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		//Moving Mouse to Particular Element
//		WebElement move = driver.findElement(By.id("nav-link-accountList"));
//		act.moveToElement(move).build().perform();
	}

}
