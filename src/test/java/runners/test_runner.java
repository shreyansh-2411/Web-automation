package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/resources/features/", glue= "stepdefinitions", tags="@windows_01")
public class test_runner extends AbstractTestNGCucumberTests {
	
}