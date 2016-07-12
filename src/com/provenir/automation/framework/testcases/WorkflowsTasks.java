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

public class WorkflowsTasks extends TestCaseExecutor {

	LoginPage loginPage;
	AdminPage adminPage;
	MyRequests myRequests;
	AdvanceSearchHelper advanceSearch;

	public TestDataReader reader = new TestDataReader();

	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();
	static Logger log = Logger.getLogger(WorkflowsTasks.class);

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
		adminPage.clickManageWorkflows();
		Assert.assertTrue(adminPage.verifyWorkflowTitile());
	}

	// Workflow for Small Business

	@Test(priority = 1)
	public void test1_verifyWorkflowforSmallBusinessDisplayed()
			throws InterruptedException {
		Thread.sleep(4000);
		adminPage.enterWflw1();
//		Assert.assertEquals(adminPage.getWorkflow(),
//				"Workflow for Small Business");
	}

	@Test(priority = 2)
	public void test2_verifyworkflowPageDisplayed() throws InterruptedException {
		adminPage.clickEditOnWflw();
		adminPage.verifyWorkflowPageTitle();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void test3_verifyTasks() throws InterruptedException {
		adminPage.clickWflwNm();
		Thread.sleep(2000);
		adminPage.verifyPreAnalysisTasks();
		adminPage.verifyDecision();
		adminPage.verifyCustomerAcceptance();
		adminPage.verifyDueDiligence();
		adminPage.verifyLoanDocumentPreparation();
		adminPage.verifyClosing();
		adminPage.verifyBookingFundingServicing();
	}

	// New request for Money

	@Test(priority = 4)
	public void test4_verifyNewRequestForMoney() throws InterruptedException {
		adminPage.clickBackBtnOnWorkflow();
		Thread.sleep(4000);
		adminPage.enterwflw2();
//		Assert.assertEquals(adminPage.getWorkflow(), "* New Request for Money");
	}
	
	@Test(priority = 5)
	public void test5_verifyworkflowPageDisplayed() throws InterruptedException {
		adminPage.clickEditOnWflw();
		adminPage.verifyWorkflowPageTitle();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void test6_verifyTasksForNewRequestForMoney() throws InterruptedException
	{
		adminPage.clickWflwNm();
		Thread.sleep(2000);
		adminPage.verifyGeneralTask();
		adminPage.verifyCompliance();
		adminPage.verifyPreAnalysis();
		adminPage.verifyCreditAnalysis();
		adminPage.verifyDecisioning();
		adminPage.verifyFulfillmentDueDiligence();
		adminPage.verifyFulfillmentLoanDocumentPreparation();
		adminPage.verifyFulfillmentClosing();
		adminPage.verifyBookingAndFundingAndServicing();
		adminPage.verifyPostBooking();
		
		
	}

}
