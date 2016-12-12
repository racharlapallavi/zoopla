package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ToRentPage {
	WebDriver driver;
	@FindBy(id = "search-tabs-to-rent")
	WebElement eleToRent;

	@FindBy(id = "search-input-location")
	WebElement eleSearchLocation;

	@FindBy(id = "rent_price_min_per_month")
	WebElement eleMinPrice;

	@FindBy(id = "rent_price_max_per_month")
	WebElement eleMaxPrice;

	@FindBy(id = "property_type")
	WebElement elePropertyType;

	@FindBy(id = "search-submit")
	WebElement eleSearch;

	@FindBy(css = "a[title='Grid view'] ")
	WebElement eleGridView;

	@FindBy(css = "a[title='Map view']")
	WebElement eleMapView;

	// constructor
	public ToRentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void rent() {
		eleToRent.click();
	}

	public void searchLoc(String locname) {
		eleSearchLocation.sendKeys(locname);
		eleSearchLocation.sendKeys(Keys.TAB);
	}

	public void minPrice(String minprice) {
		new Select(eleMinPrice).selectByValue(minprice);;
		
	}

	public void maxPrice(String maxprice) {
		new Select(eleMaxPrice).selectByValue(maxprice);
		
	}

	public void propertyType(String type) {
		new Select(elePropertyType).selectByVisibleText(type);
		
	}

	public void searchButton() throws Exception {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(eleSearch));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#search-submit').click()");

	}

	public void clickGridView() throws Exception {
		 Thread.sleep(2000);
		 eleGridView.click();
	}

	public void clickMapView() throws Exception {
		// Thread.sleep(2000);
		eleMapView.click();
	}

	public void toRentData(String locname,String minprice,String maxprice,String type) throws Exception {
		rent();
		searchLoc(locname);
		minPrice(minprice);
		maxPrice(maxprice);
		propertyType(type);
		searchButton();
		clickMapView();
       clickGridView();
	}

}
