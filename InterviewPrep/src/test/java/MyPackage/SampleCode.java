package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewPrep\\src\\main\\resources\\chromedriver.exe");
		
		  //ChromeOptions options = new ChromeOptions();
		  //options.addArguments("--remote-allow-origins=*");
		  
		  //WebDriver driver = new ChromeDriver(options);
		 
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//driver.manage().window().maximize();
		//mouse right click action
		

	}

}
