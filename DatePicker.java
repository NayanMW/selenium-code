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

public class DatePicker {
	
	WebDriver driver;
	
  @Test
  public void datePicker() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement widgets =driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]"));
   widgets.click();
   
   
   js.executeScript("window.scrollBy(0,350)", "");
	  
   WebElement dP =driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
   dP.click(); 
   
   
   WebElement selectDate=driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
   selectDate.click(); 
   
   
   WebElement day =driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--022 react-datepicker__day--selected react-datepicker__day--today']"));
   day.click(); 
   
   WebElement dateAndTime =driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));
   dateAndTime.click(); 
   
   
   WebElement day1 =driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--022 react-datepicker__day--selected react-datepicker__day--today']"));
   day1.click(); 
   
   
   WebElement time =driver.findElement(By.xpath("//li[contains(text(),'23:45')]"));
   time.click(); 
   
   
   
   
   
	  
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
