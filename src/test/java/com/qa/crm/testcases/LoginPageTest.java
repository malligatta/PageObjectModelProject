package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase_Class;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LogingPage;

public class LoginPageTest extends TestBase_Class{
	
	LogingPage loginpage;
	HomePage homepage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LogingPage();
		
	}
	
	@Test(priority=1)
	public void LoginPageTitlePage() {
		String title = loginpage.validatingLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	

}
