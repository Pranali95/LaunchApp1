package launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo-opencart.com/");
		
		String pageTitle = driver.getTitle();
		
		
		if(pageTitle.equals("Your Store"))
				{
			System.out.println("Test Passed");
		}
		
		else{
			System.out.println("Test Failed");
		}
	}

}
