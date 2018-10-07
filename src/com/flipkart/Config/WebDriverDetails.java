/**
 * 
 */
package com.flipkart.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author 612946
 *
 */
public class WebDriverDetails {
	
	public Properties CONFIG = new Properties();
	public Properties OR = new Properties();
	public String configPath = "./src/configFiles/config.properties";
	public String orPath = "./src/configFiles/OR.properties";
	
	public WebDriver getWebDriver() 
	{
		try {
			FileInputStream fs1 = new FileInputStream(configPath);
			CONFIG.load(fs1);
			FileInputStream fs2 = new FileInputStream(orPath);
			OR.load(fs2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary(CONFIG.getProperty("chromePath"));
		
		System.setProperty("webdriver.chrome.driver", CONFIG.getProperty("cdriverPath"));
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(CONFIG.getProperty("url"));		
		
		return driver;
		
	}

}
