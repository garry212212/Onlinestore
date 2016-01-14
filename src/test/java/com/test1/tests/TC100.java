package com.test1.tests;



import org.testng.Assert;
import org.testng.annotations.Test;


public class TC100 extends TestBase


{
  @Test
  public void PeoplePageLoad() 
  
  {
	  boolean testresult = homepage.clickPeopleLink()
	  							.isPageLoadSuccessful();
	  Assert.assertTrue(testresult, "People page failed to load");
  }
 
  }
