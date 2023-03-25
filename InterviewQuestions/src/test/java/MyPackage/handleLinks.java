package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleLinks {
	/*
	 * 1. How To Locate links in Selenium WebDriver?
	 *  2. What is the difference between LinkText() and PartialLinkText()?
	 *  3. How to capture all the linksfrom Web Page?
	 *   4. What is Broken Link? How to check it?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Today's Deals")).click();//linkText
		//driver.findElement(By.partialLinkText("Deals")).click();//partiallinktext
		
		
		//3. How to capture all the links * from Web Page?
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("count of liks present in web page:"+links.size());
		// for to capture every link  and print using for loop
		/*
		 * for(int i=0; i<links.size();i++) {
		 * System.out.println(links.get(i).getText());//gives every specific link name
		 * System.out.println(links.get(i).getAttribute("href"));//gives every specific
		 * href link }
		 */
		// same for loop notation using foreach loop to simply code
		for( WebElement href:links) {
			 System.out.println(href.getText());//gives every specific link name
			 System.out.println(href.getAttribute("href"));//gives every specific
		}
		//4. What is Broken Link? How to check it?
	}

}
