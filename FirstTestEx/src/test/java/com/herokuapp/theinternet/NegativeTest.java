package com.herokuapp.theinternet;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTest {
	@Test
	public void testJunit() {
		assertTrue(true);
	}

	@Test
	public void NegativeLoginTest() {
		System.out.println("Starting loginTest");
		
//		Create driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

//		open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened.");
		
		// sleep for 2 seconds
		sleep(2000);

//		enter username
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("tomsmh");
		sleep(1000);
//		enter password
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		sleep(1000);
//		click login button
		WebElement logInButton = driver.findElement(By.tagName("button"));
		logInButton.click();
		sleep(1000);
		
		WebElement errormessage= driver.findElement(By.id("flash"));
		String expectedmessage="Your username is invalid!";
		String actualerrormessage= errormessage.getText();
		Assert.assertEquals(actualerrormessage.contains(expectedmessage), 
				"actual error msg doesnt contain error msg. \n Actual:"+actualerrormessage+"\n error msg:"+expectedmessage);
		// Close browser
		driver.quit();
	}



		

		@Test
		public void NegativeLoginPasswordTest() {
			System.out.println("Starting loginTest");
			
//			Create driver
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// sleep for 3 seconds
			sleep(3000);

			// maximize browser window
			driver.manage().window().maximize();

//			open test page
			String url = "http://the-internet.herokuapp.com/login";
			driver.get(url);
			System.out.println("Page is opened.");
			
			// sleep for 2 seconds
			sleep(2000);

//			enter username
			WebElement username= driver.findElement(By.id("username"));
			username.sendKeys("tomsmith");
			sleep(1000);
//			enter password
			WebElement password= driver.findElement(By.id("password"));
			password.sendKeys("SupertPassword!");
			sleep(1000);
//			click login button
			WebElement logInButton = driver.findElement(By.tagName("button"));
			logInButton.click();
			sleep(1000);
			
			WebElement errormessage= driver.findElement(By.id("flash"));
			String expectedmessage="Your password is invalid!";
			String actualerrormessage= errormessage.getText();
			Assert.assertEquals(actualerrormessage.contains(expectedmessage), 
					"actual error msg doesnt contain error msg. \n Actual:"+actualerrormessage+"\n error msg:"+expectedmessage);
		
			
		
		
		// Close browser
		driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


