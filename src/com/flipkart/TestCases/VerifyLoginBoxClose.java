/**
 * 
 */
package com.flipkart.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.Config.*;
import com.flipkart.Pages.Login;

/**
 * @author 612946
 *
 */
public class VerifyLoginBoxClose extends WebDriverDetails{
		
	WebDriver driver;
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
	    System.out.println("Test name: " + method.getName());       
	}
	
	@Test
	public void VerifyClickClose() throws Exception
	{	
		driver = getWebDriver();	
		Login loginPF = PageFactory.initElements(driver, Login.class);

		loginPF.closeLoginDialogClick();

		driver.quit();
	}
	
	@Test
	public void VerifyEscClose()
	{
		driver = getWebDriver();
		Login loginPF = PageFactory.initElements(driver, Login.class);

		loginPF.closeLoginDialogEsc();
		
		driver.quit();
	}
	
	
}
