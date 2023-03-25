package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		//1st frame on top left
		
		 driver.switchTo().frame("packageListFrame");
		 driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		 driver.switchTo().defaultContent();
		  // go back to original page
		  Thread.sleep(3000);
		//2nd frame on bottom left
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[9]/a/span")).click();//AddHascdp
		driver.switchTo().defaultContent();// go back to original page
		 Thread.sleep(5000);
		//3rd frame on right
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();//AddHascdp
		driver.switchTo().defaultContent();// go back to original page
	}

}
