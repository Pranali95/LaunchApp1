package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
		
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Tshirts");
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Tshirts");
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Tshirts");

		
		
		
}}
