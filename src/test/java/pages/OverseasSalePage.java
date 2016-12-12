package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OverseasSalePage {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='mn-buy']/div/ul[2]/li[3]/a")
	WebElement clkOverseaslink;
	@FindBy(xpath=".//*[@id='search_input_location_overseas_chzn']/a/div/b")
	WebElement btnarrow;
	
	@FindBy(xpath=".//*[@id='search_input_location_overseas_chzn']/div/div/input")
	WebElement eleSearchCountry;
	
	@FindBy(id ="search-submit" )
	WebElement eleSearch;
	
	public OverseasSalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clkoverseas() {
		clkOverseaslink.click();
	}
	
	public void searchLoc(String locname) {
		btnarrow.click();
		eleSearchCountry.sendKeys(locname);
		eleSearchCountry.sendKeys(Keys.TAB);
	}
	public void search(){
		eleSearch.click();
	}

public void enterValueOverseas(String loc){
	mouse();
		clkoverseas();
		

	searchLoc(loc);
	search();
	
	
}
public void mouse(){
	  WebElement ele=driver.findElement(By.linkText("For sale"));
	  Actions a=new Actions(driver);
	  a.moveToElement(ele).build().perform();
}



}
