package stepdefinitions;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ExtentManager;
import utilities.JsonReader;
import utilities.Webdriver;
import utilities.utils;

public class Hooks {
	
	WebDriver driver;
	utils utilities= new utils();
	JSONObject data;
	ExtentManager reporter= new ExtentManager();
	ExtentReports report= ExtentManager.getReport();
	
	@Before
	public void setup(Scenario scenario) throws IOException, ParseException {
		JsonReader.setData();
		data= JsonReader.getData();
		report.createTest(scenario.getName());
	}
	
	@After
	public void tearDown() {
		driver= Webdriver.getDriver();
		driver.quit();
		report.flush();
	}
	
}