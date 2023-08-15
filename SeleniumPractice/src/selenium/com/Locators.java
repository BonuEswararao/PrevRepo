package selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Eswar");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacad");
		//driver.findElement(By.cssSelector("input[type*='pass']")).click(); //
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Eswar");
		driver.findElement(By.xpath("input[placeholder='Email']")).sendKeys("eswar@bonu");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8939107812");
		driver.findElement(By.cssSelector(".rest-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.close();
		
	}

}
