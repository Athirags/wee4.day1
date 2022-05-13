package Week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("https://erail.in/");	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement from = driver.findElement(By.id("txtStationFrom"));
	 from.clear();
	 driver.findElement(By.id("txtStationFrom")).sendKeys("MDU",Keys.ENTER);
	 WebElement To = driver.findElement(By.id("txtStationTo"));
	 To.clear();

	 driver.findElement(By.id("txtStationTo")).sendKeys("TPJ",Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement elementtable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		List<WebElement> rows = elementtable.findElements(By.tagName("tr"));

	
		for(int i=1;i<rows.size();i++) {
			
			List<WebElement> cols = elementtable.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
			for(int j=0;j<cols.size();j++)
			{
				
				System.out.println(cols.get(j).getText());
			}
			}
	}}
	