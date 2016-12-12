package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawMapSalePage {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='mn-buy']/div/ul[2]/li[2]/a")
	WebElement clkdrawlink;
	
	@FindBy(id = "location")
	WebElement eleSearchLocation;
	@FindBy(id = "maps-promo-button")
	WebElement eleMyArea;
	public DrawMapSalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clkdraw() {
		clkdrawlink.click();
	}
	
	public void searchLoc(String locname) {
		eleSearchLocation.sendKeys(locname);
		eleSearchLocation.sendKeys(Keys.TAB);
	}
	public void defineMyArea(){
		eleMyArea.click();
	}

public void enterValuesdrawmap(String loc){
	mouse();
	clkdraw();
	searchLoc(loc);
	defineMyArea();
	
	
}
public void mouse(){
	  WebElement ele=driver.findElement(By.linkText("For sale"));
	  Actions a=new Actions(driver);
	  a.moveToElement(ele).build().perform();
}



}
