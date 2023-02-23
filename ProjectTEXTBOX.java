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

public class ProjectTEXTBOX {
	
	WebDriver driver;
	
	
  @Test
  public void textBox1() {
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement element =driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
    element.click();	
    WebElement textbox =driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
    textbox.click();	  
	WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
	name.sendKeys("nayan");
	WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
	email.sendKeys("nayan@gmail.com");        
	 WebElement currentaddress =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	currentaddress.sendKeys("hfkuewhrgyuygkg");
	
	 WebElement permanentAddress =driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
     permanentAddress.sendKeys("abcdjrhbqeogb");
     
    	
     js.executeScript("window.scrollBy(0,350)", "");
     
     WebElement submit=driver.findElement(By.id("submit"));
     submit.click();
	 
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
