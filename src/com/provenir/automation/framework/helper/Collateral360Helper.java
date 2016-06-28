package com.provenir.automation.framework.helper;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.provenir.automation.framework.utility.Util;

public class Collateral360Helper {

	WebDriver driver;
	Actions actions = null;

	public Collateral360Helper(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	@FindBy(how = How.ID, using = "ctrl")
	private WebElement collateralLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='clientCollateral']/div/a")
	private WebElement addBtnOnCollateral;

	@FindBy(how = How.XPATH, using = ".//*[@id='c360r']")
	private WebElement collateralTitle;

	@FindBy(how = How.ID, using = "collAccName")
	private WebElement collateralName;

	@FindBy(how = How.ID, using = "collCd")
	private WebElement collateralCode;

	@FindBy(how = How.ID, using = "ownerName")
	private WebElement collateralOwnerName;

	@FindBy(how = How.ID, using = "ownSearch")
	private WebElement clickSearchedCollateralOwner;

	@FindBy(how = How.ID, using = "ownerPer")
	private WebElement collateralOwnerPercentage;

	@FindBy(how = How.ID, using = "daysUntilNxtRevw")
	private WebElement daysUntilReview;

	@FindBy(how = How.ID, using = "selectPrimaryOwner")
	private WebElement collateralPrimaryOwner;

	@FindBy(how = How.ID, using = "savecolldetails")
	private WebElement saveCollateralDetails;

	@FindBy(how = How.ID, using = "useCurrentCust")
	private WebElement useCurrentCustomer;

	@FindBy(how = How.XPATH, using = ".//*[@id='partySrchRes']//span[contains(.,'Load')]")
	private WebElement loadCollateralOwner;

	@FindBy(how = How.ID, using = "city")
	private WebElement city;

	@FindBy(how = How.ID, using = "addr2")
	private WebElement street;

	@FindBy(how = How.ID, using = "addr1")
	private WebElement number;

	@FindBy(how = How.ID, using = "zip")
	private WebElement zipcode;

	@FindBy(how = How.ID, using = "c360")
	private WebElement basicCollateralInformation;

