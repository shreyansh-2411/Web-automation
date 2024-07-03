package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;

public class Webdriver {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static void setDriver(String name) {
		switch (name) {
		case ("chrome"):
			driver.set(new ChromeDriver());
			break;
		case ("firefox"):
			driver.set(new FirefoxDriver());
			break;
		default:
			driver.set(new ChromeDriver());
		}
	}

	public static WebDriver getDriver() {
		return driver.get();
	}
	
	@After
	public static void tearDown() {
		driver.get().close();
		driver.remove();
	}

}
