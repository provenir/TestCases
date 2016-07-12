package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.AdminPage;
import com.provenir.automation.framework.helper.AdvanceSearchHelper;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.MyRequests;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class Checklists extends TestCaseExecutor {

	LoginPage loginPage;
	AdminPage adminPage;
	MyRequests myRequests;
	AdvanceSearchHelper advanceSearch;

	public TestDataReader reader = new TestDataReader();

	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	static Logger log = Logger.getLogger(Checklists.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		adminPage = new AdminPage(getDriver(browserValue));
		myRequests = new MyRequests(getDriver(browserValue));
		advanceSearch = new AdvanceSearchHelper(getDriver(browserValue));
	}

	@Test(priority = 0)
	public void test0_landingPage() throws InterruptedException {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins, "resources/Login.json");
		loginPage.login(_hashLogins);
		loginPage = adminPage.clickAdminLink();
		adminPage.clickChecklistSummary();
		Assert.assertTrue(adminPage.verifyChecklistSummary());
	}

	@Test(priority = 1)
	public void test1_verifyEligibilityChecklist() throws InterruptedException {
		Thread.sleep(4000);
		adminPage.enterChklist1();
		Assert.assertEquals(adminPage.getChecklist(),
				"CHK-REV-ELIG-CHKLST-SML-BUS");
	}

	@Test(priority = 2)
	public void test2_verifyPolicyExceptionForSmallBusiness()
			throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist2();
		Assert.assertEquals(adminPage.getChecklist(), "PLC-EXCP");
	}

	@Test(priority = 3)
	public void test3_verifyConditionsAndPrecedent()
			throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist3();
		Assert.assertEquals(adminPage.getChecklist(), "COND_PREC");
	}

	@Test(priority = 4)
	public void test4_verifyClosingChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist4();
		Assert.assertEquals(adminPage.getChecklist(), "CLOS_CHECKLIST");
	}

	@Test(priority = 5)
	public void test5_verifyPostBookingQAChecklist()
			throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist5();
		Assert.assertEquals(adminPage.getChecklist(), "CHK-POST-BOOK");
	}

	@Test(priority = 6)
	public void test6_verifyPreBookingChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist6();
		Assert.assertEquals(adminPage.getChecklist(), "CHK-PRE-BOOK");
	}

	@Test(priority = 7)
	public void test7_verifyPreFundingChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist7();
		Assert.assertEquals(adminPage.getChecklist(), "PRE_FUND_CHECKLIST");
	}

	@Test(priority = 8)
	public void test8_verifyPreClosingChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist8();
		Assert.assertEquals(adminPage.getChecklist(), "CHK-PRE-CLOSE");
	}

	@Test(priority = 9)
	public void test9_verifyDocumentChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist9();
		Assert.assertEquals(adminPage.getChecklist(), "DOC_CHECKLIST");
	}

	@Test(priority = 10)
	public void test10_verifyDueDiligenceChecklist()
			throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist10();
		Assert.assertEquals(adminPage.getChecklist(), "CHK-DUE-DIL");
	}

	@Test(priority = 11)
	public void test11_verifyApplicationChecklist() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.enterChklist11();
		Assert.assertEquals(adminPage.getChecklist(), "CHK-APPLICATION");
	}

	@Test(priority = 12)
	public void test12_verifyApplicationChecklistItems()
			throws InterruptedException {
		Thread.sleep(2000);
		adminPage.clickEditOfApplicationChecklist();
		Thread.sleep(2000);
		adminPage.verifyAttachCopyofArticlesofIncorporation();
		adminPage.verifyAttachFinancialStatements_Last3Years();
		adminPage.verifyAttachCopyofRealEstateTitle();
		adminPage
				.verifyAttachPersonalFinancialStatements_LAst3YearsofIndividualBorrowersOrGuarantors();
		adminPage.verifyAttachCopyofPassportOrDriversLicenseOrGovtID();
		adminPage.verifyAttachCorporateBorrowingResolution();
		adminPage.clickCancelOnChklistDetails();
	}
}
