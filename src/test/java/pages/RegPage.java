package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegPage {
	WebDriver driver;
	@FindBy(linkText="Sign in")
	WebElement clkSignin;

	@FindBy(id = "signin_register_tab_register")
	WebElement eleRegisterlink;

	@FindBy(id = "register_email")
	WebElement eleEmail;

	@FindBy(id = "register_email_confirm")
	WebElement eleCEmail;
	
	@FindBy(id = "register_password")
	WebElement elepwd;
	

	@FindBy(id = "sender_property_status")
	WebElement eleAboutMe;

	@FindBy(id = "register_submit")
	WebElement eleRegButton;
	@FindBy(id = "fancybox-close")
	WebElement eleclose;
	
	

	// constructor
	public RegPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIn(){
		clkSignin.click();
	}
	public void Register(){
		eleRegisterlink.click();
	}
public void email(String email){
	eleEmail.sendKeys(email);
}
public void cEmail(String cemail){
	eleCEmail.sendKeys(cemail);
}
	public void password(String pwd){
		elepwd.sendKeys(pwd);
}
public void aboutMe(String value){
	new Select(eleAboutMe).selectByVisibleText(value);
}
public void clilckRegister(){
	eleRegButton.click();
}
public void close(){
	eleclose.click();
}
public void Registration(String email,String cemail,String pwd,String aboutme){
	signIn();
	Register();
	email(email);
	cEmail(cemail);
	password(pwd);
	aboutMe(aboutme);
	clilckRegister();
	close();
}
}
