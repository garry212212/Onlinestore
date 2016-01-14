package com.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PeoplePage extends PageBase
{

public PeoplePage(WebDriver driver)

{
	super(driver);
}


public boolean isPageLoadSuccessful()
{
	return driver.findElement(By.xpath("//*[@id='features']/div/div[2]/a[1]")).isDisplayed();
}

}
