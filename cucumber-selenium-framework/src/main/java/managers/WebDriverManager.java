package managers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	//private static String hubAddress = "http://192.168.1.9:4444";
	private static String hubAddress = "http://localhost:4444";
	private static MutableCapabilities mutableCapabilities;
	private static ChromeOptions chromeOptions;
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
	}
	
	public WebDriver getDriver() {
		if(driver==null) driver= createDriver();
		return driver;
	}
	
	private WebDriver createDriver() {
		switch(environmentType) {
		case LOCAL : driver = createLocalDriver();
		break;
		case REMOTE : driver = createRemoteDriver();
		break;
		}
		
		return driver;
	}
	
	private WebDriver createLocalDriver() {
		switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
    		break;
        }

       // if(FileReaderManager.getInstance().getConfigFileReader().getBrowserWindowSize()) driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	
	}
	
	private WebDriver createRemoteDriver() {
		switch(driverType) {
		case CHROME : try {
				driver = new RemoteWebDriver(new URL(hubAddress),getChromeOptions());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception Occured while launching the Remote WebDriver");
				e.printStackTrace();
			}
		}
		return driver;
	}
	
	private MutableCapabilities getChromeOptions() {
		mutableCapabilities = new MutableCapabilities();
		chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("incognito");
		//mutableCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		mutableCapabilities.setCapability("browserName", "Chrome");
		mutableCapabilities.setCapability("browserVersion", "latest");
		return mutableCapabilities;
	}
	
	
	
	public void closeDriver() {
		driver.close();
		//driver.quit();
	}
}
