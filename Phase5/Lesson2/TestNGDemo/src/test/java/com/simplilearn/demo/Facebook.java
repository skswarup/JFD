package com.simplilearn.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Facebook {
	
	WebDriver driver=null;
  @Test
  public void welcome() { }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver =new ChromeDriver();

		String BaseURL="https://www.facebook.com/";
		driver.get(BaseURL);
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("sibanandasahoo130@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("Sibasahoo@");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After Method");
	  
	  driver.close();
	 
	  driver=null;
	  
  }

}