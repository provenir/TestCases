package com.provenir.automation.framework.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.provenir.automation.framework.utility.TestDataReader;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.WebDriverSetUp;

public class TestCaseExecutor {

	private static WebDriver firefox;
	private static WebDriver chrome;
	private static WebDriver internetExplorer;
	
	private final static Logger log = Logger.getLogger(TestCaseExecutor.class);
	public static Properties localProperties = new Properties();
	public static String applicationUrl;
	public static TestDataReader reader = new TestDataReader();

//	public TestCaseExecutor() {
//		setUp(browserValue);
//	}
	
	@BeforeTest
	public void beforeTest() {
		try {
				// Initialize Firefox
				firefox = WebDriverSetUp.getDriver("Firefox");

				firefox.get(applicationUrl);

				if (firefox instanceof FirefoxDriver) {
					firefox.navigate().to("javascript:document.getElementById('overridelink').click()");
				}

				firefox.manage().window().maximize();

				// Initialize Chrome
				chrome = WebDriverSetUp.getDriver("Chrome");

				chrome.get(applicationUrl);

				if (chrome instanceof ChromeDriver) {
					chrome.navigate().to("javascript:document.getElementById('overridelink').click()");
				}

				chrome.manage().window().maximize();
				
				// Initialize IE
				internetExplorer = WebDriverSetUp.getDriver("InternetExplorer");

				internetExplorer.get(applicationUrl);

				if (internetExplorer instanceof InternetExplorerDriver) {
					internetExplorer.navigate().to("javascript:document.getElementById('overridelink').click()");
				}

				internetExplorer.manage().window().maximize();				
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	public WebDriver getDriver(String browserValue) {
		if(browserValue.toLowerCase().equals("firefox")) {
			return firefox;
		} else if(browserValue.toLowerCase().equals("chrome")) {
			return chrome;
		} else {
			return internetExplorer;				
		}
	}
	
	@AfterSuite
	public static void tearDown() {
		firefox.close();
		firefox.quit();
		chrome.close();
		chrome.quit();
		internetExplorer.close();
		internetExplorer.quit();
		WebDriverSetUp.stopService();
		System.gc();
	}

	@BeforeSuite
	public void initialize() throws IOException, FileNotFoundException {
		File env = new File("src/com/provenir/automation/framework/config/Env.properties");

		localProperties.load(new FileReader(env));
		
		applicationUrl = localProperties.getProperty("QA");
		System.out.println("url	=	" + applicationUrl);

		PropertyConfigurator.configure("src/com/provenir/automation/framework/config/log4j.properties");
	}
}
