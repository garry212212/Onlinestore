package com.test.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase
{

public HomePage(WebDriver driver)
{
super(driver);
}



public PeoplePage clickPeopleLink()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='menu-item-4162']/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return new PeoplePage(driver);
	
	
}


}


