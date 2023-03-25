package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestzDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("size of dropdown elements list:"+list.size()); 
		for(WebElement lists:list)
		{
			if(lists.getText().contains("download"))
			{
				lists.click();
				break;
			}
		}
	}

}
