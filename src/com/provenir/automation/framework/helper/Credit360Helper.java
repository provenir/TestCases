package com.provenir.automation.framework.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;
import com.sun.jna.platform.win32.WinNT.WELL_KNOWN_SID_TYPE;

public class Credit360Helper {

	WebDriver driver;
	Actions actions = null;

	public Credit360Helper(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "credBorr")
	private WebElement creditBorrowerLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='credBorrowers']/a")
	private WebElement addBtnOfCreditBorrower;

	@FindBy(how = How.XPATH, using = ".//*[@id='SEARCHCUSTFORM']/input[5]")
	private WebElement srchBorrower;

	@FindBy(how = How.ID, using = "imgBtn")
	private WebElement imgBtn;

	@FindBy(how = How.ID, using = "selCustomer")
	private WebElement selectedCustomer;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Select')]")
	private WebElement selectBtnOnCreditBorrower;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Save')]")
	private WebElement saveBtnOnCreditBorrower;

	@FindBy(how = How.XPATH, using = "//a[contains(.,'Action')]")
	private WebElement actionColumnOnCredit360;

	@FindBy(how = How.ID, using = "home")
	private WebElement homeLink;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='credCreditLine']/div/div/table/tbody/tr[1]/td[6]/a")
	// private WebElement actionMenuOnFacilitySummary;

	@FindBy(how = How.XPATH, using = ".//*[@class='scroll tableGrid']/tbody/tr[2]/td[6]/a")
	private WebElement actionMenuOnFacilitySummary;

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[2]/div/div[1]/h2")
	private WebElement creditDetailsTxt;

	@FindBy(how = How.XPATH, using = ".//*[@id='credSumm']")
	private WebElement creditSummary;

	@FindBy(how = How.ID, using = "taskMangmntr")
	private WebElement taskMgmt;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLineSumm']")
	private WebElement facSumLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='DEWORKFLOWDEFFORM']/div/div/ul/li[30]/a/span")
	private WebElement actionList;

	@FindBy(how = How.XPATH, using = ".//*[@id='addCrdLine']")
	private WebElement addBtn;

	@FindBy(how = How.LINK_TEXT, using = "Details")
	private WebElement detailsLnk;

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement delete;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']//b[contains(.,'Test_facility')]")
	private WebElement verifyWFlow;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[1]/a")
	private WebElement expandIconOnTM;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[2]/div/div/div[3]/div/div/div[2]/div/div[4]/span")
	private WebElement taskDescOnTM;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Credit 360')]")
	private WebElement credit360Title;

	@FindBy(how = How.ID, using = "credDcsn")
	private WebElement creditDecision;

	@FindBy(how = How.XPATH, using = "//*[@id='credDcsnr']/div/a")
	private WebElement verifyCreditDecisionSummary;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Decisioning')]")
	private WebElement verifyCreditDecisionTitle;

	@FindBy(how = How.XPATH, using = "//*[@id='addButtonDecision']/a")
	private WebElement addBtnOnCreditDecision;

	@FindBy(how = How.ID, using = "regB")
	private WebElement regB;

	@FindBy(how = How.XPATH, using = "//*[@id='regBr']/div//a[contains(.,'Reg B')]")
	private WebElement verifyRegB;

	@FindBy(how = How.ID, using = "startDt")
	private WebElement regBStrtDate;

	@FindBy(how = How.ID, using = "satisfactionDt")
	private WebElement regBSatisfactionDate;

	@FindBy(how = How.XPATH, using = "//*[@id='taskManagmntContainer']/div[1]/a")
	private WebElement expnadIconOnTM;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[2]/div/div[@title='Expand/Collapse']/span")
	private WebElement expandAll;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[2]/div[1]/span[2]")
	private WebElement expandDecision;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[1]/span[2]")
	private WebElement expandCustomerAcceptance;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[4]/div[1]/span[2]")
	private WebElement expandDueDiligence;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[5]/div[1]/span[2]")
	private WebElement expandLoanDocument;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[2]/div[12]/a")
	private WebElement actionMenuOnDecisionOfTM;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[12]/a")
	private WebElement actionMenuOnCustomerAcceptanceOfTM;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[1]/div[12]/a")
	private WebElement actionMenuOnPreAnalysisOfTM;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[1]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskOfPreAnalysis;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[2]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTask;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskForCustomerAcceptance;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[12]/a")
	private WebElement actionMenuOnPolicyException;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskOnPolicyException;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[3]/div[12]/div/div/div/div/ul/li[1]/a")
	private WebElement setTaskWaivedOnPolicyException;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[4]/div[12]/a")
	private WebElement actionMenuOfCompleteApplication;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[4]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskOfCompleteApplication;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[4]/div[12]/div/div/div/div/ul/li[1]/a")
	private WebElement setTaskToWaivedOfCompleteApplication;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[5]/div[12]/a")
	private WebElement actionMenunOfDDChklist;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[5]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskOfDDChklist;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[5]/div[12]/div/div/div/div/ul/li[1]/a")
	private WebElement setTaskToWaivedOfDDChklist;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[6]/div[12]/a")
	private WebElement actionMenunOfCompletePreDocument;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[6]/div[12]/div/div/div/div/ul/li/a")
	private WebElement reassignTaskOfCompletePreDocument;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div taskMgmtblock']/div[3]/div/div/div[5]/div/div[6]/div[12]/div/div/div/div/ul/li[1]/a")
	private WebElement setTaskToWaivedOfCompletePreDocument;

	@FindBy(how = How.XPATH, using = "//*[@id='taskAssigee']/input")
	private WebElement assignedUser;

	@FindBy(how = How.XPATH, using = "//li[contains(.,'Abby Lockhart [alockhart]')]")
	private WebElement clickAssignedUSer;

	@FindBy(how = How.ID, using = "saveTask")
	private WebElement saveBtnOnAssignedUSer;

	@FindBy(how = How.XPATH, using = "//*[@id='data_content']/div[3]/table/tbody/tr/td[contains(.,'Decision Complete')]")
	private WebElement regBGrid;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[1]")
	private WebElement status;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div/div[8]/a/span")
	private WebElement editBtnOnCrdSummary;

	@FindBy(how = How.ID, using = "savecreddetails")
	private WebElement saveCredSumm;

	private String creditWorkflowText = ".//*[@id='taskManagmntContainer']/div[1]/div/span/b";
	private String creditTextOnWorkflow = ".//*[@id='taskManagmntContainer']/div[1]/div/a/span";
	private String facilityWorkflowText = ".//*[@id='taskManagmntContainer']/div[3]/div/span/b";
	private String facilityTextOnWorkflow = ".//*[@id='taskManagmntContainer']/div[3]/div/a/span";

	public void clickCreditBorrowerAndAdd() {
		Util.waitForAJAX(driver);
		Util.scrollDown(driver);
		Util.waitForElement(driver, creditBorrowerLink, 10);
		creditBorrowerLink.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void reassignTaskOfPolicyException() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPolicyException);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOnPolicyException);
		Util.waitForAJAX(driver);
	}

	public void setTaskToWaived() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();",
		// actionMenuOnPolicyException);
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(actionMenuOnPolicyException).click().build()
				.perform();
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				setTaskWaivedOnPolicyException);
		Util.waitForAJAX(driver);
	}

	public void setTaskInProgress() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPolicyException);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOnPolicyException);
		Util.waitForAJAX(driver);
	}

	public void setTaskInProgressOfDecision() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnDecisionOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTask);
		Util.waitForAJAX(driver);
	}

	public void setTaskInProgressOFCustomerAcceptance()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				actionMenuOnCustomerAcceptanceOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskForCustomerAcceptance);
		Util.waitForAJAX(driver);
	}

	public void setTaskInProgressOFDueDiligence() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				actionMenuOnCustomerAcceptanceOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskForCustomerAcceptance);
		Util.waitForAJAX(driver);
	}

	public void setTaskToCompleteOfDueDiligence() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				actionMenuOnCustomerAcceptanceOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskForCustomerAcceptance);
		Util.waitForAJAX(driver);
	}

	public void setTaskToCompleteofCustomerAcceptance()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				actionMenuOnCustomerAcceptanceOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskForCustomerAcceptance);
		Util.waitForAJAX(driver);
	}

	public void setTaskToComplete() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPolicyException);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOnPolicyException);
		Util.waitForAJAX(driver);
	}

	public void setTaskToCompleteOfDecision() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnDecisionOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTask);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfDecision() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnDecisionOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTask);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfCustomerAcceptance() throws InterruptedException {
		Util.scrollDown(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenuOnCustomerAcceptanceOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskForCustomerAcceptance);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfDueDiligence() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenuOfCompleteApplication);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskOfCompleteApplication);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOFDueDiligenceChklist() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();", actionMenunOfDDChklist);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOfDDChklist);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfCompletePreDocument() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenunOfCompletePreDocument);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskOfCompletePreDocument);
		Util.waitForAJAX(driver);
	}

	public void setTaskToWaivedOfCompletePreDocument()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenunOfCompletePreDocument);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				setTaskToWaivedOfCompletePreDocument);
		Util.waitForAJAX(driver);

	}

	public void setTaskToWaivedOfDueDiligenceChklist()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();", actionMenunOfDDChklist);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", setTaskToWaivedOfDDChklist);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfCompleteApplication() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenuOfCompleteApplication);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				reassignTaskOfCompleteApplication);
		Util.waitForAJAX(driver);
	}

	public void setTaskToWaivedOfCompleteApplication()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumen5ts[0].click();",
				actionMenuOfCompleteApplication);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",
				setTaskToWaivedOfCompleteApplication);
		Util.waitForAJAX(driver);
	}

	public void reassignTaskOfPreAnalysis() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPreAnalysisOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOfPreAnalysis);
		Util.waitForAJAX(driver);
	}

	public void setTaskInProgressOfPreAnalysis() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPreAnalysisOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOfPreAnalysis);
		Util.waitForAJAX(driver);
	}

	public void setTaskToCompleteOfPreAnalysis() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnPreAnalysisOfTM);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", reassignTaskOfPreAnalysis);
		Util.waitForAJAX(driver);
	}

	public void enterAssignedUser() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", assignedUser);
		assignedUser.clear();
		assignedUser.sendKeys("alockhart");
		Util.waitForAJAX(driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", clickAssignedUSer);
		Util.waitForAJAX(driver);
	}

	public void clickSaveOnReassignTask() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveBtnOnAssignedUSer);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
		Util.scrollBottom(driver);
	}

	public void clickAddBtnOnCreditBorrower() {
		Util.waitForElement(driver, addBtnOfCreditBorrower, 10);
		addBtnOfCreditBorrower.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void saveBorrower() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, srchBorrower, 10);
		srchBorrower.sendKeys("intex");
		imgBtn.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, selectedCustomer, 15);
		selectedCustomer.click();
		selectBtnOnCreditBorrower.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, saveBtnOnCreditBorrower, 15);
		saveBtnOnCreditBorrower.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyActionColumn() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionColumnOnCredit360, 10);
		if (actionColumnOnCredit360.isDisplayed()) {
			Util.waitForAJAX(driver);
			return true;
		} else
			return false;
	}

	public boolean clickActionColumnAndVerifyAddedWorkflow() {
		Util.waitForElement(driver, actionColumnOnCredit360, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionColumnOnCredit360);

		Util.waitForElement(driver, actionList, 15);
		String str = actionList.getText();
		if (str.equalsIgnoreCase("Credit level workflow")) {
			Util.waitForLoaderToFinish(driver);
			return true;
		} else
			return false;
	}

	public void clickActionMenu() {
		Util.waitForElement(driver, actionColumnOnCredit360, 15);
		actionColumnOnCredit360.click();
	}

	public void clickTaskManagement() {
		Util.waitForAJAX(driver);
		Util.scrollBottom(driver);
		Util.waitForElementPresent(driver, By.id("taskMangmnt"), 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", taskMgmt);
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public void clickFacilitySummary() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, facSumLink, 20);
		facSumLink.click();
	}

	public boolean verifyFacilitySummary() {
		Util.waitForAJAX(driver);
		if (driver.findElement(
				By.xpath(".//*[@id='credCreditLine']/div/div/table/tbody/tr"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddBtnFacilitySummary() {
		Util.waitForElement(driver, addBtn, 20);
		addBtn.click();
		Util.waitForAJAX(driver);
	}

	public void clickDetailsOnFacilityGrid() {
		Util.waitForAJAX(driver);
		actions.moveToElement(actionMenuOnFacilitySummary).click().perform();
		Util.waitForElement(driver, detailsLnk, 20);
		detailsLnk.click();
		Util.waitForAJAX(driver);
	}

	public Facility360Details clickDetailsOnFacilityGrid1() {
		Util.waitForAJAX(driver);
		actions.moveToElement(actionMenuOnFacilitySummary).click().build()
				.perform();
		Util.waitForElement(driver, detailsLnk, 20);
		detailsLnk.click();
		Util.waitForAJAX(driver);
		return new Facility360Details(driver);
	}

	public boolean verifyCredit360Loaded() {
		Util.waitForElement(driver, creditDetailsTxt, 10);
		if (creditDetailsTxt.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public MyRequests clickHome() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, homeLink, 10);
		homeLink.click();
		Util.waitForAJAX(driver);
		return new MyRequests(driver);
	}

	public boolean verifyWorkflowOrderOnCredit360() {
		if (creditWorkflowText.equalsIgnoreCase("New Request for Money")
				&& creditTextOnWorkflow
						.equalsIgnoreCase("Request HCL Corporation")
				&& facilityWorkflowText
						.equalsIgnoreCase("Facility_New Request for Money")
				&& facilityTextOnWorkflow
						.equalsIgnoreCase("Fac for HCL Corporation")) {
			return true;
		} else
			return false;
	}

	public void clickDeleteOnFacilityDetails() {
		Util.waitForElementPresent(driver, By.xpath(""), 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnFacilitySummary);
		Util.waitForElement(driver, delete, 5);
		// actions.moveToElement(actionMenuOnFacilitySummary).click().perform();
		js.executeScript("arguments[0].click();", delete);

		Util.waitForAJAX(driver);
	}

	public boolean verifyWorkflowDeletedOrNot() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, verifyWFlow, 20);
		String str = verifyWFlow.getText().trim();
		if (str.equalsIgnoreCase("Test_facility")) {
			return true;
		} else
			return false;
	}

	public void clickExpandIconOnTM() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, expandIconOnTM, 20);
		expandIconOnTM.click();
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyTaskDisplayedOrNot() {
		Util.waitForAJAX(driver);
		String s1 = taskDescOnTM.getText().trim();
		if (s1.equalsIgnoreCase("Task Description")) {
			return true;
		} else
			return false;
	}

	// to check element is not present in the page

	public boolean isBookingSummaryDisplayed() {
		List<WebElement> lst = driver.findElements(By
				.xpath("//a[@title='Booking Summary']"));
		if (lst.isEmpty()) {
			System.out.println("element does not exist");
			return true;
		} else
			return false;
	}

	public boolean verifyCredit360Title() {
		Util.waitForAJAX(driver);
		if (credit360Title.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickCreditDecisionSummaryLink() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", creditDecision);
		Util.waitForAJAX(driver);
	}

	public boolean isCreditDecisionSummaryDisplayed() {
		Util.waitForAJAX(driver);
		if (verifyCreditDecisionSummary.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickAddOnCreditDecision() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addBtnOnCreditDecision);
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyCreditDecisionTitle() {
		Util.waitForAJAX(driver);
		Util.scollTop(driver);
		return verifyCreditDecisionTitle.isDisplayed();
	}

	public void expandWorkflow() {
		Util.waitForAJAX(driver);
		Util.scrollUp(driver);
		Util.waitForElement(driver, expnadIconOnTM, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", expnadIconOnTM);
		// expnadIconOnTM.click();
		Util.waitForAJAX(driver);
		Util.scrollBottom(driver);
	}

	public void clickWflwNm() {
		WebElement e = driver.findElement(By
				.xpath("//*[@id='taskManagmntContainer']/div[1]/div/span/b"));
		e.click();
		Util.scrollDown(driver);
	}

	public void expandDecision() {
		Util.scrollDown(driver);
		Util.waitForAJAX(driver);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", expandDecision);
//		expandDecision.click();
		Util.waitForAJAX(driver);
	}

	public void expandCustomerAcceptance() {
		Util.scrollDown(driver);
		Util.waitForAJAX(driver);
		expandCustomerAcceptance.click();
		Util.waitForAJAX(driver);
	}

	public void expandDueDiligence() {
		Util.scrollDown(driver);
		Util.waitForAJAX(driver);
		expandDueDiligence.click();
		Util.waitForAJAX(driver);
	}

	public void expandLoanDocument() {
		Util.scrollDown(driver);
		Util.waitForAJAX(driver);
		expandLoanDocument.click();
		Util.waitForAJAX(driver);
	}

	public void clickRegB() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, regB, 10);
		regB.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyRegBSection() {
		Util.waitForAJAX(driver);
		if (verifyRegB.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyRegBStartDate() {
		String s = regBStrtDate.getText();
		if (s.equalsIgnoreCase(Util.getCurrentDate()))
			return true;
		else
			return false;
	}

	public boolean verifyRegBSatisfactionDate() {
		String s = regBSatisfactionDate.getText();
		if (s.equalsIgnoreCase(Util.getCurrentDate()) && regBGrid.isDisplayed())
			return true;
		else
			return false;
	}

	public String verifyStatus() {
		Util.waitForAJAX(driver);
		return status.getText().trim();
	}

	public boolean verifyDueDiligence() {
		WebElement e = driver
				.findElement(By
						.xpath(".//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[contains(.,'Due Diligence')]"));
		return e.isDisplayed();
	}

	public boolean verifySubmitted() {
		WebElement e = driver
				.findElement(By
						.xpath("//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[contains(.,'Submitted')]"));
		return e.isDisplayed();
	}

	public boolean verifyCreditDecisioning() {
		WebElement e = driver
				.findElement(By
						.xpath(".//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[contains(.,'Credit Decisioning')]"));
		return e.isDisplayed();
	}

	public boolean verifyReqStatus() {
		Util.waitForAJAX(driver);
		WebElement e = driver
				.findElement(By
						.xpath(".//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[contains(.,'Credit Decisioning')]"));
		WebElement f = driver
				.findElement(By
						.xpath(".//*[@id='UPSERTCUSTCREDREQFORM']/div/div[6]/div[2]/div[1]/div[contains(.,'Customer Acceptance')]"));
		if (e.isDisplayed() || f.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickEditBtnOnCreditSummary() {
		Util.waitForElement(driver, editBtnOnCrdSummary, 10);
		editBtnOnCrdSummary.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void clickSaveOnCredSumm() {
		Util.waitForElement(driver, saveCredSumm, 10);
		saveCredSumm.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void clickCreditSummary() {
		Util.waitForElement(driver, creditSummary, 5);
		creditSummary.click();
		Util.waitForAJAX(driver);
	}

}
