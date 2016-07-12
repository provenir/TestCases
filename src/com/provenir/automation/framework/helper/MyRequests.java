package com.provenir.automation.framework.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.provenir.automation.framework.utility.Util;
import com.sun.jna.platform.win32.WinNT.WELL_KNOWN_SID_TYPE;

public class MyRequests {

	WebDriver driver;
	Actions actions = null;

	public MyRequests(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[@class='green_section']/div[1]/h2")
	private WebElement myDashboardTitle;

	@FindBy(how = How.XPATH, using = ".//table[@class='scroll tableGrid']/tbody/tr[1]/td[2]")
	private WebElement customerRecord;

	@FindBy(how = How.XPATH, using = "//*[@id='data_content']/div/table/tbody/tr[1]/td[1]")
	private WebElement expandIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='data_content']/div/table/tbody/tr[2]/td/div/div/div/div[1]")
	private WebElement lendingProcessTitle;

	@FindBy(how = How.XPATH, using = ".//*[@name='rmDasbrd']/span")
	private WebElement clickMyDashboard;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr[1]/td[3]/a")
	private WebElement clickReqOnDashboard;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr[1]/td[2]/a")
	private WebElement clickCustomerOnDashboard;

	@FindBy(how = How.XPATH, using = "//a[contains(@name,'credLineLnk00')]")
	private WebElement clickFacilityOnDashboard;

	@FindBy(how = How.ID, using = "home")
	private WebElement homeLink;

	@FindBy(how = How.ID, using = "srchTxt")
	private WebElement searchBox;

	@FindBy(how = How.ID, using = "selCredLine")
	private WebElement searchedFacility;

	@FindBy(how = How.XPATH, using = ".//*[@id='transSrchRes']//span[contains(.,'Load')]")
	private WebElement loadFacility;

	@FindBy(how = How.ID, using = "selCredReq")
	private WebElement searchedReq;

	@FindBy(how = How.XPATH, using = ".//*[@id='requestSrchRes']//span[contains(.,'Load')]")
	private WebElement loadReq;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr[1]/td[1]/img[@id='binddone']")
	private WebElement expand;

	@FindBy(how = How.XPATH, using = ".//*[@id='pgexpanded']/td/div/div[3]/div/a")
	private WebElement facWorkFlow;

	@FindBy(how = How.XPATH, using = "//label[contains(.,'Workflow Milestone')]")
	private WebElement workflowMilestoneText;

	@FindBy(how = How.XPATH, using = "//label[contains(.,'Decision')]")
	private WebElement decisionText;

	@FindBy(how = How.XPATH, using = "//label[contains(.,'From')]")
	private WebElement dateFromText;

	@FindBy(how = How.XPATH, using = "//label[contains(.,'To')]")
	private WebElement dateToText;

	@FindBy(how = How.ID, using = "saveFilterDetails")
	private WebElement filterBtnOnMyReq;

