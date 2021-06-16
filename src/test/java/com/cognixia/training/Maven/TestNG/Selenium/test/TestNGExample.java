package com.cognixia.training.Maven.TestNG.Selenium.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	private String name;
	
    @Test
	public void testFirst() {
		System.out.println("Inside Test First");
		getData();
		name="Achal";
	}
	
    private void getData() {
		System.out.println("Inside get data");		
	}

	@BeforeTest
    public void setUp() {
    	System.out.println("Inside setup");
    }
    
    @AfterTest
    public void tearDown() {
    	
    	System.out.println("Inside teardown");
    }
	
	@Test
    public void testSecond()
    {
    	System.out.println("Inside Secondtest");
    	System.out.println("name is :"+name);
    }
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Inside Before Method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Inside Before suite");
	}
	
	@AfterSuite
	public void aferSuite()
	{
		System.out.println("Inside After suite");
	}
	
	@Test
	public void testA()
	{
		System.out.println("Inside test A");
		System.out.println("Name is :"+name);
	}
	
}















