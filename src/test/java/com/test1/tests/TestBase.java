package com.test1.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.test.pages.HomePage;
import com.test.util.WebDriverHelper;

public class TestBase 
{
		protected WebDriver driver;
		protected HomePage homepage;
		protected Properties testconfig;
		
	  @BeforeMethod
	  public void beforeMethod() throws FileNotFoundException, IOException 
	  {
		  testconfig=new Properties();
		  testconfig.load(new FileInputStream("testconfig.properties"));
		  driver=WebDriverHelper.createDriver(testconfig.getProperty("browser"));
		  driver.get(testconfig.getProperty("baseurl"));
		  homepage=new HomePage(driver);
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
		  WebDriverHelper.quitDriver(driver);
	  }
}
