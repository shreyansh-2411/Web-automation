package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.IframePage;
import utilities.JsonReader;
import utilities.Webdriver;
import utilities.utils;

public class IframeStep {
	
	WebDriver driver= Webdriver.getDriver();
	utils utilities= new utils();
	IframePage iframePage= new IframePage();
	JsonReader reader= new JsonReader();
	JSONObject data;
	
	@Given("working with iframes")
	public void workingWithFrames() throws IOException, ParseException, InterruptedException {
		utilities.waitUntillElementIsClickable(driver, iframePage.iframeUrl, Duration.ofSeconds(5));
		data= JsonReader.getData();
		driver.findElement(iframePage.iframeUrl).sendKeys((String)data.get("url"));
		utilities.waitUntillElementIsClickable(driver, iframePage.renderIframe, Duration.ofSeconds(5));
		driver.findElement(iframePage.renderIframe).click();
		utilities.waitUntillElementIsClickable(driver, iframePage.iframe, Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(iframePage.iframe));
		utilities.waitUntillElementIsClickable(driver, iframePage.iframeUrl, Duration.ofSeconds(5));
		driver.findElement(iframePage.iframeUrl).sendKeys((String)data.get("url"));
		utilities.waitUntillElementIsClickable(driver, iframePage.renderIframe, Duration.ofSeconds(5));
		driver.findElement(iframePage.renderIframe).click();
		utilities.waitUntillElementIsClickable(driver, iframePage.iframe, Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(iframePage.iframe));
		utilities.waitUntillElementIsClickable(driver, iframePage.iframeUrl, Duration.ofSeconds(5));
		driver.findElement(iframePage.iframeUrl).sendKeys((String)data.get("url"));
		driver.switchTo().parentFrame();
		utilities.waitUntillElementIsClickable(driver, iframePage.iframeUrl, Duration.ofSeconds(5));
		driver.findElement(iframePage.iframeUrl).sendKeys("test");
		Thread.sleep(5000);
	}
}
