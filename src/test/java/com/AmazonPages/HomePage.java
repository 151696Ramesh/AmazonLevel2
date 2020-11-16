package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By hamburger_menu = By.xpath(" //*[@id=\"nav-hamburger-menu\"]");
	By MouseHover =By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a"); 
	By submenu= By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[3]/a");
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		
	}
	public void ClickhAmburgerMenu() throws Exception {
		driver.findElement(hamburger_menu).click();
		Thread.sleep(3000);
	}
public void ClickToMainMenu() throws Exception {
		driver.findElement(MouseHover).click();
		Thread.sleep(2000);
	}
public void ClickToSubMenu() throws Exception {
	driver.findElement(submenu).click();
	Thread.sleep(3000);
	
}

}
