package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ToRentPage;
import utils.BaseDriver;

public class ToRentTest {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		ToRentPage tr = new ToRentPage(driver);
		tr.toRentData("Portsmouth", "500", "2000", "Flats");

	}

	@BeforeMethod
	public void openURL() {
		driver = new FirefoxDriver();
		driver.get("http://www.zoopla.co.uk/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();

	}
}