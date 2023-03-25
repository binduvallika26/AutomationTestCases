package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		//mouse d click action
		driver.switchTo().frame("iframeResult");
		WebElement inputfiled1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		inputfiled1.clear();
		inputfiled1.sendKeys("welcome");
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		Actions act= new Actions(driver);
		act.doubleClick(button).build().perform();
		System.out.println("Mouseover Double click action successfull");
		}

}
