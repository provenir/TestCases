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

public class StatusUpdate extends TestCaseExecutor {

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
	Credit360Helper credit360Helper;
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

	static Logger log = Logger.getLogger(StatusUpdate.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		searchHelper = new SearchHelper(getDriver(browserValue));
		collateral360Helper = new Collateral360Helper(getDriver(browserValue));
		customer360Helper = new Customer360Helper(getDriver(browserValue));
		credit360Helper = new Credit360Helper(getDriver(browserValue));
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
	public void test4_step_verifyAddBtnOnCustInfoPage() {
		customerInfoPage.clickAddNewButton();
		Assert.assertTrue(customerInfoPage.isCompanyLegalNamePresent());
	}

	@Test(priority = 5)
	public void test5_verifyManadatoryFieldsForBusinessTypCustomer() {
		customerInfoPage.clickSaveButton();
		Assert.assertEquals(customerInfoPage.getCountOfErrorMsgs(), 4);
	}

	@Test(priority = 6)
	public void test6_saveBusinessCustDetails() throws InterruptedException {

		customerInfoPage.selCustType();

		int randomNumber = (int) (Math.random() * 1111);
		companyName = "Test FMC " + randomNumber;
		reader.updateNodeValue(
				"testdata/newCreditReqWizard/customerInformation/asBusiness/companyName",
				companyName);

		customerInfoPage.enterCompanyLegalName(companyName);

		customerInfoPage.enterTaxID();

		Thread.sleep(2000);
		customerInfoPage.selectCorporateStructure();

		Thread.sleep(2000);

		customerInfoPage.enterCustomerSince();
		Thread.sleep(2000);
		customerInfoPage.clickCustInfo();
		// address section

		customerInfoPage.clickAddBtnOFAddressOnCustInfo();
		Thread.sleep(2000);
		customerInfoPage.selAddType();
		customerInfoPage.selCountry();

		customerInfoPage.enterAddressLine1();
		customerInfoPage.enterAddressLine2();
		customerInfoPage.selState();
		customerInfoPage.enterCity();
		customerInfoPage.enterZipCode();

		customerInfoPage.clickSaveButton();

		customerInfoPage.clickMatchPopup();
	}

	@Test(priority = 8)
	public void test8_verifyManadatoryFieldsForIndividualCustomer()
			throws InterruptedException {
		Thread.sleep(2000);
		customerInfoPage.clickAddNewButton();
		customerInfoPage.selCustTyp();

		customerInfoPage.clickSaveButton();
		Assert.assertEquals(customerInfoPage.getCountOfErrorMsgs(), 6);
	}

	@Test(priority = 9)
	public void test9_saveIndividualCustDetails() throws InterruptedException {

		customerInfoPage.selCustTyp();
		Thread.sleep(3000);

		int randomNumber = (int) (Math.random() * 1111);
		custName = "Customer I2" + randomNumber;
		customerInfoPage.enterCustFirstName(custName);
		reader.updateNodeValue(
				"testdata/newCreditReqWizard/customerInformation/asIndividual/firstName",
				custName);

		customerInfoPage.enterDateOfBirth();

		customerInfoPage.enterMiddleName();
		customerInfoPage.selectGender();

		customerInfoPage.enterCustLastName();

		customerInfoPage.enterTaxID();

		customerInfoPage.enterCustomerSince();
		Thread.sleep(2000);
		customerInfoPage.clickCustomerInfo();

		// address section

		customerInfoPage.clickAddBtnOFAddressOnCustInfo();
		Thread.sleep(2000);
		customerInfoPage.selAddType();
		customerInfoPage.selCountry();

		customerInfoPage.enterAddressLine1();
		customerInfoPage.enterAddressLine2();
		customerInfoPage.selState();
		customerInfoPage.enterCity();
		customerInfoPage.enterZipCode();

		customerInfoPage = customerInfoPage.clickSaveButton();

		customerInfoPage.clickMatchPopup();

	}

	@Test(priority = 10)
	public void test10_verifyCollateralInformationPage() {
		collateralInfoPage = customerInfoPage.clickNextBtn();
		Assert.assertEquals(collateralInfoPage.getCollPoolSummaryHeadingText(),
				"Collateral Pool List for Credit Request");
	}

	@Test(priority = 11)
	public void test11_verifyAddNewBtnOnCollateralInformation() {
		collateralInfoPage.clickAddNewButton();
		Assert.assertEquals(collateralInfoPage.getCollAccSummaryTitle(),
				"Collateral Account Summary");
	}

	@Test(priority = 12)
	public void test12_saveCollateralInformation() throws InterruptedException {

		int randomNumber = (int) (Math.random() * 1111);
		collName = collName + randomNumber;

		Thread.sleep(3000);
		collateralInfoPage.enterCollateralAccountName(collName);
		reader.updateNodeValue(
				"testdata/newCreditReqWizard/collateralInformation/collateralAccName",
				collName);

		collateralInfoPage.selectCollType();
		Thread.sleep(2000);
		collateralInfoPage.selectCollSubType();

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

	@Test(priority = 13)
	public void test13_verifyTransactionInformationPage() {
		transactionInfoPage = collateralInfoPage.clickOnNextButton();

		Assert.assertEquals(transactionInfoPage.getTransactionInfoTitle(),
				"Transaction Information");
	}

	@Test(priority = 14)
	public void test14_saveTransactionDetails() throws InterruptedException {

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

	@Test(priority = 16)
	public void test16_verifyAdditionalInformation() {
		addInfo = transactionInfoPage.clickNextBtn();
		Assert.assertTrue(addInfo.verifyAdditionalInformationTitle());
	}

	@Test(priority = 17)
	public void test17_verifySummaryOfApplicationTitle() {
		summaryOfApplication = addInfo.clickNxt();
		Assert.assertTrue(summaryOfApplication.verifySummaryOfApplication());
	}

	@Test(priority = 18)
	public void test18_clickSubmitOnLastStepOfBOAWizard()
			throws InterruptedException {
		Thread.sleep(2000);
		summaryOfApplication.clickFinishButton();
		result = summaryOfApplication.verifyLinks();
	}

	@Test(priority = 19)
	public void test19_verifyReqOnDashboard() {
		myRequests = summaryOfApplication.clickMyRequestsLink();
		Assert.assertEquals(myRequests.getMyRequestsTitle(), "My Requests");
	}

	@Test(priority = 20)
	public void test20_verifyCredit360Page() throws InterruptedException {
		myRequests.expandReqToVerifyTM();
		Thread.sleep(2000);
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 21)
	public void test21_verifyCreditStatusAsSubmitted()
			throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(credit360Helper.verifyStatus(), "Status: Submitted");
	}

	@Test(priority = 22)
	public void test22_completePreAnalysis() throws InterruptedException {
		Thread.sleep(2000);
		credit360Helper.clickTaskManagement();
		Thread.sleep(1000);
		credit360Helper.expandWorkflow();
		Thread.sleep(1000);
		credit360Helper.reassignTaskOfPreAnalysis();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskInProgressOfPreAnalysis();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskToCompleteOfPreAnalysis();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
	}

	@Test(priority = 23)
	public void test23_refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		myRequests = credit360Helper.clickHome();
		myRequests.clickMyReq();
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 24)
	public void test24_verifyCreditStatusAsCreditDecisioning()
			throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(credit360Helper.verifyStatus(),
				"Status: Credit Decisioning");
	}

