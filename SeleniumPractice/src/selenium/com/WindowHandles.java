package selenium.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("openwindow")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> list = new ArrayList<String>(windowHandles);
	    System.out.println(list.size());
	    driver.switchTo().window(list.get(1));
	    System.out.println(driver.getCurrentUrl());
	    driver.switchTo().window(list.get(0));
	    System.out.println(driver.getCurrentUrl());
	}

}
