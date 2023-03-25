package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWithPagination {
	// How To Handle Dynamic Web Table with Pagination in Selenium?

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		//user name and password fields
		 WebElement username= driver.findElement(By.id("input-username"));
		 username.clear();
		 username.sendKeys("demo");
		 WebElement password= driver.findElement(By.id("input-password"));
		 password.clear();
		 password.sendKeys("demo");
		 
		 driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		 //sales-orders
		 Thread.sleep(3000);
		// driver.switchTo().alert().dismiss();
		//*[@id="modal-security"]/div/div/div[1]/button
		 driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")).click();
		 //1. finding total no of pages in a table
		 String text =  driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[2]")).getText();
		 System.out.println(text);
		 int count= Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		 System.out.println("toatl no of pages:"+count);
		 //finding out which page is active
		 for(int p=1;p<count;p++) {
		 WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		 System.out.println("the active page number is:"+active_page.getText());
		 Thread.sleep(2000);
		 active_page.click();
		 // finding no of rows in that active page
		 int rows= driver.findElements(By.xpath("//*[@id=\"form-order\"]/div[1]/table")).size();
		 System.out.println("the active page number rows are:"+rows);
		 //going to next pages
		 String pageno=Integer.toString(p+1);
		 driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
		 
		 
	}

}
}
