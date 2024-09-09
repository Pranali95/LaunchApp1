package conditionalmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println(logo.isDisplayed());
//		
//		
//		boolean enable = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println(enable);
		
		
		
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
		//beforeclick
		System.out.println(female.isSelected());
		
		//afterclick
		female.click();
		System.out.println(female.isSelected());

		WebElement male= driver.findElement(By.xpath("//input[@id='gender-male']"));
		//beforeclick
		System.out.println(male.isSelected());
		
		//afterclick
		male.click();
		System.out.println(male.isSelected());
	}

}
