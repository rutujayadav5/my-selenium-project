package RegisterPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class Register {
  
	public WebDriver driver;

  @Test
  public void main() {
	  
	    driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	System.out.println(" Test case:1-Login page Successful.");
	    
	    
	      }
  
  
@Test
  public void register()
  {
	  driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("rutujatest1@gmail.com");
	  driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
	  
	  
	  //System.out.println("Test case:2-Register Successful.");
	  //to load the webpage
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  @SuppressWarnings("unused")
	  WebElement myDynamicElement = driver.findElement(By.xpath("//*[@id='id_gender2']"));
	  driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
	  driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Rutuja");
	  driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Yadav");
	  driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("password");
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='days']")));
	  dropdown.selectByValue("30");
	  dropdown = new Select(driver.findElement(By.xpath("//*[@id='months']")));
	  dropdown.selectByValue("3");
	  dropdown = new Select(driver.findElement(By.xpath("//*[@id='years']")));
	  dropdown.selectByValue("1994");
	  driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Rutuja");
	  driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Yadav");
	  driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Test Company");
	  driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("street no 1, test");
	  driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("street no 2, test");
	  driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Test city");
	  dropdown = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
	  dropdown.selectByValue("3");
	  driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("12345");
	  dropdown = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
	  dropdown.selectByValue("21");
	  driver.findElement(By.xpath("//*[@id='other']")).sendKeys("Test info");
	  driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("8989898989");
	  driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("8989898989");
	  driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	  
	  if (driver.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders."))
			  {
		  	System.out.println("Account was successfully created");
			  }
	  else
	  		{
		  System.out.println("Account was failed to be created");
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
	  driver.quit();
  }

}
