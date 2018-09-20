package com.mvn.test;

import java.io.File;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class abcd {

	WebDriver driver;
	
	@Test(priority=1)
	public void demo() throws InterruptedException{
	//	System.setProperty("webdriver.gecko.driver", "E:\\MealsPlus\\WorkSpaceMealsPlus\\Test\\Driver\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
                //Option for Windows OS
		options.addArguments("--disable-gpu");
		driver = new ChromeDriver(options);
		
		for(int i=0;i<2;i++){
		System.out.println("Testing......!!!!!!!!!!");
		Thread.sleep(500);
		}
		
		System.out.println("priority 1 test case get executed...!!!");
		 
		//driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		System.out.println("Url Tital: "+driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		System.out.println("UserName entered...!!!");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("Password Entered...!!!");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login Successful...!!!");
		System.out.println("Tital after Login:"+driver.getTitle());
		 
	}
	
	@Test(priority=2)
	public void demo2(){
		System.out.println("priority 2 test case get executed...!!!");
	}
	
	@Test(priority=3)
	public void demo3(){
		System.out.println("priority 3 test case get executed...!!!");
		//Assert.assertEquals("True", "False");
	}
	
	@Test(priority=4)
	public void demo4(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("priority 4 test case get executed...!!!");
	}
}