	@FindBy(how = How.ID, using = "testPG")
	private WebElement paginationGrid;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'All Selected')]")
	private WebElement ddlValue;

	@FindBy(how = How.XPATH, using = ".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[1]/p/div/button")
	private WebElement workFlowMilestone;

	@FindBy(how = How.XPATH, using = ".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[2]/p/div/button")
	private WebElement decisionMilestone;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'New Credit Request')]")
	private WebElement newCreditRequestLink;

	@FindBy(how = How.XPATH, using = ".//*[@name='selectAllworkflowmilestone']")
	private WebElement allOnWorkflowMilestone;

	@FindBy(how = How.XPATH, using = ".//*[@name='selectAlldecision']")
	private WebElement allOnDecision;

	@FindBy(how = How.ID, using = "datefrom")
	private WebElement fromDate;

	@FindBy(how = How.ID, using = "dateto")
	private WebElement toDate;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'My Requests')]")
	private WebElement myReqTitle;

	@FindBy(how = How.XPATH, using = "//span[@class='getcount']")
	private WebElement reqCount;

	@FindBy(how = How.XPATH, using = ".//*[@id='pgexpanded']/td/div/div[1]/div/a[@class='expandGridLinkIcon']")
	private WebElement credit360HyperlinkOnMyReqPage;

	@FindBy(how = How.XPATH, using = ".//*[@class='blueColor']")
	private WebElement reqName;

	@FindBy(how = How.XPATH, using = "//*[@id='data_content']/div/table/tbody/tr[1]/td[1]/img[1]")
	private WebElement expandReq;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'provenir/grid/images/minus.gif')]")
	private WebElement collapseSign;

	@FindBy(how = How.XPATH, using = "//img[@src='provenir/grid/images/plus.gif']")
	private WebElement expandSignOnReq;

	@FindBy(how = How.XPATH, using = ".//*[@id='pgexpanded']/td/div/div[1]/a")
	private WebElement wFlowExpandSign;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'toggle expand')]")
	private WebElement taskExpandSign;

	@FindBy(how = How.XPATH, using = ".//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[2]/div/div[4]/span")
	private WebElement taskDesc;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'My Team Tasks')]")
	private WebElement myTeamTasks;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'My Tasks')]")
	private WebElement myTasks;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'L West and Central Credit Group QUEUE')]")
	private WebElement grpQueue;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Automation Engineer QUEUE')]")
	private WebElement roleQueue;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'My Requests')]")
	private WebElement myRequests;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Create Customer')]")
	private WebElement createCustomer;

	@FindBy(how = How.ID, using = "newBBRequest")
	private WebElement boaWizard;

	private String dashboardRows = "//*[@id='data_content']/div/table/tbody/tr";
	private String reqOnDashboard = "//*[@id='data_content']/div/table/tbody/tr[1]";
	private String reqOnDashboard1 = "//*[@id='data_content']/div/table/tbody/tr";
	private String reqOnDashboard2 = ".//*[@id='credLnk']";
	private String facOnDashboard = ".//*[@id='credLineLnk0']";
	private String wFlowMilestone = ".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[1]/p/div/div/ul/li";
	private String expandSign = "//td[contains(@class,'gridClickable')]";

	private WebElement element = null;
	List<WebElement> lstWebElements = null;

	final Calendar cal = Calendar.getInstance();
	final DateFormat dForm = new SimpleDateFormat("yyyy-MM-dd");

	/*
	 * Service
	 */
	public void customerDetail() {
		customerRecord.click();

	}

	public String getMyDashboardTitle() {
		Util.waitForAJAX(driver);
		return myDashboardTitle.getText();
	}

	public int getCountOfAddedCustomerRows(String creditName) {
		List<WebElement> listRows = driver
				.findElements(By.xpath(dashboardRows));
		int cnt = 0;
		for (int i = 1; i <= listRows.size(); i++) {
			WebElement element = driver.findElement(By.xpath(dashboardRows
					+ "[" + i + "]/td[3]"));
			if (element.getText().equals(creditName)) {
				cnt++;
			}
		}
		return cnt;
	}

	public int getCountOfAddedCustomerName(String customerName) {
		List<WebElement> listRows = driver
				.findElements(By.xpath(dashboardRows));
		int cnt = 0;
		for (int i = 1; i <= listRows.size(); i++) {
			WebElement element = driver.findElement(By.xpath(dashboardRows
					+ "[" + i + "]/td[2]"));
			if (element.getText().equals(customerName)) {
				cnt++;
			}
		}
		return cnt;
	}

	public void clickExpandIcon() {
		expandIcon.click();
		Util.waitForAJAX(driver);

	}

	public boolean getLendingProcessTitle(String lendingProcess) {
		Util.waitForElement(driver, lendingProcessTitle, 10);

		String title = lendingProcessTitle.getText();
		String[] temp;
		String delimiter = ": ";
		temp = title.split(delimiter);
		System.out.println("**Passed string" + lendingProcess);
		System.out.println("***" + title);
		System.out.println("***temp" + temp);

		for (int i = 0; i < temp.length; i++) {

			if (temp[i].equalsIgnoreCase(lendingProcess)) {
				return true;
			}

		}

		return false;

	}

	public boolean getFacilityName(String oldFacilityName) {
		List<WebElement> listRows = driver
				.findElements(By.xpath(dashboardRows));

		for (int i = 1; i <= listRows.size(); i++) {
			WebElement addedFacilityName = driver.findElement(By
					.xpath(dashboardRows + "[" + i + "]/td[4]"));

			if (addedFacilityName.getText().equals(oldFacilityName)) {
				return true;
			}
		}

		return false;
	}

	public void clickDshboardLnk() {
		clickMyDashboard.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void clickReqOnDashboard() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickReqOnDashboard, 20);
		clickReqOnDashboard.click();
		Util.waitForAJAX(driver);
	}

	public void clickCustomerOnDashboard() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickCustomerOnDashboard, 20);
		clickCustomerOnDashboard.click();
		Util.waitForAJAX(driver);
	}

	public void clickFacilityOnDashboard1() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickFacilityOnDashboard, 20);
		clickFacilityOnDashboard.click();
		Util.waitForAJAX(driver);
	}

	public AdminPage clickHomeLink() {
		Util.waitForElement(driver, homeLink, 10);
		homeLink.click();
		Util.waitForAJAX(driver);
		return new AdminPage(driver);
	}

	public NewCreditRequest newCreditRequestLink() {
		Util.waitForElement(driver, newCreditRequestLink, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", newCreditRequestLink);

		Util.waitForAJAX(driver);
		return new NewCreditRequest(driver);
	}

	public NewCreditRequest BOALink() {
		Util.waitForElement(driver, boaWizard, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", boaWizard);
		Util.waitForAJAX(driver);
		return new NewCreditRequest(driver);
	}

	public TransactionInfoPage clickHomePage() {
		Util.waitForElement(driver, homeLink, 10);
		homeLink.click();
		Util.waitForAJAX(driver);
		return new TransactionInfoPage(driver);
	}

	public void clickHome() {
		Util.waitForElement(driver, homeLink, 10);
		homeLink.click();
		Util.waitForAJAX(driver);
	}

	public SearchHelper srchAssociatedFacility() {
		Util.waitForWorkflowToLoad(driver);
		Util.waitForLoaderToFinish(driver);
		searchBox.sendKeys("Fac 1234");
		searchBox.sendKeys(Keys.ENTER);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);

		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='transSrchRes']//span[contains(.,'Load')]"),
				20);
		searchedFacility.click();
		loadFacility.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		return new SearchHelper(driver);
	}

	public SearchHelper searchExistingRequest() {
		searchBox.sendKeys("Request HCL Corporation");
		searchBox.sendKeys(Keys.ENTER);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);

		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='requestSrchRes']//span[contains(.,'Load')]"),
				20);
		searchedReq.click();
		loadReq.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		return new SearchHelper(driver);
	}

	public SearchHelper searchExistingFacility() {
		searchBox.sendKeys("Fac for HCL Corporation");
		searchBox.sendKeys(Keys.ENTER);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);

		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='transSrchRes']//span[contains(.,'Load')]"),
				20);
		searchedFacility.click();
		loadFacility.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		return new SearchHelper(driver);
	}

	public Facility360Details clickFacilityOnDashboard() {
		Util.waitForWorkflowToLoad(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, clickFacilityOnDashboard, 15);
		clickFacilityOnDashboard.click();
		Util.waitForAJAX(driver);
		return new Facility360Details(driver);
	}

	public void expandRequest() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, expand, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", expand);

		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public Facility360Details clickOnAddedWorkflow()
			throws InterruptedException {
		Thread.sleep(8000);
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, facWorkFlow, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", facWorkFlow);

		Util.waitForLoaderToFinish(driver);
		return new Facility360Details(driver);
	}

	public SearchHelper searchExistingRequest1() {
		searchBox.sendKeys("Testcreditmilestone");
		searchBox.sendKeys(Keys.ENTER);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);

		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='requestSrchRes']//span[contains(.,'Load')]"),
				20);
		searchedReq.click();
		loadReq.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		return new SearchHelper(driver);
	}

	public boolean verifyAllFiltersDisplayed() {
		String s1 = workflowMilestoneText.getText().trim();
		String s2 = decisionText.getText().trim();
		String s3 = dateFromText.getText().trim();
		String s4 = dateToText.getText().trim();
		if (s1.equalsIgnoreCase("Workflow Milestone")
				&& s2.equalsIgnoreCase("Decision")
				&& s3.equalsIgnoreCase("From") && s4.equalsIgnoreCase("To")) {
			return true;
		} else
			return false;
	}

	public boolean verifyFilterBtnDisplayed() {
		if (filterBtnOnMyReq.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickFilterBtn() {
		Util.waitForElement(driver, filterBtnOnMyReq, 10);
		filterBtnOnMyReq.click();
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyPageIndicatorsDisplayed() {
		if (paginationGrid.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean verifyDefaultValues() {
		if (ddlValue.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void selectWorkflowMilestone() {
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[1]/p/div/button"),
				20);
		element = null;
		workFlowMilestone.click();
		allOnWorkflowMilestone.click();

		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[1]/p/div/div/ul/li[3]/label/input"));
		ele.click();
		workFlowMilestone.click();
	}

	public void selectDecisionMilestone() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[2]/p/div/button"),
				20);
		element = null;
		decisionMilestone.click();
		allOnDecision.click();

		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[2]/p/div/div/ul/li[4]/label/input"));
		ele.click();
		decisionMilestone.click();
	}

	public void enterFromDate() {
		Util.waitForElement(driver, fromDate, 5);
		fromDate.clear();
		fromDate.sendKeys(fromDate());
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a"));
		ele.click();
	}

	public String fromDate() {
		cal.add(Calendar.DATE, -15);
		final String fromDate = dForm.format(cal.getTime());
		return fromDate;
	}

	public void enterToDate() {
		Util.waitForElement(driver, toDate, 5);
		toDate.clear();
		toDate.sendKeys(toDate());
	}

	public String toDate() {
		cal.add(Calendar.DATE, 10);
		final String toDate = dForm.format(cal.getTime());
		return toDate;
	}

	public boolean verifyWorkflowStatusAsInProgress() {
		WebElement ele = driver.findElement(By
				.xpath("//td[contains(.,'In Progress')]"));
		String s1 = ele.getText().trim();
		if (s1.equalsIgnoreCase("In Progress")) {
			return true;
		} else
			return false;
	}

	public boolean verifyDecisionStatusAsUndecided() {
		WebElement ele = driver.findElement(By
				.xpath("//td[contains(.,'Undecided')]"));
		String s1 = ele.getText().trim();
		if (s1.equalsIgnoreCase("Undecided")) {
			return true;
		} else
			return false;
	}

	public void selectDecisionMilestoneAsUndecided() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[2]/p/div/button"),
				20);
		element = null;
		decisionMilestone.click();
		allOnDecision.click();

		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='SAVEREQUESTFILTERFORM']/div[2]/div/div[2]/p/div/div/ul/li[4]/label/input"));
		ele.click();
		decisionMilestone.click();
	}

	public boolean verifyReqCount() {
		String s1 = reqCount.getText().trim();
		if (s1.equalsIgnoreCase("Request Count 20")) {
			return true;
		} else
			return false;
	}

	public Credit360Helper clickOnAnyReqFromDashboard() {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver, By.xpath(reqOnDashboard2), 20);

		List<WebElement> reqListOnDashboard = driver.findElements(By
				.xpath(reqOnDashboard2));
		for (int i = 1; i < reqListOnDashboard.size(); i++) {
			System.out.println("Count  =  " + reqListOnDashboard.size());
			reqListOnDashboard.get(1).click();
			Util.waitForLoaderToFinish(driver);
		}
		return new Credit360Helper(driver);
	}

	public Facility360Details clickOnAnyFacilityFromDashboard() {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver, By.xpath(facOnDashboard), 20);

		List<WebElement> reqListOnDashboard = driver.findElements(By
				.xpath(facOnDashboard));
		for (int i = 1; i < reqListOnDashboard.size(); i++) {
			System.out.println("Count  =  " + reqListOnDashboard.size());
			reqListOnDashboard.get(1).click();
			Util.waitForLoaderToFinish(driver);

		}
		return new Facility360Details(driver);
	}

	public void expandReqToVerifyHyperlink() {
		Util.waitForElement(driver, expandReq, 15);
		expandReq.click();
		Util.waitForWorkflowToLoad(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyHeaderOnTM() {
		Util.waitForElement(driver, reqName, 10);
		if (reqName.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void expandWFlowByExpanding() {
		Util.waitForElement(driver, wFlowExpandSign, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wFlowExpandSign);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyCollapseAllOption() {
		Util.waitForElement(driver, collapseSign, 10);
		if (collapseSign.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickCollapseOption() {
		Util.waitForElement(driver, collapseSign, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", collapseSign);
		Util.waitForAJAX(driver);
	}

	public boolean verifyExpandAllOption() {
		Util.waitForElement(driver, expandSignOnReq, 10);
		if (expandSignOnReq.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean verifyExpandAllOptionOfTasks() {
		Util.waitForElement(driver, taskExpandSign, 10);
		if (taskExpandSign.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean verifyTaskListDisplayed() throws InterruptedException {
		Thread.sleep(6000);
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, taskDesc, 15);
		String str = taskDesc.getText().trim();
		if (str.equalsIgnoreCase("Task Description")) {
			return true;
		} else
			return false;
	}

	public MyTeamTasks clickMyTeamTasksLink() {
		Util.waitForElement(driver, myTeamTasks, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", myTeamTasks);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new MyTeamTasks(driver);
	}

	public MyTasks clickMyTasksLink() {
		Util.waitForElement(driver, myTasks, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", myTasks);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new MyTasks(driver);
	}

	public GroupQueue clickGroupQueue() {
		Util.waitForElement(driver, grpQueue, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", grpQueue);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new GroupQueue(driver);
	}

	public RoleQueue clickRoleQueue() {
		Util.waitForElement(driver, roleQueue, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", roleQueue);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new RoleQueue(driver);
	}

	public void clickMyRequests() {
		Util.waitForElement(driver, myRequests, 10);
		myRequests.click();
		Util.waitForAJAX(driver);
	}
	
	public void clickMyReq() {
		Util.waitForElement(driver, myRequests, 10);
		Util.scollTop(driver);
		myRequests.click();
		Util.waitForAJAX(driver);
	}

	public void clickCreateCustomer() {
		Util.scrollDown(driver);
		Util.waitForElement(driver, createCustomer, 10);
		createCustomer.click();
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	// to check element is not present in the page

	public boolean isCreateCustomerDisplayed() {
		List<WebElement> lst = driver.findElements(By
				.xpath("//span[contains(.,'Create Customer')]"));
		if (lst.isEmpty()) {
			System.out.println("element does not exist");
			return true;
		} else
			return false;
	}

	public LogoutPage clickMyRequetsLink() {
		Util.waitForElement(driver, myRequests, 10);
		myRequests.click();
		Util.waitForAJAX(driver);
		return new LogoutPage(driver);
	}

	public boolean verifyBOAWizardLinkOnLeftNav() {
		Util.waitForAJAX(driver);
		if (boaWizard.isDisplayed())
			return true;
		else
			return false;
	}

	public String getMyRequestsTitle() {
		Util.waitForAJAX(driver);
		return myReqTitle.getText().trim();
	}

	public Credit360Helper gotoCredit360() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, credit360HyperlinkOnMyReqPage, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", credit360HyperlinkOnMyReqPage);
//		credit360HyperlinkOnMyReqPage.click();
		Util.waitForAJAX(driver);
		return new Credit360Helper(driver);
	}

	public void expandReqToVerifyTM() {
		Util.waitForElement(driver, expandReq, 20);
		expandReq.click();
		Util.waitForAJAX(driver);
		Util.waitForWorkflowToLoad(driver);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}
}
