package RegisterPackage;






import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Flipkartwatches {
		
	WebDriver Driver;
	public void invokeBrowser(){
		/*Setting property of a system variable used by chrome driver*/
		System.setProperty("webdriver.chrome.driver", "E:/seleniumtest1/chromedriver.exe");
		
		Driver = new ChromeDriver();
		
		String url = "http://www.ebay.in";
	
		
		//To maximise the browser
		Driver.manage().window().maximize();
		
	//	Driver.manage().deleteAllCookies();
		
		Driver.get(url);
		
	}
	
	public void searchProduct(String product, String category){
		
		Driver.findElement(By.id("gh-ac")).sendKeys(product);
		
		WebElement dropElement = Driver.findElement(By.id("gh-cat"));
		
		Select dropdown = new Select(dropElement);
		
		
		dropdown.selectByVisibleText("Watches");
		
		Driver.findElement(By.id("gh-btn")).click();
		
		String result =	Driver.findElement(By.className("listingscnt")).getText();
	
		System.out.println("Result is : "+ result);
	}
	
	
	public void searchAllProduct(){
		List<WebElement> allProduct = Driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));
		
		for( WebElement product : allProduct){
			
			System.out.println(product.getText());
			
			System.out.println("*********************************************************************");
		}
	}
}