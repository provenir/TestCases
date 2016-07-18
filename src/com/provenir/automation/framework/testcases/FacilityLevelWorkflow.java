package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.AdminPage;
import com.provenir.automation.framework.helper.AdvanceSearchHelper;
import com.provenir.automation.framework.helper.CollateralInfoPage;
import com.provenir.automation.framework.helper.Credit360Details;
import com.provenir.automation.framework.helper.Credit360Helper;
import com.provenir.automation.framework.helper.CustomerInfoPage;
import com.provenir.automation.framework.helper.Facility360Details;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.ManageWorkflow;
import com.provenir.automation.framework.helper.MyRequests;
import com.provenir.automation.framework.helper.NewCreditRequest;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.helper.TransactionInfoPage;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class FacilityLevelWorkflow extends TestCaseExecutor {

	LoginPage loginPage;
	AdminPage adminPage;
	ManageWorkflow manageWorkflow;
	MyRequests myRequests;
	NewCreditRequest creditRequest;
	CustomerInfoPage customerInfoPage;
	CollateralInfoPage collateralInfoPage;
	TransactionInfoPage transactionInfoPage;
	AdvanceSearchHelper advanceSearch;
	Credit360Helper credit360;
	Credit360Details credit360Details;
	Facility360Details facility360;
	SearchHelper searchHelper;

	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	private HashMap<String, Map<String, String>> _hashReq = new HashMap<String, Map<String, String>>();

	static Logger log = Logger.getLogger(FacilityLevelWorkflow.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		adminPage = new AdminPage(getDriver(browserValue));
		myRequests = new MyRequests(getDriver(browserValue));
		creditRequest = new NewCreditRequest(getDriver(browserValue));
		customerInfoPage = new CustomerInfoPage(getDriver(browserValue));
		collateralInfoPage = new CollateralInfoPage(getDriver(browserValue));
		transactionInfoPage = new TransactionInfoPage(getDriver(browserValue));
		advanceSearch = new AdvanceSearchHelper(getDriver(browserValue));
	}

	@Test(priority = 0)
	public void landingPage() throws InterruptedException {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins, "resources/Login.json");
		loginPage.login(_hashLogins);
		loginPage = adminPage.clickAdminLink();
		adminPage.clickManageWorkflows();
		adminPage.verifyWorkflowSummaryTitle();
	}

	@Test(priority = 0)
	public void test1_verifyResultsAccToWorkflowType() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.selectAndVerifyWorkflowTypeAsCredit();
		Thread.sleep(3000);
		adminPage.selectAndVerifyWorkflowTypeAsFacility();
	}

	@Test(priority = 1)
	public void test2_clickOnAddBtnOfWorkflowSummary() {
		adminPage.clickAddBtnOnWorkflowSummary();
		adminPage.verifyWorkflowPageTitle();
		adminPage.clickBackBtnOnWorkflow();
	}

	@Test(priority = 2)
	public void test3_verifyMandatoryDetailsOnManageWorkflow() {
		adminPage.clickAddBtnOnWorkflowSummary();
		adminPage.verifyWorkflowPageTitle();
		adminPage.verifyMandatoryDetailsOnManageWorkflow();
		adminPage.clickCrossOnManageWorkflow();
		adminPage.clickBackBtnOnWorkflow();
	}
	

	// @Test(priority = 3)
	// public void test4_clickAddAndSaveFacilityLevelWorkflow() {
	// adminPage.clickAddBtnOnWorkflowSummary();
	//
	// adminPage.enterFacilityWorkflow();
	// adminPage.selectWorkflowTypeAsFacility(option);
	//
	// adminPage.clickAddBtnOnManageWorkflow();
	//
	// adminPage.enterFacilityWorkflow();
	// adminPage.selectTaskName(option);
	// adminPage.enterTaskCode();
	// adminPage.clickMilestone();
	// adminPage.enterMilestoneAsOnboarded(option);
	//
	// adminPage.clickAddBtnOnManageWorkflow();
	// adminPage.selectTaskName1(option);
	// adminPage.enterTaskCode();
	// adminPage.clickMilestone();
	// adminPage.enterMilestoneAsComplianceComplete(option);
	//
	// adminPage.clickAddBtnOnManageWorkflow();
	// adminPage.selectTaskName2(option);
	// adminPage.enterTaskCode();
	// adminPage.clickMilestone();
	// adminPage.enterMilestoneAsUnderwritingComplete(option);
	//
	// adminPage.clickAddBtnOnManageWorkflow();
	// adminPage.selectTaskName3(option);
	// adminPage.enterTaskCode();
	// adminPage.clickMilestone();
	// adminPage.enterMilestoneAsFinancialsReviewed(option);
	//
	// adminPage.clickAddBtnOnManageWorkflow();
	// adminPage.selectTaskName4(option);
	// adminPage.enterTaskCode();
	// adminPage.clickMilestone();
	// adminPage.enterMilestoneAsCompleted(option);
	//
	// adminPage.clickSaveBtnOnWorkflowPage();
	// adminPage.verifyWorkflowIsSavedOrNot();
	// }
	//
	// @Test(priority = 4)
	// public void test5_searchSavedWorkflow() {
	// adminPage.enterFacilityWorkflowNameToSearch();
	// adminPage.clickOnSearchIconOnWorkflowSummary();
	// adminPage.verifySavedWorkflowAsFacility();
	// }
	//
	// @Test(priority = 6)
	// public void test7_updateWorkflowType() {
	// adminPage.enterFacilityWorkflowNameToSearch();
	// adminPage.clickOnSearchIconOnWorkflowSummary();
	// adminPage.clickWorkflowName();
	// adminPage.editWorkflow();
	// adminPage.selectAndVerifyWorkflowTypeAsFacility();
	// adminPage.enterCreditWorkflow();
	// adminPage.clickSaveBtnOnWorkflowPage();
	// adminPage.clickBackBtnOnWorkflow();
	// }
	//
	// @Test(priority = 7)
	// public void test8_searchUpdatedWorkflow() {
	// adminPage.enterCreditWorkflowNameToSearch();
	// adminPage.clickOnSearchIconOnWorkflowSummary();
	// adminPage.verifySavedWorkflowAsCredit();
	// }
	//
	// @Test(priority = 8)
	// public void test9_setUpdatedWorkflowToDefault() {
	// adminPage.enterCreditWorkflowNameToSearch();
	// adminPage.clickOnSearchIconOnWorkflowSummary();
	// adminPage.setWorkflowAsDefault();
	// }
	//
	// @Test(priority = 9)
	// public void tes10_verifyAsterixOnDefaultWorkflow() {
	// adminPage.enterCreditWorkflowNameToSearch();
	// adminPage.clickOnSearchIconOnWorkflowSummary();
	// adminPage.verifyAsterixOnSavedWorkflow();
	// }

	// goto Home page

	@Test(priority = 10)
	public void test11_goToHomePage() {
		adminPage = myRequests.clickHomeLink();
		myRequests.clickMyRequests();
	}

	@Test(priority = 11)
	public void test12_clickNewCreditRequest() {
		creditRequest = myRequests.newCreditRequestLink();
		creditRequest.getRequestSummaryPgTitle();
	}

	@Test(priority = 12)
	public void test13_verifyDefaultCreditLevelWorkflow() {
		creditRequest.verifyDefaultWorkflowName();
	}

	@Test(priority = 13)
	public void test14_verifySavedWorkflow() {
		creditRequest.enterLendingProcess(option);
		creditRequest.getSavedWorkflowName();
	}

	@Test(priority = 14)
	public void test15_clickTransactionInfoPage() {
		creditRequest.enterCreditName();
		creditRequest.creditAgreeDate();
		creditRequest.creditProjectedClosingDt();
		customerInfoPage = creditRequest.btnNext();
		collateralInfoPage = customerInfoPage.clickNextBtn();
		transactionInfoPage = collateralInfoPage.clickOnNextButton();
	}

	@Test(priority = 15)
	public void test16_verifyDefaultFacilityLevelWorkflow() {
		transactionInfoPage.clickProdCatalogButton();
		transactionInfoPage.verifyDefaultFacilityWorkflow();

	}

	@Test(priority = 16)
	public void test17_verifysavedFacilityWorkflow() {
		transactionInfoPage.selectFacilityWorkflow(option);
		transactionInfoPage.verifySavedFacilityWorkflow();
		transactionInfoPage.clickCrossOnTransactionPopup();
	}

	@Test(priority = 17)
	public void test18_gotoHomePage() {
		transactionInfoPage = myRequests.clickHomePage();
	}

	// search request

	@Test(priority = 18)
	public void test19_searchRequest() {
		advanceSearch.clickAdvanceSearchLink();
		advanceSearch.enterRequestType(option);
		advanceSearch.enterCreditNameAndSubmit();
		credit360 = advanceSearch.clickReqOnGrid();
	}

	@Test(priority = 19)
	public void test20_verifyTaskManagementSection() {
		credit360.clickTaskManagement();
		credit360.verifyActionColumn();
		credit360.clickActionColumnAndVerifyAddedWorkflow();
	}

	@Test(priority = 20)
	public void test21_gotoFacility360() throws InterruptedException {
		myRequests = credit360.clickHome();
		searchHelper = myRequests.srchAssociatedFacility();
		Thread.sleep(2000);
		facility360 = searchHelper.clickFacSummary();
		facility360.isFacilitySummaryNamePresent();
	}

	@Test(priority = 21)
	public void test22_verifyTaskManagementLoadedOnFacility360() {
		facility360.clickTaskManagement();
		facility360.verifyTaskMgmtSectionLoaded();
	}

	@Test(priority = 22)
	public void test23_verifyNoWorkflowIsDisplayedInTaskMgmtOfFacility360() {
		facility360.verifyNoWorkflowIsDisplayed();
	}

	@Test(priority = 23)
	public void test24_gotoFacility360() throws InterruptedException {
		myRequests = facility360.clickHome();
		searchHelper = myRequests.searchExistingFacility();
		Thread.sleep(2000);
		facility360 = searchHelper.clickFacSummary();
		Thread.sleep(2000);
		facility360.isFacilitySummaryNamePresent();
	}

	@Test(priority = 24)
	public void test25_verifyTaskManagementLoadedOnFacility360() throws InterruptedException {
		Thread.sleep(2000);
		facility360.clickTaskManagement();
		facility360.verifyTaskMgmtSectionLoaded();
		facility360.verifyOrderOfWorkflows();
	}

	// trigger workflow

	@Test(priority = 25)
	public void test26_triggerFacilityWorkflow() {
		facility360.verifyWFTriggeredOrNot();
	}

	@Test(priority = 26)
	public void test27_verifyWorkflowOrderInCredit360() throws InterruptedException {
		myRequests = facility360.clickHome();
		searchHelper = myRequests.searchExistingRequest();
		Thread.sleep(3000);
		credit360 = searchHelper.clickCreditSummary();
		Thread.sleep(3000);
		credit360.clickTaskManagement();
		credit360.verifyWorkflowOrderOnCredit360();
	}

	@Test(priority = 27)
	public void test28_gotoMyRequestPage() {
		myRequests = credit360.clickHome();
		facility360 = myRequests.clickFacilityOnDashboard();
		facility360.isFacilitySummaryNamePresent();
	}

	@Test(priority = 28)
	public void test29_verifyWorkflowDDLReadOnlyWhenEdit() {
		facility360.clickFacilityLnk();
	}

	@Test(priority = 29)
	public void test30_expandReqAndGotoFacility360() throws InterruptedException {
		myRequests = facility360.clickHome();
		myRequests.expandRequest();
		facility360 = myRequests.clickOnAddedWorkflow();
		facility360.isFacilitySummaryNamePresent();
	}

	@Test(priority = 30)
	public void test31_deleteFacility() throws InterruptedException {
		myRequests = facility360.clickHome();
		searchHelper = myRequests.searchExistingRequest1();
		Thread.sleep(2000);
		credit360 = searchHelper.clickCreditSummary();
		Thread.sleep(2000);
	}

	@Test(priority = 31)
	public void test32_VerifyAssociatedWorkflowIsDeletedOrNot() {
		credit360.clickTaskManagement();
		credit360.verifyWorkflowDeletedOrNot();
	}

}
