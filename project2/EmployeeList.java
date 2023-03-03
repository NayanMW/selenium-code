package Project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class EmployeeList {
	
	WebDriver driver;
	
	
  @Test
  public void list() {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 
	  
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
      
	  driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
	  

	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,350)", "");
	  driver.findElement(By.xpath("//div[text()='Aaliyah '] ")).click();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  
	  
	  
  }

}
