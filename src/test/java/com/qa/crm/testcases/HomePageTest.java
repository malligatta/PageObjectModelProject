package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase_Class;
import com.qa.crm.pages.ContactPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LogingPage;
import com.qa.crm.utils.TestUtils;

public class HomePageTest extends TestBase_Class{
	
	TestUtils testutils;
	LogingPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		testutils =new TestUtils();
		loginpage = new LogingPage();
		contactpage = new ContactPage();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePage() {
		String title = loginpage.validatingLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@AfterMethod
	public void tearDown() {
		
	}

}
