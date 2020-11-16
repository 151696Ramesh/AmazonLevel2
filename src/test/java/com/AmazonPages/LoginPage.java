package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By clcik = By.tagName("Hello, Sign in");
	By Emailorphonenumber = By.xpath("//*[@id=\"ap_email\"]");
	By conti = By.id("continue");
	By pasw = By.id("ap_password");
	By login = By.id("signInSubmit");
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
public void mobile_phone_number(String mnumber) {
		driver.findElement(Emailorphonenumber).sendKeys(mnumber);
		
	}
public void nextcontinue() throws Exception {
		driver.findElement(conti).click();
		Thread.sleep(3000);
	}
public void loginpassword(String pas) {
	driver.findElement(pasw).sendKeys(pas);
}
public void clcikToLogin()throws Exception {
	driver.findElement(login).click();
	Thread.sleep(3000);
}
}
