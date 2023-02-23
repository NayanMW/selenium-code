package POM.Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class UploadAndDownload {
	
	
	WebDriver driver;
	
	
  @Test
  public void uploadDownload() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement element =driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
    element.click();	 
	  
    js.executeScript("window.scrollBy(0,350)", "");
	  
    WebElement up1 =driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]"));
     up1.click();	 
 	  
     WebElement download =driver.findElement(By.xpath("//a[@id='downloadButton']"));
     download.click();	 
 	   
     WebElement upload =driver.findElement(By.xpath("//input[@id='uploadFile']"));
     upload.sendKeys("C:\\Users\\wadek\\OneDrive\\Documents\\resume.docx");	 
 	     
	  
     
     
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.edgedriver().setup();
	  
	  driver =new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
	  
	  
  }

}
