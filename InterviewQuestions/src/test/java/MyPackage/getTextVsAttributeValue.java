package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsAttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		//findelement()--single element
		WebElement login = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		System.out.println("value from the getText method:"+login.getText());
		System.out.println("value from the getAttribute method:"+login.getAttribute("value"));
		login.clear();
		login.sendKeys("XYZ@gmail.com");
	}

}
