package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		//1.selecting single checkbox
		
		  driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		  driver.findElement(By.
		  xpath("//input[@type='checkbox'and contains(@id,'day')]")).click();
		 
		//size of all the checkboxes
		List<WebElement> Checkboxes= driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
		System.out.println("Total no of checkboxes:"+Checkboxes.size());
		//2.selecting of all the checkboxes
		for(int i=0;i<Checkboxes.size();i++) {
			Checkboxes.get(i).click();
		}
		//3.same execution using for each loop
		for(WebElement chk:Checkboxes) {
			chk.click();
		}
		System.out.println("Total all checkboxes are selected");
		//4.particular checkboxes selection
				for(WebElement chk:Checkboxes) {
					String chkboxname= chk.getAttribute("id");
					if(chkboxname.equals("monday")||chkboxname.equals("sunday")) {
						chk.click();
				}
		//5.selecting last 2 checkboxes
					int toatlcheckboxes= Checkboxes.size();
					//toatlnofcheckboxes-no of checkbxes= start index  ;  7-2=5 5 is the start index.
					
					  for(int i=toatlcheckboxes-2;i<Checkboxes.size();i++) {
					  Checkboxes.get(i).click(); Thread.sleep(2000); }
					  System.out.println("last 2 checkboxes are selected");
					 
		//6.selecting first 2 checkboxes
		for(int i=0;i<2;i++) //or we can write like for(i=0;i<Checkboxes.size();i++) and then use if(i<2) condition 
		{
			Checkboxes.get(i).click();
			Thread.sleep(2000);
		}	System.out.println("first 2 checkboxes are selected");
				
				}

		}
}

	

