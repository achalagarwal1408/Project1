package com.cognixia.training.MavenTestNGSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cognixia.training.Maven.TestNG.Selenium.common.*;

public class ScreenShot extends Base{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		openBrowser("chrome");
		
		driver.get("https://www.cleartrip.com");
		
		File f;
		
		f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("ScreenShot/cleartrip.jpg"));
				
		}
		
	}


