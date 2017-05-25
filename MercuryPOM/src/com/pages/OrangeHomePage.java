package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHomePage {
  WebDriver driver;
  public OrangeHomePage(WebDriver driver){
	  this.driver=driver;
	 
  }
  @FindBy (id="txtUsername")
  WebElement Username;
  @FindBy (id="txtPassword")
  WebElement Password;
  @FindBy (id="btnLogin")
  WebElement Login;
  
  public void loginPage(String username,String password){
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  Login.click();
  }
  public void navigatetoURL(String url){
	  driver.get(url);
	  
  }
  
  
}
