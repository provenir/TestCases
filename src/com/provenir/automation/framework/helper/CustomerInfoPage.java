package com.provenir.automation.framework.helper;

import java.util.ArrayList;
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

public class CustomerInfoPage {

	WebDriver driver;

	public CustomerInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// New Credit Request link from left navigation menu
	@FindBy(how = How.XPATH, using = "//ul[@id='breadCrumbMainNav_new']/li[@id='cstInfo']")
	private WebElement customerInfoTitle;

	@FindBy(how = How.XPATH, using = ".//*[@id='breadCrumbMainNav_new']/li[2]/a/span")
	private WebElement WizardSecondStep;

	@FindBy(how = How.XPATH, using = ".//*[@id='breadCrumbMainNav_new']/li[5]/a/span")
	private WebElement WizardFourthStep;

	@FindBy(how = How.XPATH, using = "//div[@id='partyList']/div[@class='main_content_div']/div[2]/div[1]/a[@id='searchBtn']")
	private WebElement searchButton;

	@FindBy(how = How.ID, using = "dragbar")
	private WebElement searchPopupText;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/div/a")
	private WebElement closeSearchPopup;

	@FindBy(how = How.XPATH, using = "//div[@id='partyList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='backBtn']")
	private WebElement backButton;

	@FindBy(how = How.XPATH, using = "//*[@id='partyList']/div[3]/div[2]/div[1]/a[@name='addParty']")
	private WebElement addNewButton;

	// @FindBy(how = How.XPATH, using =
	// "//div[@id='partyList']/div[@class='main_content_div']/div[2]/div[1]/a[@name='addParty']")
	// private WebElement NewButton;

	@FindBy(how = How.XPATH, using = "//label[@class='error']")
	private List<WebElement> errorMsg;

	@FindBy(how = How.XPATH, using = "//div[@id='partyList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='nextBtn']")
	private WebElement nextButton;

	@FindBy(how = How.XPATH, using = ".//*[@id='openPopup']/div[2]/form/div/div[2]/table/tbody/tr[2]/td[2]/div/a/b")
	private WebElement popupWarningMessage;

	@FindBy(how = How.CSS, using = "a[id='cancelBtn']")
	private WebElement cancelButton;

	@FindBy(how = How.XPATH, using = ".//form[@id='SAVECUSTDETAILSFORM']/div[1]/div[@class='sub_title']")
	private WebElement custSummTitle;

	@FindBy(how = How.ID, using = "compLglName")
	private WebElement companyLegalName;

	@FindBy(how = How.ID, using = "noOfFullTimeEmp")
	private WebElement fullTimeEmpl;

	@FindBy(how = How.ID, using = "compShortName")
	private WebElement companyShortName;

	@FindBy(how = How.ID, using = "partTimeEmpls")
	private WebElement partTimeEmpl;

	@FindBy(how = How.ID, using = "yrEstablished")
	private WebElement yrEstb;

	@FindBy(how = How.ID, using = "selCustList")
	private WebElement CustSelectionCheckBox;

	@FindBy(how = How.ID, using = "addPartyList")
	private WebElement AddCustList;

	@FindBy(how = How.ID, using = "addPartyListBB")
	private WebElement addToCustLst;

	@FindBy(how = How.XPATH, using = ".//*[@id='f7ceb66d0e2b40c5ae8c296b9a13c9a9']/table/tbody/tr[3]/td[1]/input")
	private WebElement CheckBox;

	@FindBy(how = How.ID, using = "delete")
	private WebElement CustomerDeleteButton;

	@FindBy(how = How.ID, using = "dbaName")
	private WebElement doingBusiness;

	@FindBy(how = How.ID, using = "status")
	private WebElement custStatus;

	@FindBy(how = How.NAME, using = "status")
	private WebElement custStatusOfIndivid;

	@FindBy(how = How.NAME, using = "customerSince")
	private WebElement customerSince;

	@FindBy(how = How.ID, using = "website")
	private WebElement website;

	// added Date of birth. tarun Jain 21/02/2014
	@FindBy(how = How.ID, using = "dob")
	private WebElement dateOfBirth;

	@FindBy(how = How.ID, using = "tin")
	private WebElement taxIdentification;

	@FindBy(how = How.XPATH, using = "//*[@id='grsAnnualRvn']")
	private WebElement GAR;

	@FindBy(how = How.ID, using = "stateOfInfo")
	private WebElement stateOfIncorp;

	@FindBy(how = How.ID, using = "garSourceDT")
	private WebElement dateOfGAR;

	@FindBy(how = How.ID, using = "annRevwDt")
	private WebElement annualReviewDate;

	@FindBy(how = How.NAME, using = "interimRevwDt")
	private WebElement interimReviewDate;

	@FindBy(how = How.ID, using = "fiscalYrEnd")
	private WebElement fiscalYearDate;

	@FindBy(how = How.ID, using = "dUNSNumber")
	private WebElement DUNSNumber;

	@FindBy(how = How.CSS, using = "a[id='savecustdetails']")
	private WebElement saveButton;

	@FindBy(how = How.ID, using = "addCustAddr")
	private WebElement addBtn;

	@FindBy(how = How.CSS, using = "a[id='delete']")
	private WebElement deleteButton;

	@FindBy(how = How.ID, using = "noOfSignersReqd")
	private WebElement numOfSigners;

	@FindBy(how = How.NAME, using = "custTypeId")
	private WebElement custTypeIndividual;

	@FindBy(how = How.NAME, using = "firstName")
	private WebElement custFirstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement custLastName;

	@FindBy(how = How.NAME, using = "oFACBlackList")
	private WebElement OFACCheckBox;

	@FindBy(how = How.NAME, using = "publicallyTraded")
	private WebElement publicTradedCheckBox;

	@FindBy(how = How.NAME, using = "nonDomesticEntity")
	private WebElement nonDomesticCheckBox;

	@FindBy(how = How.NAME, using = "restrictedFlag")
	private WebElement restrictedFlagCheckBox;

	@FindBy(how = How.ID, using = "stockExcSymbol")
	private WebElement stockExchange;

	// @FindBy(how = How.XPATH, using =
	// ".//div[@class='sub_content_div']/div[6]/div[1]/input")

	@FindBy(how = How.XPATH, using = ".//*[@id='lastTaxReturn']")
	private WebElement lastTaxReturn;

	@FindBy(how = How.XPATH, using = ".//*[@id='frmSearch']/div[@class='search_div']/div[1]/input[1]")
	private WebElement searchByFirstName;

	@FindBy(how = How.CSS, using = "a[id='submitCrt']")
	private WebElement searchSubmitBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTREQBORRFORM']/div[1]/div/table/tbody/tr[1]/td[1]")
	private WebElement searchedCustOnGrid;

	@FindBy(how = How.CSS, using = "a[id='addPartyList']")
	private WebElement addToCustListBtn;

	@FindBy(how = How.CSS, using = ".//*[@id='addPartyList']/span")
	private WebElement addToCustList;

	@FindBy(how = How.CSS, using = "a[id='loadCustomerGrp']")
	private WebElement loadBtn;

	@FindBy(how = How.NAME, using = "loanOfficer")
	private WebElement loanOfficer;

	@FindBy(how = How.XPATH, using = ".//*[@id='sysUserDiv']/a")
	private WebElement searchBtn;

	@FindBy(how = How.XPATH, using = ".//div[@class='main_content_div']/div[@class='sub_content_div']/div[1]/a")
	private WebElement editBtn;

	@FindBy(how = How.XPATH, using = ".//div[@class='main_content_div']/div[@class='sub_content_div']/div[1]/a[2]")
	private WebElement saveBtn;

	// @FindBy(how = How.XPATH, using =
	// ".//div[@class='main_content_div']/div[@class='sub_content_div']/div[1]/a[1]")
	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCREDBORRFORM']/div/div[2]/div[1]/div[1]/a[1]")
	private WebElement cancelBtn;

	@FindBy(how = How.NAME, using = "primaryBorr")
	private WebElement primaryBorrChkBox;

	@FindBy(how = How.NAME, using = "collAccDepo")
	private WebElement collAccDepoChkBox;

	@FindBy(how = How.XPATH, using = ".//div[@class='green_section']/div[1]/h2")
	private WebElement borrowerDetailTxt;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[1]/input[1]")
	private WebElement searchFirstName;

	@FindBy(how = How.XPATH, using = ".//*[@id='frmSearch']/div/div[2]/input[1]")
	private WebElement searchLastName;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[3]/input[1]")
	private WebElement searchLegalName;

	@FindBy(how = How.XPATH, using = ".//*[@id='frmSearch']/div/div[4]/input[1]")
	private WebElement searchCustShrtName;

	@FindBy(how = How.XPATH, using = ".//*[@id='frmSearch']/div/div[6]/input[1]")
	private WebElement searchCity;

