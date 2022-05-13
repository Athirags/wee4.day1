package Week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/india/s?k=india");
	  driver.manage().window().maximize();
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 13",Keys.ENTER);
	 List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
	 for(WebElement eachmobileName:mobileNames) {
		 System.out.println(eachmobileName.getText());
		 
	 }
	}

}
