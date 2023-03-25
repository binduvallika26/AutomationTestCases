package com.parameters;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;



public class ParametersTestClass {
	WebDriver driver;
	
	
	@Test
	//@Parameters({"url","emailId"})
	
	public void yahoologintest(){
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("naveen@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		
	}

}
