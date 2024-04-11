package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class steps {
	public WebDriver driver;
	public LoginPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers.chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("click login")
	public void click_login() {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("No match for E-Mail and/or Password.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("user clicks logout link")
	public void user_clicks_logout_link() {
		lp.clickLogout();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}

}
