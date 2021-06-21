package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase_Class;

public class ContactPage extends TestBase_Class{
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	WebElement clkOnCreate;
	
	@FindBy(name = "first_name")
	WebElement firstname;
	
	@FindBy(name = "last_name")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id='main-content']/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div/input")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement saveBtn;
	
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createContactPage(String email,String fname,String lname) {
		clkOnCreate.click();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		emailAddress.sendKeys(email);
		saveBtn.click();
	}
	

}
