package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase_Class;

public class HomePage extends TestBase_Class {
	
	
	@FindBy(xpath="//*[@id='main-nav']/div[3]/a")
	WebElement clkOnContacts;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	
	public ContactPage clickOnbtn() {
		clkOnContacts.click();
		return  new ContactPage();
	}
	
/*	public ContactPage createContactlist() {
		
		//clkOnCreate.click();
		/*firstname.sendKeys("RameshBabu");
		lastname.sendKeys("gg");
		emailAddress.sendKeys("rameshbb@gmail.com");
		saveBtn.click();
		
		return new ContactPage();
	}
	*/
	
	

}
