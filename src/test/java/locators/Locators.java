package locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Locators {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo-opencart.com/");
			driver.manage().window().maximize();
			
			/************Name******************/
		//	driver.findElement(By.name("search")).sendKeys("Mac");
			
			/*************ID*****************/
			//boolean logoStatus = driver.findElement(By.id("logo")).isDisplayed();
			//System.out.println(logoStatus);
			
			/*******Linked text and Partial Linked Text***********************/
			
			driver.findElement(By.linkText("Tablets")).click();
			
			//driver.findElement(By.partialLinkText("MP3 ")).click();
		
			
	}

}
