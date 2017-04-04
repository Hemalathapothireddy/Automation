package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class ClassB  {
	
	
	public static void main(String[] args)  {
		ClassA obj=new ClassA();
		obj.setI(12);
		obj.setS("jay");
		System.out.println(obj.getI());
		System.out.println(obj.getS());
		
		}
}

