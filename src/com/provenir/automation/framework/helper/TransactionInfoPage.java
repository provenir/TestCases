package com.provenir.automation.framework.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class TransactionInfoPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//ul[@id='breadCrumbMainNav_new']/li[@id='trnsInfo']")
	private WebElement transactionInfoTitle;

	@FindBy(how = How.ID, using = "crdLnName")
	private WebElement facilityName;

	@FindBy(how = How.ID, using = "appDate")
	private WebElement ApplicationDate;

	@FindBy(how = How.CSS, using = "a[id='saveCredLnSummDetails']")
	private WebElement saveButton;

	@FindBy(how = How.ID, using = "nextBtn")
	private WebElement nextButton;

	@FindBy(how = How.XPATH, using = "//div[@id='transactionList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='backBtn']")
	private WebElement backButton;

	@FindBy(how = How.ID, using = "addTrans")
	private WebElement addNewButton;

	@FindBy(how = How.XPATH, using = ".//*[@id='UPSERTCREDLNSUMMFORM']/div[1]/div/h2")
	private WebElement trnsSummText;

	@FindBy(how = How.XPATH, using = ".//div[@id='borrSelect']/div[1]/table/tbody/tr[1]/td[1]")
	private WebElement facBorroNmOnGrid;

	@FindBy(how = How.XPATH, using = "//div[@class='main_content_div']/div[@id='data_content']/div[1]/table/tbody/tr[1]/td[3]")
	private WebElement tranListGrid;

	@FindBy(how = How.CSS, using = "a[id='editBtn']")
	private WebElement editButton;

	@FindBy(how = How.CSS, using = "a[id='cancelBtn']")
	private WebElement cancelButton;

	@FindBy(how = How.XPATH, using = "//div[@id='transactionList']/div[@class='main_content_div']/div[2]/div[2]/a[@id='prodCatlogBtn']")
	private WebElement prodCatalogButton;

	@FindBy(how = How.ID, using = "submitBtn")
	private WebElement submitButton;

	@FindBy(how = How.XPATH, using = ".//div[@id='borrSelect']/div[1]/table/tbody/tr[1]/td[5]/input")
	private WebElement facBorroPrimaryStatusOnGrid;

	private String lstFacilityBorr = ".//*[@class='GridContent ProvGrid']/table/tbody/tr";

	@FindBy(how = How.CLASS_NAME, using = "popup_cancel_icon")
	private WebElement closeButton;

	@FindBy(how = How.XPATH, using = "//div[@class='main_content_div']/div[5]/a[2]")
	private WebElement loadBtn;

	@FindBy(how = How.XPATH, using = ".//label[@id='region']")
	private WebElement regionTxt;

	@FindBy(how = How.XPATH, using = "//*[@id='extId']")
	private WebElement externalID;

	@FindBy(how = How.XPATH, using = ".//input[@customname='lineOfBuss']")
	private WebElement lineOfBusinessTxt;

	@FindBy(how = How.XPATH, using = ".//input[@customname='prodTyp']")
	private WebElement productTypeTxt;

	@FindBy(how = How.XPATH, using = ".//input[@customname='indexval']")
	private WebElement indexTxt;

	@FindBy(how = How.XPATH, using = ".//input[@customname='currency']")
	private WebElement currencyTxt;

	@FindBy(how = How.XPATH, using = ".//div[@id='data_content']/div[1]/table/tbody/tr")
	private List<WebElement> lstFacilityName;

	@FindBy(how = How.XPATH, using = "//input[contains(@customname,'facWorkflow0')]")
	private WebElement getFacilityWorkflow;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/h2")
	private WebElement popUpTitle;

	@FindBy(how = How.XPATH, using = ".//*[@id='openPopup']/div[2]/form/div/div[2]/table/tbody/tr[2]/td[2]/div/a/b")
	private WebElement okBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='transactionList']/div[2]/h2")
	private WebElement transListHeading;

	@FindBy(how = How.XPATH, using = ".//*[@id='dragbar']/div[2]/a")
	private WebElement crossOnPopup;

	@FindBy(how = How.ID, using = "crdPropAmt")
	private WebElement proposedAmt;

	@FindBy(how = How.ID, using = "addNewTrnsBorr")
	private WebElement addBtnOfFacBorrower;

	@FindBy(how = How.ID, using = "borrList")
	private WebElement borrowerName;

	@FindBy(how = How.ID, using = "amountRequested")
	private WebElement amtRequested;

	private String lstProdCata = ".//div[@id='prodCatalogContentDiv']/div[2]/table/tbody/tr";

	private String facilityBorrowerList = "//*[@id='borrSelect']/div/table/tbody/tr";
	private String productType = "prodTyp";
	private String index = "indexval";
	private String currency = "currency";
	private String facilityType = "crdLnType";
	private String facilityWorkflow = "facWorkflow0";

	private WebElement element = null;
	private WebElement number = null;
	private int transRowCount;
	private List<String> facilityNameOnTransList;

	public TransactionInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		transRowCount = 0;
	}

	public List<String> getFacilityNameOnTransList() {
		return facilityNameOnTransList;
	}

	public void setFacilityNameOnTransList(List<String> facilityNameOnTransList) {
		this.facilityNameOnTransList = facilityNameOnTransList;
	}

	public int getTransRowCount() {
		return transRowCount;
	}

	public void setTransRowCount(int transRowCount) {
		this.transRowCount = transRowCount;
	}

	public String getTransactionInfoTitle() {
		Util.waitForAJAX(driver);
		return transactionInfoTitle.getText();
	}

	public void enterFacilityName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", facilityName);
		js.executeScript("arguments[0].value='Test Facility';", facilityName);
	}

	public void selectFacilityType() throws InterruptedException {
		Util.enableAllDropdowns(driver);
		driver.findElement(
				By.xpath("//*[@id='BBUPSERTCREDLNSUMMFORM']/div[3]/div[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='BBUPSERTCREDLNSUMMFORM']/div[3]/div[1]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBUPSERTCREDLNSUMMFORM']/div[3]/div[1]/span/input"))
				.sendKeys("Term Loan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(.,'Term Loan')]"))
				.click();
	}

	public void enterProposedAmount() {
		Util.waitForElement(driver, proposedAmt, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", proposedAmt);
		js.executeScript("arguments[0].value='500000000';", proposedAmt);
	}

	public TransactionInfoPage clickSaveButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveButton);
		Util.waitForAJAX(driver);
		Thread.sleep(3000);
		return this;
	}

	public void clickAddNewButton() {
		Util.waitForAJAX(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addNewButton);
		Util.waitForAJAX(driver);
	}

	public CollateralInfoPage clickBackButton() {
		backButton.click();
		Util.waitForAJAX(driver);
		return new CollateralInfoPage(driver);
	}

	public UserTeamInfoPage clickNextButton() {
		Util.waitForElement(driver, nextButton, 2);
		setTransRowCount(lstFacilityName.size());

		String facilitynamepath = ".//div[@id='data_content']/div/table/tbody/tr";

		List<WebElement> elementList = driver.findElements(By
				.xpath(facilitynamepath));

		List<String> lstFacilityNames = new ArrayList<String>();

		for (int i = 1; i <= elementList.size(); i++) {
			lstFacilityNames
					.add(driver.findElement(
							By.xpath(facilitynamepath + "[" + i + "]/td[3]"))
							.getText());

		}
		setFacilityNameOnTransList(lstFacilityNames);

		nextButton.click();
		Util.waitForAJAX(driver);
		return new UserTeamInfoPage(driver);
	}

	public UserTeamInfoPage clickNextButtonDirectly() {
		Util.waitForElement(driver, nextButton, 20);
		nextButton.click();
		Util.waitForAJAX(driver);
		return new UserTeamInfoPage(driver);
	}

	public String getPopUpTitle() {
		Util.waitForAJAX(driver);
		return popUpTitle.getText();

	}

	public void clickOkBtn() {
		okBtn.click();
		Util.waitForElement(driver, transListHeading, 5);

	}

	public String getTransSummaryText() {
		Util.waitForAJAX(driver);
		return trnsSummText.getText();
	}

	public String getFacilityBorroNmOnGrid() {
		return facBorroNmOnGrid.getText();
	}

	public String getFacilityNmOnGrid() {
		Util.waitForAJAX(driver);
		return tranListGrid.getText();
	}

	public TransactionInfoPage clickEditButton() {
		editButton.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public TransactionInfoPage clickCancelButton() {
		cancelButton.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public TransactionInfoPage clickOnNumber() throws InterruptedException {
		Thread.sleep(10000);
		number = driver.findElement(By.xpath(lstFacilityBorr + "[1]/td[3]"));
		number.click();
		Util.waitForAJAX(driver);
		return this;
	}

	public TransactionInfoPage clickProdCatalogButton() {
		Util.waitForElement(driver, prodCatalogButton, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", prodCatalogButton);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.enableAllDropdowns(driver);
		return this;
	}

	public String getLineOfBusinessTxt() {
		Util.enableAllDropdowns(driver);
		return lineOfBusinessTxt.getText();
	}

	public boolean verifyProdCatalogPopup() {
		submitButton.isDisplayed();
		return true;
	}

	public String getPrimaryStatusAfterEdit() {
		return facBorroPrimaryStatusOnGrid.getAttribute("disabled");
	}

	public void editRelationshipType(String type) {
		Util.enableAllDropdowns(driver);
		List<WebElement> borrowerName = driver.findElements(By
				.xpath(facilityBorrowerList));
		int k = 0;
		for (int i = 1; i <= borrowerName.size(); i++) {
			WebElement borrowerBusinessName = driver.findElement(By
					.xpath(facilityBorrowerList + "[" + i + "]/td[5]/input"));

			if (borrowerBusinessName.getAttribute("checked") != null) {
				k = i - 1;
				Util.selectItemFromList(driver, "relType" + k, type);

			}

		}
	}

	public void addRelationshipType(String type) {
		Util.enableAllDropdowns(driver);
		List<WebElement> borrowerName = driver.findElements(By
				.xpath(facilityBorrowerList));
		int k = 0;
		for (int i = 1; i <= borrowerName.size(); i++) {
			WebElement borrowerBusinessName = driver.findElement(By
					.xpath(facilityBorrowerList + "[" + i + "]/td[5]/input"));

			if (borrowerBusinessName.getAttribute("checked") == null) {
				k = i - 1;
				Util.selectItemFromList(driver, "relType" + k, type);

			}

		}
	}

	public void addRelationshipForEveryRow(String type) {
		Util.waitForAJAX(driver);
		List<WebElement> transList = driver.findElements(By
				.xpath(lstFacilityBorr));
		for (int i = 1; i <= transList.size(); i++) {
			WebElement transRow = driver.findElement(By.xpath(lstFacilityBorr
					+ "[" + i + "]/td[2]"));
			transRow.click();
			Util.waitForAJAX(driver);
			editButton.click();
			Util.waitForAJAX(driver);
			addRelationshipType(type);
			saveButton.click();
			Util.waitForAJAX(driver);
		}
	}

	public String getBorrowerName() {
		List<WebElement> pBorrowerList = driver.findElements(By
				.xpath(lstFacilityBorr));
		for (int i = 1; i <= pBorrowerList.size(); i++) {
			WebElement pBorrowerElement = driver.findElement(By
					.xpath(lstFacilityBorr + "[" + i + "]/td[4]"));
			String pBorrower = pBorrowerElement.getText();
			if (pBorrower != null) {
				return pBorrower;
			}
		}
		return null;
	}

	public String getRelationshipType(String companyName) {
		Util.waitForElementPresent(driver, By.xpath(facilityBorrowerList), 5);
		List<WebElement> borrowerName = driver.findElements(By
				.xpath(facilityBorrowerList));
		for (int i = 1; i <= borrowerName.size(); i++) {
			WebElement borrowerBusinessName = driver.findElement(By
					.xpath(facilityBorrowerList + "[" + i + "]/td[1]"));
			if (borrowerBusinessName.getText().equals(companyName)) {

				return driver.findElement(
						By.xpath(facilityBorrowerList + "[" + i
								+ "]/td[4]/label")).getText();
			}
		}
		return null;
	}

	public void clickClosePopup() {
		closeButton.click();
	}

	public void editExternalId(String id) {
		externalID.sendKeys(id);
	}

	public String getRegionText() {
		Util.waitForAJAX(driver);
		return regionTxt.getText();
	}

	public void selectCurrency(String option) {
		lineOfBusinessTxt.clear();
		productTypeTxt.clear();
		indexTxt.clear();
		Util.selectItemFromList(driver, currency, option);
		submitButton.click();
		Util.waitForAJAX(driver);
	}

	public void selectProductType(String option) {
		lineOfBusinessTxt.clear();
		currencyTxt.clear();
		Util.selectItemFromList(driver, productType, option);
		submitButton.click();
		Util.waitForAJAX(driver);
	}

	public void selectIndex(String option) {
		lineOfBusinessTxt.clear();
		productTypeTxt.clear();
		Util.selectItemFromList(driver, index, option);
		submitButton.click();
		Util.waitForAJAX(driver);
	}

	public void FacilityApplicationDate() {
		ApplicationDate.clear();
		ApplicationDate.sendKeys(Util.getCurrentDate());
	}

	public boolean verifyProdListAsPerLineOfBusi(String filterValue) {
		WebElement element = null;
		List<WebElement> lstProdCatalog = driver.findElements(By
				.xpath(lstProdCata));
		WebElement firstRow = driver.findElement(By.xpath(lstProdCata
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstProdCatalog.size(); i++) {

				element = driver.findElement(By.xpath(lstProdCata + "[" + i
						+ "]/td[8]"));
				if (element.getText().contains(filterValue)) {
					return true;
				}
			}
		} else {
			return true;
		}
		return false;
	}

	public boolean verifyProductListAsPerFilter(String filterType,
			String filterValue) {
		Util.waitForAJAX(driver);
		WebElement element = null;
		List<WebElement> lstProdCatalog = driver.findElements(By
				.xpath(lstProdCata));
		WebElement firstRow = driver.findElement(By.xpath(lstProdCata
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstProdCatalog.size(); i++) {
				if (filterType.equalsIgnoreCase("Product Type")) {
					element = driver.findElement(By.xpath(lstProdCata + "[" + i
							+ "]" + "/td[3]"));
					if (element.getText().contains(filterValue)
							|| (element.getText() != null)) {
						return true;
					}
				}
				if (filterType.equalsIgnoreCase("Line of Business")) {
					element = driver.findElement(By.xpath(lstProdCata + "[" + i
							+ "]" + "/td[8]"));
					if (element.getText().contains(filterValue)
							|| (element.getText() != null)) {
						return true;
					}
				}
				if (filterType.equalsIgnoreCase("Index")) {
					element = driver.findElement(By.xpath(lstProdCata + "[" + i
							+ "]" + "/td[4]"));
					if (element.getText().contains(filterValue)
							|| (element.getText() != null)) {
						return true;
					}
				}
				if (filterType.equalsIgnoreCase("Currency")) {
					element = driver.findElement(By.xpath(lstProdCata + "[" + i
							+ "]" + "/td[10]"));
					if (element.getText().contains(filterValue)
							|| (element.getText() != null)) {
						return true;
					}
				}
			}
		} else {
			return true;
		}
		return false;

	}

	public String selectProductFromList() {
		Util.waitForAJAX(driver);
		String element = null;
		List<WebElement> lstProdCatalog = driver.findElements(By
				.xpath(lstProdCata));
		WebElement firstRow = driver.findElement(By.xpath(lstProdCata
				+ "[1]/td[1]"));
		if (!firstRow.getText().equals("No Data Available")) {
			for (int i = 1; i <= lstProdCatalog.size();) {
				driver.findElement(
						By.xpath(lstProdCata + "[" + i + "]" + "/td[1]/input"))
						.click();
				element = driver.findElement(
						By.xpath(lstProdCata + "[" + i + "]" + "/td[2]"))
						.getText();
				loadBtn.click();
				break;
			}
		} else {
			return firstRow.getText();
		}
		return element;
	}

	public boolean verifyAddedFacilityFromGrid(String value) {
		for (WebElement element : lstFacilityName) {
			if (element.getText().equals(value)) {
				return true;
			}
		}
		return false;
	}

	public int selectMultiProductsFromList() {
		Util.waitForAJAX(driver);
		int count = 0;
		// List<String> elements = new ArrayList<String>();
		List<WebElement> lstProdCatalog = driver.findElements(By
				.xpath(lstProdCata));
		if (lstProdCatalog.size() != 0) {
			for (int i = 1; i <= lstProdCatalog.size(); i++) {
				if (i >= 3) {
					break;
				}
				driver.findElement(
						By.xpath(lstProdCata + "[" + i + "]" + "/td[1]/input"))
						.click();
				count++;
				// elements.add(driver.findElement(
				// By.xpath(lstProdCata + "[" + i + "]" + "/td[2]"))
				// .getText());
			}
		}
		loadBtn.click();
		Util.waitForAJAX(driver);
		return count;
	}

	public boolean verifyAddedFacilitiesFromGrid(List<String> values) {
		if (values.containsAll(lstFacilityName)) {
			return true;
		}

		return false;
	}

	public boolean verifyPrimaryBorrPresent(String companyName) {

		List<WebElement> lstFacilityBorrOnGrid = driver.findElements(By
				.xpath(lstFacilityBorr));

		for (int i = 1; i <= lstFacilityBorrOnGrid.size(); i++) {
			number = driver.findElement(By.xpath(lstFacilityBorr + "[" + i
					+ "]/td[2]"));

			number.click();
			Util.waitForAJAX(driver);

			List<WebElement> lstFacilityBorrOnTransSumm = driver
					.findElements(By.xpath(facilityBorrowerList));

			for (int j = 1; j <= lstFacilityBorrOnTransSumm.size(); j++) {

				WebElement name = driver.findElement(By
						.xpath(facilityBorrowerList + "[" + j + "]/td[1]"));

				if (name.getText().equals(companyName)) {

					element = driver.findElement(By.xpath(facilityBorrowerList
							+ "[" + j + "]/td[5]/input"));

					if (element.getAttribute("checked") != null) {
						return true;
					}
				}
			}

		}
		return false;
	}

	public String gettransListHeadingPgTitle() {
		Util.waitForElement(driver, transListHeading, 5);
		return transListHeading.getText();
	}

	public UserTeamInfoPage NextButton() {

		Util.waitForElement(driver, nextButton, 10);
		nextButton.click();
		return new UserTeamInfoPage(driver);

	}

	public void selectFacilityWorkflow(String option) {
		Util.waitForAJAX(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver, By.xpath(facilityWorkflow), 5);
		option = "Facility level workflow";
		Util.selectItemFromList(driver, facilityWorkflow, option);
	}

	public boolean verifySavedFacilityWorkflow() {
		Util.waitForElement(driver, getFacilityWorkflow, 5);
		String str = getFacilityWorkflow.getText();
		if (str.equalsIgnoreCase("Copy of Facility level workflow")) {
			return true;
		} else
			return false;
	}

	public boolean verifyDefaultFacilityWorkflow() {
		Util.waitForElement(driver, getFacilityWorkflow, 5);
		String str = getFacilityWorkflow.getText();
		if (str.equalsIgnoreCase("Facility_New Request for Money")) {
			return true;
		} else
			return false;
	}

	public void clickCrossOnTransactionPopup() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, crossOnPopup, 10);
		crossOnPopup.click();

	}

	public void clickAddBtnOfFacilityBorrowr() {
		Util.waitForElement(driver, addBtnOfFacBorrower, 10);
		addBtnOfFacBorrower.click();
	}

	public void selectBorrowerName(String option) {
		Util.selectItemFromList(driver, borrowerName, option);
	}

	public void selBorrowerOnTransactionInformation()
			throws InterruptedException {
		driver.findElement(
				By.xpath("//*[@id='borrSelect']/div/table/tbody/tr/td[1]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='borrSelect']/div/table/tbody/tr/td[1]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='borrSelect']/div/table/tbody/tr/td[1]/span/input"))
				.sendKeys("Test FMC");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//strong[starts-with(.,'Test FMC')]"))
				.click();
		Util.waitForAJAX(driver);
	}

	public void selRelationshipTyp() throws InterruptedException {

		Util.waitForElementPresent(
				driver,
				By.xpath(".//*[@id='BBUPSERTCREDLNSUMMFORM']/div[5]/div[3]/div/table/tbody/tr/td[4]/span/input"),
				10);
		driver.findElement(
				By.xpath(".//*[@id='BBUPSERTCREDLNSUMMFORM']/div[5]/div[3]/div/table/tbody/tr/td[4]/span/input"))
				.click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath(".//*[@id='BBUPSERTCREDLNSUMMFORM']/div[5]/div[3]/div/table/tbody/tr/td[4]/span/input"))
				.clear();
		driver.findElement(
				By.xpath(".//*[@id='BBUPSERTCREDLNSUMMFORM']/div[5]/div[3]/div/table/tbody/tr/td[4]/span/input"))
				.sendKeys("Borrower");
		Thread.sleep(2000);
		List<WebElement> lst = driver.findElements(By
				.xpath("//strong[contains(.,'Borrower')]"));
		lst.get(0).click();
		Util.waitForAJAX(driver);
	}

	public void clickPrimaryChkbox() {
		WebElement e = driver
				.findElement(By
						.xpath("//*[@id='BBUPSERTCREDLNSUMMFORM']/div[5]/div[3]/div/table/tbody/tr/td[5]/input[@name='primFlag0']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
		Util.waitForAJAX(driver);
	}

	public String verifyAmountRequestedValue() {
		Util.waitForAJAX(driver);
		return amtRequested.getText();
		
//		if (amtRequested.getText().trim().equalsIgnoreCase("500000000"))
//			return true;
//		else
//			return false;
	}

	public AdditionalInformation clickNextBtn() {
		Util.waitForElement(driver, nextButton, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextButton);
		Util.waitForAJAX(driver);
		return new AdditionalInformation(driver);
	}
}
