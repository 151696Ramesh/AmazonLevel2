package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

	
	WebDriver driver;
	By clcik = By.xpath("//*[@id=\"nav-link-accountList\"]/div");
	By Emailorphonenumber1 = By.id("ap_email");
	By nextconit = By.id("continue");
	By forgot = By.id("auth-fpp-link-bottom");
	By enterMobilnumber = By.id("ap_email");
	By conit = By.id("continue");
	
	public ForgotPassword(WebDriver driver) {
		this.driver= driver;
	}
	
	public void sign() {
		driver.findElement(clcik).click();
	}
	public void mobile_phone_number() {
		driver.findElement(Emailorphonenumber1).sendKeys("9030838930");
	}
	public void gotoconti() {
		driver.findElement(nextconit).click();
	}
	public void ForgetPassword() {
		driver.findElement(forgot).click();
	}
	public void Enternumber() {
		driver.findElement(enterMobilnumber).sendKeys("9030838930");
	}
	public void gointoOTP() {
		driver.findElement(conit).click();
	}
}
