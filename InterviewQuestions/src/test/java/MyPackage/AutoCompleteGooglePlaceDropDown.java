package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteGooglePlaceDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement searchbox= driver.findElement(By.id("autocomplete"));
		searchbox.clear();
		searchbox.sendKeys("Toronto");
		Thread.sleep(3000);
		String text;//used to capture the input ele and compare
		//applying arrow functions and select the preferred location and compare if yes click on enter
		do {
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.equals("Toronto, OH, USA")) {
				searchbox.sendKeys(Keys.ENTER);
				break;
		}
		Thread.sleep(3000);
		}
		while(!text.isEmpty());
		System.out.println("execution successfull");
	}
	
	

}
