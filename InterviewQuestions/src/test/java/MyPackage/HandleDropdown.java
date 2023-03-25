package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropdown = driver.findElement(By.id("input-country"));
		Select drpele= new Select(dropdown);
		drpele.selectByVisibleText("Denmark");
		drpele.selectByValue("10");
		drpele.selectByIndex(12);
	}

}
