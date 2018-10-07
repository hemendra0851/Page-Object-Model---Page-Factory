/**
 * 
 */
package com.flipkart.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.flipkart.Config.WebDriverDetails;

/**
 * @author 612946
 *
 */
public class Login extends WebDriverDetails{
	
	WebDriver driver;
		
	@FindBy(how=How.XPATH, using=".//input[@class='_2zrpKA']") 
	@CacheLookup
	WebElement username;

	@FindBy(how=How.XPATH, using=".//input[@class='_2zrpKA _3v41xv']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH, using=".//button[@class='_2AkmmA _1LctnI _7UHT_c']") 
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using=".//button[@class='_2AkmmA _29YdH8']")
	@CacheLookup
	WebElement closeIco;
	
	//Constructor
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}

	//Verify Login using Page Factory
	public void LoginToFB(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	//Close Login Dialog Box
		public void closeLoginDialogClick()
		{
			closeIco.click();
		}
		
		public void closeLoginDialogEsc()
		{
			closeIco.sendKeys(Keys.ESCAPE);
		}
}