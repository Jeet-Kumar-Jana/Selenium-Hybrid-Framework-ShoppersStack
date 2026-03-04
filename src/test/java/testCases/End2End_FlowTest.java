package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import base.BrowserSetup;
import pages.ShopperLoginPage;
import pages.ShopperRegistrationPage;

public class End2End_FlowTest extends BrowserSetup {
	
	String randomEmail = "jeet"+RandomStringUtils.randomAlphanumeric(3)+"@gmail.com";
	
	@Test (priority = 1)
	public void shopperRegistrationTest() {
		driver.get("https://www.shoppersstack.com/signup");
		
		ShopperRegistrationPage obj = new ShopperRegistrationPage(driver);
		
		obj.register("Jeet", "Jana", "9002029204", randomEmail, "Jeet@123");
	}
	
	@Test (priority = 2, dependsOnMethods = "shopperRegistrationTest")
	public void shopperLoginTest() {
		driver.get("https://www.shoppersstack.com/user-signin");
		
		ShopperLoginPage obj = new ShopperLoginPage(driver);
		
		obj.shopperLogin(randomEmail, "Jeet@123");
		
		
	}
}