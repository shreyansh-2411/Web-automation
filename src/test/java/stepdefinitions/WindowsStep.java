package stepdefinitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import pages.WindowsPage;
import utilities.Webdriver;
import utilities.utils;

public class WindowsStep {
	
	WebDriver driver= Webdriver.getDriver();
	WindowsPage windowPage= new WindowsPage();
	utils utilities= new utils();
	
	@Given("working with windows in selenium")
	public void workingWithWindows() throws InterruptedException {
		Actions action= new Actions(driver);
		utilities.waitUntillElementIsClickable(driver, windowPage.linkedinLink, Duration.ofSeconds(5));
		action.scrollToElement(driver.findElement(windowPage.linkedinLink));
		driver.findElement(windowPage.linkedinLink).click();
		Set<String> windowHandles= driver.getWindowHandles();
		Iterator<String> windows= windowHandles.iterator();
		String parentWindow= windows.next();
		String childWindow= windows.next();
		driver.switchTo().window(childWindow);
		utilities.waitUntillElementIsClickable(driver, windowPage.closeLoginModal, Duration.ofSeconds(5));
		driver.findElement(windowPage.closeLoginModal).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		utilities.waitUntillElementIsClickable(driver, windowPage.backpackItem, Duration.ofSeconds(5));
		driver.findElement(windowPage.backpackItem).click();
		Thread.sleep(3000);
	}
	
}
