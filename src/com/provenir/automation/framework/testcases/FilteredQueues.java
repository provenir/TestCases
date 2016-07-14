package com.provenir.automation.framework.testcases;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.provenir.automation.framework.helper.CollateralInfoPage;
import com.provenir.automation.framework.helper.Credit360Details;
import com.provenir.automation.framework.helper.Credit360Helper;
import com.provenir.automation.framework.helper.CustomerInfoPage;
import com.provenir.automation.framework.helper.Facility360Details;
import com.provenir.automation.framework.helper.GroupQueue;
import com.provenir.automation.framework.helper.LoginPage;
import com.provenir.automation.framework.helper.MyRequests;
import com.provenir.automation.framework.helper.MyTasks;
import com.provenir.automation.framework.helper.MyTeamTasks;
import com.provenir.automation.framework.helper.NewCreditRequest;
import com.provenir.automation.framework.helper.RoleQueue;
import com.provenir.automation.framework.helper.SearchHelper;
import com.provenir.automation.framework.helper.TransactionInfoPage;
import com.provenir.automation.framework.utility.TestCaseExecutor;
import com.provenir.automation.framework.utility.TestDataReader;

public class FilteredQueues extends TestCaseExecutor {

	LoginPage loginPage;
	MyRequests myRequests;
	NewCreditRequest creditRequest;
	CustomerInfoPage customerInfoPage;
	CollateralInfoPage collateralInfoPage;
	TransactionInfoPage transactionInfoPage;
	Credit360Helper credit360;
	Credit360Details credit360Details;
	Facility360Details facility360;
	SearchHelper searchHelper;
	MyTeamTasks myTeamTasks;
	MyTasks myTask;
	GroupQueue groupQueue;
	RoleQueue roleQueue;

	public TestDataReader reader = new TestDataReader();

	private String option;
	private HashMap<String, Map<String, String>> _hashLogins = new HashMap<String, Map<String, String>>();

	static Logger log = Logger.getLogger(FacilityLevelWorkflow.class);

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeMethod(String browserValue) {
		loginPage = new LoginPage(getDriver(browserValue));
		myRequests = new MyRequests(getDriver(browserValue));
	}

	@Test(priority = 0)
	public void test1_landingPage() {
		log.info("Login to Prism and search customer");
		reader.readValue(_hashLogins, "resources/Login.json");
		loginPage.login(_hashLogins);
	}

	@Test(priority = 1)
	public void test2_verifyFiltersOnMyRequestsPage() {
		myRequests = loginPage.clickMyRequetsLink();
		myRequests.verifyAllFiltersDisplayed();
		myRequests.verifyFilterBtnDisplayed();
		myRequests.verifyPageIndicatorsDisplayed();
	}

	@Test(priority = 2)
	public void test3_verifyDefaultValuesOfFilters() {
		myRequests.verifyDefaultValues();
	}

	@Test(priority = 3)
	public void test4_verifyFiltersFunctionality() {
		myRequests.selectWorkflowMilestone();
		myRequests.selectDecisionMilestone();
		myRequests.clickFilterBtn();
	}

	@Test(priority = 4)
	public void test5_verifyInitialWorkflowStatusOfNewlyCreatedRequest() {
		myRequests.clickHome();
		myRequests.selectWorkflowMilestone();
		myRequests.verifyWorkflowStatusAsInProgress();
		myRequests.clickFilterBtn();
	}

	@Test(priority = 5)
	public void test6_verifyInitialDecisionStatusOfNewlyCreatedRequest() {
		myRequests.selectDecisionMilestoneAsUndecided();
		myRequests.verifyDecisionStatusAsUndecided();
		myRequests.clickFilterBtn();
	}

	@Test(priority = 6)
	public void test7_verifyReqCount() {
		myRequests.verifyReqCount();
	}

	@Test(priority = 7)
	public void test8_verifyExpandAllOnMyReqPage() {
		myRequests.verifyExpandAllOption();
	}

	@Test(priority = 8)
	public void test9_verifyHeaderOnTMActAsHyperlink() {
		myRequests.expandReqToVerifyHyperlink();
		myRequests.verifyHeaderOnTM();
	}

	@Test(priority = 9)
	public void test10_verifyWorkflowExpandedOrNot() {
		myRequests.expandWFlowByExpanding();
	}

	@Test(priority = 10)
	public void test11_verifyTaskListDisplayedOnExpanding() throws InterruptedException {
		myRequests.verifyTaskListDisplayed();
	}

	@Test(priority = 11)
	public void test12_verifyExpandBtnAgainstEachTask() {
		myRequests.verifyExpandAllOptionOfTasks();
	}

	@Test(priority = 12)
	public void test13_verifyCollapseAllFunctionality() {
		myRequests.verifyCollapseAllOption();
	}

