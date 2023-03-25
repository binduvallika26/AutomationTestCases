package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.get("https://www.amazon.com");
		driver.navigate().back();//navigate back to snapdeal page
		driver.navigate().forward();//navigate forward to amazon page
		driver.navigate().refresh();//refreshing amazon page again
		driver.navigate().to("https://www.flipkart.com");
	}

}
