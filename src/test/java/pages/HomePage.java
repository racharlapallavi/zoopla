package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="For sale")
	WebElement clkForsalelink;

	@FindBy(linkText="To rent")
	WebElement clkToRentlink;
	@FindBy(linkText="House prices")
	WebElement clkHousePriceslink;

	@FindBy(linkText="New homes")
	WebElement clknewHomeslink;

	@FindBy(linkText="Commercial")
	WebElement clkcommerciallink;

	@FindBy(linkText="Overseas")
	WebElement clkoverseaslink;
	
	@FindBy(id="mn-invest")
	WebElement clkinvestlink;
	
	@FindBy(linkText="Property news")
	WebElement clkpropnewslink;
	
	@FindBy(linkText="Agents")
	WebElement clkAgentslink;

	// constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clkForsale(){
		clkForsalelink.click();
	}
	public void clkToRent(){
		clkToRentlink.click();
	}
	public void clkHousePrices(){
		clkHousePriceslink.click();
	}
	public void clknewHomes(){
		clknewHomeslink.click();
	}
	public void clkcommercial(){
		clkcommerciallink.click();
	}
	
	public void clkoverseas(){
		clkoverseaslink.click();
	}
	public void clkinvest(){
		clkinvestlink.click();
	}
	
	public void clkpropnews(){
		clkpropnewslink.click();
	}public void clkAgents(){
		clkAgentslink.click();
	}
	public void homelinks() throws Exception{
		clkForsale();
		clkToRent();
		clkHousePrices();
		clknewHomes();
		clkcommercial();
		clkoverseas();
		clkinvest();
		clkAgents();
		clkpropnews();
		
		Thread.sleep(2000);
		
		
	}
	

}
