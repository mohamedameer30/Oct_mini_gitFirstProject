package com.Oct_Mini_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookScreenshot {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ameer\\eclipse-workspace\\Selenium_firstproject\\driver\\chromedriver.exe" );
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://en-gb.facebook.com/");
	
	 WebElement username = driver.findElement(By.xpath("//input[@type ='text']"));
	username.sendKeys("mohamedameerdeen30@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
	password.sendKeys("12345678");
	
	WebElement login = driver.findElement(By.xpath("//button[@value ='1']"));
	login.click();
	
	TakesScreenshot ts = ((TakesScreenshot)driver);
	
	File scr = ts.getScreenshotAs(OutputType.FILE);
	
   File dest	=new File("C:\\Users\\ameer\\eclipse-workspace\\Oct_Mini_project\\Snaps//snap.png");

    
FileUtils.copyFile(scr, dest);
	
	
	
	
	
}
}