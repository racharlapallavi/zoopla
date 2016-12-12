package tests;

import org.testng.annotations.Test;

import pages.RegPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class RegTest {
	WebDriver driver;
	String email = getRandomString(5) + "@gmail.com";

	@Test
	public void f() {
		RegPage rp = new RegPage(driver);
		rp.Registration(email, email, "pkpkpk12", "I am looking to rent");

	}

	public static String getRandomString(int count) {
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterTest() {

		driver.quit();
	}

}
