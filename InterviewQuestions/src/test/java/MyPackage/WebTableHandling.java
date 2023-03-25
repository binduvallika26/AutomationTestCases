package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How To Handle Web Table in Selenium WebDriver?
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		//1. number of rows in a table
		 int row = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		 System.out.println("Total no of rows in a table:"+row);
		 //2. number of cols in a table
		 int cols = driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();
		 System.out.println("Total no of cols in a table:"+cols);
		 //3. Retrieve specific row/col data
		 String specvalue = driver.findElement(By.xpath("//table[@class='data-list']//tr[2]/td[1]")).getText();
		 System.out.println("specific row/col in a table:"+specvalue);
		 //4. retrieve all data from the table
		 for(int r=1;r<=row;r++) {
			 for(int c=1;c<=cols;c++) {
				 String data= driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText();
				 System.out.println(data+"    ");
			 }
		 }
		 //5. PRINT RELEASE DATA AND VERSION OF PARTICULAR ITEM
		 for(int r=1;r<=row;r++) {
			 String language= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[1]")).getText();
			 if(language.equals("Java")) {
				 String languageversion= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[2]")).getText();
				 String languagerelease= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[3]")).getText();
				 System.out.println(language+"   "+languageversion+"    "+languagerelease+"    ");
				
			 }
		 }
		 
	}

}
