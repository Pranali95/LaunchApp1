package getmethods;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {
	
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String current = driver.getCurrentUrl();
//		System.out.println(current);
		
	
//		
//		String windowId= driver.getWindowHandle();
//		System.out.println("window," + windowId);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIds =driver.getWindowHandles();
		System.out.println(windowIds);
		
		
		
		
	}

}
