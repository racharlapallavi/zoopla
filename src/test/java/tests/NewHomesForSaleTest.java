package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NewHomesForSalePage;

public class NewHomesForSaleTest {
	WebDriver driver;
	 
  @Test
  public void f() {
	  NewHomesForSalePage np=new NewHomesForSalePage(driver);
	  np.enterValuesForSale("Portsmouth","£10,000","£30,000","Flats","2+");
  }
 
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\library\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.zoopla.co.uk");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }
}
