package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CommercialSalePage;
import utils.BaseDriver;


public class CommercialTest{
	WebDriver driver;

	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\library\\chromedriver.exe");
		driver = new ChromeDriver();//open chrome browser
		driver.get("http://www.zoopla.co.uk/");//open zoopla 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the window
	

	}

	@Test
	public void f() {

		CommercialSalePage cp = new CommercialSalePage(driver);//creating object
		cp.enterValuescomm("Portsmouth", "Offices", "Square feet", "200 ft²", "500 ft²", "£10,000", "£30,000");
		Assert.assertTrue(cp.getResult().equalsIgnoreCase("Offices for sale near Portsmouth"),
				"my test case failed reason text dint matched");
	}

	@AfterMethod
	public void afterTest() {
	driver.quit();//close chrome browser
	}
}
