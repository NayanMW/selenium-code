package Project2;

import org.testng.annotations.Test;   

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class CustomField {
	
	WebDriver driver;
	
  @Test
  public void customField() {
	  
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 
	  
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      
      
     driver.findElement(By.xpath("//span[text()='PIM']")).click();
        
      
     driver.findElement(By.xpath("//span[contains(text(),'Configuration')]")).click();
       
         
      driver.findElement(By.xpath("//a[contains(text(),'Custom Fields')]")).click();
      
      
      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
      
      
    driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("1213456789910");
    
      
     driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).click();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
     List<WebElement>screen=driver.findElements(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]"));
    
      System.out.println("number of element:"+ screen.size());
      
      for(WebElement screen1:screen)
      {
    	  if(screen1.getText().equals("Personal Details"))
    	  {
    		  screen1.click();
    		  break;
    	  }
    	  
      }                                  
      
   driver.findElement(By.xpath("//div[contains(text(),'-- Select --')]")).click(); 
      
      
      
      
      
      
      
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
