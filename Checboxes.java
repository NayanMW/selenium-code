package POM.Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Checboxes {
	
	WebDriver driver;
  @Test
  public void checkbox() {
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement element =driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
    element.click();	
	  
    WebElement chechbox=driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
    chechbox.click();
    WebElement home =driver.findElement(By.className("rct-checkbox"));
    home.click();
    
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
	  
  }

}
