package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCategory {

	WebDriver driver;
	By Brands= By.name("s-ref-checkbox-Samsung");
	By Price = By.xpath("//*[@id=\"p_36/1318507031\"]/span/a/span");
	
	By NewArrivals= By.xpath("//*[@id=\"p_n_date_first_available_absolute/1318488031\"]/span/a/span");
	
	By ItemConditions= By.xpath("//*[@id=\"p_n_condition-type/8609960031\"]/span/a/span");
	
	
	
	//By Discount2 = By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span");
	
	By Seller= By.xpath("//*[@id=\"p_6/A28V9ODN1CMECW\"]/span/a/span");
	
	public ShopCategory(WebDriver driver) {
		this.driver= driver;
	}
	
	public void Brandsname() {
		driver.findElement(Brands).click();
	}
   public void NewArriv() {
		driver.findElement(NewArrivals).click();
	}
   public void NewItems() {
	driver.findElement(ItemConditions).click();
    }
   public void price() {
	   driver.findElement(Price).click();
	
    }
     
    public void Seller4() {
	driver.findElement(Seller).click();
   }
}
