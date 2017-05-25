package com.testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.OrangeHomePage;

public class OrangeDriverclass {
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser(){
	 driver=new ChromeDriver();
	}
	@AfterSuite
	public void tearDown(){
		driver.close();
	}
  @Test
	public void verifyLoginpage(){
	  
	  OrangeHomePage ohp = PageFactory.initElements(driver, OrangeHomePage.class);
	  ohp.navigatetoURL("http://opensource.demo.orangehrmlive.com/");
	  ohp.loginPage("Admin", "admin");
	  
	  Assert.assertEquals("http://opensource.demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
		
	}
	
}
