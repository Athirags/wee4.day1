package Week4.day1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
	public static void main(String[] args) {
		

		
WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.manage().window().maximize();
  WebElement elementUsername=driver.findElement(By.id("username"));
  elementUsername.sendKeys("Demosalesmanager");
  driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
  driver.findElement(By.className("decorativeSubmit")).click();
  String text = driver.findElement(By.tagName("h2")).getText();
  System.out.println(text);
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Leads")).click();
  driver.findElement(By.linkText("Create Lead")).click();
 // WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
 // Select select=new Select(ownershipDropdown);
// java.util.List<WebElement> options = select.getOptions();
// select.selectByIndex(options.size()-2);
// WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
 //Select select1=new Select(industryDropdown);
//java.util.List<WebElement> options2 = select.getOptions();
//for(WebElement eachOptions:options2) {
	//System.out.println(eachOptions.getText());
	
//WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	//Select select2=new Select(marketingCampaignDropdown);
//	java.util.List<WebElement> options3 = select2.getOptions();
     //select2.selectByIndex(options3.size()-1);
//	select2.selectByVisibleText("Car and Driver");
//WebElement marketingCampaignDropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
//	Select select3=new Select(marketingCampaignDropdown1);
	//java.util.List<WebElement> options4 = select3.getOptions();
	//for(WebElement eachOptions:options4) {	System.out.println(eachOptions.getText());

	
  WebElement marketingCamaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
 Select select3=new Select(marketingCamaignDropdown);
 
  //select3.selectByIndex(4);
 // select3.selectByVisibleText("Automobile");
 //select3.selectByValue("9002");
  
  java.util.List<WebElement> options = select3.getOptions();
  for(WebElement eachoptions:options) {
	  System.out.println(eachoptions.getText());
  }
  
  
  
	
}

	
}
