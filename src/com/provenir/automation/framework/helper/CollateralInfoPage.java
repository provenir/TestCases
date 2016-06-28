package com.provenir.automation.framework.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class CollateralInfoPage {

	WebDriver driver;

	public CollateralInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//ul[@id='breadCrumbMainNav_new']/li[@id='collateralInfo']")
	private WebElement collateralPageTitle;

	@FindBy(how = How.XPATH, using = "//div[@id='collateralList']/div[@class='main_content_div']/div[2]/div[1]/a[@name='addCollPool']")
	private WebElement addNewButton;

	@FindBy(how = How.CSS, using = "input[id='collAccName']")
	private WebElement collateralAccountName;

	@FindBy(how = How.ID, using = "advncRate")
	private WebElement advanceRate;

	@FindBy(how = How.ID, using = "discRate")
	private WebElement discountRate;

	@FindBy(how = How.ID, using = "perUtilized")
	private WebElement perUtilized;

	@FindBy(how = How.NAME, using = "suggestText")
	private WebElement whereUtilized;

	private String whereUtilizedList = ".//div[@class='suggestMenu']/div[@class='actionList']/ul";

	@FindBy(how = How.NAME, using = "activeChkbx")
	private WebElement activeCheckBox;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLTERALPOOLFORM']/div[contains(@class,'button')]/a[@id='saveCollPoolDetails']")
	private WebElement saveButton;

	@FindBy(how = How.XPATH, using = "//div[@id='collateralList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='nextBtn']")
	private WebElement nextButton;

	@FindBy(how = How.XPATH, using = ".//div[@id='collateralDetails']/div[@class='sub_title']")
	private WebElement collAccSummaryTitle;

	@FindBy(how = How.XPATH, using = "//div[@id='collateralList']/div[@class='main_content_div']/div[2]/div[1]/a[@id='searchBtn']")
	private WebElement searchButton;

	@FindBy(how = How.ID, using = "dragbar")
	private WebElement searchPopupText;

	@FindBy(how = How.XPATH, using = ".//a[@class='popup_cancel_icon']")
	private WebElement closeSearchPopup;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLTERALPOOLFORM']/div[contains(@class,'button')]/a[1]")
	private WebElement cancelButton;

	@FindBy(how = How.XPATH, using = ".//*[@class='GridContent ProvGrid']/table[@class='scroll tableGrid']/tbody/tr/td[1]")
	private WebElement collAccNameFromGrid;

	@FindBy(how = How.XPATH, using = ".//form[@name='UPSERTCOLLTERALPOOLFORM']/div[contains(@class,'button')]/a")
	private WebElement editButton;

	@FindBy(how = How.XPATH, using = "//*[@id='poolCollReq']")
	private WebElement poolCollPercentReq;

	@FindBy(how = How.XPATH, using = "//div[@id='collateralList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='backBtn']")
	private WebElement backBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='UPSERTCOLLTERALPOOLFORM']/div[1]/div[4]/div[1]/span/input")
	private WebElement collateralType;

	@FindBy(how = How.XPATH, using = ".//*[@id='collSubType']/option[2]")
	private WebElement collateralSubType;

	@FindBy(how = How.XPATH, using = ".//*[@id='addr1']")
	private WebElement number;

	@FindBy(how = How.XPATH, using = ".//*[@id='city']")
	private WebElement city;

	@FindBy(how = How.XPATH, using = ".//*[@id='country']")
	private WebElement country;

	@FindBy(how = How.XPATH, using = ".//*[@id='newlyBlt']")
	private WebElement newlyBuilt;

	@FindBy(how = How.XPATH, using = "//*[@id='dragbar']/h2")
	private WebElement searchCollateralPopUpTitle;

	@FindBy(how = How.XPATH, using = "//*[@name='addColList']/b")
	private WebElement addToCustListBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='collateralList']/div/h2")
	private WebElement collPoolSummaryHeader;

	@FindBy(how = How.ID, using = "ownerName")
	private WebElement customerName;

	@FindBy(how = How.ID, using = "ownSearch")
	private WebElement searchIcon;

	@FindBy(how = How.CSS, using = "a[name=loas]")
	private WebElement loadBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='collOwnerDetails']/div/table/tbody/tr[1]/td[5]/input")
	private WebElement ownerPercentage;

	@FindBy(how = How.XPATH, using = ".//*[@id='searchData']/form/div/table/tbody/tr/td[1]/input")
	private WebElement coll;

	@FindBy(how = How.XPATH, using = "//*[@id='propertySection']/div[3]/div[1]/div[1]/input[1]")
	private WebElement ownerOccAsYes;

	@FindBy(how = How.XPATH, using = ".//*[@id='ownOccPercent']")
	private WebElement ownerOccOfRent;

	@FindBy(how = How.XPATH, using = ".//*[@id='noTotUnits']")
	private WebElement noOfUnits;

	@FindBy(how = How.XPATH, using = ".//*[@id='noTotBuildings']")
	private WebElement noOfBuildings;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCOLLTERALPOOLFORM']/div[1]/div[2]/div[2]/input")
	private WebElement activeChkBox;

	@FindBy(how = How.XPATH, using = ".//*[@id='f7ceb66d0e2b40c5ae8c296b9a13c9a9']/table/tbody/tr[3]/td[1]/input")
	private WebElement CollateralSelection;

	@FindBy(how = How.ID, using = "addButton")
	private WebElement addButton;

	WebElement element = null;
	private String currency = "currCd";
	private String collateralTypeField = "collType";
	private String lstOfSearchCollateralPopUp = "//*[@id ='FRMADDCALL']/div/table/tbody/tr";
	private String lstOfCollAccounts = "//*[@class='scroll tableGrid']/tbody/tr";
	private int cntOfAddedCollAccount = 0;
	private String lstOfCustSearch = "//*[@id='customerData']/div[1]/table/tbody/tr";
	private String businessLine = "bussLineId";
	private String market = "marketId";
	private String collSubType = "collSubType";

	public int getCntOfAddedCollAccount() {
		return cntOfAddedCollAccount;
	}

	public void selectcollateralType(String collateralTypeValue) {
		collateralType.clear();
		collateralType.sendKeys(collateralTypeValue);
		Util.waitForElementPresent(driver, By.xpath(".//ul[@customid='"
				+ collateralTypeField + "']/li[1]"), 5);

		driver.findElement(
				By.xpath(".//ul[@customid='" + collateralTypeField + "']/li[1]"))
				.click();
		Util.waitForElement(driver, collateralSubType, 10);
	}

	public void selectSubCollateralType(String collateralSubTypeValue) {
		collateralSubType.click();
		Util.waitForElement(driver, city, 10);
	}

	public void selectCountry(String option) {
		Util.selectItemFromList(driver, country, option);
	}

	public void selectNewlyBuilt(String option) {
		Util.selectItemFromList(driver, newlyBuilt, option);
	}

	/*
	 * public void selectSubCollateralType(String collateralSubTypeValue) {
	 * Util.selectItemFromList(collateralSubType, collateralSubTypeValue); }
	 */

	public CollateralInfoPage clickAddNewButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addNewButton);

		Util.waitForAJAX(driver);
		return this;
	}

	public void enterCollateralAccountName(String Collateral_Ac_Name) {
		collateralAccountName.sendKeys(Collateral_Ac_Name);
	}

	public void enterCity(String City) {
		city.sendKeys(City);
	}

	public void enterNumber(String Number) {
		number.sendKeys(Number);
	}

	public void enterAdvanceRate(String Adv_Rate) {
		advanceRate.clear();
		advanceRate.sendKeys(Adv_Rate);
	}

	public void enterDiscountRate(String Disc_Rate) {
		discountRate.clear();
		discountRate.sendKeys(Disc_Rate);
	}

	public void enterPercentUtilized(String Per_Utilized) {
		perUtilized.clear();
		perUtilized.sendKeys(Per_Utilized);
	}

	public void enterWhereUtilized(String Where_Utilized) {
		whereUtilized.clear();
		whereUtilized.sendKeys(Where_Utilized);
		Util.waitForAJAX(driver);
	}

	public boolean verifyWhereUtilizedList(String Where_Utilized) {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver,
				driver.findElement(By.xpath(whereUtilizedList)), 5);
		List<WebElement> elements = driver.findElements(By
				.xpath(whereUtilizedList));
		Util.waitForAJAX(driver);
		for (WebElement strUtilized : elements) {
			if (strUtilized.getText().toLowerCase()
					.contains(Where_Utilized.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public void checkBoxUncheck() {
		activeCheckBox.click();
	}

	public void enterCurrency(String currencyValue) {
		Util.enableAllDropdowns(driver);
		Util.selectItemFromList(driver, currency, currencyValue);
	}

	public void selectPrimaryOwner() {
		element = driver.findElement(By.id("selectPrimaryOwner"));
		element.click();
	}

	public CollateralInfoPage clickOnSaveButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveButton);
		Util.waitForAJAX(driver);
		return this;
	}

	public String getCollAccNameFromGrid() {
		Util.waitForAJAX(driver);
		return collAccNameFromGrid.getText();
	}

	public void clickEditButton() {
		Util.waitForAJAX(driver);
		editButton.click();
		Util.waitForAJAX(driver);
	}

	public TransactionInfoPage clickOnNextButton() {
		Util.waitForElement(driver, nextButton, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextButton);

		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new TransactionInfoPage(driver);
	}

	public String getSearchCollateralPopUptitle() {
		Util.waitForAJAX(driver);
		return searchCollateralPopUpTitle.getText();
	}

	public String getCollateralPageTitle() {
		Util.waitForAJAX(driver);
		return collateralPageTitle.getText();
	}

	public String getCollAccSummaryTitle() {
		return collAccSummaryTitle.getText();
	}

	public boolean getPoolCollPercReqAfterCancel() {
		Util.waitForAJAX(driver);

		if (poolCollPercentReq.getTagName().equals("label")) {
			return true;
		}
		return false;
	}

	public boolean getPoolCollPercReqAfterEdit() {
		if (poolCollPercentReq.getTagName().equals("input")) {
			return true;
		}
		return false;
	}

	public void enterPoolCollPercReq(String percentage) {
		poolCollPercentReq.clear();
		poolCollPercentReq.sendKeys(percentage);
	}

	public String getPoolCollPercReqValue() {
		Util.waitForAJAX(driver);
		return poolCollPercentReq.getText();
	}

	public void clickSearchButton() {
		searchButton.click();
		// return this;
	}

	public String getSearchPopupText() {
		Util.waitForAJAX(driver);
		return searchPopupText.getText();
	}

	public void clickCloseBtnSearchPopup() {
		closeSearchPopup.click();
		// return this;
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

	public CustomerInfoPage clickBackButton() {
		backBtn.click();
		Util.waitForAJAX(driver);
		return new CustomerInfoPage(driver);
	}

	public void selectCollateralsFromSearchPopUp(String collName) {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, searchCollateralPopUpTitle, 60);
		List<WebElement> elements = driver.findElements(By
				.xpath(lstOfSearchCollateralPopUp));
		for (int i = 1; i <= elements.size(); i++) {
			element = driver.findElement(By.xpath(lstOfSearchCollateralPopUp
					+ "[" + i + "]/td[2]"));
			if (element.getText().toLowerCase()
					.contains(collName.toLowerCase())) {

				WebElement checkBox = driver.findElement(By
						.xpath(lstOfSearchCollateralPopUp + "[" + i
								+ "]/td[1]/input"));
				checkBox.click();
				cntOfAddedCollAccount++;
			}
		}
	}

	public void clickPopulatedCollateral() {
		Util.waitForElement(driver, coll, 30);
		coll.click();
		Util.waitForAJAX(driver);
	}

	public void clickAddToCustListBtn() {
		addToCustListBtn.click();
		Util.waitForAJAX(driver);
	}

	public String getCollPoolSummaryHeadingText() {
		return collPoolSummaryHeader.getText();
	}

	public int getCountOfAddedCollateralAccounts() {

		List<WebElement> lstOfRows = driver.findElements(By
				.xpath(lstOfCollAccounts));
		return lstOfRows.size();
	}

	public void enterCustName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", customerName);
		js.executeScript("arguments[0].value='Dell Corporation';", customerName);
	}

	public void clickSearchIcon() {
		Util.waitForAJAX(driver);
		searchIcon.click();
		Util.waitForAJAX(driver);
	}

	public void selectCustomerFromList() {
		element = driver.findElement(By.xpath(lstOfCustSearch + "[" + 1
				+ "]/td[1]/label/input[1]"));
		element.click();
		Util.waitForAJAX(driver);
	}

	public void clickLoadBtn() {
		loadBtn.click();
		Util.waitForAJAX(driver);
	}

	public void enterOwnerPercentage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", ownerPercentage);
		js.executeScript("arguments[0].value='100';", ownerPercentage);
	}

	public void selectBusinessLine(String value) {
		Util.selectItemFromList(driver, businessLine, value);
		Util.waitForAJAX(driver);
	}

	public void selectMarket(String value) {
		Util.selectItemFromList(driver, market, value);
		Util.waitForAJAX(driver);
	}

	public void checkOwnerOccupancy() {
		Util.waitForElement(driver, ownerOccAsYes, 20);
		ownerOccAsYes.click();
		Util.waitForAJAX(driver);
	}

	public void enterOwnerOccupancyPercentage(String value) {
		Util.waitForElement(driver, ownerOccOfRent, 20);
		ownerOccOfRent.sendKeys(value);
	}

	public void enterTotalUnits(String value) {
		Util.waitForElement(driver, noOfUnits, 20);
		noOfUnits.sendKeys(value);
	}

	public void enterTotalBuildings(String value) {
		Util.waitForElement(driver, noOfBuildings, 20);
		noOfBuildings.sendKeys(value);
	}

	public void clickActiveCheckbox() {
		Util.waitForElement(driver, activeChkBox, 20);
		activeChkBox.click();
		Util.waitForAJAX(driver);
	}

	public void CollateralSelectionFromPopup() {
		Util.waitForElement(driver, CollateralSelection, 20);
		CollateralSelection.click();
		Util.waitForAJAX(driver);
	}

	public void AddButton() {
		Util.waitForElement(driver, addButton, 20);
		addButton.click();
		Util.waitForAJAX(driver);
	}

	public void selectCollType() throws InterruptedException {
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(collateralTypeField), 10);
		driver.findElement(
				By.xpath("//*[@id='UPSERTCOLLTERALPOOLFORM']/div[1]/div[2]/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='UPSERTCOLLTERALPOOLFORM']/div[1]/div[2]/div[1]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='UPSERTCOLLTERALPOOLFORM']/div[1]/div[2]/div[1]/span/input"))
				.sendKeys("Shares");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(.,'Shares')]")).click();
	}

	public void selectCollSubType() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(collSubType), 10);
		driver.findElement(By.xpath("//*[@id='collSubTyp']/span/input"))
				.click();
		driver.findElement(By.xpath("//*[@id='collSubTyp']/span/input"))
				.clear();
		driver.findElement(By.xpath("//*[@id='collSubTyp']/span/input"))
				.sendKeys("Corporate Bonds");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(.,'Corporate')]"))
				.click();
	}

}
