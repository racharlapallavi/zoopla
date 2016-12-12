package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseDriver {
	
	WebDriver driver;
	public void createDriver() {
	try {
		
		String path = System.getProperty("user.dir");
		PropertyUtil pus = new PropertyUtil(path + "\\src\\test\\java\\resources\\configuration.properties");
		String url = pus.getProperty("url");
		String grid = pus.getProperty("grid");
		String browser = pus.getProperty("browser");
		String gridUrl = pus.getProperty("gridUrl");

		if (browser.equalsIgnoreCase("firefox")) {
			if (grid.equalsIgnoreCase("true")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("firefox");
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
				driver = new RemoteWebDriver(new URL(gridUrl), cap);
			} else {
				driver = new FirefoxDriver();
			}  
		} else if (browser.equalsIgnoreCase("chrome")) {
		} else if (browser.equalsIgnoreCase("ie")) {
			
		}
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	} catch (Exception ex) {
	
}
}

}
