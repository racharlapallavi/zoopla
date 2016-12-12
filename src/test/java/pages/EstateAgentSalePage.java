package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EstateAgentSalePage {
WebDriver driver;

    @FindBy(xpath=".//*[@id='mn-buy']/div/ul[1]/li[4]/a")
    WebElement clkestatelink;
	@FindBy(id = "search-input-location")
	WebElement eleSearchLocation;
	@FindBy(id = "radius")
	WebElement eleRadius;
	@FindBy(id = "search-input-company")
	WebElement eleAgentName;
	@FindBy(id = "search-submit")
	WebElement eleSearch;//hello//kranthi

	public EstateAgentSalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clkestate() {
		clkestatelink.click();
	}
	
	public void searchLoc(String locname) {
		eleSearchLocation.sendKeys(locname);
		eleSearchLocation.sendKeys(Keys.TAB);
	}
	public void Radius(String radius) {
		new Select(eleRadius).selectByVisibleText(radius);
		
	}
public void AgentName(String aname ){
	eleAgentName.sendKeys(aname);
}
	
	public void search(){
		eleSearch.click();
	}

public void enterValuesestate(String loc,String radius,String name){
	mouse();
	clkestate();
	searchLoc(loc);
	Radius(radius);
	AgentName(name);
	search();
	
	
}
public void mouse(){
	  WebElement ele=driver.findElement(By.linkText("For sale"));
	  Actions a=new Actions(driver);
	  a.moveToElement(ele).build().perform();
}


}


