package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonAccount {

	WebDriver driver;
	By clcik = By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");
	By CreateAccount= By.id("createAccountSubmit");
	By username = By.id("ap_customer_name");
	By phonenumber = By.id("ap_phone_number");
	By email = By.name("secondaryLoginClaim");
	By password = By.name("password");
	By submite = By.xpath("//*[@id=\"continue\"]");
	
	public AmazonAccount(WebDriver driver) {
		this.driver= driver;
		
	}
	
public void NewAmazon() {
		driver.findElement(CreateAccount).click();
	}
public void Yourname() {
		driver.findElement(username).sendKeys("ramesh");
	}
public void Mobilenumber() {
	driver.findElement(phonenumber).sendKeys("9030838930");
}
public void Email() {
	driver.findElement(email).sendKeys("ramesh.sulthan1991@gmail.com");
}
public void Password() {
	driver.findElement(password).sendKeys("9030838930");
}
public void sub() {
	driver.findElement(submite).click();
}

}
