package com.cognixia.training.Maven.TestNG.Selenium.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	    protected static WebDriver driver;

	    protected static void setproperties() {
		
		System.setProperty("webdriver.chrome.driver","C:\\tools\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\tools\\Selenium\\geckodriver.exe");
			
	}
	
	    protected static void openBrowser( String Browser) {
		
		setproperties();
		
		if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
