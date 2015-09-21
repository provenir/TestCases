package com.provenir.automation.framework.helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.provenir.automation.framework.utility.Util;

public class Collateral360Helper {

	WebDriver driver;

	public Collateral360Helper(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	@FindBy(how = How.ID, using = "selectPrimaryOwner")
	private WebElement collateralPrimaryOwner;

	@FindBy(how = How.ID, using = "savecolldetails")
	private WebElement saveCollateralDetails;

	@FindBy(how = How.ID, using = "useCurrentCust")
	private WebElement useCurrentCustomer;

	@FindBy(how = How.XPATH, using = ".//*[@id='partySrchRes']//span[contains(.,'Load')]")
	private WebElement loadCollateralOwner;
	
	private String country = ".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/span/input";
	
	@FindBy(how = How.ID, using = "city")
	 private WebElement city;

<<<<<<< HEAD
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

	@FindBy(how = How.ID, using = "stock")
	private WebElement shares;

	@FindBy(how = How.ID, using = "ucc")
	private WebElement ucc;

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

	@FindBy(how = How.ID, using = "addNewTitledMotor")
	private WebElement addBtnOnTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLUCCFORM']/div[4]/a")
	private WebElement editBtnOnUCC;

	@FindBy(how = How.ID, using = "addNewUccLock")
	private WebElement addBtnOnUCC;

	@FindBy(how = How.ID, using = "")
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

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[1]/input")
	private WebElement typeOfVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[2]/input")
	private WebElement vehicleYear;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[3]/input")
	private WebElement make;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[4]/input")
	private WebElement model;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[5]/input")
	private WebElement vin;

	@FindBy(how = How.XPATH, using = ".//*[@id='titledMotorGrid']/div/table/tbody/tr/td[6]/a")
	private WebElement actionMenuOnTitledMotorVehicle;

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement deleteLnk;

	@FindBy(how = How.ID, using = "saveTitledMotorDetails")
	private WebElement saveTitledMotorVehicle;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTTITLEDMOTORFORM']/div/div[3]/div/a[1]")
	private WebElement cancelTitledMotorVehicle;

	@FindBy(how = How.ID, using = "errorMsgForTitledMotor")
	private WebElement errMsgOnTitledVehicle;

	@FindBy(how = How.ID, using = "cReq")
	private WebElement creditReq;

	private String collType = "collType";
	private String collSubType = "collSubType";
	private String movable = ".//*[@id='collaterTypePage']/div[1]/div[2]/div[1]/span/input";
	private String country = ".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/span/input";
=======
	private String collType = "collType";
	private String collSubType = "collSubType";
>>>>>>> f3d93f2d33644c08c724cd42938163248aae61b8

	public void selectCollType(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Deposits";
		Util.selectItemFromList(driver,collType, option);
		Util.waitForAJAX(driver);
	}

	public void selectCollSubType(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collSubType')]"), 10);
		option = "Deposit Account, External";
		Util.selectItemFromList(driver,collSubType, option);
		Util.waitForAJAX(driver);
	}

	public void clickCollateralLink() throws InterruptedException {
		Util.waitForLoaderToFinish(driver);
//		Thread.sleep(4000);
//		Util.waitForElement(collateralLink, 20);
		collateralLink.click();
		Util.scrollDown(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public void clickOnAddCollateralLink() {
		collateralLink.click();
		Util.waitForElement(driver,addBtnOnCollateral, 20);
		addBtnOnCollateral.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public void verifyCollateralTitle() throws InterruptedException {
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
//		Thread.sleep(3000);
		Util.waitForElement(driver,collateralTitle, 20);
		String title = collateralTitle.getText().trim();
		Assert.assertEquals("Basic Collateral Information", title);
		
//		Boolean isFound = IsElementPresent(driver, By.xpath(".//*[@id='c360r']"));
////		Assert.assertEquals("Basic Collateral Information", title);
//		Assert.assertTrue(isFound);
	
	}

	public void enterCollateralName() {
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver,collateralName, 20);
		collateralName.sendKeys("Test collateral");
	}

	public void enterCollateralCode() {
		Util.waitForElement(driver,collateralCode, 10);
		collateralCode.sendKeys("coll1");
	}

	public void enterCollateralOwnerName() {
		Util.waitForLoaderToFinish(driver);
		collateralOwnerName.sendKeys("intex");
		Util.scrollUp(driver);
		clickSearchedCollateralOwner.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForElement(driver,loadCollateralOwner, 10);
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
		saveCollateralDetails.click();
		Util.waitForLoaderToFinish(driver);
		if (useCurrentCustomer.isDisplayed()) {
			useCurrentCustomer.click();
			Util.waitForLoaderToFinish(driver);
		}
		Util.waitForAJAX(driver);
	}
<<<<<<< HEAD

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

	public void enterMovable(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='collaterTypePage']/div[1]/div[2]/div[1]/span/input"),
				10);
		option = "N/A";
		// Util.selectOptionFromDropDown(driver, movable, option);
		Util.selectItemFromList(driver, movable, option);
	}

	public void enterCountry(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/span/input"),
				10);
		option = "United States";
		// Util.selectOptionFromDropDown(driver, country, option);
		Util.selectItemFromList(driver, country, option);
	}

