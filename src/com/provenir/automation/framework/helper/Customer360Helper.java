package com.provenir.automation.framework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.provenir.automation.framework.utility.Util;

public class Customer360Helper {

	WebDriver driver;

	public Customer360Helper(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "addr")
	private WebElement addressLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='clientAddress']/div/a")
	private WebElement addBtnOnAddress;

	@FindBy(how = How.XPATH, using = "//h2[contains(.,'Add Address')]")
	private WebElement addressTitle;

	@FindBy(how = How.ID, using = "addrLn1")
	private WebElement addressLine;

	@FindBy(how = How.ID, using = "postalCd")
	private WebElement postalCode;

	@FindBy(how = How.ID, using = "city")
	private WebElement city;

	@FindBy(how = How.XPATH, using = ".//*[@id='postCodeDivId']/img")
	private WebElement postalCodeImage;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Save')]")
	private WebElement saveAddress;

	private String addressType = "addrTyp";
	private String country = "country";
	private String region = "state";

	public void clickAddressLink() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addressLink, 20);
		addressLink.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void clickAddBtnOfAddressLink() {
		Util.waitForElement(driver, addBtnOnAddress, 10);
		addBtnOnAddress.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void verifyAddressTitle() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver, addressTitle, 20);
		String title = addressTitle.getText().trim();
		Assert.assertEquals("Add Address", title);
	}

	public void enterAddressType(String option) {
		Util.waitForAJAX(driver);
		Util.scrollUp(driver);
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver,By.xpath(addressType), 20);
		option = "Mailing";
		Util.selectItemFromList(driver,addressType, option);
	}

	public void selectCountry(String option) {
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver,By.xpath(country), 20);
		option = "United States";
		Util.selectItemFromList(driver,country, option);
	}

	public void enterAddressLine() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver,addressLine, 10);
		addressLine.sendKeys("address line 1");
	}

	public void enterPostalCode() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver,postalCode, 20);
		postalCode.sendKeys("10005");
		postalCodeImage.click();
		Util.waitForLoaderToFinish(driver);
	}

	public void enterCity() {
		Util.waitForElement(driver,city, 10);
		city.sendKeys("NY");
	}

	public void enterRegion(String option) {
		postalCodeImage.click();
		Util.enableAllDropdowns(driver);
		Util.waitForElementPresent(driver,By.xpath(region), 20);
		option = "New York";
		Util.selectItemFromList(driver,country, option);
	}

	public void saveAddress() {
		Util.waitForAJAX(driver);
		Util.waitForElement(driver,saveAddress, 15);
		saveAddress.click();
		Util.waitForLoaderToFinish(driver);
	}

}
