package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement{

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/register");
			//isDisplayed,isEnabled
			WebElement search= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
			System.out.println("search element is displayed:"+ search.isDisplayed());
			System.out.println("search element is Enabled:"+ search.isEnabled());
			//isSelected
			WebElement male= driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
			WebElement female= driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label"));
			System.out.println("male element is selected:"+ male.isSelected());
			System.out.println("female element is selected:"+ female.isSelected());
			//click functionality
			male.click();
			System.out.println("male element is selected:"+ male.isSelected());
			System.out.println("female element is selected:"+ female.isSelected());
			female.click();
			System.out.println("male element is selected:"+ male.isSelected());
			System.out.println("female element is selected:"+ female.isSelected());

	}
}