/**
 * 
 */
package com.flipkart.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.Config.WebDriverDetails;
import com.flipkart.Pages.Login;

/**
 * @author 612946
 *
 */
public class VerifyLogin extends WebDriverDetails{
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
	    System.out.println("Test name: " + method.getName());       
	}
	
	@Test
	public void VerifyValidLogin() throws Exception
	{
		WebDriver driver = getWebDriver();
		Login loginPF = PageFactory.initElements(driver, Login.class);

		loginPF.LoginToFB(OR.getProperty("username"), OR.getProperty("password"));
		driver.quit();
	}

}