	@FindBy(how = How.XPATH, using = ".//*[@id='frmSearch']/div/div[5]/input[1]")
	private WebElement searchAddressLine;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[7]/input[1]")
	private WebElement searchPostalCode;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[8]/input[1]")
	private WebElement searchRegion;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[9]/span/input[1]")
	private WebElement searchNAICS;

	@FindBy(how = How.XPATH, using = "//div[@class='search_div']/div[10]/input[1]")
	private WebElement searchMaxExposure;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper0']")
	private WebElement firstNameField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper1']")
	private WebElement lastNameField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper2']")
	private WebElement legalNameField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper3']")
	private WebElement shrtNameField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper4']")
	private WebElement addressLineField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper5']")
	private WebElement cityField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper6']")
	private WebElement postalField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper7']")
	private WebElement regionField;

	@FindBy(how = How.XPATH, using = "//*[@name='ipOper9']")
	private WebElement maxExposureField;

	@FindBy(how = How.XPATH, using = "//*[@id='custGrpSrchResDiv']/div[1]/h2")
	private WebElement grpAndRltnPopuptitle;

	@FindBy(how = How.XPATH, using = "//*[@class='sub_content_div']/div[2]/div[3]/div[2]/label")
	private WebElement getFstGrpTitle;

	@FindBy(how = How.XPATH, using = "//*[@id='selGroup']")
	private WebElement selectAllGrpCheckBox;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div[1]/table/tbody/tr")
	private WebElement customerList;

	@FindBy(how = How.ID, using = "langPref")
	private WebElement langPrefer;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div']/div[@class='sub_content_div_alternate']/div[7]/div[1]/label[2]")
	private WebElement custSinceDate;

	@FindBy(how = How.ID, using = "division")
	private WebElement divisionValue;

	@FindBy(how = How.ID, using = "region")
	private WebElement regionValue;

	@FindBy(how = How.ID, using = "corporateStr")
	private WebElement corpStructure;

	@FindBy(how = How.ID, using = "branch")
	private WebElement branchValue;

	@FindBy(how = How.ID, using = "expenseCode")
	private WebElement expenseCodeValue;

	@FindBy(how = How.ID, using = "department")
	private WebElement deptValue;

	@FindBy(how = How.ID, using = "sicCode")
	private WebElement SICCodeValue;

	@FindBy(how = How.ID, using = "nAICSCode")
	private WebElement NAICSCodeValue;

	@FindBy(how = How.ID, using = "legalCode")
	private WebElement legalCodeValue;

	@FindBy(how = How.ID, using = "custClassificatnCode")
	private WebElement custClassiCode;

	@FindBy(how = How.XPATH, using = ".//*[@id='0']/td[5]")
	private WebElement CustGrid;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div']/div[@class='sub_content_div']/div[10]/div[1]/label[2]")
	private WebElement interimReviewDateValue;

	@FindBy(how = How.ID, using = "environmentalRating")
	private WebElement envRating;

	@FindBy(how = How.ID, using = "industryRiskRating")
	private WebElement indRiskRating;

	@FindBy(how = How.ID, using = "middleName")
	private WebElement middleName;

	@FindBy(how = How.ID, using = "annPersonalInc")
	private WebElement annPersInc;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement firstName;

	@FindBy(how = How.ID, using = "salutation")
	private WebElement saluationField;

	@FindBy(how = How.ID, using = "gender")
	private WebElement genderField;

	@FindBy(how = How.ID, using = "marStat")
	private WebElement marriageStatusField;

	@FindBy(how = How.ID, using = "suffix")
	private WebElement suffixField;

	@FindBy(how = How.ID, using = "occupation")
	private WebElement occupationValue;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div']/div[@class='sub_content_div_alternate']/div[6]/div[2]/label[2]")
	private WebElement status;

	@FindBy(how = How.XPATH, using = ".//*[@id='addInfoDiv']/div[8]/div/label[2]")
	private WebElement interimReviewDateOfIndivid;

	@FindBy(how = How.XPATH, using = "//*[@class='main_content_div']/div[@class='sub_content_div_alternate']/div[7]/div[2]/label[2]")
	private WebElement customerSinceDateOfIndivid;

	@FindBy(how = How.XPATH, using = "//*[@id='dupCustContentData']")
	private WebElement dupcustPopup;

