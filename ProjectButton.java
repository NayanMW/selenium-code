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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ProjectButton {
	
	WebDriver driver;
	
	
  @Test
  public void buttonRightclickdubbleClick() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement element =driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
    element.click();	
	  
    WebElement button =driver.findElement(By.xpath("//div[@class=\"element-list collapse show\"]//li[@id=\"item-4\"]"));
    button.click();	
	  
    WebElement doubbleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    
    Actions act =new Actions(driver);
    act.doubleClick(doubbleClick).perform();
    
    WebElement rightClick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    
    act.contextClick(rightClick).perform();
    
    WebElement clickMe=driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
    
    act.click(clickMe).perform();
    
    System.out.println("All Actions are perfomed");
    
	  
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
