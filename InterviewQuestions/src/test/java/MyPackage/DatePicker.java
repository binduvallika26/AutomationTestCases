package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
				driver.manage().window().maximize();
			/*	
				String date="20";
				String month="July";
				String year="2023";
				driver.findElement(By.xpath("//input[@id='onward_call']")).click();//calender opens
				while(true)
				{
					String monthyr= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
					String arr[]= monthyr.split(" ");
					String mon = arr[0];
					String yr = arr[1];
					if(mon.equalsIgnoreCase(month)&& yr.equals(year)) {
						break;
					}
					else {
						driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
					}
					//Date Selection
					List<WebElement> alldates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
							for(WebElement element:alldates) {
								String date1=element.getText();
								if(date1.equals(date)) {
									element.click();
									break;
								}
								
							}
				

				}


*/
	}
}