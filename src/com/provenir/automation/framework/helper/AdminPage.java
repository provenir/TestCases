package com.provenir.automation.framework.helper;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.provenir.automation.framework.utility.Util;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class AdminPage {

	WebDriver driver;
	Actions actions = null;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "PGADMIN")
	private WebElement adminLink;

	@FindBy(how = How.XPATH, using = "//*[@id='left']/div/div/ul/li[18]/a/span")
	private WebElement securitySettings;

	@FindBy(how = How.XPATH, using = ".//*[@id='roleSec']/div[2]/span/input")
	private WebElement role;

	@FindBy(how = How.XPATH, using = ".//*[@id='securityContainer']/div[2]/div[2]/span/input")
	private WebElement category;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Manage Workflows')]")
	private WebElement manageWorkflows;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Team Roles')]")
	private WebElement teamRoles;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Checklist Summary')]")
	private WebElement chklistSummary;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Checklist Summary')]")
	private WebElement verifyChklistSummaryTitle;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Team Role Editor ')]")
	private WebElement verifyTeamRoles;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Add')]")
	private WebElement addOnManageWorkflows;

	@FindBy(how = How.XPATH, using = "//a[contains(.,'Add')]")
	private WebElement addOnManageWorkflows1;

	@FindBy(how = How.XPATH, using = ".//*[@id='content']/tbody/tr/td[3]/div/div[1]/div[1]/a[2]/span")
	private WebElement verifyWorkflowPage;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Save')]")
	private WebElement saveWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='valiadtionOther']/h2/a[2]")
	private WebElement crossBtn;

	@FindBy(how = How.ID, using = "nameError")
	private WebElement errMsgOnManageWorkflow;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Add')]")
	private WebElement addBtnOnWorkflowPage;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Remove')]")
	private WebElement deleteBtnOnWorkflowPage;

	@FindBy(how = How.ID, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]")
	private WebElement taskNameOnGrid;

	@FindBy(how = How.XPATH, using = ".//*[@id='content']/tbody/tr/td[3]/div/div/div[1]/h2")
	private WebElement workflowSummaryTitle;

	@FindBy(how = How.ID, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[3]")
	private WebElement taskCodeOnGrid;

	@FindBy(how = How.ID, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[5]")
	private WebElement roleAssignmentOnGrid;

	@FindBy(how = How.ID, using = ".//*[@id='roleListDD']")
	private WebElement roleAssignment;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]/select[@id='taskListDD']")
	// private WebElement taskName;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskListDD']")
	private WebElement taskName;

	@FindBy(how = How.XPATH, using = "//*[@id='checklistContentDiv']/div/table/tbody/tr/td[4]/a")
	private WebElement actionMenuOnChklist;

	@FindBy(how = How.XPATH, using = "//*[@id='checklistContentDiv']/div/table/tbody/tr/td[4]/div/div/div/div/ul/li[1]/a")
	private WebElement editOnChklist;

	@FindBy(how = How.XPATH, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[9]")
	private WebElement milestoneOnGrid;

	@FindBy(how = How.XPATH, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[9]/input")
	private WebElement milestone;

	@FindBy(how = How.XPATH, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]")
	private WebElement milestoneNameOnGrid;

	@FindBy(how = How.XPATH, using = ".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]/select")
	private WebElement milestoneName;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Indent')]")
	private WebElement indent;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Outdent')]")
	private WebElement outdent;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Cancel')]")
	private WebElement cancelOnManageWorkflow;

	@FindBy(how = How.ID, using = "wfName")
	private WebElement creditWorkflow;

	@FindBy(how = How.ID, using = "wfName")
	private WebElement facilityWorkflow;

	@FindBy(how = How.ID, using = "srchWfName")
	private WebElement srchboxOnWorkflowSummary;

	@FindBy(how = How.ID, using = "imgSearchWorkflow")
	private WebElement srchIconOnWorkflowSummary;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div/div[5]/div/div[1]/div[1]")
	private WebElement workflowName;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div/div[5]/div/div/div[2]")
	private WebElement savedWorkflowType;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div/div[5]/div/div[1]/div[4]/a")
	private WebElement actionMenuOnSearchedWorkflow;

	@FindBy(how = How.LINK_TEXT, using = "Set As Default")
	private WebElement setWorkflowAsDefault;

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement editWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='container']/div[9]/div/div/div/ul/li[3]/a")
	private WebElement copyWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='valdationMsg']/div/h2")
	private WebElement aftersaveConfirmation;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div[2]/div[2]/div/div[2]/span[2]")
	private WebElement selectWorkflowTypeInWorkflowSummary;

	@FindBy(how = How.ID, using = "backBC")
	private WebElement backBtnOnWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='securityData']/table/thead/th[2]/input")
	private WebElement parentEditBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='securityData']/table/tbody/tr[11]/td[5]/input[2]")
	private WebElement createCust;

	@FindBy(how = How.XPATH, using = ".//*[@id='securityData']/table/tbody/tr[11]/td[5]/div[3]")
	private WebElement DEPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='securityData']/table/tbody/tr[18]/td/div/a[2]")
	private WebElement saveOnSecuritySettings;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Ok')]")
	private WebElement okOnSecurityPopup;

	@FindBy(how = How.XPATH, using = "//*[@id='securityData']/table/thead/th[5]")
	private WebElement rule;

	@FindBy(how = How.XPATH, using = "//*[@id='securityData']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[5]/input[2]")
	private WebElement projectedClosedDate;

	@FindBy(how = How.XPATH, using = "//*[@id='securityData']/table/tbody/tr[5]/td[5]/input[2]")
	private WebElement bookingDetails;

	@FindBy(how = How.ID, using = "srchTeamRole")
	private WebElement srchTeamRole;

	@FindBy(how = How.ID, using = "srchChecklist")
	private WebElement srchChecklist;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'searchButtonIcon')]")
	private WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTTEAMROLEFORM']/div[4]/table/tbody/tr[1]/td[1]")
	private WebElement verifyRoleNm;

	@FindBy(how = How.XPATH, using = "//*[@id='checklistContentDiv']/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement verifyChecklistName;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTTEAMROLEFORM']/div[4]/table/tbody/tr[2]/td[1]")
	private WebElement verifyRNm;

	@FindBy(how = How.XPATH, using = "//*[@id='myGrid']/div/div[5]/div/div/div[1]")
	private WebElement verifyWflwName;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Workflow Summary')]")
	private WebElement verifyWorkflowSummary;

	@FindBy(how = How.XPATH, using = "//*[@id='myGrid']/div/div[5]/div/div/div[4]/a")
	private WebElement actionMenuWorkflowSummary;

	@FindBy(how = How.XPATH, using = "//*[@id='myGrid']/div/div[5]/div/div/div[4]/div/div/div/div/ul/li[2]/a")
	private WebElement editLinkWorkflowSummary;

	@FindBy(how = How.ID, using = "wfNameLabel")
	private WebElement wflwNm;

	private String roleOnSecurity = ".//*[@id='roleSec']/div[2]/span/input";
	private String workflowType = "processTypeCd";
	private String s = ".//*[@id='securityData']/table/tbody/tr[11]/td[5]/div[3]";

	private String wflw1 = "Workflow for Small Business";
	private String wflw2 = "New Request for Money";

	private String role1 = "SALESADMN";
	private String role2 = "LOANOFCR";
	private String role3 = "SALESMNGR";
	private String role4 = "SALESEXCTV";
	private String role5 = "RELNMGR";
	private String role6 = "CRDTADMN";
	private String role7 = "CRDANLST";
	private String role8 = "SRCRDTANLSYST";
	private String role9 = "CREDOFFICER";
	private String role10 = "SRCREDOFFICER";
	private String role11 = "CHIEFCREDOFFICER";
	private String role12 = "OPRTNMNGR";
	private String role13 = "PRTFLIOMNGR";
	private String role14 = "PRTFLIOADMN";
	private String role15 = "SCRTYOFSR";
	private String role16 = "CMPLIANSANLSYST";
	private String role17 = "DOCMNGR";
	private String role18 = "DOCSPCLIST";
	private String role19 = "COLLATRLMNGR";
	private String role20 = "COLLATRLANALSYST";
	private String role21 = "UCCSPCLST";
	private String role22 = "IMGINGSPCLST";
	private String role23 = "FNDINGSPCLST";
	private String role24 = "BOKINGSPCLST";
	private String role25 = "PROVADMIN";
	private String role26 = "CRDRISKMGR";
	private String role27 = "COMPLIANCE";
	private String role28 = "SBBO";
	private String role29 = "UNDERWRITER";
	private String role30 = "SBANALYST";
	private String role31 = "SBUW";
	private String role32 = "SBCLOSER";

	private String chklist1 = "Eligibility Checklist";
	private String chklist2 = "Policy Exception Checklist";
	private String chklist3 = "Conditions and Precedent";
	private String chklist4 = "Closing Checklist";
	private String chklist5 = "Post-Booking QA checklist";
	private String chklist6 = "Pre-Booking Checklist";
	private String chklist7 = "Pre-Funding Checklist";
	private String chklist8 = "Pre-Closing Checklist";
	private String chklist9 = "Document Checklist";
	private String chklist10 = "Due Diligence Checklist";
	private String chklist11 = "Application Checklist";

	public LoginPage clickAdminLink() throws InterruptedException {

		try {
			int count = driver.findElements(By.id("PGADMIN")).size();
			count = driver.findElements(
					By.xpath("//a[contains(@id, 'PGADMIN')]")).size();
			System.out.println("Count = " + count);
		} catch (Exception e) {
			int count = driver.findElements(
					By.xpath("//a[contains(@id, 'PGADMIN')]")).size();
			System.out.println("Count = " + count);
			System.out.println("Element not found");
		}

		System.out.println("before admin link click");
		adminLink.click();
		System.out.println("after admin link click");
		Thread.sleep(5000);
		Util.waitForAJAX(driver);
		return new LoginPage(driver);
	}

	public void clickManageWorkflows() {
		Util.waitForElement(driver, manageWorkflows, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", manageWorkflows);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public void clickTeamRoles() {
		Util.waitForElement(driver, teamRoles, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", teamRoles);
		Util.waitForAJAX(driver);
	}

	public void clickChecklistSummary() {
		Util.waitForElement(driver, teamRoles, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chklistSummary);
		Util.waitForAJAX(driver);
	}

	public boolean verifyChecklistSummary() {
		Util.waitForAJAX(driver);
		if (verifyChklistSummaryTitle.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTeamRoles() {
		Util.waitForAJAX(driver);
		if (verifyTeamRoles.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickAddBtnOnWorkflowSummary() {
		Util.waitForElement(driver, addOnManageWorkflows1, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addOnManageWorkflows1);
		Util.waitForAJAX(driver);
	}

	public void clickAddBtnOnWorkflowSummary1() {
		Util.waitForElement(driver, addOnManageWorkflows, 10);
		addOnManageWorkflows.click();
		Util.waitForAJAX(driver);
	}

	public ManageWorkflow clickAddBtnOnWorkflowSumm() {
		Util.waitForElement(driver, addOnManageWorkflows, 10);
		addOnManageWorkflows.click();
		Util.waitForAJAX(driver);
		return new ManageWorkflow(driver);
	}

	public void clickSecuritySettings() throws InterruptedException {
		Thread.sleep(2000);
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//*[@id='left']/div/div/ul/li[18]/a/span"), 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", securitySettings);

		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public void selectCustomer360FromCategoryOnSecurity(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='securityContainer']/div[2]/div[2]/span/input"),
				10);
		option = "Customer360";
		Util.selectItemFromList(driver, category, option);
		Util.waitForAJAX(driver);
	}

	public void selectCategoryFromSecurity() {
		Util.enableAllDropdowns(driver);
		driver.findElement(
				By.xpath(".//*[@id='securityContainer']/div[2]/div[2]/span/input"))
				.sendKeys("dash");
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"),
				5);
		driver.findElement(By.xpath("//a[contains(.,'DashBoardLinks')]"))
				.click();
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public void selectCredit360AsCategoryFromSecurity() {
		Util.enableAllDropdowns(driver);
		driver.findElement(
				By.xpath(".//*[@id='securityContainer']/div[2]/div[2]/span/input"))
				.sendKeys("credit");
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"),
				5);
		driver.findElement(By.xpath("//a[contains(.,'Credit 360')]")).click();
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public String getRoles() {
		WebElement ele = driver.findElement(By.name("securityCd"));
		String s = ele.getAttribute("name");
		System.out.println("***********" + s);
		return s;
	}

	public void selectRoleFromSecurity(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(".//*[@id='roles']"), 20);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='roles']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Auto Engineer");
		WebElement ele1 = driver.findElement(By
				.xpath("//strong[contains(.,'Auto Engineer')]"));
		ele1.click();
		Util.waitForAJAX(driver);
	}

	public void selectGroupFromSecurity() {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		driver.findElement(By.xpath(".//*[@id='groupSec']/div[2]/span/input"))
				.sendKeys("insti");
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"),
				5);
		driver.findElement(
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"))
				.click();
		Util.waitForAJAX(driver);
	}

	public void selectRoleFromSecurity() {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		driver.findElement(By.xpath(".//*[@id='roleSec']/div[2]/span/input"))
				.sendKeys("Provenir Admin");
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"),
				5);
		driver.findElement(
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"))
				.click();
		Util.waitForAJAX(driver);
	}

	public void selectRuleBasedGroupFromSecurity() {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		driver.findElement(By.xpath(".//*[@id='groupSec']/div[2]/span/input"))
				.sendKeys("rule");
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"),
				5);
		driver.findElement(
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"))
				.click();
		Util.waitForAJAX(driver);
	}

	public void verifyWorkflowPageTitle() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, verifyWorkflowPage, 10);
		String title = verifyWorkflowPage.getText().trim();
		Assert.assertEquals("Process Details", title);
	}

	public boolean verifyMandatoryDetailsOnManageWorkflow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveWorkflow);
		if (errMsgOnManageWorkflow.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickCrossOnManageWorkflow() {
		Util.waitForElement(driver, crossBtn, 10);
		crossBtn.click();
	}

	public void clickAddBtnOnManageWorkflow() {
		Util.waitForElement(driver, addBtnOnWorkflowPage, 10);
		addBtnOnWorkflowPage.click();
	}

	public void selectTaskName(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]"),
				15);
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[1]/input"));
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(1).click();

		option = "Add Customer Address";
		Util.selectItemFromList(driver, taskName, option);
	}

	public void selectTaskName1(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]"),
				15);
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[1]/input"));
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(1).click();

		option = "Annual Review Documents";
		Util.selectItemFromList(driver, taskName, option);
	}

	public void selectTaskName2(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]"),
				15);
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[1]/input"));
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(1).click();

		option = "Compliance";
		Util.selectItemFromList(driver, taskName, option);
	}

	public void selectTaskName3(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]"),
				15);
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[1]/input"));
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(1).click();

		option = "General Task";
		Util.selectItemFromList(driver, taskName, option);
	}

	public void selectTaskName4(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[2]"),
				15);
		WebElement ele = driver
				.findElement(By
						.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[1]/input"));
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(1).click();

		option = "ABCQueue";
		Util.selectItemFromList(driver, taskName, option);
	}

	public void enterTaskCode() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[3]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(2).click();
	}

	public void selectRoleAssignment(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[5]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(4).click();

		option = "Automation Engineer";
		Util.selectItemFromList(driver, roleAssignment, option);
	}

	public void clickMilestone() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[9]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(8).click();
		milestone.click();
	}

	public void enterMilestoneAsOnboarded(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Onboarded";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsComplianceComplete(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Compliance Complete";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsUnderwritingComplete(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Underwriting Complete";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsFinancialsReviewed(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Financials Reviewed";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsPreliminaryAcceptance(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Preliminary Acceptance";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsReadyForReview(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Ready for Review";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void enterMilestoneAsCompleted(String option) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='processGrid']/div[2]/div[5]/div/div/div[10]"),
				5);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		System.out.println("Count - " + elements.size());
		elements.get(9).click();
		option = "Completed";
		Util.selectItemFromList(driver, milestoneName, option);
	}

	public void selectWorkflowTypeAsCredit(String option) {
		Util.waitForElementPresent(driver, By.xpath(workflowType), 10);
		option = "Credit";
		Util.selectItemFromList(driver, workflowType, option);
	}

	public void selectWorkflowTypeAsFacility(String option) {
		Util.waitForElementPresent(driver, By.xpath(workflowType), 10);
		option = "Facility";
		Util.selectItemFromList(driver, workflowType, option);
	}

	public boolean verifyWorkflowTypeAsCredit(String option) {
		selectWorkflowTypeAsCredit(option);
		String s = driver
				.findElement(
						By.xpath(".//*[@id='processGrid']/div[1]/div[2]/span/input"))
				.getText().trim();
		if (s.contains(option)) {
			return true;
		} else
			return false;
	}

	public boolean verifyWorkflowTypeAsFacility(String option) {
		selectWorkflowTypeAsCredit(option);
		String s = driver
				.findElement(
						By.xpath(".//*[@id='processGrid']/div[1]/div[2]/span/input"))
				.getText().trim();
		if (s.contains(option)) {
			return true;
		} else
			return false;
	}

	public void clickOnSearchIconOnWorkflowSummary() {
		Util.waitForElement(driver, srchIconOnWorkflowSummary, 5);
		srchIconOnWorkflowSummary.click();
		Util.waitForAJAX(driver);
	}

	public void enterCreditWorkflowNameToSearch() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 15);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys("Credit level workflow");
	}

	public void enterDefaultCreditWorkflow() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 15);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys("New Request for Money");
	}

	public void enterFacilityWorkflowNameToSearch() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 15);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys("Facility level workflow");
	}

	public void enterDefaultFacilityWorkflow() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 15);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys("New Request for Money");
	}

	public boolean verifySavedWorkflowAsCredit() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, workflowName, 10);
		String s1 = workflowName.getText().trim();
		String s2 = savedWorkflowType.getText().trim();
		if (s1.equalsIgnoreCase("Credit level workflow")
				&& s2.equalsIgnoreCase("Credit")) {
			return true;
		} else
			return false;
	}

	public boolean verifySavedWorkflowAsFacility() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, workflowName, 10);
		String s1 = workflowName.getText().trim();
		String s2 = savedWorkflowType.getText().trim();
		if (s1.equalsIgnoreCase("Facility level workflow")
				&& s2.equalsIgnoreCase("Facility")) {
			return true;
		} else
			return false;
	}

	public boolean verifyActionMenuPresentOnWorkflow() {
		if (actionMenuOnSearchedWorkflow.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void setWorkflowAsDefault() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionMenuOnSearchedWorkflow, 10);
		actions.moveToElement(actionMenuOnSearchedWorkflow).click().build()
				.perform();
		Util.waitForElement(driver, setWorkflowAsDefault, 10);
		setWorkflowAsDefault.click();
		Util.waitForAJAX(driver);
	}

	public void editWorkflow() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='myGrid']/div/div[5]/div/div[1]/div[4]/a"),
				10);
		List<WebElement> elements = driver
				.findElements(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div"));

		WebElement ele = driver
				.findElement(By
						.xpath("//div[contains(@class, 'ui-widget-content slick-row even')]/div/div/div/div/div/ul/li"));

		actions.moveToElement(ele).build().perform();
		for (int i = 1; i <= elements.size(); i++) {
			WebElement ele1 = driver.findElement(By.xpath(ele + "[" + i
					+ "]//a[@oper='Edit']"));
			if (ele1.getText().equalsIgnoreCase("Edit")) {

				ele1.click();
			}
		}
		Util.waitForAJAX(driver);
	}

	public void copyWorkflow() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionMenuOnSearchedWorkflow, 10);
		actions.moveToElement(actionMenuOnSearchedWorkflow).click().build()
				.perform();
		Util.waitForElement(driver, copyWorkflow, 10);
		copyWorkflow.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyCopiedWorkflowName() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, facilityWorkflow, 10);
		String title = facilityWorkflow.getText().trim();
		if (title.equalsIgnoreCase("Copy of Facility level workflow")) {
			return true;
		} else
			return false;
	}

	public boolean verifyWorkflowSummaryTitle() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, workflowSummaryTitle, 10);
		if (workflowSummaryTitle.isDisplayed()) {
			workflowSummaryTitle.click();
			return true;
		} else
			return false;
	}

	public void enterCreditWorkflow() {
		Util.waitForElement(driver, creditWorkflow, 10);
		creditWorkflow.clear();
		creditWorkflow.sendKeys("Credit level workflow");
	}

	public void enterFacilityWorkflow() {
		Util.waitForElement(driver, facilityWorkflow, 10);
		facilityWorkflow.clear();
		facilityWorkflow.sendKeys("Facility level workflow");
	}

	public void clickSaveBtnOnWorkflowPage() {
		Util.waitForElement(driver, saveWorkflow, 15);
		saveWorkflow.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyWorkflowIsSavedOrNot() {
		Util.waitForElement(driver, aftersaveConfirmation, 5);
		if (aftersaveConfirmation.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean selectAndVerifyWorkflowTypeAsCredit() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='myGrid']/div[2]/div[2]/div/div[2]/span[2]"),
				10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				selectWorkflowTypeInWorkflowSummary);

		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath(".//*[@id='myGrid']/div[2]/div[5]/div/div[1]/div[2]"))
				.getText().trim().contains("Credit")) {
			return true;
		} else
			return false;
	}

	public boolean selectAndVerifyWorkflowTypeAsFacility() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='myGrid']/div[2]/div[2]/div/div[2]/span[2]"),
				10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				selectWorkflowTypeInWorkflowSummary);

		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath(".//*[@id='myGrid']/div[2]/div[5]/div/div[1]/div[2]"))
				.getText().trim().contains("Facility")) {
			return true;
		} else
			return false;
	}

	public void clickBackBtnOnWorkflow() {
		Util.waitForElement(driver, backBtnOnWorkflow, 10);
		backBtnOnWorkflow.click();
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyAsterixOnSavedWorkflow() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, workflowName, 10);
		String s1 = workflowName.getText().trim();
		if (s1.contains("*")) {
			return true;
		} else
			return false;
	}

	public void clickWorkflowName() {
		Util.waitForAJAX(driver);
		workflowSummaryTitle.click();
	}

	public void clickEditPermissionOnSecurity() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, parentEditBtn, 10);
		parentEditBtn.click();
	}

	public void clickCreateCustomerOnSecurityPage() {
		Util.waitForElement(driver, createCust, 10);
		createCust.click();
		Util.waitForAJAX(driver);
	}

	public void clickProjectedClosedDate() {
		Util.waitForElement(driver, projectedClosedDate, 10);
		projectedClosedDate.click();
		Util.waitForAJAX(driver);
	}

	public void clickBookingDetails() throws InterruptedException {
		Thread.sleep(2000);
		Util.waitForElement(driver, bookingDetails, 10);
		bookingDetails.click();
		Util.waitForAJAX(driver);
	}

	public void selectRule() throws InterruptedException {

		Thread.sleep(3000);
		List<WebElement> upperLinks = driver
				.findElements(By
						.xpath("//*[@id='securityData']/table/tbody/tr[11]/td[5]/div[3]/ul/li"));

		List<WebElement> ele1 = driver
				.findElements(By
						.xpath("//*[@id='securityData']//*[@class='RepoFolderTreeClass']"));
		WebElement ele = ele1.get(0);
		ele.findElement(By.xpath("//*[text()='Rules']")).click();
		Thread.sleep(1000);
		WebElement e = driver.findElement(By
				.xpath("//div[@class='RepoFolderTreeClass']"));
		e.sendKeys(Keys.PAGE_DOWN);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']"))
				.click();
		Thread.sleep(1000);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']/..//*[text()='SimpleReadPermission']"))
				.click();
	}

	public void select5MRule() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> upperLinks = driver
				.findElements(By
						.xpath("//*[@id='securityData']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[5]/input[2]"));
		List<WebElement> ele1 = driver
				.findElements(By
						.xpath("//*[@id='securityData']//*[@class='RepoFolderTreeClass']"));
		WebElement ele = ele1.get(0);
		ele.findElement(By.xpath("//*[text()='Rules']")).click();
		Thread.sleep(1000);
		WebElement e = driver.findElement(By
				.xpath("//div[@class='RepoFolderTreeClass']"));
		e.sendKeys(Keys.PAGE_DOWN);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']"))
				.click();
		Thread.sleep(1000);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']/..//*[text()='Credit360_ProposedAmtGrt5M_RlCdNotEqlCrdOfcr_Read_Edit']"))
				.click();
	}

	public void select5MRuleForBookingDetails() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> ele1 = driver
				.findElements(By
						.xpath("//*[@id='securityData']//*[@class='RepoFolderTreeClass']"));
		WebElement ele = ele1.get(0);
		ele.findElement(By.xpath("//*[text()='Rules']")).click();
		Thread.sleep(1000);
		WebElement e = driver.findElement(By
				.xpath("//div[@class='RepoFolderTreeClass']"));
		e.sendKeys(Keys.PAGE_DOWN);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']"))
				.click();
		Thread.sleep(1000);
		e.sendKeys(Keys.PAGE_DOWN);
		ele.findElement(
				By.xpath("//*[text()='Rules']/..//*[text()='RuleBasedSecurity']/..//*[text()='Credit360_ProposedAmtGrt5M_Hide_Read']"))
				.click();
	}

	public LogoutPage clickSaveBtnOnSecuritySettings()
			throws InterruptedException {
		List<WebElement> lst = driver.findElements(By
				.className("ui-button-text"));
		WebElement e = lst.get(1);
		e.findElement(By.xpath("//*[text()='Save']")).click();
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
		Thread.sleep(1000);
		okOnSecurityPopup.click();
		return new LogoutPage(driver);
	}

	public void enterRole(String option) {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(option);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole1() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role1);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterWflw1() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 10);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys(wflw1);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterwflw2() {
		Util.waitForElement(driver, srchboxOnWorkflowSummary, 10);
		srchboxOnWorkflowSummary.clear();
		srchboxOnWorkflowSummary.sendKeys(wflw2);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist1() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist1);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist2() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist2);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist3() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist3);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist4() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist4);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist5() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist5);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist6() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist6);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist7() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist7);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist8() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist8);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist9() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist9);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist10() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist10);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterChklist11() {
		Util.waitForElement(driver, srchChecklist, 10);
		srchChecklist.clear();
		srchChecklist.sendKeys(chklist11);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void clickEditOfApplicationChecklist() throws InterruptedException {
		Util.waitForElement(driver, actionMenuOnChklist, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnChklist);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", editOnChklist);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyAttachCopyofArticlesofIncorporation() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath("//input[contains(@value,'Attach Copy of Articles of Incorporation')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAttachFinancialStatements_Last3Years() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath("//input[contains(@value,'Attach Financial Statements (Last 3 Years)')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAttachCopyofRealEstateTitle() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath("//input[contains(@value,'Attach Copy of Real Estate Title')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAttachPersonalFinancialStatements_LAst3YearsofIndividualBorrowersOrGuarantors() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath("//input[contains(@value,'Attach Personal Financial Statements (Last 3 Years) of Individual Borrowers/Guarantors')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAttachCopyofPassportOrDriversLicenseOrGovtID() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(By.xpath("//input[contains(@name,'itemName4')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAttachCorporateBorrowingResolution() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath("//input[contains(@value,'Attach Corporate Borrowing Resolution')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickCancelOnChklistDetails() {
		WebElement e = driver
				.findElement(By
						.xpath("//*[@id='UPSERTCHECKLISTDETAILS']/div/div/div[7]/a[1]//span/span[contains(.,'Cancel')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole2() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role2);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole3() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role3);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole4() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role4);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole5() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role5);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole6() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role6);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole7() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role7);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole8() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role8);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole9() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role9);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole10() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role10);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole11() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role11);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole12() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role12);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole13() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role13);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole14() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role14);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole15() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role15);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole16() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role16);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole17() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role17);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole18() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role18);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole19() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role19);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole20() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role20);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole21() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role21);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole22() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role22);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole23() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role23);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole24() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role24);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole25() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role25);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole26() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role26);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole27() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role27);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole28() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role28);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole29() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role29);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole30() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role30);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole31() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role31);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterRole32() {
		Util.waitForElement(driver, srchTeamRole, 10);
		srchTeamRole.clear();
		srchTeamRole.sendKeys(role32);
		searchBtn.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public String getTeamRole() {
		Util.waitForAJAX(driver);
		return verifyRoleNm.getText().trim();
	}

	public String getChecklist() {
		Util.waitForAJAX(driver);
		return verifyChecklistName.getText().trim();
	}

	public String getWorkflow() {
		Util.waitForAJAX(driver);
		return verifyWflwName.getText().trim();
	}

	public String getRole() {
		Util.waitForAJAX(driver);
		return verifyRNm.getText().trim();
	}

	public boolean verifyWorkflowTitile() {
		Util.waitForAJAX(driver);
		if (verifyWorkflowSummary.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickEditOnWflw() throws InterruptedException {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuWorkflowSummary);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", editLinkWorkflowSummary);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void clickWflwNm() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wflwNm);
		Util.waitForAJAX(driver);
	}

	public boolean verifyPreAnalysisTasks() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Pre-Analysis')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Enter Financial Statements')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Execute OFAC Check on all Parties')]"));
		WebElement h = driver
				.findElement(By
						.xpath("//label[contains(.,'Verify readiness to pull credit')]"));
		WebElement i = driver.findElement(By
				.xpath("//label[contains(.,'Retrieve Credit Bureau Data')]"));
		WebElement j = driver.findElement(By
				.xpath("//label[contains(.,'Execute Auto-Decision')]"));
		WebElement k = driver.findElement(By
				.xpath("//label[contains(.,'Duplicate Check')]"));
		WebElement l = driver.findElement(By
				.xpath("//label[contains(.,'Fraud Check')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed() && i.isDisplayed() && j.isDisplayed()
				&& k.isDisplayed() && l.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyDecision() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[starts-with(.,'Decision')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Policy Exceptions')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Post Bureau Check')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'Review or Amend Decision')]"));
		WebElement i = driver.findElement(By
				.xpath("//label[contains(.,'Generate Commitment Letter')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed() && i.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCustomerAcceptance() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Customer Acceptance')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Complete Application Checklist')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Does Customer Accept Approved Terms?')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyDueDiligence() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Fulfillment - Due diligence')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Due Diligence checklist')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Complete Pre-Document Checklist')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyLoanDocumentPreparation() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//label[contains(.,'Fulfillment - Loan Document Preparation')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Generate Legal Docs (Laser Pro)')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Document Package creation')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'Verify Docs Are Correct')]"));
		WebElement i = driver.findElement(By
				.xpath("//label[contains(.,'Closing Checklist')]"));
		WebElement j = driver.findElement(By
				.xpath("//label[contains(.,'Schedule Closing')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed() && i.isDisplayed() && j.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyClosing() {
		Util.waitForAJAX(driver);
		Util.scrollBottom(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//*[@id='processGrid']/div[2]/div[5]/div/div[28]/div[2]/label"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Complete Pre-Funding Checklist')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Have Signed Docs Been Received Back from Customer?')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyBookingFundingServicing() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//label[contains(.,'Booking, Funding and Servicing')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Complete Pre-Booking Checklist')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Book to Servicing System')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyGeneralTask() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'General Task')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'CheckList Common Conditional Task')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Fee review task')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCompliance() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Compliance')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Start Reg B')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Stop Reg B')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'OFAC')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyPreAnalysis() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Pre-Analysis')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Add Customer Address')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Enter Financial Statements')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'Setup Pricing')]"));
		Util.scrollDown(driver);

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCreditAnalysis() {
		Util.waitForAJAX(driver);
		Util.scrollDown(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Credit Analysis')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Facility Risk Rating')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Financial Analysis')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'Set covenants')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyDecisioning() {
		Util.waitForAJAX(driver);
		Util.scrollDown(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Decisioning')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Review Credit Memo')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Generate Commitment Letter')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyFulfillmentDueDiligence() {
		Util.waitForAJAX(driver);
		Util.scrollBottom(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Fulfillment - Due diligence')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Due Diligence checklist')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Customize Terms and Conditions')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyFulfillmentLoanDocumentPreparation() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//label[contains(.,'Fulfillment - Loan Document Preparation')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Generate Legal Docs (Laser Pro)')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Document Package creation')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyFulfillmentClosing() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//*[@id='processGrid']/div[2]/div[5]/div/div[66]/div[2]/label"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Closing Checklist')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Satisfy conditions precedent')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyBookingAndFundingAndServicing() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath("//label[contains(.,'Booking, Funding and Servicing')]"));
		WebElement f = driver.findElement(By
				.xpath("//label[contains(.,'Book to Loan IQ')]"));
		WebElement g = driver
				.findElement(By
						.xpath("//label[contains(.,'Complete Pre-Funding Checklist')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyPostBooking() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//label[contains(.,'Post- Booking')]"));
		WebElement f = driver
				.findElement(By
						.xpath("//label[contains(.,'Generate Document, Generate Cancel Letter, Duplicate')]"));
		WebElement g = driver.findElement(By
				.xpath("//label[contains(.,'Submit UCC filing')]"));
		WebElement h = driver.findElement(By
				.xpath("//label[contains(.,'Lien Perfection')]"));

		if (e.isDisplayed() && f.isDisplayed() && g.isDisplayed()
				&& h.isDisplayed())
			return true;
		else
			return false;
	}

}
