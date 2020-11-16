package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Paymoney {

	WebDriver driver;
	By proceedtoby = By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");

	public  Paymoney(WebDriver driver) {
		this.driver=driver;
		
	}
	public void paynow() {
		driver.findElement(proceedtoby).click();
		
	}
}
