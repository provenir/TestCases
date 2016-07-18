package com.provenir.automation.framework.helper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;
import com.sun.jna.platform.win32.WinNT.WELL_KNOWN_SID_TYPE;

public class Facility360Details {

	WebDriver driver;
	Actions actions = null;

	public Facility360Details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	@FindBy(how = How.XPATH, using = ".//*[@class='breadcrumbText']")
	private WebElement breadCrumText;

	@FindBy(how = How.XPATH, using = ".//*[@id='credCreditLine']/div/div/table/tbody/tr")
	private WebElement facSumGrid;

	@FindBy(how = How.XPATH, using = ".//*[@id='saveCredLnSummDetails']")
	private WebElement saveBtnFacSum;

	@FindBy(how = How.XPATH, using = ".//*[@class='error']")
	private WebElement errorMsgText;

	@FindBy(how = How.XPATH, using = ".//*[@id='crdLnName']")
	private WebElement facName;

	@FindBy(how = How.XPATH, using = ".//*[@id='status']")
	private WebElement facStatus;

	@FindBy(how = How.XPATH, using = ".//*[@id='intPriFxRate']")
	private WebElement fixedPercent;

	@FindBy(how = How.XPATH, using = ".//*[@id='intPriFxRatePrd']")
	private WebElement fixedPeriod;

	@FindBy(how = How.XPATH, using = ".//*[@id='intPriMargin']")
	private WebElement margin;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnFee']")
	private WebElement feeTermStruct;

	@FindBy(how = How.XPATH, using = ".//*[@id='buttonDiv']/a[2]")
	private WebElement saveFeesBtn;

	@FindBy(how = How.XPATH, using = ".//*[@name='feeNm']")
	private WebElement selectFeeName;

	@FindBy(how = How.XPATH, using = ".//*[@id='feeBal']")
	private WebElement feeAmount;

	@FindBy(how = How.XPATH, using = ".//*[@id='otherFeeName']")
	private WebElement otherFeeName;

	@FindBy(how = How.XPATH, using = ".//*[@id='addAddrRow']")
	private WebElement addBtnFeeTermStruct;

	@FindBy(how = How.XPATH, using = ".//*[@id='credBook']")
	private WebElement clickBooking;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnGuar']")
	private WebElement clickGuarantor;

	@FindBy(how = How.XPATH, using = ".//*[@name='SEARCHCUSTFORM']/input[6]")
	private WebElement enterGuarantor;

