package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Webdriver;

public class HomePage {
	
	WebDriver driver= Webdriver.getDriver();
	
	public By productsHeading= By.xpath("//span[text()=\"Products\"]");
}