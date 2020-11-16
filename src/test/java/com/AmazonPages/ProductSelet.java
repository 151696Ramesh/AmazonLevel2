package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSelet {

	WebDriver driver;
	By Samsung_Galaxy_M51 = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
	By addtocart = By.xpath("//*[@id=\"add-to-cart-button\"]");
	
	public ProductSelet(WebDriver driver) {
		this.driver= driver;
		
	}
	public void itemselet() {
		driver.findElement(Samsung_Galaxy_M51).click();
	}
	public void add() {
		driver.findElement(addtocart);
		
	}
}
