package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//one page one class
//this is be hema
public class GoogleHomePage {
	WebDriver driver;
	public GoogleHomePage(WebDriver driver){
		this.driver=driver;
			}
@FindBy  (name="q")
WebElement Googlesearch;
@FindBy (name="btnG")
WebElement Enter;

public void googleSearch(){
	Googlesearch.sendKeys("seleniumhq");
	Enter.click();
	
}
 public void navigatetoURL(String url){
	 driver.get(url);
 }
}
