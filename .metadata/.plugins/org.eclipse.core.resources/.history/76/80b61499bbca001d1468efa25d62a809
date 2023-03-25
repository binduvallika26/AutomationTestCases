package MyPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	/*
	 * 1) What is Java Script Alert? 
	 * 2) How To Handle Java Script Alerts?
	 *  3) How To Handle Authentication Popup?
	 *   4) How To Handle Permission Pop-ups?
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		// 1.handle OK button
		//*[@id="content"]/div/ul/li[1]/button
	/*
		| * driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).
	 * click(); Thread.sleep(3000); driver.switchTo().alert().accept();
		 */
		 //2. OK and Cancel options handling
			/*
			 * driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).
			 * click(); Thread.sleep(3000); //driver.switchTo().alert().accept();//to select
			 * Ok button driver.switchTo().alert().dismiss();//to select cancel button //
			 */		 //alert window with input box,ok, cancel
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click(); 
		Thread.sleep(3000);
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("message passing to alert window:"+alertwindow.getText());
		alertwindow.sendKeys("decision call");
		alertwindow.accept();
	}

}
