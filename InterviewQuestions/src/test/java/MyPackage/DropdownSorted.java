package MyPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkarutur\\eclipse-workspace\\InterviewQuestions\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();
		WebElement drpdwon= driver.findElement(By.name("category_id"));
		Select drpdownselect = new Select (drpdwon);
		List<WebElement> options=  drpdownselect.getOptions();
		
		ArrayList OriginalList= new ArrayList();
		ArrayList templList= new ArrayList();
		for(WebElement drpdownoption:options)
		{
			OriginalList.add(drpdownoption.getText());
			templList.add(drpdownoption.getText());
			
			
		}
		System.out.println("original list elements:"+ OriginalList );
		System.out.println("templList list elements:"+ templList );
		
		Collections.sort(templList);
		System.out.println("original list elements:"+ OriginalList );
		System.out.println("templList list elements:"+ templList );
		
		if(OriginalList.equals(templList)) {
			System.out.println("original list elements are in sorted order");
		}
		else {
			System.out.println("original list elements are in unsorted order");
			
		}
	}

}
