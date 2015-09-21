package com.provenir.automation.framework.helper;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provenir.automation.framework.utility.Util;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "j_username")
	private WebElement username;

	@FindBy(how = How.ID, using = "j_password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'Login')]")
	private WebElement loginBtn;
	
	public void login(HashMap<String, Map<String, String>> _hashLogins)
	{
		try
		{
			HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashLogins
					.get("fmartin");
			username.sendKeys(propertiesMap.get("username"));
			password.sendKeys(propertiesMap.get("password"));
			loginBtn.click();
			Util.waitForAJAX(driver);
			Util.waitForLoaderToFinish(driver);
			Util.waitForAJAX(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void login1(HashMap<String, Map<String, String>> _hashLogins)
	{
		try
		{
			HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashLogins
					.get("jcarter");
			username.sendKeys(propertiesMap.get("username"));
			password.sendKeys(propertiesMap.get("password"));
			loginBtn.click();
			Util.waitForLoaderToFinish(driver);
			Util.waitForAJAX(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void login2(HashMap<String, Map<String, String>> _hashLogins)
	{
		try
		{
			HashMap<String, String> propertiesMap = (HashMap<String, String>) _hashLogins
					.get("sdietz");
			username.sendKeys(propertiesMap.get("username"));
			password.sendKeys(propertiesMap.get("password"));
			loginBtn.click();
			Util.waitForLoaderToFinish(driver);
			Util.waitForAJAX(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
