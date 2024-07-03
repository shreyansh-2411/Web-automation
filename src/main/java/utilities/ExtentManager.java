package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ThreadLocal<ExtentReports> report= new ThreadLocal<>();
	
	public static void setReport(ExtentReports report) {
		ExtentManager.report.set(report);
	}
	
	public static ExtentReports getReport() {
		return report.get();
	}
	
	public ExtentManager(){
		ExtentReports extentReports= new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("src/test/resources/reports");
		spark.config().setDocumentTitle("TEST REPORT");
		spark.config().setTheme(Theme.DARK);
		extentReports.attachReporter(spark);
		ExtentManager.setReport(extentReports);
	}
}
