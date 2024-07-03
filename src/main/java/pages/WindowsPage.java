package pages;

import org.openqa.selenium.By;

public class WindowsPage {
	
	public By linkedinLink= By.xpath("//a[text()=\"LinkedIn\"]");
	public By closeLoginModal= By.xpath("//div[@id=\"base-contextual-sign-in-modal\"]/div/section/button/icon");
	public By backpackItem= By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
}