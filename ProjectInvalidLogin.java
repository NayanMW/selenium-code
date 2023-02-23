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

public class ProjectInvalidLogin {
	
	WebDriver driver;
	
  @Test
  public void invalidLogin() {
	  

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,650)", "");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    	 WebElement bsa =driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]"));
    	   bsa.click();
    	   
     js.executeScript("window.scrollBy(0,650)", "");
     WebElement login =driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
     login.click();
     
     WebElement username =driver.findElement(By.xpath("//input[@id='userName']"));
     username.sendKeys("nayan");
     	   
     WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
     password.sendKeys("abcd");
     	   	   
     WebElement submit =driver.findElement(By.xpath("//button[@id='login']"));
     submit.click();  
     
     System.out.println("User is not able to login becouse of invalid username and password");
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
