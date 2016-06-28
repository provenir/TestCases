package com.provenir.automation.framework.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class NewCreditRequest {

	WebDriver driver;

	public NewCreditRequest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * WebElement
	 */
	// Locating a new credit request link.
	@FindBy(how = How.ID, using = "newCredRequest")
	private WebElement newCreditRequestLink;

	// Locating a Request summary.
	@FindBy(how = How.XPATH, using = "//ul[@id='breadCrumbMainNav_new']/li[@id='rqstSummary']")
	private WebElement requestSummaryTitle;
	//
	@FindBy(how = How.XPATH, using = ".//label[@class='error']")
	private List<WebElement> errorMsg;
	// locating a credit name element.
	@FindBy(how = How.ID, using = "creditNm")
	private WebElement creditName;

	@FindBy(how = How.ID, using = "credExtId")
	private WebElement credExtension;

	// @FindBy(how = How.NAME, using = "creditClassfn")
	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div[2]/div[2]/div[3]/div[1]/span/input")
	private WebElement creditClassfn;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div[2]/div[2]/div[2]/div[2]/span/input")
	private WebElement creditBranch;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div[2]/div[2]/div[3]/div[2]/span/input")
	private WebElement creditDepartment;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div[2]/div[2]/div[4]/div[2]/span/input")
	private WebElement creditlineOfBusiness;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCUSTCREDREQFORM']/div[2]/div[2]/div[5]/div[2]/span/input")
	private WebElement creditExpenseCode;

	@FindBy(how = How.ID, using = "creditAppliDt")
	private WebElement creditApplicationDate;

	@FindBy(how = How.ID, using = "creditAgreeDt")
	private WebElement creditAgreeDate;

	@FindBy(how = How.ID, using = "creditProjClsDt")
	private WebElement creditProjectedClosingDt;

	@FindBy(how = How.XPATH, using = "//input[@customname='workflowProcessId']")
	private WebElement lendingProcessOnRequestSummary;

	/*
	 * @FindBy(how = How.NAME, using = "creditProfExpCd") private WebElement
	 * creditProfExpCd;
	 */

	@FindBy(how = How.ID, using = "savecreddetails")
	private WebElement btnNext;

	private String credClassFn = "creditClassfn";
	private String credBranch = "credBranch";
	private String creditDept = "creditDept";
	private String creditBussLine = "creditBussLine";
	private String creditProfExpCd = "creditProfExpCd";
	private String optionLendingProcess = ".//*[@id='workflowProcessId']/option";
	private String lendingProcess = "workflowProcessId";

	// get current date and format as yyyy-mm-dd
	final Calendar cal = Calendar.getInstance();
	final DateFormat dForm = new SimpleDateFormat("yyyy-MM-dd");

	public NewCreditRequest newCreditRequestLink() {
		Util.waitForElement(driver, newCreditRequestLink, 5);
		newCreditRequestLink.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public void enterCreditName() {
		Util.waitForElement(driver, creditName, 5);
		creditName.clear();
		creditName.sendKeys("Test Credit");
	}

	public void enterLendingProcess(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(lendingProcess), 15);
		option = "Credit level workflow";
		Util.selectItemFromList(driver, lendingProcess, option);
	}

	public void enterLendingProcessForBOA(String wflw) {
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(lendingProcess), 10);
		wflw = "Workflow for Small Business";
		Util.selectItemFromList(driver, lendingProcess, wflw);
	}

	public boolean getSavedWorkflowName() {
		Util.waitForElement(driver, lendingProcessOnRequestSummary, 10);
		String str = lendingProcessOnRequestSummary.getText();
		if (str.equalsIgnoreCase("Credit level workflow")) {
			return true;
		} else
			return false;
	}

	public boolean verifyDefaultWorkflowName() {
		Util.waitForElement(driver, lendingProcessOnRequestSummary, 10);
		String str = lendingProcessOnRequestSummary.getText();
		if (str.equalsIgnoreCase("New Request for Money")) {
			return true;
		} else
			return false;
	}

	public boolean getRequestSummaryPgTitle() {
		Util.waitForElement(driver, requestSummaryTitle, 5);
		String str = requestSummaryTitle.getText();
		if (str.equalsIgnoreCase("Request Summary")) {
			return true;
		} else
			return false;
	}

	public void clearApplicationDate() {
		Util.waitForElement(driver, creditApplicationDate, 2);
		creditApplicationDate.clear();
	}

	public int getCountOfErrorMsgs() {
		return errorMsg.size();
	}

	public void creditName(HashMap<String, Map<String, String>> _hashWizard) {
		try {
			HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashWizard
					.get("newCreditReq");
			creditName.sendKeys(propertiesMap.get("request"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterCreditName(String value) {
		Util.waitForElement(driver, creditName, 5);
		creditName.clear();
		creditName.sendKeys(value);
	}

	public void enterAggrementDate(
			HashMap<String, Map<String, String>> _hashWizard) {
		try {
			HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashWizard
					.get("reqSummaryDetails");
			creditAgreeDate.sendKeys(propertiesMap.get("agreementDate"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void credExtension(String crdExtn) {
		credExtension.sendKeys(crdExtn);

	}

	public void creditClassfn(String creditClassification) {
		creditClassfn.clear();
		Util.selectItemFromList(driver, credClassFn, creditClassification);
	}

	public void creditApplicationDate() {
		// get current date and format as yyyy-mm-dd
		creditApplicationDate.clear();
		creditApplicationDate.sendKeys(Util.getCurrentDate());
	}

	public void creditAgreeDate() {
		creditAgreeDate.clear();
		// cal.add(Calendar.DATE, 10);
		// final String agreeDate = dForm.format(cal.getTime());
		creditAgreeDate.sendKeys(agreeDate());
	}

	public String agreeDate() {
		cal.add(Calendar.DATE, 10);
		final String agreeDate = dForm.format(cal.getTime());
		return agreeDate;
	}

	public void creditProjectedClosingDt() {

		// final String closingDate = dForm.format(cal.getTime());
		creditProjectedClosingDt.clear();
		creditProjectedClosingDt.sendKeys(ProjectedClosingDt());
		// creditProjectedClosingDt.click();
	}

	public String ProjectedClosingDt() {
		final String closingDate = dForm.format(cal.getTime());
		return closingDate;
	}

	public void credBranch(String branch) {
		Util.enableAllDropdowns(driver);
		Util.waitForAJAX(driver);
		Util.selectItemFromList(driver, credBranch, branch);
	}

	public void creditDept(String department) {
		Util.selectItemFromList(driver, creditDept, department);
	}

	public void creditBussLine(String businessLine) {
		Util.selectItemFromList(driver, creditBussLine, businessLine);
	}

	public void creditProfExpCd(String expectedCode) {
		Util.selectItemFromList(driver, creditProfExpCd, expectedCode);
		// creditProfExpCd.sendKeys(expectedCode);

	}

	public CustomerInfoPage btnNext() {
		btnNext.click();
		Util.waitForAJAX(driver);
		return new CustomerInfoPage(driver);
	}

	public String getCreditName() {
		return creditName.getAttribute("value");
	}

	public String getCreditExtension() {
		return credExtension.getAttribute("value");
	}

	public String getCreditClasification() {
		return creditClassfn.getAttribute("value");
	}

	public String getAppDate() {
		return creditApplicationDate.getAttribute("value");
	}

	public String getAggDate() {
		return creditAgreeDate.getAttribute("value");
	}

	public String getProjCloseDate() {
		return creditProjectedClosingDt.getAttribute("value");
	}

	public String getLendingProcess() {

		List<WebElement> option = driver.findElements(By
				.xpath(optionLendingProcess));
		for (int i = 1; i <= option.size(); i++) {
			String lendingProcess = driver.findElement(
					By.xpath(optionLendingProcess + "[" + i + "]"))
					.getAttribute("selected");

			if (lendingProcess != null) {
				String lendProcess = driver.findElement(
						By.xpath(optionLendingProcess + "[" + i + "]"))
						.getText();
				return lendProcess;
			}
		}
		return null;

	}

	public String getBranch() {
		return creditBranch.getAttribute("value");
	}

	public String getDepartment() {
		return creditDepartment.getAttribute("value");
	}

	public String getLineOfBusiness() {
		return creditlineOfBusiness.getAttribute("value");
	}

	public String getExpensecode() {
		return creditExpenseCode.getAttribute("value");
	}

}