	@Test(priority = 25)
	public void test25_completeDecision() throws InterruptedException {
		Thread.sleep(2000);
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
		Thread.sleep(2000);
	}

	@Test(priority = 26)
	public void test26_refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		myRequests = credit360Helper.clickHome();
		myRequests.clickMyReq();
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 27)
	public void test27_verifyCreditStatus() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(credit360Helper.verifyReqStatus());
	}

	@Test(priority = 28)
	public void test28_completeCustomerAcceptance() throws InterruptedException {
		Thread.sleep(2000);
		credit360Helper.clickTaskManagement();
		Thread.sleep(1000);
		credit360Helper.expandWorkflow();
		Thread.sleep(1000);
		credit360Helper.reassignTaskOfCustomerAcceptance();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();

		Thread.sleep(2000);
		credit360Helper.setTaskInProgressOFCustomerAcceptance();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskToCompleteofCustomerAcceptance();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
	}

	@Test(priority = 29)
	public void test29_completeChildTaskOfCustomerAcceptance()
			throws InterruptedException {
		credit360Helper.expandCustomerAcceptance();
		credit360Helper.reassignTaskOfCompleteApplication();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();

		Thread.sleep(2000);
		credit360Helper.setTaskToWaivedOfCompleteApplication();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
	}

	@Test(priority = 30)
	public void test30_refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		myRequests = credit360Helper.clickHome();
		myRequests.clickMyReq();
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 31)
	public void test31_verifyStatusAsDueDiligence() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(credit360Helper.verifyStatus(), "Due Diligence");
	}

	@Test(priority = 32)
	public void test32_completeDueDiligence() throws InterruptedException {
		Thread.sleep(2000);
		credit360Helper.clickTaskManagement();
		Thread.sleep(1000);
		credit360Helper.expandWorkflow();
		credit360Helper.expandCustomerAcceptance();
		Thread.sleep(1000);
		credit360Helper.reassignTaskOfDueDiligence();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();

		Thread.sleep(2000);
		credit360Helper.setTaskInProgressOFDueDiligence();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
		credit360Helper.setTaskToCompleteOfDueDiligence();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);
	}

	@Test(priority = 33)
	public void test33_completeChildTasksOfDueDiligence()
			throws InterruptedException {
		credit360Helper.expandDueDiligence();
		credit360Helper.reassignTaskOFDueDiligenceChklist();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();

		Thread.sleep(2000);
		credit360Helper.setTaskToWaivedOfDueDiligenceChklist();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);

		credit360Helper.reassignTaskOfCompletePreDocument();
		credit360Helper.enterAssignedUser();
		credit360Helper.clickSaveOnReassignTask();

		Thread.sleep(2000);
		credit360Helper.setTaskToWaivedOfCompletePreDocument();
		credit360Helper.clickSaveOnReassignTask();
		Thread.sleep(2000);

	}

	@Test(priority = 34)
	public void test34_refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		myRequests = credit360Helper.clickHome();
		myRequests.clickMyReq();
		myRequests.expandReqToVerifyTM();
		credit360Helper = myRequests.gotoCredit360();
		Assert.assertTrue(credit360Helper.verifyCredit360Title());
	}

	@Test(priority = 35)
	public void test35_verifyStatusAsDueDiligence() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(credit360Helper.verifyStatus(), "Due Diligence");
	}

}