	public void enterCity() {
		Util.waitForAJAX(driver);
		city.sendKeys("Parsipanny");
	}

	public void enterStreet() {
		street.sendKeys("address 2");
	}

	public void enterNumber() {
		number.sendKeys("address 1");
	}

	public void enterZipCode() {
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
		Util.waitForElement(driver, backBtn, 10);
		backBtn.click();
		Util.waitForLoaderToFinish(driver);
		return new Customer360Helper(driver);
	}

	public void selectCollateralTypeAsShares(String option) {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForElementPresent(driver,
				By.xpath("//input[contains(@customname,'collType')]"), 10);
		option = "Shares/Stocks/Bonds/Mutual Funds";
		Util.selectItemFromList(driver, collType, option);
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
		Util.waitForLoaderToFinish(driver);
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
		Util.waitForLoaderToFinish(driver);
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
		String s12 = building.getText().trim();
		String s13 = propDetails.getText().trim();
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
				&& s12.equalsIgnoreCase("Building")
				&& s13.equalsIgnoreCase("Property Details")
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

	public void clickOnAddBtn() {
		Util.waitForAJAX(driver);
		collateralLink.click();
		Util.waitForElementPresent(driver,
				By.xpath(".//*[@id='clientCollateral']/div/a"), 20);
		addBtnOnCollateral.click();
	}

	public void clickOnTitledMotorVehicleSection() {
		Util.waitForElement(driver, titledMotorVehicle, 20);
		titledMotorVehicle.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickEditOnTitledMotorVehicle() {
		Util.waitForElement(driver, editBtnOnTitledMotorVehicle, 10);
		editBtnOnTitledMotorVehicle.click();
	}

	public void addOnTitledMotorVehicle() {
		Util.waitForElement(driver, addBtnOnTitledMotorVehicle, 10);
		addBtnOnTitledMotorVehicle.click();
	}

	public void saveTitledMotorVehicleDetails() {
		typeOfVehicle.sendKeys("Truck");
		vehicleYear.sendKeys("2010");
		make.sendKeys("2008");
		model.sendKeys("NJ1234");
		vin.sendKeys("12345");
		saveTitledMotorVehicle.click();
		Util.waitForAJAX(driver);
	}

	public void cancelTitledMotorVehicle() {
		typeOfVehicle.sendKeys("Truck");
		vehicleYear.sendKeys("2010");
		make.sendKeys("2008");
		model.sendKeys("NJ1234");
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
		actions.moveToElement(actionMenuOnTitledMotorVehicle).click().perform();
		Util.waitForElement(driver, deleteLnk, 15);
		deleteLnk.click();
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
		Util.waitForElement(driver, ucc, 10);
		ucc.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickEditOnUCC() {
		
	}

	public void clickCreditRequest() {
		Util.waitForElement(driver, creditReq, 10);
		creditReq.click();
	}

=======
	
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
	
	public Boolean IsElementPresent(WebDriver driver, By by) {
        try
        {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e) { return false; 
        }
	}

	public void enterCountry(String option) {
		  Util.enableAllDropdowns(driver);
		  Util.waitForLoaderToFinish(driver);
		  Util.waitForElementPresent(
		    driver,
		    By.xpath(".//*[@id='collaterTypePage']/div[1]/div[2]/div[2]/span/input"),
		    10);
		  option = "United States";
		  Util.selectOptionFromDropDown(driver, country, option);
		  // Util.selectItemFromList(driver, country, option);
		 }

		 public void enterCity() {
		  Util.waitForAJAX(driver);
		  city.sendKeys("Parsipanny");
		 }

		 public void enterStreet() {
		  street.sendKeys("address 2");
		 }

		 public void enterNumber() {
		  number.sendKeys("address 1");
		 }

		 public void enterZipCode() {
		  zipcode.sendKeys("07054");
		 }	


		 public void selectCollateralSubTypeAsTitledMotorVehicles(String option) {
			  Util.enableAllDropdowns(driver);
			  Util.waitForLoaderToFinish(driver);
			  Util.waitForElementPresent(driver,
			    By.xpath("//input[contains(@customname,'collSubType')]"), 10);
			  option = "Retail Office";
			  Util.selectItemFromList(driver, collSubType, option);
			  Util.waitForAJAX(driver);
			 }
}
