package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(linkText="Sign in")
	WebElement clkSigninlink;

	@FindBy(id = "signin_email")
	WebElement eleEmail;

	@FindBy(id = "signin_password")
	WebElement elepwd;

	@FindBy(id = "signin_submit")
	WebElement eleSignin;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIn(){
		clkSigninlink.click();
	}
	
public void email(String email){
	eleEmail.sendKeys(email);
}
public void password(String pwd){
	elepwd.sendKeys(pwd);
}
public void clksignin(){
	eleSignin.click();	
}
public void login(String email,String pwd){
	signIn();
	email(email);
	password(pwd);
	clksignin();
	
	
}

}
