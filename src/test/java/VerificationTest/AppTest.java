package VerificationTest;

import java.lang.System.Logger;
import java.util.logging.*; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.AmazonPages.AmazonAccount;
import com.AmazonPages.ForgotPassword;
import com.AmazonPages.HomePage;
import com.AmazonPages.LoginPage;
import com.AmazonPages.ProductSelet;
import com.AmazonPages.ShopCategory;



public class AppTest {
	static WebDriver driver;
	@BeforeClass 
	public void openbrowser() {
		try {
		System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")).click();
		} catch (Exception e) {
            e.printStackTrace();
        }
       
	}
	/**
	  @throws Exception 
	 * @Test(priority=1)
	   public void CreateNewAccount() {
		
		AmazonAccount aa= new AmazonAccount(driver);
		
		aa.NewAmazon();
		aa.Yourname();
		aa.Mobilenumber();
		aa.Email();
		aa.Password();
		aa.sub();
	   }
	   */
		@Test(priority=2)
		public void AmazonLogin() throws Exception {
			LoginPage lp= new LoginPage(driver);
			
			lp.mobile_phone_number("9030838930");
			lp.nextcontinue();
			lp.loginpassword("9030838930");
			lp.clcikToLogin();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Assert.assertTrue(true);
			
		
			HomePage hp= new HomePage(driver);
			hp.ClickhAmburgerMenu();
			hp.ClickToMainMenu();
			hp.ClickToSubMenu();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Assert.assertTrue(true);
			
			ShopCategory sc= new ShopCategory(driver);
			sc.Brandsname();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			sc.NewArriv();
			sc.NewItems();
			sc.price();
			//sc.Discount2();
			sc.Seller4();
			ProductSelet ps= new ProductSelet(driver);
			ps.itemselet();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ps.add();
			
			
		}
		 /**
		@Test(priority=3)
		public void AmazonForgotPassword() {
			ForgotPassword fp= new ForgotPassword(driver);
			fp.sign();
			fp.mobile_phone_number();
			fp.gotoconti();
			fp.ForgetPassword();
			fp.Enternumber();
			fp.gointoOTP();
		}
		*/
	
}
