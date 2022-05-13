package Week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/table.html");
	  driver.manage().window().maximize();
	  WebElement elementTable = driver.findElement(By.xpath("//table"));
	  List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
	 
	  
	 for(int i=1;i<rows.size();i++) {
	 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	 for(int j=0;j<cols.size();j++) {
			 
		System.out.println(cols.get(j).getText());
		 }
			 
			
			 
	 }
		 
		 
	 }}

	 
	 
	  
	

	

