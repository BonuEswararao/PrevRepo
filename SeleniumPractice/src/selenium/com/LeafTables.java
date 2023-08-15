package selenium.com;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//eswara pottira//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		//Get the count of number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//tbody//tr//th"));
		System.out.println(columns.size());
		//Get the count of number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
		System.out.println(rows.size());
		//Get the progress value of 'Learn to interact with Elements'
		List<String> price;
		List<WebElement> rowsInteract = driver.findElements(By.xpath("//tr/td[1]"));
		price  = rowsInteract.stream().filter(x->x.getText().contains("Learn to interact with Elements")).map(x->getPrice(x)).collect(Collectors.toList());
		price.forEach(x->System.out.println(x));
		
		
		
	}
	private static String getPrice(WebElement x) {
		// TODO Auto-generated method stub
		String priceValue = x.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
