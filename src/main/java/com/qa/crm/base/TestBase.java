package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.crm.utils.TestUtils;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	
	
	
	public TestBase() {
		
		try {
		prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\com\\qa\\crm\\config\\config.properties");
		prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void initialization() {
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\OxygenJava\\PageObjectModel\\chrome_driver\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		} else if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "D:\\OxygenJava\\PageObjectModel\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
