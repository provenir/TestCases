package com.provenir.automation.framework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class AdditionalInformation {

	WebDriver driver;
	Actions actions = null;

	public AdditionalInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private String quesObligation = "quesOthObli";
	private String quesBankrupt = "quesBussBankRupt";
	private String quesGuarantor = "quesIsGurantToAnyOthr";
	private String quesTaxesOwned = "quesTaxesOwed";
	private String quesAnyDegree = "quesAnyAgreeChgOwnship";
	private String quesBusinessTax = "quesBusiTaxLien";
	private String quesRelatedParty = "quesPratyExeDirPrin";
	private String quesBusinessOwn = "quesBusinessOwnOrLien";

	@FindBy(how = How.XPATH, using = "//h1[contains(.,'Additional Information')]")
	private WebElement additionalInfoTitle;

	@FindBy(how = How.ID, using = "saveBBQuestionaire")
	private WebElement saveOnAdditionalInfo;

	@FindBy(how = How.ID, using = "nextBtn")
	private WebElement nextBtn;

	@FindBy(how = How.ID, using = "acctNo")
	private WebElement acctNo;

	@FindBy(how = How.ID, using = "noOfFullTimeEmp")
	private WebElement noOfEmp;

	@FindBy(how = How.ID, using = "acgBalYTD")
	private WebElement avgAccBalance;

	public boolean verifyAdditionalInformationTitle() {
		Util.waitForAJAX(driver);
		if (additionalInfoTitle.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickSaveOnAdditionalInformation() {
		Util.waitForElement(driver, saveOnAdditionalInfo, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", saveOnAdditionalInfo);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
	}

	public SummaryOfApplication clickNextButton() {
		Util.waitForElement(driver, nextBtn, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextBtn);
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		return new SummaryOfApplication(driver);
	}

	public SummaryOfApplication clickNxt() {
		WebElement e = driver.findElement(By.xpath("//span[contains(.,'6')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
		Util.waitForAJAX(driver);
		return new SummaryOfApplication(driver);
	}

	public void enterPrimaryCheckingAccount(String value) {
		acctNo.clear();
		acctNo.sendKeys(value);
	}

	public void enterNoOFEmp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", noOfEmp);
		js.executeScript("arguments[0].value='500';", noOfEmp);
	}

	public void enterAvgAccBalance() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", avgAccBalance);
		js.executeScript("arguments[0].value='100';", avgAccBalance);
	}

	public void selectQuesObligation() throws InterruptedException {

		Util.waitForElementPresent(driver, By.xpath(quesObligation), 10);
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[2]/div[2]/span/input"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[2]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[2]/div[2]/span/input"))
				.sendKeys("No");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(.,'No')]")).click();
		Util.waitForAJAX(driver);
	}

	public void selectQuesBankrupt() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(quesBankrupt), 2);
		String option = "No";
		Util.selectItemFromList(driver, quesBankrupt, option);
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[3]/div[2]/span/input"))
		// .click();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[3]/div[2]/span/input"))
		// .clear();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[3]/div[2]/span/input"))
		// .sendKeys("No");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a/strong[contains(.,'No')]")).click();

		Util.waitForAJAX(driver);
	}

	public void selectQuesGuarantor() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(quesGuarantor), 6);
		String option = "No";
		Util.selectItemFromList(driver, quesGuarantor, option);

		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[4]/div[2]/span/input"))
		// .click();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[4]/div[2]/span/input"))
		// .clear();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[4]/div[2]/span/input"))
		// .sendKeys("No");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//strong[contains(.,'No')]")).click();
		Util.waitForAJAX(driver);
	}

	public void selectQuesTaxesOwned() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(quesTaxesOwned), 7);
		String option = "No";
		Util.selectItemFromList(driver, quesTaxesOwned, option);

		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[5]/div[2]/span/input"))
		// .click();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[5]/div[2]/span/input"))
		// .clear();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[5]/div[2]/span/input"))
		// .sendKeys("No");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//strong[contains(.,'No')]")).click();
		Util.waitForAJAX(driver);
	}

	public void selectQuesOwnership() throws InterruptedException {
		Util.waitForElementPresent(driver, By.xpath(quesAnyDegree), 7);
		String option = "No";
		Util.selectItemFromList(driver, quesAnyDegree, option);

		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[6]/div[2]/span/input"))
		// .click();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[6]/div[2]/span/input"))
		// .clear();
		// driver.findElement(
		// By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[6]/div[2]/span/input"))
		// .sendKeys("No");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//strong[contains(.,'No')]")).click();
		Util.waitForAJAX(driver);
	}

	public void enterValues() throws InterruptedException {
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[2]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[2]/div[2]/span/input"))
				.sendKeys("Yes");
		clickYes();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[3]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[3]/div[2]/span/input"))
				.sendKeys("Yes");
		clickYes();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[4]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[4]/div[2]/span/input"))
				.sendKeys("No");
		clickYes();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[5]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[5]/div[2]/span/input"))
				.sendKeys("No");
		clickYes();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[6]/div[2]/span/input"))
				.clear();
		driver.findElement(
				By.xpath("//*[@id='BBCRUPSERTAPPINFO']/div/div[1]/div[5]/div/div[6]/div[2]/span/input"))
				.sendKeys("No");
		clickYes();
		Thread.sleep(1000);

	}

	public void clickYes() {
		WebElement e = driver.findElement(By.id("phyAdd"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

}
