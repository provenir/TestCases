package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.Credit360Helper;
import com.provenir.automation.framework.helper.Customer360Helper;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class Customer360 extends TestCaseExecutor{
	
	LoginPage loginPage;
	SearchHelper searchHelper;
	Credit360Helper credit360;
	Customer360Helper customer360;
	
	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	private HashMap<String, Map<String, String>> _hashCustomers = new HashMap<String, Map<String, String>>();

	static Logger log = Logger.getLogger(Customer360.class);
	
	@BeforeClass
	@Parameters({ "browser"})
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		customer360 = new Customer360Helper(getDriver(browserValue));
	}
	
	@BeforeMethod
	public void landingPage() {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins,
				"resources/Login.json");

		loginPage.login(_hashLogins);
	}
	
	@Test
	public void test1_gotoCustomer360() {
		reader.readValue(_hashCustomers,
				"resources/Customers.json");
		searchHelper.searchCustomer(_hashCustomers);
		customer360.clickAddressLink();
		customer360.clickAddBtnOfAddressLink();
		System.out.println("test 0");
	}
	
	@Test
	public void test2_verifyAddressTitle() {
		customer360.verifyAddressTitle();
		System.out.println("test 1");
	}
	
	@Test
	public void test3_saveAddress()
	{
		customer360.enterAddressType(option);
		customer360.selectCountry(option);
		customer360.enterAddressLine();
		customer360.enterPostalCode();
		customer360.enterCity();
		customer360.enterRegion(option);
		customer360.saveAddress();
		System.out.println("test 2");
	}

}
