package utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils {

	public void waitUntillElementIsDisplayed(WebDriver driver, By element, Duration maxTime) {
		WebDriverWait wait = new WebDriverWait(driver, maxTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public void waitUntillElementIsClickable(WebDriver driver, By element, Duration maxTime) {
		WebDriverWait wait = new WebDriverWait(driver, maxTime);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public List<String> convertStringToArrayOfStringByNewLine(String str) {
		List<String> strList = new ArrayList<String>();
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '\n') {
				temp += str.charAt(i);
			} else {
				strList.add(temp);
				temp = "";
			}
		}
		strList.add(temp);
		return strList;
	}
}