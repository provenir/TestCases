package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.Collateral360Helper;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class Collateral360 extends TestCaseExecutor {

	LoginPage loginPage;
	SearchHelper searchHelper;
	Collateral360Helper collateral360Helper;

	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	private HashMap<String, Map<String, String>> _hashCustomers = new HashMap<String, Map<String, String>>();

	static Logger log = Logger.getLogger(Collateral360.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		collateral360Helper = new Collateral360Helper(getDriver(browserValue));

	}

	@BeforeMethod
	public void landingPage() {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins,
				"resources/Login.json");

		loginPage.login(_hashLogins);
	}

	@Test
	public void test1_gotoCollateral360() throws InterruptedException {
		log.info("Click on collateral and Add");
		reader.readValue(_hashCustomers,
				"resources/Customers.json");
		searchHelper.searchCustomer(_hashCustomers);
		collateral360Helper.clickCollateralLink();
		collateral360Helper.clickOnAddCollateralLink();
		System.out.println("test 0");
	}

	@Test
	public void test2_verifyCollateralTitle() throws InterruptedException {
		log.info("Click on collateral and Add");
		collateral360Helper.verifyCollateralTitle();
		System.out.println("test 1");
	}

	@Test
	public void test3_saveCollateralDetails() {
		collateral360Helper.enterCollateralName();
		collateral360Helper.enterCollateralCode();
		collateral360Helper.selectCollType(option);
		collateral360Helper.selectCollSubType(option);
		collateral360Helper.enterCollateralOwnerName();
		collateral360Helper.enterCollateralPercentage();
		collateral360Helper.setPrimaryCollateralOwner();
		collateral360Helper.clickOnSaveCollateral();
		System.out.println("test 2");
	}

	@Test
	 public void test9_saveCollateralDetailsAsRealState() {
	  collateral360Helper.enterCollateralName();
	  collateral360Helper.enterCollateralCode();
	  collateral360Helper.selectCollateralTypeAsRealState(option);
	  collateral360Helper
	    .selectCollateralSubTypeAsTitledMotorVehicles(option);
	  collateral360Helper.enterCountry(option);
	  collateral360Helper.enterCity();
	  collateral360Helper.enterStreet();
	  collateral360Helper.enterNumber();
	  collateral360Helper.enterZipCode();

<<<<<<< HEAD
		collateral360Helper.enterCollateralOwnerName();
		collateral360Helper.enterCollateralPercentage();
		collateral360Helper.setPrimaryCollateralOwner();
		collateral360Helper.clickOnSaveCollateral();
	}

	@Test
	public void test9_verifyActionMenuDisplayedOnVehicle() {
		collateral360Helper.clickOnTitledMotorVehicleSection();
		collateral360Helper.clickEditOnTitledMotorVehicle();
		collateral360Helper.addOnTitledMotorVehicle();
		collateral360Helper.verifyActionMenuPresentOnTitledMotorVehicle();
	}

	@Test
	public void test10_verifyMandatoryDetails() {
		collateral360Helper.verifyMandatoryDetailsOnTitledMotorVehicle();
	}

	@Test
	public void test11_saveOnTitledMotorVehicle() {
		collateral360Helper.saveTitledMotorVehicleDetails();
	}

	@Test
	public void test12_updateTitledMotorVehicle() {
		collateral360Helper.clickEditOnTitledMotorVehicle();

	}

	@Test
	public void test13_deleteTitledMotorVehicleInfo() {
		collateral360Helper.clickDeleteOnTitledMotorVehicle();
	}

	@Test
	public void test14_cancelOnTitledMotorVehicle() {
		collateral360Helper.clickEditOnTitledMotorVehicle();
		collateral360Helper.addOnTitledMotorVehicle();
		collateral360Helper.cancelTitledMotorVehicle();
	}

	// UCC

	@Test
	public void test15_saveCollateralDetailsAsUCC() {
		collateral360Helper.enterCollateralName();
		collateral360Helper.enterCollateralCode();
		collateral360Helper.selectCollateralTypeAsAccountsReceivable(option);
		collateral360Helper.selectCollateralSubTypeASAccountsReceivable(option);
		collateral360Helper.enterMovable(option);
		collateral360Helper.enterCountry(option);
		collateral360Helper.enterCity();
		collateral360Helper.enterStreet();
		collateral360Helper.enterNumber();
		collateral360Helper.enterZipCode();

		collateral360Helper.enterCollateralOwnerName();
		collateral360Helper.enterCollateralPercentage();
		collateral360Helper.setPrimaryCollateralOwner();
		collateral360Helper.clickOnSaveCollateral();
	}
	
	@Test
	public void test16_verifyActionMenuDisplayedOnUCC()
	{
		
	}

}
=======
	}
}
>>>>>>> f3d93f2d33644c08c724cd42938163248aae61b8
