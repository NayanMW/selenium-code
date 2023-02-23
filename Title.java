package POM.Project;

import org.testng.annotations.Test; 

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Title {
	
	WebDriver driver;
	
  @Test
  public void loginURL() {
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/");
	  System.out.println("page title is: " + driver.getTitle() );
	  System.out.println("Page title is visible");
	  
  }
  @BeforeClass
  public void beforeClass() {
	
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  
  }

}
