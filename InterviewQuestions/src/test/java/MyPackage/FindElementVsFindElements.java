package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//findelement()--single element
		WebElement search= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		search.sendKeys("XYZ");
		//out of n-number of elements return only first element
		WebElement ele= driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		System.out.println(ele.getText());
		//no such element exception
		WebElement noele= driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		//System.out.println(noele);
		
		//multiple web elements
		List<WebElement> multele= driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		System.out.println(multele.size());
	}

}
