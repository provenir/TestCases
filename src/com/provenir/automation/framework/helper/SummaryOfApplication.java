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

public class SummaryOfApplication {

	WebDriver driver;
	Actions actions = null;

	public SummaryOfApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h1[contains(.,'Summary of Application')]")
	private WebElement summaryOfApplicationTitle;

	@FindBy(how = How.ID, using = "finishDataEntry")
	private WebElement finishBtn1;

	private String wizardCompletePopup = ".//*[@id='presales']/ul/li";

	public boolean verifySummaryOfApplication() {
		Util.waitForAJAX(driver);
		if (summaryOfApplicationTitle.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickFinishButton() {
		Util.waitForElementPresent(driver, By.id("finishDataEntry"), 20);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('finishDataEntry').focus();");
		js.executeScript("arguments[0].click();", finishBtn1);

		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

	public boolean verifyLinks() throws InterruptedException {
		Util.waitForAJAX(driver);
		Util.waitForLoaderToFinish(driver);
		Util.waitForLoaderToFinish(driver);
		Thread.sleep(3000);
		Util.waitForElementPresent(driver, By.xpath(wizardCompletePopup), 40);
		List<WebElement> elementList = driver.findElements(By
				.xpath(wizardCompletePopup));

		List<String> lstLinks = new ArrayList<String>();

		for (int i = 1; i <= elementList.size(); i++) {
			lstLinks.add(driver.findElement(
					By.xpath(wizardCompletePopup + "[" + i + "]/a")).getText());
		}

		for (String linkText : lstLinks) {
			if (linkText.contains("My Tasks.")
					|| linkText.contains("New Credit Request.")
					|| linkText.contains("My Requests.")) {
				return true;
			}
		}
		return false;
	}

	public MyRequests clickMyRequestsLink() {
		Util.waitForAJAX(driver);
		Util.waitForElementPresent(driver, By.xpath(wizardCompletePopup), 10);
		List<WebElement> elementList = driver.findElements(By
				.xpath(wizardCompletePopup));
		WebElement element = null;
		for (int i = 1; i <= elementList.size(); i++) {
			element = driver.findElement(By.xpath(wizardCompletePopup + "[" + i
					+ "]/a"));
			Util.waitForElement(driver, element, 5);
			if (element.getText().contains("My Requests.")) {
				element.click();
			}
		}
		Util.waitForAJAX(driver);
		return new MyRequests(driver);
	}

}