	@FindBy(how = How.ID, using = "titledMot")
	private WebElement titledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='coll360cSliderMenu']/div[2]/ul/div[14]/li[1]/a")
	private WebElement titledMotorVech;

	@FindBy(how = How.ID, using = "stock")
	private WebElement shares;

	@FindBy(how = How.XPATH, using = ".//*[@id='coll360cSliderMenu']/div[2]/ul/div[6]/li[1]/a")
	private WebElement sharesLink;

	@FindBy(how = How.ID, using = "ucc")
	private WebElement ucc;

	@FindBy(how = How.XPATH, using = ".//*[@id='coll360cSliderMenu']/div[2]/ul/div[3]/li[1]/a")
	private WebElement uccLink;

	// @FindBy(how = How.ID, using = "apn")
	// private WebElement TaxInformation;

	@FindBy(how = How.XPATH, using = ".//*[@id='coll360cSliderMenu']/div/ul/div[2]/li[3]/a")
	private WebElement TaxInformation;

	@FindBy(how = How.ID, using = "editBtn")
	private WebElement editBtnTax;

	@FindBy(how = How.ID, using = "cvnt")
	private WebElement covenant;

	@FindBy(how = How.ID, using = "dcts")
	private WebElement documents;

	@FindBy(how = How.ID, using = "siteVisit")
	private WebElement siteVisit;

	@FindBy(how = How.ID, using = "existLiens")
	private WebElement existingLiens;

	@FindBy(how = How.ID, using = "cVal")
	private WebElement collateralEvaluation;

	@FindBy(how = How.ID, using = "cFac")
	private WebElement collateralFacility;

	@FindBy(how = How.ID, using = "backBC")
	private WebElement backBtn;

	@FindBy(how = How.ID, using = "add")
	private WebElement address;

	@FindBy(how = How.ID, using = "cHold")
	private WebElement collateralHolding;

	@FindBy(how = How.ID, using = "apn")
	private WebElement apn;

	@FindBy(how = How.ID, using = "insurance")
	private WebElement insurance;

	@FindBy(how = How.ID, using = "floodInfo")
	private WebElement floodInfo;

	@FindBy(how = How.ID, using = "leaseInfo")
	private WebElement leaseInfo;

	@FindBy(how = How.ID, using = "envDetails")
	private WebElement envDetails;

	@FindBy(how = How.ID, using = "bDetails")
	private WebElement building;

	@FindBy(how = How.ID, using = "propDetails")
	private WebElement propDetails;

	@FindBy(how = How.ID, using = "pDesign")
	private WebElement propertyDesignation;

	@FindBy(how = How.ID, using = "pInsp")
	private WebElement propertyInspection;

	@FindBy(how = How.ID, using = "pHistory")
	private WebElement propertyHistory;

	@FindBy(how = How.ID, using = "pMgmt")
	private WebElement propertyManagement;

	@FindBy(how = How.ID, using = "editBtn")
	private WebElement editBtnOnTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLACCTFORM']/div[1]/div[1]/div[1]/label[1]")
	private WebElement collName;

	@FindBy(how = How.ID, using = "addNewTitledMotor")
	private WebElement addBtnOnTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLUCCFORM']/div[4]/a")
	private WebElement editBtnOnUCC;

	@FindBy(how = How.ID, using = "addNewUccLock")
	private WebElement addBtnOnUCC;

	@FindBy(how = How.ID, using = "lastSearchDate")
	private WebElement lastSrchDateOnUCC;

	@FindBy(how = How.NAME, using = "filingDate0")
	private WebElement fillingDate;

	@FindBy(how = How.NAME, using = "filingNumber0")
	private WebElement fillingNumber;

	@FindBy(how = How.NAME, using = "facilityName0")
	private WebElement facilityName;

	@FindBy(how = How.NAME, using = "fillingComments0")
	private WebElement comments;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/div/table/tbody/tr/td[5]/a")
	private WebElement actionMenuOnUCC;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[1]/input")
	// private WebElement typeOfVehicle;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'typeInfo0')]")
	private WebElement typeOfVehicle;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[2]/input")
	// private WebElement vehicleYear;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'year0')]")
	private WebElement vehicleYear;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[3]/input")
	// private WebElement make;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'make0')]")
	private WebElement make;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[4]/input")
	// private WebElement model;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'model0')]")
	private WebElement model;

	// @FindBy(how = How.XPATH, using =
	// ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[5]/input")
	// private WebElement vin;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'vinDesc0')]")
	private WebElement vin;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[6]/a")
	private WebElement actionMenuOnTitledMotorVehicle;

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement deleteLnk;

	@FindBy(how = How.LINK_TEXT, using = "Details")
	private WebElement detailsLnk;

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement EditLink;

	@FindBy(how = How.LINK_TEXT, using = ".//*[@id='data_content']/div/table/tbody/tr/td[5]/div/div/div/div/ul/li[1]/a")
	private WebElement EditLink1;

	@FindBy(how = How.ID, using = "saveTitledMotorDetails")
	private WebElement saveTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTTITLEDMOTORFORM']/div/div[3]/div/a[1]")
	private WebElement cancelTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTTAXDETAILFORM']/div/div[8]/a[2]")
	private WebElement cancelApnTaxPayment;

	@FindBy(how = How.ID, using = "errorMsgForTitledMotor")
	private WebElement errMsgOnTitledVehicle;

	@FindBy(how = How.ID, using = "cReq")
	private WebElement creditReq;

	@FindBy(how = How.ID, using = "credCollPool")
	private WebElement collateralPoolOnCredit;

	@FindBy(how = How.ID, using = "credLnCollPool")
	private WebElement collateralPoolOnFacility;

	@FindBy(how = How.XPATH, using = ".//*[@id='CredLnCollPoolDetails']/div/div/table/tbody/tr/td[5]/a")
	private WebElement actionMenuOnCollateralPool;

	@FindBy(how = How.ID, using = "cAcc")
	private WebElement collateralAccounts;

	@FindBy(how = How.ID, using = "ownOccflg")
	private WebElement ownerOccupancy;

	@FindBy(how = How.XPATH, using = ".//*[@id='collAccnt']/div/div/table/tbody/tr/td[7]/a")
	private WebElement actionMenuOnCollateralAccounts;

	@FindBy(how = How.ID, using = "addCollAcc")
	private WebElement addBtnOncollateralAccounts;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLACCTFORM']/div[2]/a")
	private WebElement editOnBasicCollateral;

	@FindBy(how = How.ID, using = "saveUccDtls")
	private WebElement saveUCC;

	@FindBy(how = How.ID, using = "forUccErrorMsg")
	private WebElement errMsgOnUCC;

	@FindBy(how = How.ID, using = "cancelUccDtls")
	private WebElement cancelUCC;

	@FindBy(how = How.XPATH, using = "//b[contains(.,' Proceed ')]")
	private WebElement proceedBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='stockDiv']/form/a")
	private WebElement editBtnOnShares;

	@FindBy(how = How.ID, using = "saveStockBondDtls")
	private WebElement saveSharesDetails;

	@FindBy(how = How.XPATH, using = ".//*[@class='error']")
	private WebElement errMsgOnShares;

	@FindBy(how = How.ID, using = "marginRateLtv")
	private WebElement marginRate;

	@FindBy(how = How.ID, using = "noOfCertificates")
	private WebElement noOfCertificate;

	@FindBy(how = How.ID, using = "certificateNums")
	private WebElement certificateNumber;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTSTOCKMUTUALFUNDFORM']/div[2]/a[1]")
	private WebElement cancelOnShares;

	@FindBy(how = How.NAME, using = "issuerNm")
	private WebElement issuer;

	@FindBy(how = How.ID, using = "yrBuilt")
	private WebElement yearBuilt;

	@FindBy(how = How.ID, using = "bondSerialNo")
	private WebElement bondSerialNo;

	@FindBy(how = How.ID, using = "accountType")
	private WebElement accountType;

	@FindBy(how = How.ID, using = "accountNumber")
	private WebElement accountNumber;

	@FindBy(how = How.ID, using = "allTradesDesc")
	private WebElement allowedDesc;

	@FindBy(how = How.ID, using = "ownOccPercent")
	private WebElement ownOccPercent;

	@FindBy(how = How.ID, using = "noTotUnits")
	private WebElement noTotUnits;

	@FindBy(how = How.ID, using = "taxServiceContractNbr")
	private WebElement taxServiceContract;

	@FindBy(how = How.ID, using = "taxServiceCompanyNm")
	private WebElement taxServiceCompany;

	@FindBy(how = How.ID, using = "saveTaxInfo")
	private WebElement saveTaxInfo;

	@FindBy(how = How.ID, using = "addTax")
	private WebElement addTax;

	@FindBy(how = How.XPATH, using = "//label[@class='error']")
	private List<WebElement> errorMsg;

	@FindBy(how = How.ID, using = "savetaxapndetails")
	private WebElement savetaxapndetails;

	@FindBy(how = How.ID, using = "taxAssessedValue")
	private WebElement taxAssessedValue;

	@FindBy(how = How.ID, using = "annualTaxes")
	private WebElement annualTaxes;

	@FindBy(how = How.ID, using = "taxDueDate")
	private WebElement taxDueDate;

	@FindBy(how = How.ID, using = "comments")
	private WebElement commentsTax;

	@FindBy(how = How.ID, using = "addTaxPayment")
	private WebElement addTaxPayment;

	@FindBy(how = How.ID, using = "taxPaymentAmount")
	private WebElement taxPaymentAmount;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr/td")
	private String TaxGrid;

	@FindBy(how = How.XPATH, using = ".//*[@id='data_content']/div/table/tbody/tr/td[5]/a[1]")
	private WebElement actionMenuTax;

	@FindBy(how = How.ID, using = "edit")
	private WebElement EditLnk;

	@FindBy(how = How.ID, using = "Delete")
	private WebElement DeleteLnk;

	@FindBy(how = How.XPATH, using = ".//*[@class='breadcrumbText']")
	private WebElement breadCrumText;

	private WebElement element = null;
	List<WebElement> GridElements = null;

	private String collType = "collType";
	private String collSubType = "collSubType";
	private String shareType = "typeId";
	private String entireAccountPledged = "entireAccPledgedId";
	private String movable = ".//*[@id='collaterTypePage']/div[1]/div[2]/div[1]/span/input";
	private String NewlyBuilt = ".//*[@id='collaterTypePage']/div[1]/div[5]/div[1]/span/input";
	private String businessLine = "bussLineId";
	private String Market = "marketId";
	private String Country = ".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/select";
	private String propertyTaxesCurrent = "propertyTaxesCurrent";
	private String backToPage = "//div[contains(@class,'breadcrumbGrid')]/ul/li";
	private String facName = "facilityName0";

	public void selectCollType(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Deposits";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public void selectCollSubType(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Deposit Account, External";
		Util.selectItemFromList(driver, collSubType, option);
		Util.waitForAJAX(driver);
	}

	public void clickCollateralLink() throws InterruptedException {
		Util.waitForLoaderToFinish(driver);

		collateralLink.click();
		Util.scrollDown(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickOnAddCollateralLink() {
		collateralLink.click();
		Util.waitForElement(driver, addBtnOnCollateral, 20);
		addBtnOnCollateral.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public void verifyCollateralTitle() throws InterruptedException {
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);

		Util.waitForElement(driver, collateralTitle, 20);
		String title = collateralTitle.getText().trim();
		Assert.assertEquals("Basic Collateral Information", title);

	}

	public void enterCollateralName() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, collateralName, 20);
		collateralName.clear();
		collateralName.sendKeys("Test collateral");
	}

	public void enterCollateralCode() {
		Util.waitForElement(driver, collateralCode, 10);
		collateralCode.sendKeys("coll1");
	}

	public void enterCollateralOwnerName() {
		Util.waitForLoaderToFinish(driver);
		collateralOwnerName.sendKeys("intex");
		Util.scrollUp(driver);
		clickSearchedCollateralOwner.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, loadCollateralOwner, 10);
		loadCollateralOwner.click();
		Util.waitForAJAX(driver);
	}

	public void enterCollateralPercentage() {
		Util.waitForLoaderToFinish(driver);
		collateralOwnerPercentage.sendKeys("100");
	}

	public void setPrimaryCollateralOwner() {
		collateralPrimaryOwner.click();
	}

	public void clickOnSaveCollateral() {
		Util.scrollUp(driver);
		saveCollateralDetails.click();
		Util.waitForLoaderToFinish(driver);
		if (useCurrentCustomer.isDisplayed()) {
			useCurrentCustomer.click();
			Util.waitForLoaderToFinish(driver);
		}
		Util.waitForAJAX(driver);
	}

	public void selectCollateralTypeAsVehicle(String option) {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Vehicles";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public void selectCollateralSubTypeAsTitledMotorVehicles(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Titled Motor Vehicles";
		Util.selectItemFromList(driver, collSubType, option);
		Util.waitForAJAX(driver);
	}

	public String getMovableValue() {
		WebElement ele = driver.findElement(By.id("locMovable"));
		String s = ele.getCssValue("name");
		String s1 = ele.getAttribute("name");
		System.out.println("***********" + s + "_________" + s1);
		return s1;
	}

	public void selectCollateralSubTypeAsRetailOffice(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Retail Office";
		Util.selectItemFromList(driver, collSubType, option);
		Util.waitForAJAX(driver);
	}

	public String getNewlybuiltValue() {
		WebElement ele = driver.findElement(By.id("newlyBlt"));
		String s = ele.getCssValue("name");
		String s1 = ele.getAttribute("name");
		System.out.println("***********" + s + "_________" + s1);
		return s1;
	}

	public void newlybuilt(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		option = "No";
		Util.selectItemFromList(driver, getNewlybuiltValue(), option);
		Util.waitForAJAX(driver);
	}

	public void BusinessLine(String option) {
		Util.scrollUp(driver);
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'bussLineId')]"), 10);
		option = "MFL";
		Util.selectItemFromList(driver, businessLine, option);
		Util.waitForAJAX(driver);
	}

	public void Market(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'bussLineId')]"), 10);
		option = "Irvine";
		Util.selectItemFromList(driver, Market, option);
		Util.waitForAJAX(driver);
	}

	public void OwnerOccupancyAndOccupancyofRent() {
		ownerOccupancy.click();
		ownOccPercent.clear();
		ownOccPercent.sendKeys("100");
		noTotUnits.clear();
		noTotUnits.sendKeys("10");
	}

	public void enterMovable(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='collaterTypePage']/div[1]/div[2]/div[1]/span/input"),
				10);
		option = "N/A";
		Util.selectItemFromList(driver, getMovableValue(), option);
		Util.waitForAJAX(driver);
	}

	public String getCountryValue() {
		WebElement ele = driver.findElement(By.xpath(".//*[@id='country']"));
		String s = ele.getCssValue("name");
		String s1 = ele.getAttribute("name");
		System.out.println("***********" + s + "_________" + s1);
		return s1;
	}

	public void enterCountry(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/span/input"),
				10);
		option = "United States";
		Util.selectItemFromList(driver, getCountryValue(), option);
		Util.waitForAJAX(driver);
	}

	public void enterCity() {
		Util.waitForElementPresent(driver, By.id("city"), 10);
		Util.waitForAJAX(driver);
		city.clear();
		city.sendKeys("Parsipanny");
	}

	public void enterStreet() {
		street.clear();
		street.sendKeys("address 2");
	}

	public void enterNumber() {
		number.clear();
		number.sendKeys("address 1");
	}

	public void enterZipCode() {
		Util.scrollUp(driver);
		zipcode.clear();
		zipcode.sendKeys("07054");
	}

	public boolean verifyLeftHandMenuOnCollateralTypeAsVehicle() {
		Util.waitForAJAX(driver);
		String s1 = basicCollateralInformation.getText().trim();
		String s2 = titledMotorVehicle.getText().trim();
		String s3 = covenant.getText().trim();
		String s4 = documents.getText().trim();
		String s5 = siteVisit.getText().trim();
		String s6 = existingLiens.getText().trim();
		String s7 = collateralEvaluation.getText().trim();
		String s8 = collateralFacility.getText().trim();
		if (s1.equalsIgnoreCase("Basic Collateral Information")
				&& s2.equalsIgnoreCase("Titled Motor Vehicle")
				&& s3.equalsIgnoreCase("Covenants")
				&& s4.equalsIgnoreCase("Documents")
				&& s5.equalsIgnoreCase("Site Visit/Audit")
				&& s6.equalsIgnoreCase("Existing Liens")
				&& s7.equalsIgnoreCase("Collateral Valuation")
				&& s8.equalsIgnoreCase("Collateral Facility")) {
			return true;
		} else
			return false;
	}

	public Customer360Helper clickBackButton() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.id("backBC"), 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", backBtn);

		Util.waitForLoaderToFinish(driver);
		return new Customer360Helper(driver);
	}

	public Customer360Helper clickBackBreadCrum(String pageName) {
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
		Util.waitForAJAX(driver);
		return new Customer360Helper(driver);
	}

	public void selectCollateralTypeAsShares(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Shares";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public void selectCollateralSubTypeAsGovBonds(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Government Bonds";
		Util.selectItemFromList(driver, collSubType, option);
		Util.waitForAJAX(driver);
	}

	public boolean verifyLeftHandMenuOnCollateralTypeAsShares() {
		Util.waitForAJAX(driver);
		String s1 = basicCollateralInformation.getText().trim();
		String s2 = shares.getText().trim();
		String s3 = covenant.getText().trim();
		String s4 = documents.getText().trim();
		String s5 = siteVisit.getText().trim();
		String s6 = existingLiens.getText().trim();
		String s7 = collateralEvaluation.getText().trim();
		String s8 = collateralFacility.getText().trim();
		if (s1.equalsIgnoreCase("Basic Collateral Information")
				&& s2.equalsIgnoreCase("Shares/Stocks/Bonds/Mutual Funds")
				&& s3.equalsIgnoreCase("Covenants")
				&& s4.equalsIgnoreCase("Documents")
				&& s5.equalsIgnoreCase("Site Visit/Audit")
				&& s6.equalsIgnoreCase("Existing Liens")
				&& s7.equalsIgnoreCase("Collateral Valuation")
				&& s8.equalsIgnoreCase("Collateral Facility")) {
			return true;
		} else
			return false;
	}

	public void selectCollateralTypeAsAccountsReceivable(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Accounts Receivable";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public void selectCollateralSubTypeASAccountsReceivable(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Accounts Receivable";
		Util.selectItemFromList(driver, collSubType, option);
		Util.waitForAJAX(driver);
	}

	public boolean verifyLeftHandMenuOnCollateralTypeAsAccountsReceivable() {
		Util.waitForAJAX(driver);
		String s1 = basicCollateralInformation.getText().trim();
		String s2 = ucc.getText().trim();
		String s3 = covenant.getText().trim();
		String s4 = documents.getText().trim();
		String s5 = siteVisit.getText().trim();
		String s6 = existingLiens.getText().trim();
		String s7 = collateralEvaluation.getText().trim();
		String s8 = collateralFacility.getText().trim();
		if (s1.equalsIgnoreCase("Basic Collateral Information")
				&& s2.equalsIgnoreCase("UCC")
				&& s3.equalsIgnoreCase("Covenants")
				&& s4.equalsIgnoreCase("Documents")
				&& s5.equalsIgnoreCase("Site Visit/Audit")
				&& s6.equalsIgnoreCase("Existing Liens")
				&& s7.equalsIgnoreCase("Collateral Valuation")
				&& s8.equalsIgnoreCase("Collateral Facility")) {
			return true;
		} else
			return false;
	}

	public void selectCollateralTypeAsRealEstate(String option) {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Real Estate";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public boolean verifyLeftHandMenuOnCollateralTypeAsRealEstate() {
		Util.waitForAJAX(driver);
		String s1 = basicCollateralInformation.getText().trim();
		String s2 = address.getText().trim();
		String s3 = collateralHolding.getText().trim();
		String s4 = apn.getText().trim();
		String s5 = insurance.getText().trim();
		String s6 = floodInfo.getText().trim();
		String s7 = leaseInfo.getText().trim();
		String s8 = envDetails.getText().trim();
		String s9 = collateralEvaluation.getText().trim();
		String s10 = siteVisit.getText().trim();
		String s11 = existingLiens.getText().trim();
		String s14 = propertyDesignation.getText().trim();
		String s15 = propertyInspection.getText().trim();
		String s16 = propertyHistory.getText().trim();
		String s17 = propertyManagement.getText().trim();
		String s18 = covenant.getText().trim();
		String s19 = documents.getText().trim();
		String s20 = collateralFacility.getText().trim();
		if (s1.equalsIgnoreCase("Basic Collateral Information")
				&& s2.equalsIgnoreCase("Address")
				&& s3.equalsIgnoreCase("Collateral Holdings")
				&& s4.equalsIgnoreCase("APN/Tax Information")
				&& s5.equalsIgnoreCase("Insurance")
				&& s6.equalsIgnoreCase("Flood Information")
				&& s7.equalsIgnoreCase("Lease Information")
				&& s8.equalsIgnoreCase("Environmental Details")
				&& s9.equalsIgnoreCase("Collateral Valuation")
				&& s10.equalsIgnoreCase("Site Visit/Audit")
				&& s11.equalsIgnoreCase("Existing Liens")
				&& s14.equalsIgnoreCase("Property Designation")
				&& s15.equalsIgnoreCase("Property Inspection")
				&& s16.equalsIgnoreCase("Property History")
				&& s17.equalsIgnoreCase("Property Management")
				&& s18.equalsIgnoreCase("Covenants")
				&& s19.equalsIgnoreCase("Documents")
				&& s20.equalsIgnoreCase("Collateral Facility")) {
			return true;
		} else

			return false;
	}

	public void clickOnAddBtn() throws InterruptedException {
		Util.waitForAJAX(driver);
		clickCollateralLink();
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='clientCollateral']/div/a"), 20);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addBtnOnCollateral);
		Util.waitForAJAX(driver);
	}

	public void clickOnTitledMotorVehicleSection() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='coll360cSliderMenu']/div[2]/ul/div[14]/li[1]/a"),
				15);
		titledMotorVech.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickEditOnTitledMotorVehicle() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, editBtnOnTitledMotorVehicle, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editBtnOnTitledMotorVehicle);
	}

	public void addOnTitledMotorVehicle() {
		Util.waitForElement(driver, addBtnOnTitledMotorVehicle, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addBtnOnTitledMotorVehicle);
	}

	public void saveTitledMotorVehicleDetails() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, typeOfVehicle, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", typeOfVehicle);
		js.executeScript("arguments[0].value='Truck';", typeOfVehicle);

		vehicleYear.clear();

		vehicleYear.sendKeys("2010");
		make.clear();

		make.sendKeys("2008");
		model.clear();

		model.sendKeys("NJ1234");
		vin.clear();

		vin.sendKeys("12345");

		saveTitledMotorVehicle.click();
		Util.waitForAJAX(driver);
	}

	public void updateTitledMotorVehicle() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, typeOfVehicle, 15);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", typeOfVehicle);
		js.executeScript("arguments[0].value='Truck';", typeOfVehicle);

		vehicleYear.clear();
		vehicleYear.sendKeys("2012");
		make.clear();
		make.sendKeys("2010");
		model.clear();
		model.sendKeys("NY5678");
		vin.clear();
		vin.sendKeys("12345");
		saveTitledMotorVehicle.click();
		Util.waitForAJAX(driver);
	}

	public void cancelTitledMotorVehicle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", typeOfVehicle);
		js.executeScript("arguments[0].value='Truck';", typeOfVehicle);

		vehicleYear.clear();
		vehicleYear.sendKeys("2010");
		make.clear();
		make.sendKeys("2008");
		model.clear();
		model.sendKeys("NJ1234");
		vin.clear();
		vin.sendKeys("12345");
		cancelTitledMotorVehicle.click();
		Util.waitForAJAX(driver);
	}

	public boolean verifyActionMenuPresentOnTitledMotorVehicle() {
		if (actionMenuOnTitledMotorVehicle.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickDeleteOnTitledMotorVehicle() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Util.waitForElement(driver, actionMenuOnTitledMotorVehicle, 10);
		js.executeScript("arguments[0].click();",
				actionMenuOnTitledMotorVehicle);

		Util.waitForElement(driver, deleteLnk, 15);

		js.executeScript("arguments[0].click();", deleteLnk);
		Util.waitForAJAX(driver);
	}

	public boolean verifyMandatoryDetailsOnTitledMotorVehicle() {
		saveTitledMotorVehicle.click();
		if (errMsgOnTitledVehicle.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickOnUCC() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='coll360cSliderMenu']/div[2]/ul/div[3]/li[1]/a"),
				20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", uccLink);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickOnTaxInformation() {
		Util.waitForElementPresent(driver, By
				.xpath(".//*[@id='coll360cSliderMenu']/div/ul/div[2]/li[3]/a"),
				20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", TaxInformation);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickEditOnTaxInformation() {
		Util.waitForElement(driver, editBtnTax, 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editBtnTax);
		Util.waitForAJAX(driver);
	}

	public void clickEditAndAddOnUCC() {
		Util.waitForElement(driver, editBtnOnUCC, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editBtnOnUCC);

		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, addBtnOnUCC, 10);
		js.executeScript("arguments[0].click();", addBtnOnUCC);
	}

	public void clickCreditRequest() {
		Util.waitForElement(driver, creditReq, 10);
		creditReq.click();
	}

	public void clickSaveCollateral() {
		Util.scrollUp(driver);
		saveCollateralDetails.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public void clickUseCurrentBtn() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", useCurrentCustomer);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public void saveCollateral() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveCollateralDetails);
		Util.waitForAJAX(driver);
	}

	public void clickOnCollateralPool() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, collateralPoolOnFacility, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", collateralPoolOnFacility);

		Util.waitForLoaderToFinish(driver);
	}

	public void clickDetailsOnCollateralPool() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='CredLnCollPoolDetails']/div/div/table/tbody/tr/td[5]/a"),
				10);
		actions.moveToElement(actionMenuOnCollateralPool).click().perform();
		Util.waitForElement(driver, detailsLnk, 15);
		detailsLnk.click();
		Util.waitForAJAX(driver);
	}

	public void clickDetailsLinkOnCollateralPool() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", actionMenuOnCollateralPool);
		js.executeScript("arguments[0].click();", detailsLnk);
		Util.waitForAJAX(driver);
	}

	public void clickCollateralAccounts() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", collateralAccounts);
		Util.waitForAJAX(driver);
	}

	public void clickDetailsOnCollateralAccounts() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				actionMenuOnCollateralAccounts);
		js.executeScript("arguments[0].click();", detailsLnk);
		Util.waitForAJAX(driver);
	}

	public void clickAddOnCollateralAccounts() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addBtnOncollateralAccounts);
		Util.waitForLoaderToFinish(driver);
	}

	public void saveUCC(String option) {
		lastSrchDateOnUCC.clear();
		lastSrchDateOnUCC.sendKeys(Util.getCurrentDate());
		fillingDate.clear();
		fillingDate.sendKeys("2015-09-30");
		fillingNumber.clear();
		fillingNumber.sendKeys("123456789");
		Util.waitForElementPresent(driver, By.xpath(facName), 10);
		option = "Fac for intex";
//		if (driver.findElement(By.xpath(facName)).isDisplayed()) {
//			Util.selectItemFromList(driver, facName, option);
//		} else
		Util.selectItemFromList(driver, facilityName, option);

		comments.clear();
		comments.sendKeys("NA");
		saveUCC.click();
		Util.waitForAJAX(driver);
	}

	public void updateUCC(String option) {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editBtnOnUCC);
		Util.waitForAJAX(driver);
		lastSrchDateOnUCC.clear();
		lastSrchDateOnUCC.sendKeys(Util.getCurrentDate());
		fillingDate.clear();
		fillingDate.sendKeys("2015-09-10");
		fillingNumber.clear();
		fillingNumber.sendKeys("987654321");
		comments.clear();
		comments.sendKeys("NA");
		saveUCC.click();
		Util.waitForAJAX(driver);
	}

	public void editOnBasicCollateralInformation() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, editOnBasicCollateral, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editOnBasicCollateral);
		Util.waitForLoaderToFinish(driver);
	}

	public boolean verifyActionMenuOnUCC() {
		Util.waitForAJAX(driver);
		if (actionMenuOnUCC.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean verifyMandatoryDetailsOnUCC() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", lastSrchDateOnUCC);
		lastSrchDateOnUCC.sendKeys(Util.getCurrentDate());
		saveUCC.click();
		if (errMsgOnUCC.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickDeleteOnUCC() {
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='data_content']/div/div/table/tbody/tr/td[5]/a"),
				15);
		actions.moveToElement(actionMenuOnUCC).click().perform();
		Util.waitForElement(driver, deleteLnk, 15);
		deleteLnk.click();
		Util.waitForAJAX(driver);
	}

	public void clickCancelBtnOnUCC() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancelUCC);
		Util.waitForAJAX(driver);
	}

	public void cancelUCC(String option) {
		lastSrchDateOnUCC.clear();
		lastSrchDateOnUCC.sendKeys(Util.getCurrentDate());
		fillingDate.clear();
		fillingDate.sendKeys("2015-09-30");
		fillingNumber.clear();
		fillingNumber.sendKeys("123456789");
		option = "Fac for intex";
		Util.selectItemFromList(driver, facilityName, option);
		comments.clear();
		comments.sendKeys("NA");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancelUCC);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickBackButtonToNavigateToCollateralPool() {
		Util.waitForElement(driver, backBtn, 10);
		backBtn.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickOnProceedBtn() {
		Util.waitForElement(driver, proceedBtn, 10);
		proceedBtn.click();
		Util.waitForAJAX(driver);
	}

	public void clickOnShares() {
		Util.waitForElement(driver, sharesLink, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", sharesLink);

		Util.waitForAJAX(driver);
	}

	public void clickOnEDitBtnOfShares() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('stockDiv').focus();");
		js.executeScript("arguments[0].click();", editBtnOnShares);
		Util.waitForAJAX(driver);
	}

	public void selectShareTypeAsMutualFunds(String option) {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'typeId')]"), 10);
		option = "Certificated Stocks or Mutual Funds";
		Util.selectItemFromList(driver, shareType, option);
		Util.waitForAJAX(driver);
	}

	public void selectShareTypeAsCertificatedBonds(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'typeId')]"), 10);
		option = "Certificated Bonds";
		Util.selectItemFromList(driver, shareType, option);
		Util.waitForAJAX(driver);
	}

	public void selectShareTypeAsUncertificatedSecurities(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'typeId')]"), 10);
		option = "Uncertificated Securities Account or Mutual Fund";
		Util.selectItemFromList(driver, shareType, option);
		Util.waitForAJAX(driver);
	}

	public void enterAccountPledged(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath("//input[contains(@customname,'entireAccPledgedId')]"),
				10);
		option = "Yes";
		Util.selectItemFromList(driver, entireAccountPledged, option);
		Util.waitForAJAX(driver);
	}

	public void clickOnSaveBtnOfShares() {
		Util.waitForElement(driver, saveSharesDetails, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveSharesDetails);
		Util.waitForAJAX(driver);
	}

	public boolean verifyShareTypeAsMutualFunds() {
		String str = driver
				.findElement(
						By.xpath(".//*[@id='UPSERTSTOCKMUTUALFUNDFORM']/div[1]/div[2]/div[1]/span/input"))
				.getText().trim();
		if (str.equalsIgnoreCase("Certificated Stocks or Mutual Funds")) {
			return true;
		} else
			return false;
	}

	public boolean verifyCertificatedBonds() {
		String str = driver
				.findElement(
						By.xpath(".//*[@id='UPSERTSTOCKMUTUALFUNDFORM']/div[1]/div[2]/div[1]/span/input"))
				.getText().trim();
		if (str.equalsIgnoreCase("Certificated Bonds")) {
			return true;
		} else
			return false;
	}

	public boolean verifyUncertificatedSecurities() {
		String str = driver
				.findElement(
						By.xpath(".//*[@id='UPSERTSTOCKMUTUALFUNDFORM']/div[1]/div[2]/div[1]/span/input"))
				.getText().trim();
		if (str.equalsIgnoreCase("Uncertificated Securities Account or Mutual Fund")) {
			return true;
		} else
			return false;
	}

	public boolean verifyMandatoryDetailsOnShares() {
		saveSharesDetails.click();
		if (errMsgOnShares.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void enterMarginRate() {
		Util.waitForElement(driver, marginRate, 10);
		marginRate.clear();
		marginRate.sendKeys("10");
	}

	public void enterNoOfCertificate() {
		Util.waitForElement(driver, noOfCertificate, 10);
		noOfCertificate.clear();
		noOfCertificate.sendKeys("5");
	}

	public void enterCertificateNumber() {
		certificateNumber.clear();
		certificateNumber.sendKeys("20");
	}

	public void clickCancelOnShares() {
		Util.waitForElement(driver, cancelOnShares, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancelOnShares);
		Util.waitForAJAX(driver);
	}

	public void enterIssuer() {
		Util.waitForElement(driver, issuer, 10);
		issuer.clear();
		issuer.sendKeys("Cybage");
	}

	public void enterBondSerialNo() {
		bondSerialNo.clear();
		bondSerialNo.sendKeys("123456789");
	}

	public void enterAccountType() {
		Util.waitForElement(driver, accountType, 10);
		accountType.clear();
		accountType.sendKeys("Fixed");
	}

	public void enterAccountNumber() {
		accountNumber.clear();
		accountNumber.sendKeys("56789");
	}

	public void enterAllowedTradeDesc() {
		Util.waitForElement(driver, allowedDesc, 10);
		allowedDesc.clear();
		allowedDesc.sendKeys("Allowed Trades Description");
	}

	public void selectCollateralTypeAsRealState(String option) {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "RealState";
		Util.selectItemFromList(driver, collType, option);
		Util.waitForAJAX(driver);
	}

	public void EntervaluesInTaxInformation() {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver, taxServiceCompany, 10);
		taxServiceCompany.clear();
		taxServiceCompany.sendKeys("Dell");
		Util.waitForElement(driver, taxServiceContract, 10);
		taxServiceContract.clear();
		taxServiceContract.sendKeys("12345");
		Util.waitForElement(driver, saveTaxInfo, 10);
		saveTaxInfo.click();
		Util.waitForAJAX(driver);
	}

	public void ClickonCancelbuttonTax() {
		Util.waitForAJAX(driver);
	}

	public void ClickonAddTax() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addTax, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addTax);
		Util.waitForAJAX(driver);
	}

	public int getCountOfErrorMsgs() {
		return errorMsg.size();
	}

	public void SaveTaxApnDetails() {
		Util.waitForElement(driver, savetaxapndetails, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savetaxapndetails);
		Util.waitForLoaderToFinish(driver);
	}

	public void EnterDetailsTaxApnInformation() {
		Util.waitForElement(driver, apn, 10);
		apn.clear();
		apn.sendKeys("9578");

		Util.waitForElement(driver, annualTaxes, 10);
		annualTaxes.clear();
		annualTaxes.sendKeys("75");

		Util.waitForElement(driver, taxAssessedValue, 10);
		taxAssessedValue.clear();
		taxAssessedValue.sendKeys("50000");

		taxDueDate.clear();
		taxDueDate.sendKeys(Util.getCurrentDate());

		Util.waitForElement(driver, commentsTax, 10);
		commentsTax.clear();
		commentsTax.sendKeys("Test");

	}

	public void enterDaysUntilNextReview() {
		daysUntilReview.clear();
		daysUntilReview.sendKeys("10");
	}

	public void propertyTaxesCurrent(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath("//input[contains(@customname,'propertyTaxesCurrent')]"),
				10);
		option = "Yes";
		Util.selectItemFromList(driver, propertyTaxesCurrent, option);
		Util.waitForAJAX(driver);

	}

	public void ClickOnAddTaxPayment() {
		Util.waitForElement(driver, addTaxPayment, 10);
		addTaxPayment.click();
	}

	public void TaxPaymentInformation() {
		Util.waitForElement(driver, taxPaymentAmount, 10);
		taxPaymentAmount.sendKeys("5000");

	}

	public void clickOnSaveCollateralforRealState() {
		saveCollateralDetails.click();
		Util.waitForLoaderToFinish(driver);
	}

	public boolean ApnTaxGrid(String value) {
		Util.waitForElementPresent(driver, By.xpath(TaxGrid), 30);
		GridElements = driver.findElements(By.xpath(TaxGrid));

		for (int i = 1; i <= GridElements.size(); i++) {
			element = driver.findElement(By
					.xpath(TaxGrid + "[" + i + "]/td[2]"));
			if (element.getText().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

	public void EditLinkButton() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionMenuTax, 10);
		actions.moveToElement(actionMenuTax).click().build().perform();
		Util.waitForElement(driver, EditLink, 10);
		EditLink.click();
		Util.waitForAJAX(driver);
	}

	public void DeleteLinkButton() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, actionMenuTax, 10);
		actions.moveToElement(actionMenuTax).click().perform();
		Util.waitForElement(driver, DeleteLnk, 10);
		DeleteLnk.click();
		Util.waitForAJAX(driver);
	}

	public void UpdateTaxInfo() {
		Util.waitForElement(driver, apn, 10);
		apn.clear();
		apn.sendKeys("Test123");
	}

	public void CancelTaxInfoButton() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, cancelApnTaxPayment, 10);
		cancelApnTaxPayment.click();
		Util.waitForAJAX(driver);
	}

	public Boolean IsElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void enterYearBuilt() {
		Util.waitForElement(driver, yearBuilt, 10);
		yearBuilt.clear();
		yearBuilt.sendKeys("2015");
	}

	public void checkForProceedBtn() {
		Util.scrollUp(driver);
		saveCollateralDetails.click();
		Util.waitForLoaderToFinish(driver);
		if (proceedBtn.isDisplayed()) {
			proceedBtn.click();
			Util.waitForAJAX(driver);
		} else
			Util.waitForAJAX(driver);

	}

}
