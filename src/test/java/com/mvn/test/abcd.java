package com.mvn.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class abcd {

	WebDriver driver;
	@Test(priority=1)
	public void demo() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "E:\\MealsPlus\\WorkSpaceMealsPlus\\Test\\Driver\\geckodriver.exe");
		
		for(int i=0;i<4;i++){
		System.out.println("Testing......!!!!!!!!!!");
		Thread.sleep(500);
		}
		
		
		driver = new FirefoxDriver();
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
		//driver.findElement(By.xpath("ddd")).click();
		
	}
	
	@Test(priority=3)
	public void demo3(){
		System.out.println("priority 3 test case get executed...!!!");
	}
	
	@Test(priority=4)
	public void demo4(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("Closing the driver...!!!");
	}
}
