package Project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class OptionalField {
	
	WebDriver driver;
	
  @Test
  public void optionalField() {
	  
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  username.sendKeys("Admin");
	  
	  WebElement password =driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  password.sendKeys("admin123");
	  
	  WebElement submit =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
      submit.click();  
      
      WebElement pim =driver.findElement(By.xpath("//span[text()='PIM']"));
      pim.click();  
      
      WebElement configuration =driver.findElement(By.xpath("//span[contains(text(),'Configuration')]"));
      configuration.click();  
         
      
      WebElement optional =driver.findElement(By.xpath("//a[contains(text(),'Optional Fields')]"));
      optional.click();  
         
      WebElement save =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
      save.click();  
         
      
      
      
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
	  
	  driver.close();
	  
	  
  }

}
