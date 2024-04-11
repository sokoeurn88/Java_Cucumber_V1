package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	//class constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email") 
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(id = "input-password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[contains(text(), 'Login')]")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath = "//a[contains(text(), 'Logout')][1]")
	@CacheLookup
	WebElement lnklogout;
	
	//create each method for each webelement for operations
	public void setUserName(String uname) {
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
	
	public void clickLogout() {
		lnklogout.click();
	}

}
