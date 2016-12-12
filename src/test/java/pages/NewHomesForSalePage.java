package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewHomesForSalePage {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='mn-buy']/div/ul[1]/li[2]/a")
	WebElement clknewhomelink;
	
	@FindBy(id = "search-input-location")
	WebElement eleSearchLocation;

	@FindBy(id="forsale_price_min")
	WebElement eleMinPrice;

	@FindBy(id = "forsale_price_max")
	WebElement eleMaxPrice;

	@FindBy(id = "property_type")
	WebElement elePropertyType;
	
	@FindBy(id = "beds_min")
	WebElement eleBedRooms;

	@FindBy(id = "search-submit")
	WebElement eleSearch;

	

	public NewHomesForSalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clknewhome() {
		clknewhomelink.click();
	}
	
	public void searchLoc(String locname) {
		
	
		eleSearchLocation.sendKeys(locname);
		eleSearchLocation.sendKeys(Keys.TAB);
	}

	public void minPrice(String minprice) {
		new Select(eleMinPrice).selectByVisibleText(minprice);
		
	}

	public void maxPrice(String maxprice) {
		new Select(eleMaxPrice).selectByVisibleText(maxprice);
		
	}

	public void propertyType(String type) {
		new Select(elePropertyType).selectByVisibleText(type);
		
	}
	public void BedRooms(String brooms){
		new Select(eleBedRooms).selectByVisibleText(brooms);
	}
	public void search(){
		eleSearch.click();
	}

public void enterValuesForSale(String loc,String min,String max,String ptype,String rooms){
	mouse();
	clknewhome();
	searchLoc(loc);
	minPrice(min);
	maxPrice(max);
	propertyType(ptype);
	BedRooms(rooms);
	search();
	
	
}
public void mouse(){
	  WebElement ele=driver.findElement(By.linkText("For sale"));
	  Actions a=new Actions(driver);
	  a.moveToElement(ele).build().perform();
}

}
