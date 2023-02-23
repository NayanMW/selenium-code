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

public class ProjectDragAndDrop {
	
	WebDriver driver;
	
  @Test
  public void dragAndDrop() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,350)", "");
	  
	  WebElement interactions=driver.findElement(By.xpath("//h5[contains(text(),'Interactions')]"));
	  interactions.click();
	  
	  js.executeScript("window.scrollBy(0,650)", "");
	  
	  WebElement droppable=driver.findElement(By.xpath("//span[contains(text(),'Droppable')]"));
	  droppable.click();
	  
	  Actions act =new Actions(driver);  
	  
	  WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	  
	  WebElement target =driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	  
	  act.dragAndDrop(source, target).build().perform();
	  
	  System.out.println("Drag and Drop is Passed");
	  
	  
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
