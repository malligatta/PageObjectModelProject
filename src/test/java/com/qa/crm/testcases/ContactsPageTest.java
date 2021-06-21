package com.qa.crm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase_Class;
import com.qa.crm.pages.ContactPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LogingPage;
import com.qa.crm.utils.TestUtils;

public class ContactsPageTest extends TestBase_Class {

	TestUtils testutils;
	LogingPage loginpage;
	HomePage homepage;
	ContactPage contactpage;

	public ContactsPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {

		initialization();
		testutils = new TestUtils();
		loginpage = new LogingPage();
		contactpage = new ContactPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		contactpage=homepage.clickOnbtn();

	}

	@Test(priority = 1)
	public void verifyContactPage() {
		contactpage.createContactPage("raja@gmail.com", "raju", "venkat");

	}

	@AfterMethod
	public void tearDown() {
		
	}
}
