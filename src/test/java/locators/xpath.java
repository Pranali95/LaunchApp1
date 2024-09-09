package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo-opencart.com/");
		driver.manage().window().maximize();
		
		/*****Single attribute*********/
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("TSHIRT");
		
		/*****Multiple attribute*********/
		//driver.findElement(By.xpath("//input[@name='search'] [@placeholder='Search']")).sendKeys("TOP");
		
		/*****AND Operator*********/
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TOP");
		
		/*****OR Operator*********/
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("TOP");
		
		/*****Linked Text ahref tag*********/
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		/*****Text without ahref tag*********/
		String text= driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		System.out.println(text);

		

	}

}
