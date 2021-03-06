package RegisterPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class Login {

	
	public WebDriver driver;	  
    

  
  
@Test
  public void login()
  {
	 driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	System.out.println("Login page loaded Successful.");
	  	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rutujayadav5@gmail.com");
	  	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("password");
	  	driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if (driver.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders."))
		  {
			  System.out.println("Login was successful");
		  }
		  else
  			{
			  System.out.println("Login was failed ");
  			}

  }
  


  
  @BeforeClass
  public void beforeClass() {
	  
	 System.setProperty("webdriver.chrome.driver", "E:/seleniumtest1/chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.get("http://automationpractice.com/index.php");
	 
	 
	    
  }

  @After
  public void afterClass() {
	  //driver.quit();
  }

}
