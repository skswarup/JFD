package com.practice.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		WebElement Check= driver.findElement(By.id("id_privacy"));
		
		WebElement Email= driver.findElement(By.id("id_email"));
		Email.sendKeys("sibanandasahoo130@gmail.com");
		
		WebElement Name= driver.findElement(By.id("id_name"));
		Name.sendKeys("sibananda");
		
		WebElement Pass= driver.findElement(By.id("id_password"));
		Pass.sendKeys("siba@143");
		
		WebElement Mobile= driver.findElement(By.id("id_cell_phone"));
		Mobile.sendKeys("7377700845");
		
		WebElement Continue= driver.findElement(By.id("registerButton"));
		Continue.click();
		
	
		
	}

}
