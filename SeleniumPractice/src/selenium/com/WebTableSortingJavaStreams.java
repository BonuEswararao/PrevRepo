package selenium.com;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSortingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = list.stream().map(x->x.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//now assert two lists
		List<String> price;
		//scan the name column with getText -> Beans -> print the price of Beans
		
		
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price  = rows.stream().filter(x->x.getText().contains("Beans")).map(x->getPrice(x)).collect(Collectors.toList());
			price.forEach(x->System.out.println(x));
			if(price.size()<1) {
				 driver.findElement(By.cssSelector("[arial-label='Next']")).click();
			}
		}while(price.size()<1);
	}

	private static String getPrice(WebElement x) {
		// TODO Auto-generated method stub
		String priceValue = x.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
