package com.provenir.automation.framework.helper;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class SearchHelper {
	
	WebDriver driver;
	
	public SearchHelper(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "srchTxt")
	private WebElement searchBox;
	
	@FindBy(how = How.ID, using = "selCustomer")
	private WebElement searchedCust;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='partySrchRes']//span[contains(.,'Load')]")
	private WebElement loadCustomer;
	
	public void searchCustomer(HashMap<String, Map<String, String>>_hashCustomers)
	{
		HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashCustomers
				.get("searchCustomer");
		
		System.out.println("**************************************" + propertiesMap.get("searchCustomer"));
		
		searchBox.sendKeys(propertiesMap.get("searchCustomer"));
		searchBox.sendKeys(Keys.ENTER);
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
		
		Util.waitForElementPresent(driver,By.xpath(".//*[@id='transSrchRes']//span[contains(.,'Load')]"), 20);
		searchedCust.click();
		loadCustomer.click();
		Util.waitForLoaderToFinish(driver);
		Util.waitForAJAX(driver);
	}

}
