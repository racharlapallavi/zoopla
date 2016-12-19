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


public class CommercialTest extends BaseDriver{
	WebDriver driver;

	@BeforeMethod
	public void beforeTest() {
		createDriver();

	}

	@Test
	public void f() {
		
		CommercialSalePage cp = new CommercialSalePage(driver);//creating object
		cp.enterValuescomm("Portsmouth", "Offices", "Square feet", "200 ft²", "500 ft²", "£10,000", "£30,000");
		Assert.assertTrue(cp.getResult().equalsIgnoreCase("Offices for sale near Portsmouth"),
				"my test case failed reason text dint matched");//true
	}

	@AfterMethod
	public void afterTest() {
	driver.quit();//close chrome browser
	}
}
