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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class PracticeForm {
	
	WebDriver driver;
	
  @Test
  public void practiceForm() {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,350)", "");
	  
	  WebElement form =driver.findElement(By.xpath("//h5[contains(text(),'Forms')]"));
	  form.click();
	  
	  WebElement practiceForm =driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
	  practiceForm.click();
	  
	  WebElement name1 =driver.findElement(By.xpath("//input[@id='firstName']"));
	  name1.sendKeys("nayan");
	  
	  WebElement name2 =driver.findElement(By.xpath("//input[@id='lastName']"));
	  name2.sendKeys("wadekar");
	  
	  WebElement email =driver.findElement(By.xpath("//input[@id='userEmail']"));
	  email.sendKeys("ABCD@gmail.com");
	  
	  WebElement gender =driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	  gender.click();
	  
	  WebElement mobileNumber =driver.findElement(By.xpath("//input[@id='userNumber']"));
	  mobileNumber.sendKeys("1235468792");
	  
	  WebElement dateOfBirth =driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	  dateOfBirth.click();
	  
	  
	  WebElement month =driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	  Select dropDown =new Select(month);
	  dropDown.selectByValue("6");
	  

	  WebElement year =driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	  Select dropDown1 =new Select(year);
	  dropDown1.selectByValue("1999");
	  
	  
	  WebElement date =driver.findElement(By.xpath("//div[contains(text(),'24')]"));
	 date.click();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 
	
	 js.executeScript("window.scrollBy(0,750)", "");
	 
	
	  WebElement hobbies =driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
	  hobbies.click();
	  
	  
	  WebElement uploadPicture =driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  uploadPicture.sendKeys("C:\\Users\\wadek\\Downloads\\adiyogi-beautiful-night-hd-laptop-wallpaper-1080p.jpg");
	  
	  WebElement currentAddress =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	  currentAddress.sendKeys("acgcxthbvyhgkgcvjfck");
	  
	 

     
	  
	 
	
	  
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
