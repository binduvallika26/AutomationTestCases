package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");

		///***pageopen ***///
		System.out.println("Title of the web page is:"+ driver.getTitle());
		//current url to compare
		System.out.println("Title of the web page is:"+ driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
