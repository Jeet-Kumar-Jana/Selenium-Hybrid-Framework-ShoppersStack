package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BrowserSetup;


public class ShopperRegistrationPage extends BrowserSetup {
	
	private WebDriver driver;
	

	@FindBy(id = "First Name")
	private WebElement firstName;
	
	@FindBy(id = "Last Name")
	private WebElement lastName;
	
	@FindBy(id = "Male")
	private WebElement male;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id = "Email Address")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "Confirm Password")
	private WebElement confirmPassword;
	
	@FindBy(id = "Terms and Conditions")
	private WebElement tAndC;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerBtn;
	
	
	public ShopperRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void register(String fName, String lName, String phone, String mail, String pass) {
		
		expliciteWait(firstName);
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		male.click();
		phoneNumber.sendKeys(phone);
		email.sendKeys(mail);
		password.sendKeys(pass);
		confirmPassword.sendKeys(pass);
		tAndC.click();
		registerBtn.click();
		
	}
}
