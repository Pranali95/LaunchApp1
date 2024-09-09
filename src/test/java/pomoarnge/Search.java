package pomoarnge;




	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class Search {
		
		//Constructor
		WebDriver driver;
		
			public Search(WebDriver driver) {
				
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}}

