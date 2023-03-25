package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement item1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		
		WebElement item2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
		WebElement trash=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions act= new Actions(driver);
		act.dragAndDrop(item1,trash).build().perform();
		act.dragAndDrop(item2,trash).build().perform();
		System.out.println("Mouseover dragAndDrop action successfull on images");

	}

}
