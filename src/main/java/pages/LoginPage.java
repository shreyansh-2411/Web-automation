package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Webdriver;

public class LoginPage {
	
	WebDriver driver= Webdriver.getDriver();
	
	public By inputUsername= By.id("user-name");
	public By inputPassword= By.id("password");
	public By btnLogin= By.name("login-button");
	public By loginCreds= By.id("login_credentials");
	public By loginPass= By.className("login_password");
	public By lockedOutError= By.xpath("//h3[text()=\"Epic sadface: Sorry, this user has been locked out.\"]");
	
}