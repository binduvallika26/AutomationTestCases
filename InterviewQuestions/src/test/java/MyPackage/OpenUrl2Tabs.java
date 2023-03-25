package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenUrl2Tabs {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--remote-allow-origins=*");
			  
			  WebDriver driver = new ChromeDriver(options);
			  // How to open URL’s in a multiple tabs & Windows?
			driver.get("https://demo.nopcommerce.com/");
			driver.switchTo().newWindow(WindowType.TAB);//for a new tab in same window
			//driver.switchTo().newWindow(WindowType.WINDOW);// for to open a new window
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();

	}

}
