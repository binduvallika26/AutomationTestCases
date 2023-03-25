package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleSliders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Sliderele=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("Slider location:"+Sliderele.getLocation());
		System.out.println("Slider size:"+Sliderele.getSize());
		Actions act= new Actions(driver);
		act.dragAndDropBy(Sliderele,100,0).build().perform();
		System.out.println("Slider location:"+Sliderele.getLocation());
		System.out.println("Slider size:"+Sliderele.getSize());
	}

}