	@Test(priority = 13)
	public void test14_clickCollapseOption() {
		myRequests.clickCollapseOption();
	}

	// @Test(priority = 14)
	// public void test15_verifyExpansionOfTMOnCredit360() {
	// credit360 = myRequests.clickOnAnyReqFromDashboard();
	//
	// // searchHelper.srchExistingReq();
	// // credit360 = searchHelper.clickCreditSummary();
	//
	// credit360.clickTaskManagement();
	// credit360.clickExpandIconOnTM();
	// credit360.verifyTaskDisplayedOrNot();
	// }
	//
	// @Test(priority = 15)
	// public void test16_verifyExpansionOfTMOnFacility360() {
	// myRequests = credit360.clickHome();
	// facility360 = myRequests.clickOnAnyFacilityFromDashboard();
	// facility360.clickTaskManagement();
	// facility360.clickExpandIconOnTM();
	// facility360.verifyTaskDisplayedOrNot();
	// }

	// my team tasks

	@Test(priority = 16)
	public void test17_verifyMyTeamTasksPage() {
		// myRequests = facility360.clickHome();
		myTeamTasks = myRequests.clickMyTeamTasksLink();
		myTeamTasks.verifyMyTeamTasksTitle();
	}

	@Test(priority = 17)
	public void test18_verifyFiltersOnMyTeamTasksPage() {
		myTeamTasks.verifyFiltersOnMyTeamTasks();
	}

	@Test(priority = 18)
	public void test19_verifyDefaultValuesOfFiltersOnMyTeamTasksPage() {
		myTeamTasks.verifyDefaultValueOfFilters();
	}

	@Test(priority = 19)
	public void test20_verifyFilterationOnMyTeamTasksPage() {
		myTeamTasks.selectEntityType();
		myTeamTasks.selectStatus();
		myTeamTasks.clickFilterBTn();
	}

	// my task page

	@Test(priority = 20)
	public void test21_verifyMyTaskPageDisplayed() {
		myRequests = myTeamTasks.clickHome();
		myTask = myRequests.clickMyTasksLink();
		myTask.verifyMyTaskPage();
	}

	@Test(priority = 21)
	public void test22_verifyFiltersOnMyTasksPAge() {
		myTask.verifyFiltersOnMyTasks();
	}

	@Test(priority = 22)
	public void test23_verifyDefaultValuesOfFiltersOnMyTasksPage() {
		myTask.verifyDefaultValueOfFilters();
	}

	@Test(priority = 23)
	public void test24_verifyFilterationOnMyTasksPage() {
		myTask.selectEntityType();
		myTask.selectStatus();
		myTask.clickFilterBTn();
	}

	// group queue

	@Test(priority = 24)
	public void test25_verifyGroupQueuePageDisplayed() {
		myRequests = myTask.clickHome();
		groupQueue = myRequests.clickGroupQueue();
		groupQueue.verifyGroupQueueTitle();
	}

	@Test(priority = 25)
	public void test26_verifyFiltersOnGroupQueue() {
		groupQueue.verifyFiltersOnGroupQueue();
	}

	@Test(priority = 26)
	public void test27_verifyDefaultValuesOfFiltersOnGroupQueue() {
		groupQueue.verifyDefaultValueOfFilters();
	}

	@Test(priority = 27)
	public void test28_verifyFilterationOnGroupQueue() {
		groupQueue.selectEntityType();
		groupQueue.selectStatus();
		groupQueue.clickFilterBtn();
	}

	// // role queue
	//
	// @Test(priority = 28)
	// public void test29_verifyRoleQueuePageDisplayed() {
	// myRequests = groupQueue.clickHome();
	// roleQueue = myRequests.clickRoleQueue();
	// roleQueue.verifyRoleQueueTitle();
	// }
	//
	// @Test(priority = 29)
	// public void test30_verifyFiltersOnRoleQueue() {
	// roleQueue.verifyFiltersOnGroupQueue();
	// }
	//
	// @Test(priority = 30)
	// public void test31_verifyDefaultValuesOfFiltersOnRoleQueue() {
	// roleQueue.verifyDefaultValueOfFilters();
	// }
	//
	// @Test(priority = 31)
	// public void test32_verifyFilterationOnRoleQueue() {
	// roleQueue.selectEntityType();
	// roleQueue.selectStatus();
	// roleQueue.clickFilterBtn();
	// }
	//
	// // sorting of columns on My Requests page
	//
	// @Test(priority = 32)
	// public void test33_gotoOnMTasks() {
	// myRequests = roleQueue.clickHome();
	// myTask = myRequests.clickMyTasksLink();
	// myTask.verifyMyTaskPage();
	// }
	//
	// @Test(priority = 33)
	// public void test34_verifySortedColumnsOnMyTasks() {
	// myTask.clickDueOnIndicator();
	// }

}