	@FindBy(how = How.XPATH, using = ".//*[@id='imgBtn']")
	private WebElement clickSrchBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='0']/td[1]/input")
	private WebElement selectRadioBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='searchData']/div/div/div[2]/a")
	private WebElement selectBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDGUARFORM']/div/div[2]/div[1]/div[1]/a[2]")
	private WebElement saveBtnGuarantor;

	@FindBy(how = How.XPATH, using = ".//*[@id='addCredGuarRow']")
	private WebElement addBtnGuarantor;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnIntPar']")
	private WebElement clickInteresParty;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnIntrParty']")
	private WebElement addInteresParty;

	@FindBy(how = How.XPATH, using = ".//*[@name='SEARCHCUSTFORM']/input[7]")
	private WebElement enterPartyName;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDBORRFORM']/div/div[2]/div[1]/div[1]/a[2]")
	private WebElement saveBtnInterestedParty;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDLNSUMMFORM']/div[1]/div[2]/label[2]")
	private WebElement facNo;

	@FindBy(how = How.XPATH, using = ".//*[@id='BOOKINGDETAILSCREDLNFORM']/div/div[3]/div/div[2]/div/div[2]/div[3]/div[1]/label[2]")
	private WebElement transNo;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnFunding']")
	private WebElement fundingLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='addFees']")
	private WebElement addFunding;

	@FindBy(how = How.XPATH, using = ".//*[@id='saveCredFunding']")
	private WebElement saveFunding;

	@FindBy(how = How.XPATH, using = ".//*[@id='crdPropAmt']")
	private WebElement proposedAmt;

	@FindBy(how = How.NAME, using = "projClsDt")
	private WebElement projectedCloseDate;

	@FindBy(how = How.XPATH, using = ".//*[@id='bankNm']")
	private WebElement bankName;

	@FindBy(how = How.XPATH, using = ".//*[@id='fundAmt']")
	private WebElement fundAmt;

	@FindBy(how = How.XPATH, using = ".//*[@id='accNm']")
	private WebElement accName;

	@FindBy(how = How.NAME, using = "fundingDate")
	private WebElement fundingDate;

	@FindBy(how = How.XPATH, using = ".//*[@id='accNo']")
	private WebElement accountNo;

	@FindBy(how = How.XPATH, using = ".//*[@id='routingNo']")
	private WebElement routingNo;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnEntityRel']")
	private WebElement entityRel;

	@FindBy(how = How.XPATH, using = ".//*[@id='controls']/a[6]")
	private WebElement addParent;

	@FindBy(how = How.XPATH, using = ".//*[@id='controls']/a[2]")
	private WebElement saveParent;

	@FindBy(how = How.XPATH, using = ".//*[@id='controls']/a")
	private WebElement editEntityRelationship;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div[5]/div/div/div[2]/select")
	private WebElement selectCust;

	@FindBy(how = How.XPATH, using = ".//*[@id='myGrid']/div[5]/div/div/div[2]")
	private WebElement verifyselectCust;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='dataContent']/div[2]/div[4]/div[2]/a")
	// private WebElement proceedBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='popupContentDupCust']/div[2]/div[4]/div[2]/a")
	private WebElement proceedBtn;

	@FindBy(how = How.ID, using = "noDataAvailable")
	private WebElement noDataAvailable;

	@FindBy(how = How.XPATH, using = ".//*[@id='valdationMsg']/div/h2")
	private WebElement saveMsg;

	@FindBy(how = How.XPATH, using = ".//*[@id='cvnt']")
	private WebElement clickOnCovenants;

	@FindBy(how = How.XPATH, using = ".//*[@id='addAddrRow2']")
	private WebElement addCovenants;

	@FindBy(how = How.XPATH, using = ".//*[@id='covName']")
	private WebElement covenantName;

	@FindBy(how = How.XPATH, using = ".//*[@name='covSubTyp']")
	private WebElement covSubtype;

	@FindBy(how = How.XPATH, using = ".//*[@id='expectedResVal']")
	private WebElement expectedRes;

	@FindBy(how = How.XPATH, using = ".//*[@id='actualResVal']")
	private WebElement actualRes;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCONVENANTFORM']/div/div[2]/div[2]/div[3]/a[2]")
	private WebElement saveCov;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnDecision']")
	private WebElement clickDecision;

	@FindBy(how = How.XPATH, using = ".//*[@id='descStatus']")
	private WebElement selectDecision;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPDATEDESICIONTSKFORM']/div[1]/div[2]/div[1]/a")
	private WebElement saveDecision;

	@FindBy(how = How.XPATH, using = ".//*[@name='prdIdList']")
	private WebElement selectChkboxDecision;

	@FindBy(how = How.XPATH, using = ".//*[@id='status']")
	private WebElement verifyStatus;

	@FindBy(how = How.XPATH, using = "//*[@id='credLnSum']")
	private WebElement facilityLnk;

	@FindBy(how = How.XPATH, using = ".//*[@id='acc_info']/div[2]/div[2]/div/a/div")
	private WebElement commentBubble;

	@FindBy(how = How.XPATH, using = ".//*[@id='totalNoOfCommentsLabel']")
	private WebElement commentNotification;

	@FindBy(how = How.XPATH, using = ".//*[@id='FRMCOMMENTS']/div/label")
	private WebElement categoryLabelOnComment;

	@FindBy(how = How.XPATH, using = ".//*[@id='FRMCOMMENTS']/div/div[1]/label")
	private WebElement sectionLabelOnComment;

	@FindBy(how = How.XPATH, using = ".//*[@id='FRMCOMMENTS']/div/div[2]/div[2]/a/span")
	private WebElement addBtnOnCommentNotification;

	@FindBy(how = How.XPATH, using = ".//*[@id='FRMCOMMENTS']/div/div[2]/div[1]/div")
	private WebElement addSectionOnCommentNotification;

	@FindBy(how = How.XPATH, using = ".//*[@id='editRichText']/div[2]/div")
	private WebElement commentPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='cke_contents_richTxt']/iframe")
	private WebElement commentPopupEditingSection;

	@FindBy(how = How.XPATH, using = ".//*[@id='editRichText']/div[2]/div/table/thead/tr[2]/td/div/a[2]")
	private WebElement okBtnOnCommentPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='editRichText']/div[2]/div/table/thead/tr[2]/td/div/a[1]")
	private WebElement cancelBtnOnommentPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/h2")
	private WebElement commentPopupText;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/a")
	private WebElement cancelBtnOnCommentPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='result_div']")
	private WebElement scrollbarSection;

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[2]/div/div[1]/h2")
	private WebElement facilityText;

	@FindBy(how = How.XPATH, using = ".//*[@id='cSectionId']")
	private WebElement sectionOnCommentBubble;

	@FindBy(how = How.XPATH, using = ".//*[@id='facWtp']")
	private WebElement facilityWriteupLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTFACWRITUPFORM']/div[8]/a/span/span")
	private WebElement editBtnOnFacilityWriteup;

	@FindBy(how = How.ID, using = "home")
	private WebElement homeLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTFACWRITUPFORM']/div[2]/div[2]/div/div")
	private WebElement backgroundAnalysisOnFacilityWriteup;

	@FindBy(how = How.XPATH, using = ".//*[@id='cke_contents_richTxt']/iframe")
	private WebElement popupOnFacilityWriteup;

	@FindBy(how = How.XPATH, using = ".//*[@id='editRichText']/div[2]/div/table/thead/tr[2]/td/div/a[2]/span")
	private WebElement okBtnOnFacilityWriteupPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTFACWRITUPFORM']/div[8]/a[2]/span/span")
	private WebElement saveBtnOnFacilityWriteup;

	@FindBy(how = How.XPATH, using = ".//*[@id='facWtpr']/div/a")
	private WebElement verifyFacilityWriteup;

	@FindBy(how = How.ID, using = "eSum")
	private WebElement exposureSummaryLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='addAddrRow2']")
	private WebElement addBtnOnExposureSummary;

	@FindBy(how = How.XPATH, using = ".//*[@id='clientExpoSummary']/div/div/div/table/tbody/tr/td")
	private WebElement verifyExposureSummary;

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[2]/div[1]/h2")
	private WebElement exposureDetailTitle;

	@FindBy(how = How.XPATH, using = ".//*[@id='saveexpodetails']/span")
	private WebElement saveBtnOnExposureSummary;

	@FindBy(how = How.ID, using = "credLnBorr")
	private WebElement facilityBorrowerLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='credLnBorrr']/div/a")
	private WebElement verifyFacilityBorrowerLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='addCredBorrRow']")
	private WebElement addBtnOnFacilityBorrower;

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[2]/div[1]/h2")
	private WebElement facilityBorrowerPage;

	@FindBy(how = How.XPATH, using = ".//*[@id='rightContent']/div[2]/div[2]/div/div/div/form/input[7]")
	private WebElement searchBorrower;

	@FindBy(how = How.XPATH, using = ".//*[@id='imgBtn']")
	private WebElement searchBtnOnFacilityBorrower;

	@FindBy(how = How.XPATH, using = ".//*[@id='imgSave']")
	private WebElement saveOnFacilityBorrower;

	@FindBy(how = How.LINK_TEXT, using = "Details")
	private WebElement detailsLnk;

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement deleteLnk;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr[1]/td[5]/a")
	private WebElement actionMenuOnFacilityBorrower;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDLNSUMMFORM']/div[3]/div[3]/div[1]/label")
	private WebElement facTyp;

	@FindBy(how = How.XPATH, using = ".//*[@id='credCreditLine']/div/div/table/tbody/tr[1]/td[6]/a")
	private WebElement actionMenu;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCONVENANTFORM']/div/div[2]/div[1]/div[3]/div[1]/label")
	private WebElement covTyp;

	@FindBy(how = How.XPATH, using = ".//*[@id='currencyDiv']/label")
	private WebElement currency;

	@FindBy(how = How.CLASS_NAME, using = "heading")
	private WebElement ExposureSummaryPage;

	@FindBy(how = How.ID, using = "taskMangmntr")
	private WebElement taskMgmt;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskMangmntr']/div/a")
	private WebElement taskMgmtTitle;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div")
	private WebElement taskMgmtMsg;

	@FindBy(how = How.XPATH, using = "//a[contains(.,'Action')]")
	private WebElement actionColumnOnFacility360;

	@FindBy(how = How.XPATH, using = ".//*[@id='DEWORKFLOWDEFFORM']/div/div/ul/li[7]/a")
	private WebElement actionList;

	@FindBy(how = How.XPATH, using = "//b[contains(.,'Confirm')]")
	private WebElement confirmBtnOnConfirmationPopup;

	@FindBy(how = How.XPATH, using = "//b[contains(.,'Facility level workflow')]")
	private WebElement verifyTriggeredWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[1]/div")
	private WebElement verifyAllWorkflows;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[3]/div")
	private WebElement verifyAllWorkflows1;

	@FindBy(how = How.ID, using = "backBC")
	private WebElement backBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='actInfo']")
	private WebElement header;

	@FindBy(how = How.XPATH, using = ".//*[@id='actInfoDiv']/div[2]/div[2]/label[2]/a")
	private WebElement reqNoOnHeader;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDLNSUMMFORM']/div[3]/div[12]/div[13]/a")
	private WebElement editOnFacSummary;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[1]/a")
	private WebElement expandIconOnTM;

	@FindBy(how = How.XPATH, using = ".//*[@id='taskManagmntContainer']/div[2]/div/div/div[3]/div/div/div[2]/div/div[4]/span")
	private WebElement taskDescOnTM;

	private int commentCnt;
	private WebElement element = null;
	private String verifyFacSumName = ".//*[@id='rightContent']/div[2]/div/div[1]/h2";
	private String facType = "crdLnType";
	private String facRateType = "intPricRateType";
	private String facIndex = "intPriIndex";
	private String backToPage = "//div[contains(@class,'breadcrumbGrid')]/ul/li";
	private String verifyFeeName = ".//*[@id='UPSERTFEESFORM']/div/div[1]/div/h2";
	private String feeCategory = "otherFeeCategory";
	private String feeType = "feeTyp";
	private String feeCurrency = "feeCurr";
	private String feeGrid = ".//*[@id='data_content']/div/table/tbody/tr";
	private String guarantorGrid = ".//*[@id='CredLnGurantorDetails']/div/div/table/tbody/tr";
	private String interestedPartyGrid = ".//*[@id='credLnInterestedParties']/div/div/table/tbody/tr";
	private String rolType = "relType";
	private String lastTaxReturn = ".//*[@id='lastTaxReturn']";
	private String fundingGrid = ".//*[@id='data_content']/div/table/tbody/tr";
	private String fundingTitle = ".//*[@id='UPSERTCREDLNFUNDINGFORM']/div/div[1]/h2";
	private String paymentMethod = "payMethod";
	private String deliveryMethod = "delMethod";
	private String fundStatus = "status";
	private String eRtitle = ".//*[@id='rightContent']/div[2]/div[1]/h2";
	private String covenantGrid = ".//*[@id='covnt']/div/div/table/tbody/tr";
	private String verifyCovName = ".//*[@id='UPSERTCONVENANTFORM']/div/div[1]/div/h2";
	private String covenantType = "coveTyp";
	private String decisionTitle = ".//*[@id='divTab']/div[1]/h2";
	private String exposureGrid = ".//*[@id='clientExpoSummary']/div/div/div/table/tbody/tr";
	private String facilityBorrowerGrid = ".//*[@id='data_content']/div/table/tbody/tr";
	private String leftHandNav = ".//*[@id='credLine360cSliderMenu']/div[2]/div/ul/li";
	private String workflowText = ".//*[@id='taskManagmntContainer']/div[1]/div/span/b";
	private String facTextOnWorkflow = ".//*[@id='taskManagmntContainer']/div[1]/div/a/span";

	// private String entityGrid = ".//*[@id='myGrid']/div[5]/div/div/div[2]";

	private String str1 = null;
	List<WebElement> lstWebElements = null;
	private int cnt = 0;

	public String getFacilityNoOnF() {
		return str1;
	}

	public void setFacilityNoOnF() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath("//*[@id='UPSERTCREDLNSUMMFORM']/div[1]/div[2]/label[2]"),
				30);
		str1 = facNo.getText();
	}

	public boolean isFacilitySummaryNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(verifyFacSumName)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickSaveFacilitySummary() {
		Util.waitForElement(driver, saveBtnFacSum, 20);
		saveBtnFacSum.click();
		Util.waitForAJAX(driver);
	}

	public boolean isErrorMsgPresent() {
		if (errorMsgText.getText().equalsIgnoreCase("This field is required.")) {
			return true;
		} else {
			return false;
		}
	}

	public void enterFacilityName(String value) {
		facName.clear();
		facName.sendKeys(value);
	}

	public void selectStatus(String value) {
		Util.scrollUp(driver);
		Util.selectItemFromList(driver, facStatus, value);
		Util.waitForAJAX(driver);
	}

	public void selectFacilityType(String value) {
		Util.enableAllDropdowns(driver);
		Util.scrollUp(driver);
		Util.waitForElementPresent(driver, By.xpath(facType), 10);
		Util.selectItemFromList(driver, facType, value);
		Util.waitForAJAX(driver);
	}

	public void selectRateType(String value) {
		Util.enableAllDropdowns(driver);
		Util.scrollUp(driver);
		Util.selectItemFromList(driver, facRateType, value);
		Util.waitForAJAX(driver);
	}

	public void enterFixedRatePercent(String value) {
		fixedPercent.clear();
		fixedPercent.sendKeys(value);
	}

	public void enterFixedRatePeriod(String value) {
		fixedPeriod.clear();
		fixedPeriod.sendKeys(value);
	}

	public void enterMargin(String value) {
		margin.clear();
		margin.sendKeys(value);
	}

	public void selectIndex(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, facIndex, value);
		Util.waitForAJAX(driver);
	}

	public boolean isFacilityDetailsSaved() {
		Util.waitForAJAX(driver);
		if (facName.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickFeesTermAndStructure() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, feeTermStruct, 20);
		feeTermStruct.click();
	}

	public boolean verifyFeesTermAndStructure() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(feeGrid)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickSaveBtnOnFees() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, saveFeesBtn, 20);
		saveFeesBtn.click();
		Util.waitForAJAX(driver);
	}

	public boolean isFeesNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(verifyFeeName)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void selectFeeName(String value) {
		Util.selectItemFromList(driver, selectFeeName, value);
		Util.waitForAJAX(driver);
	}

	public void selectFeeCategory(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, feeCategory, value);
		Util.waitForAJAX(driver);
	}

	public void selectFeeType(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, feeType, value);
		Util.waitForAJAX(driver);
	}

	public void clickCurrency() {
		Util.waitForElement(driver, currency, 10);
		currency.click();
	}

	public void selectCurrency(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, feeCurrency, value);
		Util.waitForAJAX(driver);
	}

	public void enterFeeAmount(String value) {
		Util.waitForElement(driver, feeAmount, 20);
		feeAmount.clear();
		feeAmount.sendKeys(value);
	}

	public void enterOtherFeeName(String value) {
		Util.waitForElement(driver, otherFeeName, 20);
		otherFeeName.clear();
		otherFeeName.sendKeys(value);
		Util.waitForAJAX(driver);
	}

	public Facility360Details clickBackBreadCrum(String pageName) {
		Util.waitForAJAX(driver);
		Actions action = new Actions(driver);
		action.moveToElement(breadCrumText).build().perform();
		Util.waitForElementPresent(driver, By.xpath(backToPage), 30);
		List<WebElement> lstPages = driver.findElements(By.xpath(backToPage));

		for (int i = 1; i <= lstPages.size(); i++) {
			element = driver.findElement(By.xpath(backToPage + "[" + i
					+ "]/a[@id='breadCrumbLnk']"));
			if (element.getText().equalsIgnoreCase(pageName)) {

				element.click();
			}
		}
		// backBreadCrumBtn.click();
		Util.waitForAJAX(driver);
		return new Facility360Details(driver);
	}

	public boolean isFeeNamePresentOnGrid(String value) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(feeGrid), 20);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(feeGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By
					.xpath(feeGrid + "[" + i + "]/td[1]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void addBtnFeesTermAndStructure() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addBtnFeeTermStruct, 20);
		addBtnFeeTermStruct.click();
		Util.waitForAJAX(driver);
	}

	public void clickBookingDetails() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickBooking, 20);
		clickBooking.click();
		Util.waitForAJAX(driver);
	}

	public boolean isBookingNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(
				By.xpath(".//*[@id='BOOKINGDETAILSCREDLNFORM']/div/div[1]/h2"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public String getFacilityNoOnBooking() {
		return transNo.getText();

	}

	public void clickGuarantors() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickGuarantor, 20);
		clickGuarantor.click();
		Util.waitForAJAX(driver);
	}

	public void enterGuarantorName(String value) {
		enterGuarantor.clear();
		enterGuarantor.sendKeys(value);
		Util.waitForAJAX(driver);
	}

	public void clickSrchBtn() {
		Util.waitForElement(driver, clickSrchBtn, 20);
		clickSrchBtn.click();
		Util.waitForAJAX(driver);
	}

	public void clickRadioBtn() {
		Util.waitForElement(driver, selectRadioBtn, 20);
		selectRadioBtn.click();
		Util.waitForAJAX(driver);
	}

	public void clickSelectBtn() {
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='searchData']/div/div/div[2]/a"), 30);
		selectBtn.click();
		Util.waitForAJAX(driver);
	}

	public void saveGuarantor() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='UPSERTCREDGUARFORM']/div/div[2]/div[1]/div[1]/a[2]"),
				20);
		saveBtnGuarantor.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyGuarantor() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(
						By.xpath(".//*[@id='CredLnGurantorDetails']/div/div/table/tbody/tr"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddGuarantor() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addBtnGuarantor, 20);
		addBtnGuarantor.click();
		Util.waitForAJAX(driver);
	}

	public boolean isGuarantorNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(
				By.xpath(".//*[@id='rightContent']/div[2]/div[1]/h2"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isGuarantorNamePresentOnGrid(String value) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(guarantorGrid), 30);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(guarantorGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(guarantorGrid + "[" + i
					+ "]/td[2]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void clickInterestedParties() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, clickInteresParty, 20);
		clickInteresParty.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyInterestedParties() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(interestedPartyGrid), 60);
		if (driver.findElement(By.xpath(interestedPartyGrid)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddInterestedParties() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addInteresParty, 20);
		addInteresParty.click();
		Util.waitForAJAX(driver);
	}

	public boolean isInterestedPartiesPresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(
				By.xpath(".//*[@id='rightContent']/div[2]/div[1]/h2"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void enterPartyName(String value) {
		enterPartyName.clear();
		enterPartyName.sendKeys(value);
	}

	public void saveInterestedParties() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, saveBtnInterestedParty, 20);
		saveBtnInterestedParty.click();
		Util.waitForAJAX(driver);
	}

	public void clickProceed() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='popupContentDupCust']/div[2]/div[4]/div[2]/a"),
				30);
		proceedBtn.click();
		Util.waitForAJAX(driver);
	}

	public boolean isInterestedPartyNamePresentOnGrid(String value) {
		Util.waitForElementPresent(driver, By.xpath(interestedPartyGrid), 30);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(interestedPartyGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(interestedPartyGrid + "[" + i
					+ "]/td[1]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void selectRole(String value) {
		Util.waitForElementPresent(driver, By.name("relType"), 30);
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, rolType, value);
	}

	public void enterLastTaxReturn(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, lastTaxReturn, value);
		Util.waitForAJAX(driver);
	}

	public void clickFunding() {
		Util.waitForElement(driver, fundingLink, 20);
		fundingLink.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyFunding() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(fundingGrid)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddBtnFunding() {
		Util.waitForElement(driver, addFunding, 20);
		addFunding.click();
		Util.waitForAJAX(driver);
	}

	public boolean isFundingNameNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(fundingTitle)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickSaveOnFunding() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, saveFunding, 20);
		saveFunding.click();
		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
	}

	public void enterProposedAmount(String value) {
		proposedAmt.clear();
		proposedAmt.sendKeys(value);
	}

	public void enterProjCloseDate(String projDate) {
		projectedCloseDate.clear();
		Util.scrollUp(driver);
		projectedCloseDate.sendKeys(projDate);
		Util.waitForAJAX(driver);
	}

	public void selectPaymentMethod(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, paymentMethod, value);
		Util.waitForAJAX(driver);
	}

	public void enterBankName(String value) {
		bankName.clear();
		bankName.sendKeys(value);
	}

	public void enterFundingAmount(String value) {
		fundAmt.clear();
		fundAmt.sendKeys(value);
	}

	public void enterAccountName(String value) {
		accName.clear();
		accName.sendKeys(value);
	}

	public void enterFundingDate(String fundDate) {
		fundingDate.clear();
		fundingDate.sendKeys(fundDate);
		Util.waitForAJAX(driver);
	}

	public void enterAccountNumber(String value) {
		accountNo.clear();
		accountNo.sendKeys(value);
	}

	public void enterRoutingNumber(String value) {
		routingNo.clear();
		routingNo.sendKeys(value);
	}

	public void selectDeliveryMethod(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, deliveryMethod, value);
		Util.waitForAJAX(driver);
	}

	public void selectFundStatus(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, fundStatus, value);
		Util.waitForAJAX(driver);
	}

	public boolean isFundingPresentOnGrid(String value) {
		Util.waitForAJAX(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Util.waitForElementPresent(driver, By.xpath(fundingGrid), 100);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(fundingGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(fundingGrid + "[" + i
					+ "]/td[2]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void clickEntityRelationship() {
		Util.waitForElement(driver, entityRel, 20);
		entityRel.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyEntityRelationship() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(eRtitle)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddParentBtn() {
		Util.waitForElement(driver, addParent, 20);
		addParent.click();
		Util.waitForAJAX(driver);
	}

	public boolean isNoDataAvailable() {
		Util.waitForAJAX(driver);
		if (noDataAvailable.getText().equalsIgnoreCase("No Data Available")) {
			return true;
		} else {
			return false;
		}
	}

	public void clickSaveEntityRelationship() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, saveParent, 20);
		saveParent.click();
		Util.waitForAJAX(driver);
	}

	public void clickEditEntityRelationship() {
		Util.waitForElement(driver, editEntityRelationship, 20);
		editEntityRelationship.click();
		Util.waitForAJAX(driver);
	}

	public void selectParent(String value) {
		element = driver.findElement(By
				.xpath(".//*[@id='myGrid']/div[5]/div/div/div[2]"));
		element.click();
		Util.waitForElement(driver, selectCust, 30);
		Util.selectItemFromList(driver, selectCust, value);
		Util.waitForAJAX(driver);
	}

	public String getCustDetails() {
		Util.waitForAJAX(driver);
		return verifyselectCust.getText();
	}

	public String verifySaveMsg() {
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='valdationMsg']/div/h2"), 60);
		return saveMsg.getText();
	}

	public void clickCovenants() {
		Util.waitForElement(driver, clickOnCovenants, 20);
		clickOnCovenants.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyCovenant() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(covenantGrid)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddBtnOnCovenant() {
		Util.waitForElement(driver, addCovenants, 20);
		addCovenants.click();
		Util.waitForAJAX(driver);
	}

	public boolean isCovenantNamePresent() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(verifyCovName)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void enterCovenantName(String value) {
		covenantName.clear();
		covenantName.sendKeys(value);
	}

	public void selectCovenantType(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, covenantType, value);
		Util.waitForAJAX(driver);
	}

	public void selectCovenantSubtype(String value) {
		Util.waitForElement(driver, covSubtype, 10);
		Util.selectItemFromList(driver, covSubtype, value);
		Util.waitForAJAX(driver);
	}

	public void enterExpectedResult(String value) {
		expectedRes.clear();
		expectedRes.sendKeys(value);
	}

	public void enterActualResult(String value) {
		actualRes.clear();
		actualRes.sendKeys(value);
	}

	public void clickSaveCovenant() {
		Util.waitForElement(driver, saveCov, 20);
		saveCov.click();
		Util.waitForAJAX(driver);
	}

	public boolean isCovenantPresentOnGrid(String value) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(covenantGrid), 30);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(covenantGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(covenantGrid + "[" + i
					+ "]/td[1]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void clickDecision() {
		Util.waitForElement(driver, clickDecision, 20);
		clickDecision.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyDecision() {
		Util.waitForAJAX(driver);
		if (driver.findElement(By.xpath(decisionTitle)).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void selectDecisionType(String value) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, selectDecision, value);
		Util.waitForAJAX(driver);
	}

	public void clickSaveDecision() {
		Util.waitForElement(driver, saveDecision, 20);
		saveDecision.click();
		Util.waitForAJAX(driver);
	}

	public void selectChkDecision() {
		Util.waitForElement(driver, selectChkboxDecision, 20);
		selectChkboxDecision.click();
		Util.waitForAJAX(driver);
	}

	public String getStatus() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(".//*[@id='status']"), 30);
		return verifyStatus.getText();
	}

	public void clickFacilityLnk() {
		Util.waitForAJAX(driver);
		facilityLnk.click();
		Util.waitForAJAX(driver);
	}

	public String getFacilityDetailsText() {
		Util.waitForAJAX(driver);
		return facilityText.getText();
	}

	public void clickFacilityText() {
		Util.waitForElement(driver, facilityText, 10);
		facilityText.click();
	}

	public boolean isCommentBubbleDisplayed() {
		Util.waitForElement(driver, commentBubble, 15);
		if (commentBubble.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickOnCommentNotification() {
		Util.waitForElement(driver, commentNotification, 15);
		commentNotification.click();
		Util.waitForAJAX(driver);
	}

	public boolean isCommentPopupOpened() {
		if (categoryLabelOnComment.isDisplayed()
				&& sectionLabelOnComment.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickAddSectionOnCommentNotification() {
		Util.waitForElement(driver, addSectionOnCommentNotification, 15);
		addSectionOnCommentNotification.click();
		Util.waitForAJAX(driver);
	}

	public boolean isCommentEditorDisplayed() {
		if (commentPopup.isDisplayed() && commentPopupText.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void enterTextOnCommentPopup(String value) {
		Util.waitForElement(driver, commentPopupEditingSection, 20);
		commentPopupEditingSection.sendKeys(value);
	}

	public void clickOkBtnOnCommentPopup() {
		Util.waitForElement(driver, okBtnOnCommentPopup, 10);
		okBtnOnCommentPopup.click();
		Util.waitForAJAX(driver);
	}

	public void clickAddBtnOnCommentBubble() {
		Util.waitForElement(driver, addBtnOnCommentNotification, 15);
		addBtnOnCommentNotification.click();
		Util.waitForAJAX(driver);
	}

	public boolean isAddedCommentDisplayed(String value1, String value2) {
		Util.waitForElementPresent(driver, By.xpath(".//*[@id='commentDiv']"),
				10);
		if (driver
				.findElement(
						By.xpath(".//*[@id='result_div']/div/div/div/div/p"))
				.getText().contains(value1)
				&& driver
						.findElement(
								By.xpath(".//*[@id='result_div']/div/div/div/div/div/span[1]"))
						.getText().contains(value2)) {
			return true;
		} else
			return false;
	}

	public void clickSectionLablel() {
		Util.waitForElement(driver, sectionLabelOnComment, 10);
		sectionLabelOnComment.click();
	}

	@SuppressWarnings("unchecked")
	public int verifyCommentCount() {
		lstWebElements = driver.findElements(By
				.xpath(".//*[@id='result_div']/div/div"));
		for (int i = 1; i <= lstWebElements.size(); i++) {
			return lstWebElements.size();
		}
		return commentCnt;
	}

	public int getCountOfAddedComment(String value) {
		String str = driver
				.findElement(
						By.xpath(".//*[@id='acc_info']/div[2]/div[2]/div/a/div/b/label"))
				.getText();
		str = str.replace('(', ' ').replace(')', ' ').trim();
		if (str.contains(value)) {
			cnt = Integer.parseInt(str);

		}
		return cnt;
	}

	public void clickComment() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, commentBubble, 10);
		commentBubble.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyScrollBar() {
		if (scrollbarSection.isDisplayed()) {
			WebElement scrollbar = driver.findElement(By
					.xpath(".//*[@id='result_div']"));
			scrollbar.sendKeys(Keys.PAGE_DOWN);
			return true;
		} else
			return false;
	}

	public MyRequests clickBackBreadCrumOnFacility360(String pageName) {
		Util.waitForAJAX(driver);
		Actions action = new Actions(driver);
		action.moveToElement(breadCrumText).build().perform();
		Util.waitForElementPresent(driver, By.xpath(backToPage), 30);
		List<WebElement> lstPages = driver.findElements(By.xpath(backToPage));

		for (int i = 2; i <= lstPages.size(); i++) {
			element = driver.findElement(By.xpath(backToPage + "[" + i
					+ "]/a[@id='breadCrumbLnk']"));
			if (element.getText().equalsIgnoreCase(pageName)) {

				element.click();
			}
		}

		Util.waitForAJAX(driver);
		return new MyRequests(driver);
	}

	public void clickAllOptionOnCommentBubble(String value) {
		Util.selectItemFromList(driver, sectionOnCommentBubble, value);

		Util.waitForAJAX(driver);
	}

	public void clickFacilityWriteup() {
		Util.waitForElement(driver, facilityWriteupLink, 10);
		facilityWriteupLink.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyFacilityWriteup() {
		if (verifyFacilityWriteup.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickEditBtnOnFacilityWriteup() {
		Util.waitForElement(driver, editBtnOnFacilityWriteup, 15);
		editBtnOnFacilityWriteup.click();
		Util.waitForAJAX(driver);
	}

	public void clickBackgroundAnalysisOnFacilityWriteup() {
		Util.waitForElement(driver, backgroundAnalysisOnFacilityWriteup, 10);
		backgroundAnalysisOnFacilityWriteup.click();
		Util.waitForAJAX(driver);
	}

	public void enterTextOnBackgroundAnalysis(String value) {
		Util.waitForElement(driver, popupOnFacilityWriteup, 10);
		popupOnFacilityWriteup.sendKeys(value);
	}

	public void clickOkOnBackgroundAnalysisPopup() {
		Util.waitForElement(driver, okBtnOnFacilityWriteupPopup, 15);
		okBtnOnFacilityWriteupPopup.click();
		Util.waitForAJAX(driver);
	}

	public void clickSaveOnFacilityWriteup() {
		Util.waitForElement(driver, saveBtnOnFacilityWriteup, 15);
		saveBtnOnFacilityWriteup.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyAddedValueOnFacilityWriteup(String value) {
		if (driver.findElement(By.xpath(".//*[@id='bgAnalysis']/p")).getText()
				.contains(value)) {
			return true;
		} else
			return false;
	}

	public void clickExposureSummary() {
		Util.waitForElement(driver, exposureSummaryLink, 10);
		exposureSummaryLink.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyExposureSummary() {
		if (verifyExposureSummary.getText().contains("No Data Available")) {
			return true;
		} else
			return false;
	}

	public void clickAddOnExposureSummary() {
		Util.waitForElement(driver, addBtnOnExposureSummary, 15);
		addBtnOnExposureSummary.click();
		Util.waitForAJAX(driver);
	}

	public boolean isExposureSummaryPageDisplayes() {
		if (exposureDetailTitle.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickSaveOnExposureSummary() {
		Util.waitForElement(driver, saveBtnOnExposureSummary, 10);
		saveBtnOnExposureSummary.click();
		Util.waitForAJAX(driver);
	}

	public boolean isExposurePresentOnGrid(String value) {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(exposureGrid), 30);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(exposureGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(exposureGrid + "[" + i
					+ "]/td[6]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void clickFacilityBorrower() {
		Util.waitForElement(driver, facilityBorrowerLink, 15);
		facilityBorrowerLink.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyFacilityBorrower() {
		if (verifyFacilityBorrowerLink.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickAddOnFacilityBorrower() {
		Util.waitForElement(driver, addBtnOnFacilityBorrower, 15);
		addBtnOnFacilityBorrower.click();
		Util.waitForAJAX(driver);
	}

	public boolean isFacilityBorrowerPageDisplayed() {
		if (facilityBorrowerPage.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void enterBorrower(String value) {
		Util.waitForElement(driver, searchBorrower, 15);
		searchBorrower.sendKeys(value);
	}

	public void clickSearchBtnOnFacilityBorrower() {
		Util.waitForElement(driver, searchBtnOnFacilityBorrower, 5);
		searchBtnOnFacilityBorrower.click();
		Util.waitForAJAX(driver);
	}

	public void clickSaveOnFacilityBorrower() {
		Util.waitForElement(driver, saveOnFacilityBorrower, 20);
		saveOnFacilityBorrower.click();
		Util.waitForAJAX(driver);
	}

	public boolean isBorrowerNamePresentOnFacilityBorrowerGrid(String value) {
		Util.waitForElementPresent(driver, By.xpath(facilityBorrowerGrid), 30);
		element = null;
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(facilityBorrowerGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(facilityBorrowerGrid + "["
					+ i + "]/td[2]"));
			Util.waitForElement(driver, element, 20);
			if (element.getText().contains(value)) {
				return true;
			}
		}
		return false;
	}

	public void clickDeleteOnFacilityBorrower() {
		actions.moveToElement(actionMenuOnFacilityBorrower).click().perform();
		Util.waitForElement(driver, deleteLnk, 20);
		deleteLnk.click();
		Util.waitForAJAX(driver);
	}

	public void clickFacType() {
		Util.waitForElement(driver, facTyp, 5);
		facTyp.click();
		Util.scrollUp(driver);
	}

	public void clickDetailsOnFacSummary() {
		actions.moveToElement(actionMenu).click().perform();
		Util.waitForElement(driver, detailsLnk, 20);
		detailsLnk.click();
		Util.waitForAJAX(driver);
	}

	public void clickCovType() {
		Util.waitForElement(driver, covTyp, 10);
		covTyp.click();
	}

	public String ExposureSummaryPageTitle() {
		Util.waitForAJAX(driver);
		return ExposureSummaryPage.getText();
	}

	public void clickTaskManagement() {
		Util.scrollBottom(driver);
		Util.waitForElement(driver, taskMgmt, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", taskMgmt);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickExpandIconOnTM() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, expandIconOnTM, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", expandIconOnTM);
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyTaskMgmtSectionLoaded() {
		Util.waitForAJAX(driver);
		String title = taskMgmtTitle.getText().trim();
		if (title.equalsIgnoreCase("Task Management")) {
			return true;
		} else
			return false;
	}

	public boolean verifyNoWorkflowIsDisplayed() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, taskMgmtMsg, 10);
		String str = taskMgmtMsg.getText().trim();
		if (str.equalsIgnoreCase("There are no workflows at this level.")) {
			return true;
		} else
			return false;
	}

	public boolean verifyActionColumn() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionColumnOnFacility360, 10);
		if (actionColumnOnFacility360.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean clickActionColumnAndVerifyAddedWorkflow() {
		Util.waitForElement(driver, actionColumnOnFacility360, 15);
		actionColumnOnFacility360.click();
		actions.moveToElement(actionColumnOnFacility360).click().build()
				.perform();
		Util.waitForElement(driver, actionList, 15);
		String str = actionList.getText();
		if (str.equalsIgnoreCase("Facility level workflow")) {
			return true;
		} else
			return false;
	}

	public void triggerWorkflow() {
		Util.waitForElementPresent(driver,
				By.xpath("//a[contains(.,'Action')]"), 20);
		actionColumnOnFacility360.click();
		actions.moveToElement(actionList).click().build().perform();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickConfirmBtnOnConfirmationPopup() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, confirmBtnOnConfirmationPopup, 10);
		confirmBtnOnConfirmationPopup.click();
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyWorkflowTriggeredOrNot() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, verifyTriggeredWorkflow, 15);
		String str = verifyTriggeredWorkflow.getText().trim();
		if (str.equalsIgnoreCase("//b[contains(.,'Facility level workflow')]")) {
			return true;
		} else
			return false;
	}

	public boolean verifyWFTriggeredOrNot() {
		Util.waitForAJAX(driver);
		WebElement e = driver.findElement(By
				.xpath("//*[@id='taskManagmntContainer']/div[1]/div"));
		if (e.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAllWorkflowsDisplayedOrNot() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, verifyAllWorkflows, 10);
		String str = verifyAllWorkflows.getText().trim();
		String str1 = verifyAllWorkflows1.getText().trim();
		if (str.equalsIgnoreCase("Facility_New Request for Money")
				&& str1.equalsIgnoreCase("Facility level workflow")) {
			return true;
		} else
			return false;
	}

	public MyRequests clickHome() {
		Util.waitForElement(driver, homeLink, 10);
		homeLink.click();
		Util.waitForAJAX(driver);
		return new MyRequests(driver);
	}

	public boolean verifyOrderOfWorkflows() {
		if (workflowText.equalsIgnoreCase("Facility_New Request for Money")
				&& facTextOnWorkflow
						.equalsIgnoreCase("Fac for HCL Corporation")) {
			return true;
		} else
			return false;
	}

	public Credit360Helper gotoCredit360() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, header, 15);
		header.click();
		reqNoOnHeader.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		return new Credit360Helper(driver);
	}

	public void clickEditOnFacSummary() {
		Util.waitForElement(driver, editOnFacSummary, 10);
		editOnFacSummary.click();
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

}
