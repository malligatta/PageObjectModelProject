package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase_Class;

public class LogingPage extends TestBase_Class {

	// Pagefactory - OR

	@FindBy(name = "email")
	WebElement username;
	
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id='ui']/div/div/div[2]/a")
	WebElement SignUpBtn;
	
	//Initializing the page object
	public LogingPage() {
		
		PageFactory.initElements(driver, this);
	}

	//get page title
	public String validatingLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
