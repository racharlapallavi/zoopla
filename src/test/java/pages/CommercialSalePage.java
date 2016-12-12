package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommercialSalePage {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='mn-buy']/div/ul[1]/li[3]/a")
	WebElement clkcommlink;

	@FindBy(id = "search-input-location")
	WebElement eleSearchLocation;
	@FindBy(id = "property_type")
	WebElement elePropertyType;
	@FindBy(id = "floor_area_units")
	WebElement eleUnits;
	@FindBy(id = "floor_area_min_sq_feet")
	WebElement eleminunits;
	@FindBy(id = "floor_area_max_sq_feet")
	WebElement elemaxunits;

	@FindBy(id = "forsale_price_min")
	WebElement eleMinPrice;

	@FindBy(id = "forsale_price_max")
	WebElement eleMaxPrice;
	@FindBy(id = "search-submit")
	WebElement eleSearch;
	@FindBy(css="div#content h1")
	WebElement eleResult;

	public CommercialSalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clkcomm() {
		clkcommlink.click();
	}

	public void searchLoc(String locname) {
		eleSearchLocation.sendKeys(locname);
		eleSearchLocation.sendKeys(Keys.TAB);
	}

	public void propertyType(String type) {
		new Select(elePropertyType).selectByVisibleText(type);

	}

	public void units(String units) {
		new Select(eleUnits).selectByVisibleText(units);
	}

	public void minunits(String minunits) {
		new Select(eleminunits).selectByVisibleText(minunits);
	}

	public void maxunits(String maxunits) {
		new Select(elemaxunits).selectByVisibleText(maxunits);
	}

	public void minPrice(String minprice) {
		new Select(eleMinPrice).selectByVisibleText(minprice);

	}

	public void maxPrice(String maxprice) {
		new Select(eleMaxPrice).selectByVisibleText(maxprice);

	}

	public void search() {
		eleSearch.click();
	}
	public String getResult(){
		return eleResult.getText();
		
		
	}

	public void enterValuescomm(String loc, String ptype, String units, String minu, String maxu, String min,
			String max) {
		mouse();
		clkcomm();
		searchLoc(loc);
		propertyType(ptype);
		units(units);
		minunits(minu);
		maxunits(maxu);
		minPrice(min);
		maxPrice(max);
		search();

	}

	public void mouse() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("For sale"))));
	    Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

	}

}
