package MyPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		
		  //1.handling single windowId
		  
		  String WindowID= driver.getWindowHandle(); System.out.println(WindowID);
		  
		  //2.multiple windowId's
		  
		  driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		  //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		  Set<String> WindowIDs= driver.getWindowHandles(); Iterator<String> it=
		  WindowIDs.iterator();
		  
		  String ParentID= it.next(); String ChildID= it.next();
		  System.out.println(ParentID); System.out.println(ChildID);
		  
		  driver.switchTo().window(ParentID);
		  System.out.println("parenttitle:"+driver.getTitle());
		  driver.switchTo().window(ChildID);
		  System.out.println("childtitle:"+driver.getTitle());
		  
		  //3. switch using for loop
		 
		for (String winid : WindowIDs) {
			String Title = driver.switchTo().window(winid).getTitle();
			System.out.println("all titles:" + Title);
		}

	}

}