	@FindBy(how = How.XPATH, using = "//*[@id='useCurrentCust']")
	private WebElement useCurntbtn;
	@FindBy(how = How.XPATH, using = ".//a[@name='CreateCustomer']/span")
	private WebElement createCustLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='custSummary']")
	private WebElement customerSummaryTitle;

	@FindBy(how = How.XPATH, using = "//*[@id='SAVECUSTDETAILSFORM']/div[1]/div[2]/div[1]/label[2]")
	private WebElement addedCustName;

	@FindBy(how = How.XPATH, using = ".//*[@class='breadcrumbText']")
	private WebElement breadCrumText;

	@FindBy(how = How.XPATH, using = ".//*[@id='addInfoDiv']/div[21]/div[1]/div[1]/input")
	private WebElement empAsYes;

	@FindBy(how = How.XPATH, using = ".//*[@id='custSpecDiv']/div[1]/div[2]/div/span/input")
	private WebElement custTyp;

	@FindBy(how = How.XPATH, using = ".//*[@id='customerInfo']")
	private WebElement custText;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTDUPLICATECUSTWIZARDFORM']/div")
	private WebElement custPopUp;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDBORRFORM']/div/div[1]/h2")
	private WebElement borrowerDetailText;

	@FindBy(how = How.XPATH, using = ".//*[@id='partyList']/div[3]/div[1]/div/table/tbody/tr[1]/td[3]")
	private WebElement indvCustClick;

	@FindBy(how = How.XPATH, using = " .//*[@id='dragbar']/div/a")
	private WebElement poupCloseBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='openPopup']/div[2]/div")
	private WebElement popupCust;

	@FindBy(how = How.XPATH, using = ".//*[@id='nextBtn']/span")
	private WebElement nextBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/div/a")
	private WebElement closeBtn;

	@FindBy(how = How.ID, using = "addrLn1")
	private WebElement addLine1;

	@FindBy(how = How.ID, using = "addrLn2")
	private WebElement addLine2;

	@FindBy(how = How.ID, using = "city")
	private WebElement city;

	@FindBy(how = How.ID, using = "postalCd")
	private WebElement zipcode;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'advSrchIp2')]")
	private WebElement lglNm;

	private String custNameFromGrid = ".//*[@id='data_content']/div[1]/table/tbody/tr";
	private String loanOfficerFromGrid = ".//div[@id='searchData']/div[1]/div[2]/div[1]/table/tbody/tr";
	private String language = "langPref";
	private String branch = "branch";
	private String expenseCode = "expenseCode";
	private String department = "department";
	private String corporateStr = "corporateStr";
	private String division = "division";
	private String industryRisk = "industryRiskRating";
	private String environmentalRating = "environmentalRating";
	private String region = "region";
	private String NAICSCode = "nAICSCode";
	private String SICCode = "sicCode";
	private String legalCode = "legalCode";
	private String customerClassiCode = "custClassificatnCode";
	private String saluation = "salutation";
	private String gender = "gender";
	private String maritalStatus = "marStat";
	private String suffix = "suffix";
	private String occupation = "occupation";
	private String option = "=";
	private int cntOfAddedRows = 0;

	// private String searchedCustFrmGrid =
	// "//div[@class='GridContent']/table/tbody/tr"; Tarun Jain 20/2/2014

	private String searchedCustFrmGrid = "//*[@class='GridContent DivToScroll DivWithScroll']/table/tbody/tr";
	private String lstRetaionsFrmGrid = "//*[@class='sub_content_div']/div[2]/div[2]/div[2]/div/table/tbody/tr";
	private String backToPage = "//div[contains(@class,'breadcrumbGrid')]/ul/li";
	private String pageName = "My Requests";
	private String customerType = "custTypeId";
	private String addressType = "addrTyp0";
	private String country = "country0";
	private String state = "state0";

	private WebElement element = null;
	List<WebElement> lstWebElements = null;

	// ==========METHODS FOR ABOVE ELEMENTS========//

	public String getCustomerInfoTitle() {
		Util.waitForAJAX(driver);
		return customerInfoTitle.getText();
	}

	public int getCntOfAddedRows() {
		return cntOfAddedRows;
	}

	public void setCntOfAddedRows(int cntOfAddedRows) {
		this.cntOfAddedRows = cntOfAddedRows;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getCloseSearchPopup() {
		return closeSearchPopup;
	}

	public void setCloseSearchPopup(WebElement closeSearchPopup) {
		this.closeSearchPopup = closeSearchPopup;
	}

	public WebElement getBackButton() {
		return backButton;
	}

	public void setBackButton(WebElement backButton) {
		this.backButton = backButton;
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public void setAddNewButton(WebElement addNewButton) {
		this.addNewButton = addNewButton;
	}

	public List<WebElement> getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(List<WebElement> errorMsg) {
		this.errorMsg = errorMsg;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}

	public WebElement getPopupWarningMessage() {
		return popupWarningMessage;
	}

	public void setPopupWarningMessage(WebElement popupWarningMessage) {
		this.popupWarningMessage = popupWarningMessage;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public WebElement getCustSummTitle() {
		return custSummTitle;
	}

	public void setCustSummTitle(WebElement custSummTitle) {
		this.custSummTitle = custSummTitle;
	}

	public WebElement getCompanyLegalName() {
		return companyLegalName;
	}

	public void setCompanyLegalName(WebElement companyLegalName) {
		this.companyLegalName = companyLegalName;
	}

	public WebElement getFullTimeEmpl() {
		return fullTimeEmpl;
	}

	public void setFullTimeEmpl(WebElement fullTimeEmpl) {
		this.fullTimeEmpl = fullTimeEmpl;
	}

	public WebElement getCompanyShortName() {
		return companyShortName;
	}

	public void setCompanyShortName(WebElement companyShortName) {
		this.companyShortName = companyShortName;
	}

	public WebElement getPartTimeEmpl() {
		return partTimeEmpl;
	}

	public void setPartTimeEmpl(WebElement partTimeEmpl) {
		this.partTimeEmpl = partTimeEmpl;
	}

	public WebElement getCustStatusOfIndivid() {
		return custStatusOfIndivid;
	}

	public void setCustStatusOfIndivid(WebElement custStatusOfIndivid) {
		this.custStatusOfIndivid = custStatusOfIndivid;
	}

	public WebElement getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(WebElement customerSince) {
		this.customerSince = customerSince;
	}

	public WebElement getWebsite() {
		return website;
	}

	public void setWebsite(WebElement website) {
		this.website = website;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(WebElement dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public WebElement getDateOfGAR() {
		return dateOfGAR;
	}

	public void setDateOfGAR(WebElement dateOfGAR) {
		this.dateOfGAR = dateOfGAR;
	}

	public WebElement getFiscalYearDate() {
		return fiscalYearDate;
	}

	public void setFiscalYearDate(WebElement fiscalYearDate) {
		this.fiscalYearDate = fiscalYearDate;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(WebElement deleteButton) {
		this.deleteButton = deleteButton;
	}

	public WebElement getCustTypeIndividual() {
		return custTypeIndividual;
	}

	public void setCustTypeIndividual(WebElement custTypeIndividual) {
		this.custTypeIndividual = custTypeIndividual;
	}

	public WebElement getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(WebElement custFirstName) {
		this.custFirstName = custFirstName;
	}

	public WebElement getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(WebElement custLastName) {
		this.custLastName = custLastName;
	}

	public WebElement getOFACCheckBox() {
		return OFACCheckBox;
	}

	public void setOFACCheckBox(WebElement oFACCheckBox) {
		OFACCheckBox = oFACCheckBox;
	}

	public WebElement getPublicTradedCheckBox() {
		return publicTradedCheckBox;
	}

	public void setPublicTradedCheckBox(WebElement publicTradedCheckBox) {
		this.publicTradedCheckBox = publicTradedCheckBox;
	}

	public WebElement getNonDomesticCheckBox() {
		return nonDomesticCheckBox;
	}

	public void setNonDomesticCheckBox(WebElement nonDomesticCheckBox) {
		this.nonDomesticCheckBox = nonDomesticCheckBox;
	}

	public WebElement getRestrictedFlagCheckBox() {
		return restrictedFlagCheckBox;
	}

	public void setRestrictedFlagCheckBox(WebElement restrictedFlagCheckBox) {
		this.restrictedFlagCheckBox = restrictedFlagCheckBox;
	}

	public WebElement getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(WebElement stockExchange) {
		this.stockExchange = stockExchange;
	}

	public WebElement getSearchByFirstName() {
		return searchByFirstName;
	}

	public void setSearchByFirstName(WebElement searchByFirstName) {
		this.searchByFirstName = searchByFirstName;
	}

	public WebElement getSearchSubmitBtn() {
		return searchSubmitBtn;
	}

	public void setSearchSubmitBtn(WebElement searchSubmitBtn) {
		this.searchSubmitBtn = searchSubmitBtn;
	}

	public WebElement getSearchedCustOnGrid() {
		return searchedCustOnGrid;
	}

	public void setSearchedCustOnGrid(WebElement searchedCustOnGrid) {
		this.searchedCustOnGrid = searchedCustOnGrid;
	}

	public WebElement getAddToCustListBtn() {
		return addToCustListBtn;
	}

	public void setAddToCustListBtn(WebElement addToCustListBtn) {
		this.addToCustListBtn = addToCustListBtn;
	}

	public WebElement getLoadBtn() {
		return loadBtn;
	}

	public void setLoadBtn(WebElement loadBtn) {
		this.loadBtn = loadBtn;
	}

	public WebElement getLoanOfficer() {
		return loanOfficer;
	}

	public void setLoanOfficer(WebElement loanOfficer) {
		this.loanOfficer = loanOfficer;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		this.editBtn = editBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(WebElement cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public WebElement getPrimaryBorrChkBox() {
		return primaryBorrChkBox;
	}

	public void setPrimaryBorrChkBox(WebElement primaryBorrChkBox) {
		this.primaryBorrChkBox = primaryBorrChkBox;
	}

	public WebElement getCollAccDepoChkBox() {
		return collAccDepoChkBox;
	}

	public void setCollAccDepoChkBox(WebElement collAccDepoChkBox) {
		this.collAccDepoChkBox = collAccDepoChkBox;
	}

	public WebElement getSearchFirstName() {
		return searchFirstName;
	}

	public void setSearchFirstName(WebElement searchFirstName) {
		this.searchFirstName = searchFirstName;
	}

	public WebElement getSearchLastName() {
		return searchLastName;
	}

	public void setSearchLastName(WebElement searchLastName) {
		this.searchLastName = searchLastName;
	}

	public WebElement getSearchLegalName() {
		return searchLegalName;
	}

	public void setSearchLegalName(WebElement searchLegalName) {
		this.searchLegalName = searchLegalName;
	}

	public WebElement getSearchCustShrtName() {
		return searchCustShrtName;
	}

	public void setSearchCustShrtName(WebElement searchCustShrtName) {
		this.searchCustShrtName = searchCustShrtName;
	}

	public WebElement getSearchCity() {
		return searchCity;
	}

	public void setSearchCity(WebElement searchCity) {
		this.searchCity = searchCity;
	}

	public WebElement getSearchAddressLine() {
		return searchAddressLine;
	}

	public void setSearchAddressLine(WebElement searchAddressLine) {
		this.searchAddressLine = searchAddressLine;
	}

	public WebElement getSearchPostalCode() {
		return searchPostalCode;
	}

	public void setSearchPostalCode(WebElement searchPostalCode) {
		this.searchPostalCode = searchPostalCode;
	}

	public WebElement getSearchRegion() {
		return searchRegion;
	}

	public void setSearchRegion(WebElement searchRegion) {
		this.searchRegion = searchRegion;
	}

	public WebElement getSearchNAICS() {
		return searchNAICS;
	}

	public void setSearchNAICS(WebElement searchNAICS) {
		this.searchNAICS = searchNAICS;
	}

	public WebElement getSearchMaxExposure() {
		return searchMaxExposure;
	}

	public void setSearchMaxExposure(WebElement searchMaxExposure) {
		this.searchMaxExposure = searchMaxExposure;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public void setFirstNameField(WebElement firstNameField) {
		this.firstNameField = firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public void setLastNameField(WebElement lastNameField) {
		this.lastNameField = lastNameField;
	}

	public WebElement getLegalNameField() {
		return legalNameField;
	}

	public void setLegalNameField(WebElement legalNameField) {
		this.legalNameField = legalNameField;
	}

	public WebElement getShrtNameField() {
		return shrtNameField;
	}

	public void setShrtNameField(WebElement shrtNameField) {
		this.shrtNameField = shrtNameField;
	}

	public WebElement getAddressLineField() {
		return addressLineField;
	}

	public void setAddressLineField(WebElement addressLineField) {
		this.addressLineField = addressLineField;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public void setCityField(WebElement cityField) {
		this.cityField = cityField;
	}

	public WebElement getPostalField() {
		return postalField;
	}

	public void setPostalField(WebElement postalField) {
		this.postalField = postalField;
	}

	public WebElement getRegionField() {
		return regionField;
	}

	public void setRegionField(WebElement regionField) {
		this.regionField = regionField;
	}

	public WebElement getMaxExposureField() {
		return maxExposureField;
	}

	public void setMaxExposureField(WebElement maxExposureField) {
		this.maxExposureField = maxExposureField;
	}

	public WebElement getGetFstGrpTitle() {
		return getFstGrpTitle;
	}

	public void setGetFstGrpTitle(WebElement getFstGrpTitle) {
		this.getFstGrpTitle = getFstGrpTitle;
	}

	public WebElement getSelectAllGrpCheckBox() {
		return selectAllGrpCheckBox;
	}

	public void setSelectAllGrpCheckBox(WebElement selectAllGrpCheckBox) {
		this.selectAllGrpCheckBox = selectAllGrpCheckBox;
	}

	public WebElement getCustomerList() {
		return customerList;
	}

	public void setCustomerList(WebElement customerList) {
		this.customerList = customerList;
	}

	public WebElement getDivisionValue() {
		return divisionValue;
	}

	public void setDivisionValue(WebElement divisionValue) {
		this.divisionValue = divisionValue;
	}

	public WebElement getRegionValue() {
		return regionValue;
	}

	public void setRegionValue(WebElement regionValue) {
		this.regionValue = regionValue;
	}

	public WebElement getCorpStructure() {
		return corpStructure;
	}

	public void setCorpStructure(WebElement corpStructure) {
		this.corpStructure = corpStructure;
	}

	public WebElement getBranchValue() {
		return branchValue;
	}

	public void setBranchValue(WebElement branchValue) {
		this.branchValue = branchValue;
	}

	public WebElement getExpenseCodeValue() {
		return expenseCodeValue;
	}

	public void setExpenseCodeValue(WebElement expenseCodeValue) {
		this.expenseCodeValue = expenseCodeValue;
	}

	public WebElement getDeptValue() {
		return deptValue;
	}

	public void setDeptValue(WebElement deptValue) {
		this.deptValue = deptValue;
	}

	public WebElement getSICCodeValue() {
		return SICCodeValue;
	}

	public void setSICCodeValue(WebElement sICCodeValue) {
		SICCodeValue = sICCodeValue;
	}

	public WebElement getNAICSCodeValue() {
		return NAICSCodeValue;
	}

	public void setNAICSCodeValue(WebElement nAICSCodeValue) {
		NAICSCodeValue = nAICSCodeValue;
	}

	public WebElement getLegalCodeValue() {
		return legalCodeValue;
	}

	public void setLegalCodeValue(WebElement legalCodeValue) {
		this.legalCodeValue = legalCodeValue;
	}

	public WebElement getCustClassiCode() {
		return custClassiCode;
	}

	public void setCustClassiCode(WebElement custClassiCode) {
		this.custClassiCode = custClassiCode;
	}

	public WebElement getInterimReviewDateValue() {
		return interimReviewDateValue;
	}

	public void setInterimReviewDateValue(WebElement interimReviewDateValue) {
		this.interimReviewDateValue = interimReviewDateValue;
	}

	public WebElement getEnvRating() {
		return envRating;
	}

	public void setEnvRating(WebElement envRating) {
		this.envRating = envRating;
	}

	public WebElement getIndRiskRating() {
		return indRiskRating;
	}

	public void setIndRiskRating(WebElement indRiskRating) {
		this.indRiskRating = indRiskRating;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getSaluationField() {
		return saluationField;
	}

	public void setSaluationField(WebElement saluationField) {
		this.saluationField = saluationField;
	}

	public WebElement getGenderField() {
		return genderField;
	}

	public void setGenderField(WebElement genderField) {
		this.genderField = genderField;
	}

	public WebElement getMarriageStatusField() {
		return marriageStatusField;
	}

	public void setMarriageStatusField(WebElement marriageStatusField) {
		this.marriageStatusField = marriageStatusField;
	}

	public WebElement getSuffixField() {
		return suffixField;
	}

	public void setSuffixField(WebElement suffixField) {
		this.suffixField = suffixField;
	}

	public WebElement getOccupationValue() {
		return occupationValue;
	}

	public void setOccupationValue(WebElement occupationValue) {
		this.occupationValue = occupationValue;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getInterimReviewDateOfIndivid() {
		return interimReviewDateOfIndivid;
	}

	public void setInterimReviewDateOfIndivid(
			WebElement interimReviewDateOfIndivid) {
		this.interimReviewDateOfIndivid = interimReviewDateOfIndivid;
	}

	public WebElement getCustomerSinceDateOfIndivid() {
		return customerSinceDateOfIndivid;
	}

	public void setCustomerSinceDateOfIndivid(
			WebElement customerSinceDateOfIndivid) {
		this.customerSinceDateOfIndivid = customerSinceDateOfIndivid;
	}

	public WebElement getElement() {
		return element;
	}

	public void setElement(WebElement element) {
		this.element = element;
	}

	public String getCustNameFromGrid() {
		return custNameFromGrid;
	}

	public void setCustNameFromGrid(String custNameFromGrid) {
		this.custNameFromGrid = custNameFromGrid;
	}

	public String getLoanOfficerFromGrid() {
		return loanOfficerFromGrid;
	}

	public void setLoanOfficerFromGrid(String loanOfficerFromGrid) {
		this.loanOfficerFromGrid = loanOfficerFromGrid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCorporateStr() {
		return corporateStr;
	}

	public void setCorporateStr(String corporateStr) {
		this.corporateStr = corporateStr;
	}

	public String getEnvironmentalRating() {
		return environmentalRating;
	}

	public void setEnvironmentalRating(String environmentalRating) {
		this.environmentalRating = environmentalRating;
	}

	public String getCustomerClassiCode() {
		return customerClassiCode;
	}

	public void setCustomerClassiCode(String customerClassiCode) {
		this.customerClassiCode = customerClassiCode;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getSearchedCustFrmGrid() {
		return searchedCustFrmGrid;
	}

	public void setSearchedCustFrmGrid(String searchedCustFrmGrid) {
		this.searchedCustFrmGrid = searchedCustFrmGrid;
	}

	public String getLstRetaionsFrmGrid() {
		return lstRetaionsFrmGrid;
	}

	public void setLstRetaionsFrmGrid(String lstRetaionsFrmGrid) {
		this.lstRetaionsFrmGrid = lstRetaionsFrmGrid;
	}

	public void setCustomerInfoTitle(WebElement customerInfoTitle) {
		this.customerInfoTitle = customerInfoTitle;
	}

	public void setSearchPopupText(WebElement searchPopupText) {
		this.searchPopupText = searchPopupText;
	}

	public void setYrEstb(WebElement yrEstb) {
		this.yrEstb = yrEstb;
	}

	public void setDoingBusiness(WebElement doingBusiness) {
		this.doingBusiness = doingBusiness;
	}

	public void setCustStatus(WebElement custStatus) {
		this.custStatus = custStatus;
	}

	public void setTaxIdentification(WebElement taxIdentification) {
		this.taxIdentification = taxIdentification;
	}

	public void setGAR(WebElement gAR) {
		GAR = gAR;
	}

	public void setStateOfIncorp(WebElement stateOfIncorp) {
		this.stateOfIncorp = stateOfIncorp;
	}

	public void setAnnualReviewDate(WebElement annualReviewDate) {
		this.annualReviewDate = annualReviewDate;
	}

	public void setInterimReviewDate(WebElement interimReviewDate) {
		this.interimReviewDate = interimReviewDate;
	}

	public void setDUNSNumber(WebElement dUNSNumber) {
		DUNSNumber = dUNSNumber;
	}

	public void setNumOfSigners(WebElement numOfSigners) {
		this.numOfSigners = numOfSigners;
	}

	public void setLastTaxReturn(WebElement lastTaxReturn) {
		this.lastTaxReturn = lastTaxReturn;
	}

	public void setBorrowerDetailTxt(WebElement borrowerDetailTxt) {
		this.borrowerDetailTxt = borrowerDetailTxt;
	}

	public void setGrpAndRltnPopuptitle(WebElement grpAndRltnPopuptitle) {
		this.grpAndRltnPopuptitle = grpAndRltnPopuptitle;
	}

	public void setLangPrefer(WebElement langPrefer) {
		this.langPrefer = langPrefer;
	}

	public void setCustSinceDate(WebElement custSinceDate) {
		this.custSinceDate = custSinceDate;
	}

	public void setMiddleName(WebElement middleName) {
		this.middleName = middleName;
	}

	public void setAnnPersInc(WebElement annPersInc) {
		this.annPersInc = annPersInc;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setExpenseCode(String expenseCode) {
		this.expenseCode = expenseCode;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public void setIndustryRisk(String industryRisk) {
		this.industryRisk = industryRisk;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setNAICSCode(String nAICSCode) {
		NAICSCode = nAICSCode;
	}

	public void setSICCode(String sICCode) {
		SICCode = sICCode;
	}

	public void setLegalCode(String legalCode) {
		this.legalCode = legalCode;
	}

	public void setSaluation(String saluation) {
		this.saluation = saluation;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public CustomerInfoPage clickSearchButton() {
		searchButton.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public void clickSrchBtn() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, searchButton, 10);
		searchButton.click();
		Util.waitForAJAX(driver);
	}

	public String getSearchPopupText() {
		return searchPopupText.getText();
	}

	public CustomerInfoPage clickCloseBtnSearchPopup() {
		closeSearchPopup.click();
		return this;
	}

	public CustomerInfoPage AddNewButton() {
		addNewButton.click();
		Util.waitForAJAX(driver);
		return this;

	}

	public CustomerInfoPage clickAddNewButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addNewButton);
		Util.waitForAJAX(driver);
		return this;
	}

	public int getCountOfErrorMsgs() {
		return errorMsg.size();
	}

	public boolean verifyOnCustInfoPage() {
		Util.waitForAJAX(driver);
		return companyLegalName.isDisplayed();
	}

	public boolean verifyAddNewBtnPresent() {
		Util.waitForAJAX(driver);
		return addNewButton.isDisplayed();
	}

	public String getCustSummaryTitle() {
		Util.waitForAJAX(driver);
		return custSummTitle.getText();
	}

	public boolean isCompanyLegalNamePresent() {
		Util.waitForAJAX(driver);
		return companyLegalName.isDisplayed();
	}

	public boolean verifyCustPopup() {
		Util.waitForAJAX(driver);
		if (driver
				.findElement(By.xpath("//h2[contains(.,'Search Customers')]"))
				.isDisplayed())
			return true;
		else
			return false;
	}

	public CustomerInfoPage clickCancelButton() {
		cancelButton.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public boolean verifyCustomerExtId() {
		return cancelButton.isDisplayed();
	}

	public void enterCompanyLegalName(String companyLegalNm) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		companyLegalName.sendKeys(companyLegalNm);
	}

	public void enterCompanyShortNme() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", companyShortName);
		js.executeScript("arguments[0].value = '';", companyShortName);
		js.executeScript("arguments[0].value = 'Test Customer';",
				companyShortName);
	}

	public void enterFullTimeEmpl(String fullTmEmpl) {
		fullTimeEmpl.clear();
		fullTimeEmpl.sendKeys(fullTmEmpl);
	}

	public void enterCompanyShortName(String companyShrtName) {
		companyShortName.clear();
		companyShortName.sendKeys(companyShrtName);
	}

	public void enterPartTimeEmpl(String partTmEmpl) {
		partTimeEmpl.clear();
		partTimeEmpl.sendKeys(partTmEmpl);
	}

	public void enterYearEstb(String estbYrValue) {
		yrEstb.clear();
		yrEstb.sendKeys(estbYrValue);
	}

	public void enterDoingBusiness(String businessValue) {
		doingBusiness.clear();
		doingBusiness.sendKeys(businessValue);
	}

	public void enterCustomerSince() {
		Util.waitForElement(driver, customerSince, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", customerSince);
		js.executeScript("arguments[0].value='2016-05-10';", customerSince);

	}

	public void clickDt() {
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div[1]/div[7]/div[1]/a"))
				.click();
	}

	public void enterCustomerSince(String customerSinceValue) {
		Util.waitForElement(driver, customerSince, 5);
		customerSince.clear();
		customerSince.sendKeys(customerSinceValue);
	}

	public void clickCustInfo() {
		driver.findElement(
				By.xpath("//*[@id='addInfoDiv']/div/div[4]/div[1]/div/a"))
				.click();
		driver.findElement(By.id("customerInfo")).click();
	}

	public void clickCustomerInfo() {
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div[1]/div[7]/div[1]/div/a"))
				.click();
		driver.findElement(By.id("customerInfo")).click();
	}

	public void selectCustStatus(String status) {
		Util.selectItemFromList(driver, custStatus, status);
	}

	public void selectCustStatusOfIndivid(String status) {
		Util.selectItemFromList(driver, custStatusOfIndivid, status);
	}

	public void selectLang(String lang) {
		Util.selectItemFromList(driver, language, lang);
	}

	public void enterDateOfBirth() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", dateOfBirth);
		js.executeScript("arguments[0].value='1990-01-15';", dateOfBirth);
		// dateOfBirth.clear();
		// dateOfBirth.sendKeys(dateOfBirthvalue);
	}

	public void enterTaxIdentification(String taxId) {
		taxIdentification.clear();
		taxIdentification.sendKeys(taxId);
	}

	public void enterTaxID() {
		taxIdentification.clear();
		taxIdentification.sendKeys("123456789");
		Util.scrollUp(driver);
	}

	public void selectStateOfIncorp(String state) {
		Util.selectItemFromList(driver, stateOfIncorp, state);
	}

	public void selectCorporateStructure() throws InterruptedException {
		Util.waitForAJAX(driver);
		driver.findElement(
				By.xpath("//*[@id='addInfoDiv']/div/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='addInfoDiv']/div/div[1]/span/input"))
				.sendKeys("Corporation");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"))
				.click();
	}

	public void selectCorporateStructureAsCorporation()
			throws InterruptedException {
		Util.waitForAJAX(driver);
		driver.findElement(
				By.xpath(".//*[@id='addInfoDiv']/div[4]/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath(".//*[@id='addInfoDiv']/div[4]/div[1]/span/input"))
				.sendKeys("Corporation");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[contains(@id,'ui-id-') and (@class='ui-corner-all')]"))
				.click();
	}

	public void selectDivision(String dvsn) {
		Util.waitForAJAX(driver);
		Util.selectItemFromList(driver, division, dvsn);
	}

	public void selectRegion(String regn) {
		Util.waitForAJAX(driver);
		Util.selectItemFromList(driver, region, regn);
	}

	public void enterGARAsOfDate(String GARDate) {
		Util.waitForAJAX(driver);
		dateOfGAR.clear();
		dateOfGAR.sendKeys(GARDate);
		Util.waitForAJAX(driver);
	}
	
	public void enterGARAsOfDate() {
		Util.waitForAJAX(driver);
		dateOfGAR.clear();
		dateOfGAR.sendKeys("2013-06-03");
		Util.waitForAJAX(driver);
	}

	public void enterGAR() {
		Util.waitForElement(driver, GAR, 5);
		GAR.clear();
		GAR.sendKeys("100");
	}

	public void enterAnnualReviewDate(String annualReviewDt) {
		annualReviewDate.clear();
		annualReviewDate.sendKeys(annualReviewDt);
	}
	
	public void enterAnnualReviewDate() {
		annualReviewDate.clear();
		annualReviewDate.sendKeys("2013-06-03");
	}

	public void enterLastTaxReturnDate(String lastTaxReturnDt) {
		lastTaxReturn.clear();
		lastTaxReturn.sendKeys(lastTaxReturnDt);
	}
	
	public void enterLastTaxReturnDate() {
		lastTaxReturn.clear();
		lastTaxReturn.sendKeys("2013-06-07");
	}

	public void enterInterimReviewDate(String interimReviewDt) {
		interimReviewDate.clear();
		interimReviewDate.sendKeys(interimReviewDt);
	}
	
	public void enterInterimReviewDate() {
		interimReviewDate.clear();
		interimReviewDate.sendKeys("2014-06-07");
	}

	public void enterFiscalYearEndDate(String fiscalYearDt) {
		fiscalYearDate.clear();
		fiscalYearDate.sendKeys(fiscalYearDt);
	}
	
	public void enterFiscalYearEndDate() {
		fiscalYearDate.clear();
		fiscalYearDate.sendKeys("16");
	}

	public void enterNumOfSigner(String num) {
		numOfSigners.clear();
		numOfSigners.sendKeys(num);
	}

	public void selectNAICSCode(String NAICSCodeValue) {
		Util.selectItemFromList(driver, NAICSCode, NAICSCodeValue);
	}

	public void selectSICCode(String SICCodeValue) {
		Util.selectItemFromList(driver, SICCode, SICCodeValue);
	}

	public void selectLegalCode(String legalCodevalue) {
		Util.selectItemFromList(driver, legalCode, legalCodevalue);
	}

	public void selectBranch(String branchNm) {
		Util.selectItemFromList(driver, branch, branchNm);
	}

	public void selectIndustry(String industry) {
		Util.selectItemFromList(driver, industryRisk, industry);
	}

	public void selectEnvironment(String envment) {
		Util.selectItemFromList(driver, environmentalRating, envment);
	}

	public void enterWebsite(String webst) {
		website.clear();
		website.sendKeys(webst);
	}

	public void selectExpenseCode(String expenseCodeValue) {
		Util.selectItemFromList(driver, expenseCode, expenseCodeValue);
	}

	public void selectOFACCheckBox() {
		OFACCheckBox.click();
	}

	public void selectNonDomCheckBox() {
		nonDomesticCheckBox.click();
	}

	public void selectrestrictCheckBox() {
		restrictedFlagCheckBox.click();
	}

	public void selectPublicTradeCheckBox() {
		publicTradedCheckBox.click();
	}

	public void enterStockExch(String stExch) {
		stockExchange.clear();
		stockExchange.sendKeys(stExch);
	}

	public void selectDepartment(String departmentNm) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('department').focus();");
		Util.selectItemFromList(driver, department, departmentNm);
	}

	public void enterDUNSNumber(String DUNSNum) {
		DUNSNumber.clear();
		DUNSNumber.sendKeys(DUNSNum);
	}

	public void selectCustomerClassiCode(String custClassiCode) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, customerClassiCode, custClassiCode);
		Util.waitForAJAX(driver);
	}

	public void selectSaluation(String saluationValue) {
		Util.selectItemFromList(driver, saluation, saluationValue);
	}

	public void selectGender() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(gender), 10);
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div[1]/div[4]/div[2]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div[1]/div[4]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div[1]/div[4]/div[2]/span/input"))
				.sendKeys("Female");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Female')]")).click();
	}

	public void selectMaritalStatus(String maritalStatusValue) {
		Util.selectItemFromList(driver, maritalStatus, maritalStatusValue);
	}

	public void enterMiddleName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", middleName);
		js.executeScript("arguments[0].value='On';", middleName);
		// middleName.clear();
		// middleName.sendKeys(midName);
	}

	public void selectSuffix(String suffixValue) {
		Util.selectItemFromList(driver, suffix, suffixValue);
	}

	public void enterAnnPersInc(String persInc) {
		annPersInc.sendKeys(persInc);
	}

	public void selectOccupation(String occupationValue) {
		Util.selectItemFromList(driver, occupation, occupationValue);
	}

	public CustomerInfoPage clickSaveButton() {
		Util.enableAllDropdowns(driver);
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, saveButton, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveButton);
		Util.waitForAJAX(driver);
		return this;
	}

	public void clickAddBtnOFAddressOnCustInfo() {
		Util.waitForElement(driver, addBtn, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addBtn);
		Util.waitForAJAX(driver);
	}

	public boolean getCustNameFromGrid(String custName) {
		boolean result = false;
		result = isElementPresent(dupcustPopup);

		if (result == true) {
			useCurntbtn.click();

		}

		Util.waitForAJAX(driver);
		element = getCustFromGrid(custName);

		if (element != null) {
			return true;
		}
		return false;
	}

	private WebElement getCustFromGrid(String custName) {

		Util.waitForAJAX(driver);
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(custNameFromGrid));

		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(custNameFromGrid + "[" + i
					+ "]/td[3]"));

			if (element.getText().toLowerCase().equals(custName.toLowerCase())) {
				return element;
			}
		}
		return null;
	}

	public boolean getCustNameFromGridForIndivid(String fName, String mName,
			String lName) {
		Util.waitForAJAX(driver);
		element = getCustFromGridForIndivid(fName, mName, lName);

		if (element != null) {
			return true;
		}
		return false;
	}

	private WebElement getCustFromGridForIndivid(String fName, String mName,
			String lName) {

		Util.waitForAJAX(driver);
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(custNameFromGrid));
		String custName = fName + " " + mName + " " + lName;
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(custNameFromGrid + "[" + i
					+ "]/td[3]"));

			if (element.getText().toLowerCase().equals(custName.toLowerCase())) {
				return element;
			}
		}
		return null;
	}

	public void clickBusinessCustOnGridWithAllDetails(String custName) {

		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(custNameFromGrid));

		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(custNameFromGrid + "[" + i
					+ "]/td[3]"));
			if (element.getText().toLowerCase().equals(custName.toLowerCase())) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
				// element.click();
			}
		}
	}

	public void clickIndividCustOnGridWithAllDetails(String fName,
			String mName, String lName) {
		Util.waitForAJAX(driver);
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(custNameFromGrid));
		String custName = fName + " " + mName + " " + lName;
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(custNameFromGrid + "[" + i
					+ "]/td[3]"));
			if (element.getText().toLowerCase().equals(custName.toLowerCase())) {
				element.click();
			}
		}
	}

	public String getCompanyName() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, companyLegalName, 60);
		return companyLegalName.getText();
	}

	public String getfirstName() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, firstName, 60);
		return firstName.getText();
	}

	public String getCompanyShrtName() {
		return companyShortName.getText();
	}

	public String getNumberOfFullEmpl() {
		return fullTimeEmpl.getText();
	}

	public String getNumberOfPartEmpl() {
		return partTimeEmpl.getText();
	}

	public String getYrEstb() {
		return yrEstb.getText();
	}

	public String getDoingBusiness() {
		return doingBusiness.getText();
	}

	public String getCustStatus() {
		return custStatus.getText();
	}

	public String getCustStatusForIndivid() {
		return status.getText();
	}

	public String getLangPrefer() {
		return langPrefer.getText();
	}

	public String getCustSinceDate() {
		return custSinceDate.getText();
	}

	public String getCustSinceDateOfIndivid() {
		return customerSinceDateOfIndivid.getText();
	}

	public String getTaxIdentification() {
		return taxIdentification.getText();
	}

	public String getDivision() {
		return divisionValue.getText();
	}

	public String getRegion() {
		return regionValue.getText();
	}

	public String getStateOfIncorp() {
		return stateOfIncorp.getText();
	}

	public String getNAICSCode() {
		return NAICSCodeValue.getText();
	}

	public String getSICCode() {
		return SICCodeValue.getText();
	}

	public String getLegalCode() {
		return legalCodeValue.getText();
	}

	public String getcustclassiCode() {
		return custClassiCode.getText();
	}

	public String getcustname() {
		return CustGrid.getText();
	}

	public String getBranch() {
		return branchValue.getText();
	}

	public String getDepartment() {
		return deptValue.getText();
	}

	public String getExpenseCode() {
		return expenseCodeValue.getText();
	}

	public String getWebsiteName() {
		return website.getText();
	}

	public String getGAR() {
		return GAR.getText();
	}

	public String getAnnualReviewDate() {
		return annualReviewDate.getText();
	}

	public String getFiscalYearEnd() {
		return fiscalYearDate.getText();
	}

	public String getNumOfSigners() {
		return numOfSigners.getText();
	}

	public String getDUNSNumber() {
		return DUNSNumber.getText();
	}

	public String getStockExchangeSym() {
		return stockExchange.getText();
	}

	public String getcorpStruct() {
		return corpStructure.getText();
	}

	public String getGARAsOfDate() {
		return dateOfGAR.getText();
	}

	public String getInterimReviewDate() {
		return interimReviewDateValue.getText();
	}

	public String getInterimReviewDateForIndivid() {
		return interimReviewDateOfIndivid.getText();
	}

	public String getIndustryRisk() {
		return indRiskRating.getText();
	}

	public String getEnvironmentRating() {
		return envRating.getText();
	}

	public String getLastTaxReturn() {
		return lastTaxReturn.getText();
	}

	public String getSaluation() {
		return saluationField.getText();
	}

	public String getGender() {
		return genderField.getText();
	}

	public String getmaritalStatus() {
		return marriageStatusField.getText();
	}

	public String getMiddleName() {
		return middleName.getText();
	}

	public String getSuffix() {
		return suffixField.getText();
	}

	public String getDOB() {
		return dateOfBirth.getText();
	}

	public String getLastName() {
		return custLastName.getText();
	}

	public String getAnnPersInc() {
		return annPersInc.getText();
	}

	public String getOccupation() {
		return occupationValue.getText();
	}

	public void clickEditBtn() {
		editBtn.click();
		Util.waitForAJAX(driver);
	}

	public boolean getLoanOfficerFromGrid(String loanOfficer) {
		element = getLoanOfficerGrid(loanOfficer);
		if (element != null) {
			return true;
		}
		return false;
	}

	private WebElement getLoanOfficerGrid(String loanOfficer) {
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(loanOfficerFromGrid));

		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(loanOfficerFromGrid + "[" + i
					+ "]/td[2]"));
			if (element.getText().contains(loanOfficer)) {
				return element;
			}
		}
		return null;
	}

	public void clickCustNameOnGrid(String custName) {
		Util.waitForAJAX(driver);
		element = getCustFromGrid(custName);
		element.click();
		Util.waitForAJAX(driver);
	}

	public void searchLoanOfficerName(String loanOfficerNm) {
		loanOfficer.sendKeys(loanOfficerNm);
		searchBtn.click();
		Util.waitForAJAX(driver);
	}

	public int verifyCountEnabledFieldsAfterEdit() {
		int cntEnabled = 0;
		if (primaryBorrChkBox.isEnabled()) {
			cntEnabled++;
		}
		if (collAccDepoChkBox.isEnabled()) {
			cntEnabled++;
		}
		return cntEnabled;
	}

	public void saveEditedData() {
		saveBtn.click();
	}

	public void selectCollAccBoxAndSave() {
		element = editCheckBoxOption();
		saveEditedData();
		Util.waitForAJAX(driver);

	}

	public boolean verifyCollAccDepositBoxAfterSave() {

		if (collAccDepoChkBox.getAttribute("checked") != null) {
			return true;
		}
		return false;
	}

	public void selectCollAccBoxAndCancel() {
		element = editCheckBoxOption();
		cancelBtn.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyCollBoxAfterCancel() {

		if (collAccDepoChkBox.getAttribute("checked") == null) {
			return true;
		}
		return false;
	}

	private WebElement editCheckBoxOption() {
		collAccDepoChkBox.click();
		return collAccDepoChkBox;

	}

	public void enterCustFirstNameForSearch(String custName) {
		Util.waitForElement(driver, searchByFirstName, 10);
		searchByFirstName.sendKeys(custName);
	}

	public void clickSearchSubmitBtn() {
		searchSubmitBtn.click();
	}

	public void selectCustFromGrid() {
		Util.waitForElement(driver, addToCustListBtn, 20);
		if (!searchedCustOnGrid.getText().contains("No Data Available")) {
			searchedCustOnGrid.click();
		}
	}

	public void clickAddToCustListBtn() {
		Util.waitForElement(driver, addToCustListBtn, 20);
		addToCustListBtn.click();
		Util.waitForAJAX(driver);
	}

	public void clickAddToCustomerList() {
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='addPartyList']/span"), 40);
		// Util.waitForElement(addToCustList, 20);
		addToCustList.click();
		Util.waitForAJAX(driver);
	}

	public CustomerInfoPage clickLoadBtn() {
		Util.waitForElement(driver, loadBtn, 60);
		loadBtn.click();
		return this;
	}

	public void clickCustTypeAsIndividual(String value) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(customerType), 20);
		Util.scrollDown(driver);
		Util.selectItemFromList(driver, customerType, value);
		Util.waitForAJAX(driver);
	}

	public void enterCustFirstName(String firstNm) {
		custFirstName.sendKeys(firstNm);
	}

	public void enterCustLastName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", custLastName);
		js.executeScript("arguments[0].value='Test';", custLastName);
	}

	public NewCreditRequest clickBackBtn() {
		backButton.click();
		Util.waitForAJAX(driver);
		return new NewCreditRequest(driver);
	}

	public String enterLastTaxReturn() {
		String lastTaxReturnDate = String.valueOf((Integer.parseInt(Util
				.getCurrentYear()) - 1));
		lastTaxReturnDate += "-03-30";
		lastTaxReturn.sendKeys(lastTaxReturnDate);
		return lastTaxReturnDate;
	}

	public CollateralInfoPage clickOnNextButton() {
		Util.waitForAJAX(driver);
		boolean result = false;
		result = isElementPresent(dupcustPopup);

		if (result == true) {
			useCurntbtn.click();

		}
		Util.waitForAJAX(driver);
		nextButton.click();
		return new CollateralInfoPage(driver);
	}

	public CollateralInfoPage clickNextBtn() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='nextBtn']/span"), 40);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextBtn);

		Util.waitForAJAX(driver);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new CollateralInfoPage(driver);
	}

	public boolean isElementPresent(WebElement element) {
		try {
			// driver.findElement(By.xpath(".//*[@id='dupCustContentData']"));
			element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public String getBorrowerDetailTxt() {
		Util.waitForAJAX(driver);
		return borrowerDetailTxt.getText();
	}

	public boolean searchCustByFirstName(String fName) {
		searchFirstName.clear();
		searchFirstName.sendKeys(fName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(2, fName);
	}

	public boolean searchCustByLastName(String lName) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLastName.sendKeys(lName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(3, lName);
	}

	public boolean searchCustByLegalName(String legalName) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchLegalName.sendKeys(legalName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(4, legalName);
	}

	public boolean searchCustByShrtName(String shrtName) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchCustShrtName.sendKeys(shrtName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(5, shrtName);
	}

	public boolean searchCustByAddressLine(String addressLine) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchAddressLine.sendKeys(addressLine);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(6, addressLine);
	}

	public boolean searchCustByCity(String city) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		searchCity.sendKeys(city);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(7, city);
	}

	public boolean searchCustByPostalCode(String postalCode) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		searchPostalCode.clear();
		int pCode = Integer.parseInt(postalCode);
		searchPostalCode.sendKeys("" + pCode);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(8, postalCode);
	}

	public boolean searchCustByRegion(String region) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		searchPostalCode.clear();
		searchRegion.clear();
		searchRegion.sendKeys(region);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(9, region);
	}

	public boolean searchCustByNAICS(String NAICS) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		searchPostalCode.clear();
		searchRegion.clear();
		searchNAICS.clear();
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, "advSrchIp8", NAICS);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGrid(12, NAICS);
	}

	public boolean searchCustByFirstNameEquals(String fName) {
		Util.selectItemFromList(driver, firstNameField, option);
		searchNAICS.clear();
		searchFirstName.clear();
		searchFirstName.sendKeys(fName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(2, fName);
	}

	public boolean searchCustByLastNameEquals(String lName) {
		searchFirstName.clear();
		Util.selectItemFromList(driver, lastNameField, option);
		searchLastName.clear();
		searchLastName.sendKeys(lName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(3, lName);
	}

	public boolean searchCustByLegalNameEquals(String legalName) {
		searchFirstName.clear();
		searchLastName.clear();
		Util.selectItemFromList(driver, legalNameField, option);
		searchLegalName.clear();
		searchLegalName.sendKeys(legalName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(4, legalName);
	}

	public boolean searchCustByShrtNameEquals(String shrtName) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		Util.selectItemFromList(driver, shrtNameField, option);
		searchCustShrtName.clear();
		searchCustShrtName.sendKeys(shrtName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(5, shrtName);
	}

	public boolean searchCustByAddressLineEquals(String addressLine) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		Util.selectItemFromList(driver, addressLineField, option);
		searchAddressLine.clear();
		searchAddressLine.sendKeys(addressLine);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(6, addressLine);
	}

	public boolean searchCustByCityEquals(String city) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		Util.selectItemFromList(driver, cityField, option);
		searchCity.clear();
		searchCity.sendKeys(city);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(7, city);
	}

	public boolean searchCustByPostalCodeEquals(String postalCode) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		Util.selectItemFromList(driver, postalField, option);
		searchPostalCode.clear();
		int pCode = Integer.parseInt(postalCode);
		searchPostalCode.sendKeys("" + pCode);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForPostalCodeEquals(8, postalCode);
	}

	public boolean searchCustByRegionEquals(String region) {
		searchFirstName.clear();
		searchLastName.clear();
		searchLegalName.clear();
		searchCustShrtName.clear();
		searchAddressLine.clear();
		searchCity.clear();
		searchPostalCode.clear();
		Util.selectItemFromList(driver, regionField, option);
		searchRegion.clear();
		searchRegion.sendKeys(region);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		return getSearchedCustFrmGridForEquals(9, region);
	}

	public boolean getSearchedCustFrmGrid(int column, String value) {
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(searchedCustFrmGrid));
		WebElement firstRow = driver.findElement(By.xpath(searchedCustFrmGrid
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstCustomers.size(); i++) {

				element = driver.findElement(By.xpath(searchedCustFrmGrid + "["
						+ i + "]/td[" + column + "]"));

				if (element.getText().toLowerCase()
						.contains(value.toLowerCase())) {
					return true;
				}
			}
		} else {
			return true;
		}
		return false;
	}

	public boolean getSearchedCustFrmGridForEquals(int column, String value) {
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(searchedCustFrmGrid));
		WebElement firstRow = driver.findElement(By.xpath(searchedCustFrmGrid
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstCustomers.size(); i++) {
				element = driver.findElement(By.xpath(searchedCustFrmGrid + "["
						+ i + "]/td[" + column + "]"));
				if (element.getText().toLowerCase().equals(value.toLowerCase())) {
					return true;
				}
			}
		} else {
			return true;
		}
		return false;
	}

	public void selectMulCust(String shrtName) {
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(searchedCustFrmGrid));
		WebElement firstRow = driver.findElement(By.xpath(searchedCustFrmGrid
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstCustomers.size(); i++) {
				element = driver.findElement(By.xpath(searchedCustFrmGrid + "["
						+ i + "]/td[4]"));
				if (element.getText().toLowerCase()
						.contains(shrtName.toLowerCase())) {
					WebElement checkBox = driver.findElement(By
							.xpath(searchedCustFrmGrid + "[" + i
									+ "]/td[1]/input"));
					checkBox.click();
					cntOfAddedRows++;
				}
			}
		}

	}

	public boolean getSearchedCustFrmGridForPostalCodeEquals(int column,
			String value) {
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(searchedCustFrmGrid));
		WebElement firstRow = driver.findElement(By.xpath(searchedCustFrmGrid
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstCustomers.size(); i++) {
				element = driver.findElement(By.xpath(searchedCustFrmGrid + "["
						+ i + "]/td[" + column + "]"));

				int pCode = Integer.parseInt(element.getText());
				int val = Integer.parseInt(value);
				if (pCode == val) {
					return true;
				}
			}
		} else {
			return true;
		}
		return false;
	}

	public void selectCustUsingSearch(String legalName) {
		searchLegalName.clear();
		searchLegalName.sendKeys(legalName);
		clickSearchSubmitBtn();
		Util.waitForAJAX(driver);
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(searchedCustFrmGrid));
		for (int i = 1; i <= lstCustomers.size(); i++) {
			if ((driver.findElement(By.xpath(searchedCustFrmGrid + "[" + i
					+ "]")).getText()) != "No Data Available") {
				element = driver.findElement(By.xpath(searchedCustFrmGrid + "["
						+ i + "]/td[4]"));
				if (element.getText().contains(legalName)) {
					driver.findElement(
							By.xpath(searchedCustFrmGrid + "[" + i
									+ "]/td[1]/input")).click();
				}
			}
		}

		addToCustListBtn.click();
		Util.waitForAJAX(driver);
	}

	public void selectRelationsCheckBox(String value1, String value2) {
		List<WebElement> lstRltns = driver.findElements(By
				.xpath(lstRetaionsFrmGrid));
		for (int i = 1; i <= lstRltns.size(); i++) {
			if ((driver.findElement(By
					.xpath(lstRetaionsFrmGrid + "[" + i + "]")).getText()) != "No Data Available") {
				element = driver.findElement(By.xpath(lstRetaionsFrmGrid + "["
						+ i + "]/td[3]"));
				if (element.getText().contains(value1)
						|| element.getText().contains(value2)) {
					WebElement checkBox = driver.findElement(By
							.xpath(lstRetaionsFrmGrid + "[" + i
									+ "]/td[1]/input"));
					checkBox.click();
				}
			}
		}
	}

	public void selectAllOfGrpCheckBox() {
		selectAllGrpCheckBox.click();
		loadBtn.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyCustDetails(String custName1, String custName2,
			String custname3) {

		Util.waitForAJAX(driver);
		// Util.waitForElement(customerList, 60);
		List<WebElement> lstCustomers = driver.findElements(By
				.xpath(custNameFromGrid));

		List<String> lstLinks = new ArrayList<String>();
		for (int i = 1; i <= lstCustomers.size(); i++) {
			lstLinks.add(driver.findElement(
					By.xpath(custNameFromGrid + "[" + i + "]/td[3]")).getText());
		}
		int j = 0;
		for (String linkText : lstLinks) {
			if (linkText.contains(custName1) || linkText.contains(custName2)
					|| linkText.contains(custname3)) {
				j++;
			}
		}
		if (j == 3) {
			return true;
		} else {
			return false;
		}
	}

	public String getGrpAndRltnPopuptitle() {
		Util.waitForAJAX(driver);
		return grpAndRltnPopuptitle.getText();

	}

	public String getFstGrpTitle() {
		return getFstGrpTitle.getText();
	}

	public void closePopupWarningMessage() {
		popupWarningMessage.click();
		Util.waitForAJAX(driver);
	}

	public void clickDeleteBtn() {
		deleteButton.click();
	}

	public int cntOfAddedCustOnList(String custName) {
		int cnt = 0;
		Util.waitForAJAX(driver);
		List<WebElement> lstCustNamesFromGrid = driver.findElements(By
				.xpath(custNameFromGrid));
		for (int i = 1; i <= lstCustNamesFromGrid.size(); i++) {
			element = driver.findElement(By.xpath(custNameFromGrid + "[" + i
					+ "]/td[3]"));
			if (element.getText().toLowerCase()
					.contains(custName.toLowerCase())) {
				cnt++;
			}
		}
		return cnt;
	}

	public void clickMatchPopup() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, custPopUp, 30);
		driver.findElement(By.xpath(".//*[@id='useCurrentCust']/span/span"))
				.click();
		Util.waitForAJAX(driver);
	}

	public void selectedCustId() {
		Util.waitForAJAX(driver);
		driver.findElement(By.name("selectedCustId")).click();
	}

	public CustomerInfoPage createCustLink() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, createCustLink, 5);
		createCustLink.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public String customerSummaryPgTitle() {
		Util.waitForElement(driver, customerSummaryTitle, 5);
		return customerSummaryTitle.getText();
	}

	public String getCustName() {
		Util.waitForAJAX(driver);
		boolean result = false;
		result = isElementPresent(dupcustPopup);
		if (result == true) {
			useCurntbtn.click();
		}
		Util.waitForElement(driver, addedCustName, 30);
		return addedCustName.getText();
	}

	public CustomerInfoPage clickBackBreadCrum(String pageName) {
		Actions action = new Actions(driver);
		action.moveToElement(breadCrumText).build().perform();
		lstWebElements = driver.findElements(By.xpath(backToPage));

		for (int i = 1; i <= lstWebElements.size(); i++) {
			element = driver.findElement(By.xpath(backToPage + "[" + i
					+ "]/a[@id='breadCrumbLnk']"));
			if (element.getText().equalsIgnoreCase(pageName)) {
				element.click();
			}
		}
		// backBreadCrumBtn.click();
		Util.waitForAJAX(driver);
		return new CustomerInfoPage(driver);
	}

	public MyRequests clickBackfromBreadCrum(String pageName) {
		Actions action = new Actions(driver);
		action.moveToElement(breadCrumText).build().perform();
		lstWebElements = driver.findElements(By.xpath(backToPage));

		for (int i = 1; i <= lstWebElements.size(); i++) {
			element = driver.findElement(By.xpath(backToPage + "[" + i
					+ "]/a[@id='breadCrumbLnk']"));
			if (element.getText().equalsIgnoreCase(pageName)) {
				element.click();
			}
		}

		Util.waitForAJAX(driver);
		return new MyRequests(driver);
	}

	public void clickEmployeeAsYes() {
		Util.waitForElement(driver, empAsYes, 20);
		empAsYes.click();
		Util.waitForAJAX(driver);
	}

	public void clickCustText() {
		Util.waitForElement(driver, custText, 15);
		custText.click();
	}

	public void clickBorrowerText() {
		Util.waitForElement(driver, borrowerDetailText, 20);
		borrowerDetailText.click();
	}

	public void clickIndvCustOnGrid() {
		Util.waitForElement(driver, indvCustClick, 30);
		indvCustClick.click();
		Util.waitForAJAX(driver);
	}

	public void clickCloseOnCustPopup() {
		Util.waitForElement(driver, popupCust, 30);
		popupCust.click();
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='dragbar']/div/a"), 20);
		poupCloseBtn.click();
		Util.waitForAJAX(driver);
	}

	public void SecondStep() {

		Util.waitForElement(driver, WizardSecondStep, 30);
		WizardSecondStep.click();
		Util.waitForAJAX(driver);
	}

	public void CustSelectionCheckBox() {
		Util.waitForElement(driver, CustSelectionCheckBox, 30);
		CustSelectionCheckBox.click();
		Util.waitForAJAX(driver);
	}

	public void addCustToLst() {
		Util.waitForElement(driver, addToCustLst, 30);
		addToCustLst.click();
		Util.waitForAJAX(driver);
	}

	public void AddCustList() {
		Util.waitForElement(driver, AddCustList, 30);
		AddCustList.click();
		Util.waitForAJAX(driver);
	}

	public void ClickCheckBoxAndDeleteCustomer() {
		Util.waitForElement(driver, CheckBox, 30);
		CheckBox.click();
		Util.waitForAJAX(driver);

		Util.waitForElement(driver, CustomerDeleteButton, 30);
		CustomerDeleteButton.click();
		Util.waitForAJAX(driver);
	}

	public TransactionInfoPage FourthStep() {
		Util.waitForElement(driver, WizardFourthStep, 30);
		WizardFourthStep.click();
		Util.waitForAJAX(driver);
		return new TransactionInfoPage(driver);
	}

	public void selAddType() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(addressType), 10);
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[1]/span/input"))
				.sendKeys("Mailing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Mailing')]")).click();
	}

	public void selCountry() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(country), 5);
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[2]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[2]/span/input"))
				.sendKeys("United States");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'United States')]"))
				.click();
	}

	public void selCustTyp() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(customerType), 10);
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.sendKeys("Individual");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Individual')]")).click();
	}

	public void selCustType() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(customerType), 10);
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='custSpecDiv']/div/div[2]/div[1]/span/input"))
				.sendKeys("Business");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/strong[contains(.,'Business')]"))
				.click();
	}

	public void enterAddressLine1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", addLine1);
		js.executeScript("arguments[0].value='300 Interpace Parkway';",
				addLine1);
	}

	public void enterAddressLine2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", addLine2);
		js.executeScript("arguments[0].value='Building A';", addLine2);
	}

	public void enterCity() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", city);
		js.executeScript("arguments[0].value='Parsippany';", city);
	}

	public void enterZipCode() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", zipcode);
		js.executeScript("arguments[0].value='07054';", zipcode);
	}

	public void selState() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(state), 5);
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[5]/div/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='custAddress']/div/table/tbody/tr/td[5]/div/span/input"))
				.sendKeys("New Jersey");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'New Jersey')]")).click();
	}

	public void clickMatch() throws InterruptedException {
		WebElement ele = driver.findElement(By
				.xpath(".//*[@id='useCurrentCust']/span/span"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyAddedCustomerIsDisplayed() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addedCustName, 30);
		if (addedCustName.isDisplayed())
			return true;
		else
			return false;
	}

	public void enterLegalNm(String value) throws InterruptedException {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, lglNm, 10);
		lglNm.clear();
		lglNm.sendKeys(value);
		Thread.sleep(3000);
		clickSearchSubmitBtn();
	}

}
