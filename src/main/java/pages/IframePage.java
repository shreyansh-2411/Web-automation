package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Webdriver;

public class IframePage {
	
	WebDriver driver= Webdriver.getDriver();
	
	public By iframeUrl= By.id("url-search");
	public By renderIframe= By.xpath("//button[text()=\"Render iframe\"]");
	public By iframe= By.id("iframe-window");
	
}