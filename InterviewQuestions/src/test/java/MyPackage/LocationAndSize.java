package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocationAndSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		//  4. How to capture Size & Location of the WebElement?
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//*[@id="app"]/div[1]/div/div[1]/div/div[1]/img
		
		WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
		//Location of web Elements
		//Method-1
		System.out.println("get loaction of (x,y) web element is:"+logo.getLocation());
		System.out.println("get loaction of X web element is:"+logo.getLocation().getX());
		System.out.println("get loaction of Y web element is:"+logo.getLocation().getY());
		
		//Method-2
		//System.out.println("get location of (x,y) web element is:"+logo.getRect().getLocation());//not applicable
		System.out.println("get loaction of X web element is:"+logo.getLocation().getX());
		System.out.println("get loaction of Y web element is:"+logo.getLocation().getY());
		
		
		//Size of WebElements
		//Method-1
		System.out.println("get Size of (Width,Height) web element is:"+logo.getSize());
		System.out.println("get  Width of  web element is:"+logo.getSize().getWidth());
		System.out.println("get  Height of web element is:"+logo.getSize().getHeight());
		
		//Method-2
		System.out.println("get Width of the web element is:"+logo.getRect().getDimension().getWidth());
		System.out.println("get  Height of the web element is:"+logo.getRect().getDimension().getHeight());
		
		
	}

}
