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

public class CreditDecision extends TestCaseExecutor {

	LoginPage loginPage;
	SearchHelper searchHelper;
	Collateral360Helper collateral360Helper;
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
	Credit360Helper credit360Helper;

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

	static Logger log = Logger.getLogger(CreditDecision.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		credit360Helper = new Credit360Helper(getDriver(browserValue));
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
	public void test1_createCustomer() throws InterruptedException {
		customerInfoPage.createCustLink();
		Assert.assertEquals(customerInfoPage.customerSummaryPgTitle(),
				"Customer Summary");

		int randomNumber = (int) (Math.random() * 1111);
		companyName = "Test FMC " + randomNumber;
		reader.updateNodeValue("testdata/createCustomer/newCust", companyName);

		customerInfoPage.enterCompanyLegalName(companyName);

		Thread.sleep(2000);

		customerInfoPage.enterCompanyShortNme();

		customerInfoPage.enterCustomerSince();
		customerInfoPage.clickDt();

		customerInfoPage.enterTaxID();

		customerInfoPage.selectCorporateStructureAsCorporation();

		customerInfoPage.enterGAR();

		customerInfoPage.enterGARAsOfDate();

		customerInfoPage.enterLastTaxReturnDate();
		customerInfoPage.enterAnnualReviewDate();
		customerInfoPage.enterInterimReviewDate();
		customerInfoPage.enterFiscalYearEndDate();
		customerInfoPage
				.selectNAICSCode(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/NAICSCode"));
		customerInfoPage
				.selectSICCode(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/SICCode"));
		customerInfoPage
				.selectBranch(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/customerBranch"));
		customerInfoPage
				.selectExpenseCode(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/expenseCode"));
		customerInfoPage
				.selectDepartment(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/department"));
		customerInfoPage
				.selectCustomerClassiCode(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/customerClassiCode"));
		customerInfoPage
				.enterDUNSNumber(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/DUNSNumber"));
		customerInfoPage
				.selectLegalCode(reader
						.readNodeValue("testdata/newCreditReqWizard/customerInformation/legalCode"));

		customerInfoPage.clickSaveButton();

		customerInfoPage.clickMatch();

		customerInfoPage.verifyAddedCustomerIsDisplayed();

		myRequests = customerInfoPage
				.clickBackfromBreadCrum("My Requests HomePage");
	}

	@Test(priority = 2)
	public void test2_gotoBOAWizard() {
		creditRequest = myRequests.BOALink();
		Assert.assertTrue(creditRequest.getRequestSummaryPgTitle());
	}

	@Test(priority = 3)
	public void test3_verifyManadatoryFieldsOnRequestSummary() {
		creditRequest.btnNext();
		Assert.assertEquals(creditRequest.getCountOfErrorMsgs(), 1);
	}

	@Test(priority = 4)
	public void test4_saveRequestSummaryInformation() {

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

	@Test(priority = 5)
	public void test5_step_verifyAddBtnOnCustInfoPage() {
		customerInfoPage.clickSrchBtn();
		Assert.assertTrue(customerInfoPage.verifyCustPopup());
	}

	@Test(priority = 6)
	public void test6_enterCustToAdd() throws InterruptedException {

		customerInfoPage.enterLegalNm(reader
				.readNodeValue("testdata/createCustomer/newCust"));
		Thread.sleep(2000);
		customerInfoPage.CustSelectionCheckBox();
		customerInfoPage.addCustToLst();
	}

	@Test(priority = 7)
	public void test7_verifyCollateralInformationPage() {
		collateralInfoPage = customerInfoPage.clickNextBtn();
		Assert.assertEquals(collateralInfoPage.getCollPoolSummaryHeadingText(),
				"Collateral Pool List for Credit Request");
	}

	@Test(priority = 8)
	public void test8_verifyAddNewBtnOnCollateralInformation() {
		collateralInfoPage.clickAddNewButton();
		Assert.assertEquals(collateralInfoPage.getCollAccSummaryTitle(),
				"Collateral Account Summary");
	}

	@Test(priority = 9)
	public void test9_saveCollateralInformation() throws InterruptedException {

		int randomNumber = (int) (Math.random() * 1111);
		collName = collName + randomNumber;

		Thread.sleep(3000);
		collateralInfoPage.enterCollateralAccountName(collName);
		reader.updateNodeValue(
				"testdata/newCreditReqWizard/collateralInformation/collateralAccName",
				collName);

		collateralInfoPage.selectCollTypeAsRE();
		Thread.sleep(2000);
		collateralInfoPage.selectCollSubTypeAsRetailOffice();

		Thread.sleep(2000);
		collateralInfoPage.enterCustName();

		collateralInfoPage.clickSearchIcon();
		collateralInfoPage.selectCustomerFromList();
		collateralInfoPage.clickLoadBtn();

		collateralInfoPage.enterOwnerPercentage();

		collateralInfoPage.selectPrimaryOwner();
		Thread.sleep(3000);
		collateralInfoPage.clickOnSaveButton();
	}

	@Test(priority = 10)
	public void test10_verifyTransactionInformationPage() {
		transactionInfoPage = collateralInfoPage.clickOnNextButton();

		Assert.assertEquals(transactionInfoPage.getTransactionInfoTitle(),
				"Transaction Information");
	}

	@Test(priority = 11)
	public void test11_saveTransactionDetails() throws InterruptedException {

		transactionInfoPage.clickAddNewButton();
		Thread.sleep(2000);

		transactionInfoPage.enterFacilityName();

		transactionInfoPage.selectFacilityType();
		transactionInfoPage.enterProposedAmount();

		transactionInfoPage.clickAddBtnOfFacilityBorrowr();
		Thread.sleep(1000);

		transactionInfoPage.selBorrowerOnTransactionInformation();

		Thread.sleep(2000);
		transactionInfoPage.selRelationshipTyp();
		Thread.sleep(2000);
		transactionInfoPage.clickPrimaryChkbox();

		transactionInfoPage.clickSaveButton();
	}

	@Test(priority = 12)
	public void test12_verifyAdditionalInformation() {
		addInfo = transactionInfoPage.clickNextBtn();
		Assert.assertTrue(addInfo.verifyAdditionalInformationTitle());
	}

	@Test(priority = 13)
	public void test13_saveAdditionalInformation() throws InterruptedException {

		Thread.sleep(2000);
		int randomNumber = (int) (Math.random() * 1111);
		accName = accName + randomNumber;

		Thread.sleep(3000);

		addInfo.enterPrimaryCheckingAccount(accName);
		reader.updateNodeValue(
				"testdata/newCreditReqWizard/additionalInfo/primaryChkingAcc",
				accName);

		addInfo.enterNoOFEmp();
		addInfo.enterAvgAccBalance();

		addInfo.enterValues();
		Thread.sleep(1000);
		addInfo.clickSaveOnAdditionalInformation();
	}

	@Test(priority = 14)
	public void test14_verifySummaryOfApplicationTitle() {
		summaryOfApplication = addInfo.clickNxt();
		Assert.assertTrue(summaryOfApplication.verifySummaryOfApplication());
	}

	@Test(priority = 15)
	public void test15_clickSubmitOnLastStepOfBOAWizard()
			throws InterruptedException {
		Thread.sleep(2000);
		summaryOfApplication.clickFinishButton();
		result = summaryOfApplication.verifyLinks();
	}

	@Test(priority = 16)
	public void test16_verifyReqOnDashboard() {
		myRequests = summaryOfApplication.clickMyRequestsLink();
		Assert.assertEquals(myRequests.getMyRequestsTitle(), "My Requests");
	}

	@Test(priority = 17)
	public void test17_verifyCredit360Page() {
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 18)
	public void test18_verifyCreditDecisionSummary() {
		credit360Helper.clickCreditDecisionSummaryLink();
		Assert.assertTrue(credit360Helper.isCreditDecisionSummaryDisplayed());
	}

	@Test(priority = 19)
	public void test19_verifyCreditDecisionSummaryTitleOnAdd() {
		credit360Helper.clickAddOnCreditDecision();
		Assert.assertTrue(credit360Helper.verifyCreditDecisionTitle());
	}

}
