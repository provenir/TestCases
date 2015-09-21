package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.AdvanceSearchHelper;
import com.provenir.automation.framework.helper.Credit360Helper;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class Credit360 extends TestCaseExecutor{
	
	LoginPage loginPage;
	SearchHelper searchHelper;
	Credit360Helper credit360;
	AdvanceSearchHelper advanceSearch;
	
	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	static Logger log = Logger.getLogger(Credit360.class);
	
	@BeforeClass
	@Parameters({ "browser"})
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		credit360 = new Credit360Helper(getDriver(browserValue));
		advanceSearch = new AdvanceSearchHelper(getDriver(browserValue));
	}
	
	@BeforeMethod
	public void landingPage() {
		log.info("Login to Prism and search request");
		reader.readValue(_hashLogins,
				"resources/Login.json");

		loginPage.login(_hashLogins);
		advanceSearch.clickAdvanceSearchLink();
		advanceSearch.enterRequestType(option);
		advanceSearch.enterCreditNameAndSubmit();
		advanceSearch.clickReqOnGrid();
		credit360 = advanceSearch.verifyCreditTitle();
	}
	
	@Test
	public void test123()
	{
		
	}
	

	
	

}
