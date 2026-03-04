package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BrowserSetup;

public class ShopperLoginPage extends BrowserSetup {
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;
	
	public ShopperLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void shopperLogin(String email, String password) {
		
		expliciteWait(this.email);
		
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		loginBtn.click();
	}

}
