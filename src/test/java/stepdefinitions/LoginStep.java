package stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import utilities.JsonReader;
import utilities.Webdriver;
import utilities.utils;

public class LoginStep {

	WebDriver driver;
	LoginPage loginPage= new LoginPage();
	HomePage homePage= new HomePage();
	utils utilities= new utils();
	JSONObject data= JsonReader.getData();

	@Given("User launches the website on browser")
	public void launchWebsite() {
		Webdriver.setDriver((String)data.get("browser"));
		driver= Webdriver.getDriver();
		driver.get((String)data.get("url"));
		driver.manage().window().maximize();
	}
	
	@Given("User logs into the website with account {int}")
	public void loginAction(int a) {
		utilities.waitUntillElementIsDisplayed(driver, loginPage.loginCreds, Duration.ofSeconds(5));
		String login_credential= driver.findElement(loginPage.loginCreds).getText();
		List<String> login_credentials= utilities.convertStringToArrayOfStringByNewLine(login_credential);
		utilities.waitUntillElementIsDisplayed(driver, loginPage.loginPass, Duration.ofSeconds(5));
		String login_password= driver.findElement(loginPage.loginPass).getText();
		List<String> login_passwords= utilities.convertStringToArrayOfStringByNewLine(login_password);
		utilities.waitUntillElementIsClickable(driver, loginPage.inputUsername, Duration.ofSeconds(5));
		driver.findElement(loginPage.inputUsername).sendKeys(login_credentials.get(a));
		utilities.waitUntillElementIsClickable(driver, loginPage.inputPassword, Duration.ofSeconds(5));
		driver.findElement(loginPage.inputPassword).sendKeys(login_passwords.get(1));
		utilities.waitUntillElementIsClickable(driver, loginPage.btnLogin, Duration.ofSeconds(5));
		driver.findElement(loginPage.btnLogin).click();
	}
	
	@Then("user should land on logged in home page")
	public void loggedInHomePageIsDisplayed() {
		utilities.waitUntillElementIsDisplayed(driver, homePage.productsHeading, Duration.ofSeconds(5));
	}
	
	@Then("Error message for locked out user should be displayed")
	public void errorMessageLockedOutUser() throws IOException, ParseException {
		utilities.waitUntillElementIsDisplayed(driver, loginPage.lockedOutError, Duration.ofSeconds(5));
	}
}