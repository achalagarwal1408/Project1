package com.cognixia.training.Maven.TestNG.Selenium.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cognixia.training.Maven.TestNG.Selenium.common.Base;

public class Assignment extends Base {
	
	    static String actual;
	  
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		openBrowser("chrome");
//		
//		driver.get("https://www.google.com");
//		
//		WebElement searchbox=driver.findElement(By.name("csi")); 
//		
		Scanner myFile=new Scanner(new File("resources2/Test1"));
		
		while(myFile.hasNextLine()) {
			
			
			System.out.println(myFile.nextLine());
			
			String text=myFile.nextLine();
			
			openBrowser("chrome");
			
			driver.get("https://www.google.com");
			
			WebElement searchbox1=driver.findElement(By.name("csi"));
			
			searchbox1.sendKeys(text);
			
		    searchbox1.sendKeys(Keys.ENTER);
			
	        actual=driver.getTitle();
		    
		    String expected=myFile.nextLine();
		    
		if(actual.contains(myFile.nextLine())) {
			System.out.println("Test passed");
			
		}
		else 
		{
			System.out.println("Test failed");
			System.out.println("Title is:"+actual);
		}
		
		}
		
		
	}

}
