package credit;

import helper.AdvanceSearchHelper;
import helper.Credit360Helper;
import helper.LoginHelper;
import helper.SearchHelper;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.TestDataReader;
import utility.Util;

public class Credit360 {

	LoginHelper loginPage;
	Credit360Helper credit360Helper;
	AdvanceSearchHelper advanceSearchHelper;
	SearchHelper searchHelper;
	
	WebDriver driver;
	private String option;
	private TestDataReader reader = new TestDataReader();

	private HashMap<String, Map<String, String>> _hashSearch = new HashMap<String, Map<String, String>>();
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();

	@SuppressWarnings("static-access")
	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) throws Exception {

		reader.readValue(_hashSearch,
				"C:\\New folder\\TestCases\\java\\demo\\DemoTestNG\\resources\\AdvanceSearch.json");
		reader.readValue(_hashLogins,
				"C:\\New folder\\TestCases\\java\\demo\\DemoTestNG\\resources\\Login.json");

		// browser being initialized/called
		driver = utility.WebDriverSetUp.getDriver(browser);
		driver.manage().window().maximize();

		// deletes the cache
		driver.manage().deleteAllCookies();

		loginPage.loginPrism(driver, _hashLogins);
		
		advanceSearchHelper.clickOnAdvanceSearchLink(driver);
		advanceSearchHelper.enterRequestType(driver, option);
		advanceSearchHelper.enterCreditNameAndSubmit(driver);
		advanceSearchHelper.clickReqOnGrid(driver);

	}

	@Test
	public void searchRequest(WebDriver driver) {
		credit360Helper.verifyCreditTitle(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
		System.gc();
	}

}
