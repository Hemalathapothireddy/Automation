package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class ClassB  {
	
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.kesinenitravels.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[text()='Search']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
		
		
		
	}
	}

