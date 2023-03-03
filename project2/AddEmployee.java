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

public class AddEmployee {
	
	WebDriver driver;
	
  @Test
  public void add() {
	  
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 
	  
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
      
	  driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
	  
	  WebElement photo =driver.findElement(By.xpath("//button[@class='oxd-icon-button employee-image-action']"));
	  photo.sendKeys("C:\\Users\\wadek\\Downloads\\sampleFile (1).jpeg");
	  
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("nayann");
	  
	  driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("mahendra");
	  
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("wadekar");
	    
	    driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("3333"); 
	    
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    
	    
	    
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
