package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="name")
	private WebElement name;
	
	@FindBy(how=How.NAME, using="email")
	private WebElement email;
	
	@FindBy(how=How.ID, using="exampleInputPassword1")
	private WebElement password;
	
	@FindBy(how=How.ID , using="exampleFormControlSelect1")
	private WebElement gender;
	
	@FindAll(@FindBy(how=How.XPATH, using="//input[@type='radio']"))
	private List<WebElement> employmentStatus;
	
	@FindBy(how=How.NAME, using="bday")
	private WebElement dateOfBirth;
	
	@FindBy(how=How.XPATH, using="//input[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(how=How.XPATH, using="//div[@class='alert alert-success alert-dismissible']")
	private WebElement message;
	
	public void enter_name(String userName) {
		name.sendKeys(userName);
	}
	
	public void enter_email(String emailId) {
		email.sendKeys(emailId);
	}
	
	public void enter_password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void select_gender(String genderType) {
		Select select = new Select(gender);
		if(genderType.equalsIgnoreCase("Male")) select.selectByVisibleText("Male");
		else select.selectByVisibleText("Female");
	}
	
	public void select_employmentStatus(String employment) {
		if( employment.equalsIgnoreCase("Student")) {
			employmentStatus.get(0).click();
		}
		else if (employment.equalsIgnoreCase("Employed")) {
			employmentStatus.get(1).click();
		}else {
			
		}
	}
	
	public void enter_dob(String dob) {
		dateOfBirth.sendKeys(dob);
	}
	
	public void submitBtn() {
		submitBtn.click();
	}
	
	public String messageText() {
		return message.getText();
	}
}
