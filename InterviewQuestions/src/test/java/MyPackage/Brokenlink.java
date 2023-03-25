package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int brokenlinkcount=0;
		for( WebElement elements:links) {
			String url = elements.getAttribute("href");
			if(url==null||url.isEmpty()) {
				System.out.println("url is empty");
				continue;
				
			}URL link = new URL(url);
			try {
				HttpURLConnection httpcont = (HttpURLConnection)link.openConnection();
				httpcont.connect();
				if(httpcont.getResponseCode()>=400) {
					System.out.println("Broken Link connection is:"+httpcont.getResponseCode()+"--"+url);
					brokenlinkcount++;
				}
				else {
					System.out.println("valid Link connection is:"+httpcont.getResponseCode()+url);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
	}
		System.out.println("Broken Links conunt is:"+brokenlinkcount);
		driver.quit();
}
}
