package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement tooltip =driver.findElement(By.xpath("//*[@id=\"age\"]"));
		System.out.println("bindu");
		/*
		 * String tooltiptext= tooltip.getAttribute("title");
		 * System.out.println("Text present in the tooltip is:"+tooltiptext);
		 */
	}

}
