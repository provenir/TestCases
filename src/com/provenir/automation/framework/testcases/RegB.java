package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.AdditionalInformation;
import com.provenir.automation.framework.helper.AdvanceSearchHelper;
import com.provenir.automation.framework.helper.Collateral360Helper;
import com.provenir.automation.framework.helper.CollateralInfoPage;
import com.provenir.automation.framework.helper.Credit360Helper;
import com.provenir.automation.framework.helper.Customer360Helper;
import com.provenir.automation.framework.helper.CustomerInfoPage;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.MyRequests;
import com.provenir.automation.framework.helper.NewCreditRequest;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.helper.SummaryOfApplication;
import com.provenir.automation.framework.helper.TransactionInfoPage;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class RegB extends TestCaseExecutor {

	LoginPage loginPage;
	SearchHelper searchHelper;
	Collateral360Helper collateral360Helper;
	Credit360Helper credit360Helper;
	Customer360Helper customer360Helper;
	MyRequests myRequests;
	NewCreditRequest creditRequest;
	CustomerInfoPage customerInfoPage;
	CollateralInfoPage collateralInfoPage;
	TransactionInfoPage transactionInfoPage;
	AdvanceSearchHelper advanceSearch;
	Credit360Helper credit360;
	AdditionalInformation addInfo;
	SummaryOfApplication summaryOfApplication;

	String pageTitle = "Customer 360 Details";
	String creditName = "Credit";
	String companyName = "";
	String taxId = "";
	String custName = "";
	String collName = "Coll";
	String accName = "Acc";
	boolean result = false;

	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	static Logger log = Logger.getLogger(RegB.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		credit360Helper = new Credit360Helper(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		collateral360Helper = new Collateral360Helper(getDriver(browserValue));
		customer360Helper = new Customer360Helper(getDriver(browserValue));
		addInfo = new AdditionalInformation(getDriver(browserValue));
		myRequests = new MyRequests(getDriver(browserValue));
		creditRequest = new NewCreditRequest(getDriver(browserValue));
		customerInfoPage = new CustomerInfoPage(getDriver(browserValue));
		collateralInfoPage = new CollateralInfoPage(getDriver(browserValue));
		transactionInfoPage = new TransactionInfoPage(getDriver(browserValue));
		advanceSearch = new AdvanceSearchHelper(getDriver(browserValue));
		summaryOfApplication = new SummaryOfApplication(getDriver(browserValue));
	}

	@Test(priority = 0)
	public void test0_landingPage() {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins, "resources/Login.json");
		loginPage.login(_hashLogins);
		Assert.assertTrue(myRequests.verifyBOAWizardLinkOnLeftNav());
	}

	@Test(priority = 1)
	public void test1_gotoBOAWizard() {
		creditRequest = myRequests.BOALink();
		Assert.assertTrue(creditRequest.getRequestSummaryPgTitle());
	}

	@Test(priority = 2)
	public void test2_verifyManadatoryFieldsOnRequestSummary() {
		creditRequest.btnNext();
		Assert.assertEquals(creditRequest.getCountOfErrorMsgs(), 1);
	}

	@Test(priority = 3)
	public void test3_saveRequestSummaryInformation() {

		int Randomnumber = (int) (Math.random() * 1111);
		creditName = creditName + Randomnumber;

		reader.updateNodeValue(
				"testdata/newCreditReqWizard/newCreditRequest/creditName",
				creditName);
		creditRequest.enterCreditName(creditName);
		creditRequest.enterLendingProcessForBOA(option);
		customerInfoPage = creditRequest.btnNext();
		Assert.assertEquals(customerInfoPage.getCustomerInfoTitle(),
				"Customer Information");
	}

	@Test(priority = 4)
	public void test4_verifyCollateralInformationPage() {
		collateralInfoPage = customerInfoPage.clickNextBtn();
		Assert.assertEquals(collateralInfoPage.getCollPoolSummaryHeadingText(),
				"Collateral Pool List for Credit Request");
	}

	@Test(priority = 5)
	public void test5_verifyTransactionInformationPage() {
		transactionInfoPage = collateralInfoPage.clickOnNextButton();

		Assert.assertEquals(transactionInfoPage.getTransactionInfoTitle(),
				"Transaction Information");
	}

	@Test(priority = 6)
	public void test6_verifyAdditionalInformation() {
		addInfo = transactionInfoPage.clickNextBtn();
		Assert.assertTrue(addInfo.verifyAdditionalInformationTitle());
	}

	@Test(priority = 7)
	public void test7_verifySummaryOfApplicationTitle() {
		summaryOfApplication = addInfo.clickNxt();
		Assert.assertTrue(summaryOfApplication.verifySummaryOfApplication());
	}

	@Test(priority = 8)
	public void test8_clickSubmitOnLastStepOfBOAWizard()
			throws InterruptedException {
		Thread.sleep(2000);
		summaryOfApplication.clickFinishButton();
		result = summaryOfApplication.verifyLinks();
	}

	@Test(priority = 9)
	public void test9_verifyReqOnDashboard() {
		myRequests = summaryOfApplication.clickMyRequestsLink();
		Assert.assertEquals(myRequests.getMyRequestsTitle(), "My Requests");
	}

	@Test(priority = 10)
	public void test10_verifyCredit360Page() {

		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();

		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 11)
	public void test11_gotoRegB() throws InterruptedException {
		Thread.sleep(2000);
		credit360Helper.clickRegB();
		Assert.assertTrue(credit360Helper.verifyRegBSection());
	}

	@Test(priority = 12)
	public void test12_verifyRegBStartDate() {
		Assert.assertTrue(credit360Helper.verifyRegBStartDate());
	}

	@Test(priority = 13)
	public void test13_completeTasksOnTaskManagement()
			throws InterruptedException {
		Thread.sleep(3000);

		credit360Helper.clickTaskManagement();
		Thread.sleep(1000);
		credit360Helper.expandWorkflow();
		credit360Helper.expandDecision();
		Thread.sleep(1000);
		credit360Helper.reassignTaskOfDecision();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);

		credit360Helper.setTaskInProgressOfDecision();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskToCompleteOfDecision();
		credit360Helper.clickSaveOnReassignTask();
	}

	@Test(priority = 14)
	public void test14_completeTaskOfPolicyException()
			throws InterruptedException {

		credit360Helper.expandDecision();
		Thread.sleep(1000);
		credit360Helper.expandDecision();
		credit360Helper.reassignTaskOfPolicyException();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskToWaived();
		credit360Helper.clickSaveOnReassignTask();
	}

	@Test(priority = 15)
	public void test15_refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		myRequests = credit360Helper.clickHome();
		myRequests.clickMyReq();
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 16)
	public void test16_gotoRegBSection() throws InterruptedException {
		Thread.sleep(3000);
		credit360Helper.clickRegB();
		Assert.assertTrue(credit360Helper.verifyRegBSection());
	}

	@Test(priority = 17)
	public void test17_verifyRegBStartDate() {
		Assert.assertTrue(credit360Helper.verifyRegBSatisfactionDate());
	}

}
