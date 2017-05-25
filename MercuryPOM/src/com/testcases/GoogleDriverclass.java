package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.GoogleHomePage;

public class GoogleDriverclass {
	
	WebDriver driver;
   @BeforeSuite
		public void launchbrowser(){
			driver=new ChromeDriver();
		}
	@AfterSuite
	public void closebrowser(){
		driver.close();
	}
	@Test
	public void verifyGooglesearch() throws InterruptedException{
		GoogleHomePage ghp = PageFactory.initElements(driver, GoogleHomePage.class);
		ghp.navigatetoURL("https://www.google.co.in/");
		ghp.googleSearch();
		Thread.sleep(3000);
		boolean displayStatus = driver.findElement(By.xpath("//a[text()='Downloads - Selenium']")).isDisplayed();
		Assert.assertTrue(displayStatus);
	}

}
