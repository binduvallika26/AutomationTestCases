package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		//mouse drag and drop click action
		
		WebElement rome=driver.findElement(By.id("box6"));
		
			WebElement Italy=driver.findElement(By.id("box106"));
		Actions act= new Actions(driver);
		act.dragAndDrop(rome,Italy).build().perform();
		System.out.println("Mouseover dragAndDrop action successfull");
		

	}

}
